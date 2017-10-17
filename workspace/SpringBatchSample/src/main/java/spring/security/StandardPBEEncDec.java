package main.java.spring.security;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class StandardPBEEncDec {

	public static void main(String[] args) {
		StandardPBEStringEncryptor config = new StandardPBEStringEncryptor();
		config.setProviderName("SunJCE");
		config.setAlgorithm("PBEWithMD5AndDES");
		config.setPassword("Emmanuel");
		String text = config.encrypt("This is the plaintext messsage");
		System.out.println(text);
		System.out.println(config.decrypt(text));
	}
}
