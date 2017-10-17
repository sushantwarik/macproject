package main.java.spring.security;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class StandardPBEEncDec {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		StandardPBEStringEncryptor config = new StandardPBEStringEncryptor();
		config.setProviderName("SunJCE");
		config.setAlgorithm("AES");
		config.setPassword("Emmanuel");
		String text = config.encrypt("This is the plaintext messsage");
		System.out.println(text);
		System.out.println(config.decrypt(text));
		System.out.println(Cipher.getMaxAllowedKeyLength("AES"));
	}
}
