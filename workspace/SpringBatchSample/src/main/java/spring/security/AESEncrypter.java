package main.java.spring.security;

import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
 
public class AESEncrypter {
 
    private static final byte[] SALT = new byte[20];
    private static final int ITERATION_COUNT = 65536;
    private static final int KEY_LENGTH = 256;
    private Cipher ecipher;
    private Cipher dcipher;
   
    AESEncrypter(String passPhrase) throws Exception {
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC");
        KeySpec spec = new PBEKeySpec(passPhrase.toCharArray(), SALT, ITERATION_COUNT, KEY_LENGTH);
        SecretKey tmp = factory.generateSecret(spec);
        System.out.println("Key -> " + Base64.getEncoder().encodeToString(tmp.getEncoded()));
        //SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");
        
        ecipher = Cipher.getInstance("PBEWITHSHAAND256BITAES-CBC-BC");
        ecipher.init(Cipher.ENCRYPT_MODE, tmp);
       
        dcipher = Cipher.getInstance("PBEWITHSHAAND256BITAES-CBC-BC");
        //byte[] iv = ecipher.getParameters().getParameterSpec(IvParameterSpec.class).getIV();
        dcipher.init(Cipher.DECRYPT_MODE, tmp);//, new IvParameterSpec());
    }
 
    public String encrypt(String encrypt) throws Exception {
        byte[] bytes = encrypt.getBytes("UTF8");
        byte[] encrypted = encrypt(bytes);
        return Base64.getEncoder().encodeToString(encrypted);
    }
 
    public byte[] encrypt(byte[] plain) throws Exception {
        return ecipher.doFinal(plain);
    }
 
    public String decrypt(String encrypt) throws Exception {
        byte[] bytes = Base64.getDecoder().decode(encrypt);
        byte[] decrypted = decrypt(bytes);
        return new String(decrypted, "UTF8");
    }
 
    public byte[] decrypt(byte[] encrypt) throws Exception {
        return dcipher.doFinal(encrypt);
    }
 
    public static void main(String[] args) throws Exception {
 
        String message = "password";
        String password = "RUY1NDY5RDFCQTkyMUUwMkNGMTM3REIwMDRBRkQxNkNERUNDMDgwNjJBOUJGNUY1RDZBMERENzNBRkRDNzZDMw==";
 
        SecureRandom random = new SecureRandom();
        random.nextBytes(SALT);
        AESEncrypter encrypter = new AESEncrypter(password);
        String encrypted = encrypter.encrypt(message);
        String decrypted = encrypter.decrypt(encrypted);
 
        System.out.println("Encrypt(\"" + message + "\", \"" + password + "\") = \"" + encrypted + "\"");
        System.out.println("Decrypt(\"" + encrypted + "\", \"" + password + "\") = \"" + decrypted + "\"");
    }
}