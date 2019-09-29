package com.risesin.common.utils.md5;


import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @author sr
 * @date 2018/4/13 14:22
 * @description
 */
public class AesUtil {
    private static final String KEY_AES = "AES";
    private static final String ENCODING = "GBK";
    /**
     * 16位
     */
    private static final String key = "1s#2rn)(&^g32Sa2";

    public static String encrypt(String src) throws Exception {

        byte[] raw = key.getBytes(ENCODING);
        SecretKeySpec keySpec = new SecretKeySpec(raw, KEY_AES);
        Cipher cipher = Cipher.getInstance(KEY_AES);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        byte[] encrypted = cipher.doFinal(src.getBytes(ENCODING));
        return byte2hex(encrypted);
    }

    public static String decrypt(String src) throws Exception {

        byte[] raw = key.getBytes(ENCODING);
        SecretKeySpec keySpec = new SecretKeySpec(raw, KEY_AES);
        Cipher cipher = Cipher.getInstance(KEY_AES);
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        byte[] encrypted1 = hex2byte(src);
        byte[] original = cipher.doFinal(encrypted1);
        String originalString = new String(original, ENCODING);
        return originalString;
    }

    public static byte[] hex2byte(String strHex) {
        if (strHex == null) {
            return null;
        }
        int l = strHex.length();
        if (l % 2 != 0) {
            return null;
        }
        byte[] b = new byte[l / 2];
        for (int i = 0; i != l / 2; i++) {
            b[i] = (byte) Integer.parseInt(strHex.substring(i * 2, i * 2 + 2),
                    16);
        }
        return b;
    }

    public static String byte2hex(byte[] b) {

        StringBuilder hs = new StringBuilder();
        String sTmp = "";
        for (int n = 0; n < b.length; n++) {
            sTmp = (Integer.toHexString(b[n] & 0XFF));
            if (sTmp.length() == 1) {
                hs.append("0").append(sTmp);
            } else {
                hs.append(sTmp);
            }
        }
        return hs.toString().toUpperCase();
    }


}
