package com.risesin.common.utils.unique;
import java.security.MessageDigest;
import java.util.UUID;


/**
 * token 生成器
 * @author baby
 * @date Sep 1, 2018
 */
public class TokenGenerator {

    private static final char[] hexCode = "0123456789abcdef".toCharArray();

	public static String generateToken() {
        return generateValue(UUID.randomUUID().toString());
    }

    public static String generateValue(String param) throws RuntimeException {
	    try {
	        MessageDigest algorithm = MessageDigest.getInstance("MD5");
	        algorithm.reset();
	        algorithm.update(param.getBytes());
	        byte[] messageDigest = algorithm.digest();
	        return toHexString(messageDigest);
	    } catch (Exception e) {
	        throw new RuntimeException("生成Token失败", e);
	    }
	}

	public static String toHexString(byte[] data) {
        if(data == null) {
            return null;
        }
        StringBuilder r = new StringBuilder(data.length*2);
        for ( byte b : data) {
            r.append(hexCode[(b >> 4) & 0xF]);
            r.append(hexCode[(b & 0xF)]);
        }
        return r.toString();
    }
}
