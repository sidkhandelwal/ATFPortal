package com.atfportal.util;

import java.security.spec.KeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import com.atfportal.vo.UnlockKey;

public class SecurityUtil {

	private static final String secretKey = "98werlk3j24g56kj";
	
	
	
	public static UnlockKey decryption(String message) throws Exception {
		
		byte[] data = DigestUtils.sha1(secretKey);
		KeySpec ks = new DESKeySpec(Arrays.copyOfRange(data, 0, 8));

		SecretKey key = SecretKeyFactory.getInstance("DES").generateSecret(ks);
		IvParameterSpec iv = new IvParameterSpec(Arrays.copyOfRange(data, 8, 16));

		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, key, iv);

		byte[] decoded = cipher.doFinal(Base64.decodeBase64(message));

		populateUnlockKey(new String(decoded, "UTF-8").substring(5));
		
		return populateUnlockKey(new String(decoded, "UTF-8"));
		
		
		
	}



	private static UnlockKey populateUnlockKey(String data) throws ParseException {
		UnlockKey key = new UnlockKey();
		
		StringTokenizer st = new StringTokenizer(data,",");
		String licenceKey = st.nextToken();
		key.setCourseID(Integer.parseInt(st.nextToken()));
		key.setExpiryDate(new SimpleDateFormat("dd MMM yyyy").parse(st.nextToken()));
		key.setNumberOfUsers(Integer.parseInt(st.nextToken())); 
		
		return key;
		
	}
	
	
}
