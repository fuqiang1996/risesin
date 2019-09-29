package com.risesin.common.utils.md5;

/**
 * This software is the confidential and proprietary information of lms Learning Services Co.,Ltd.
 * You shall not disclose such Confidential Information.
 * <p>
 * Modified by:
 ***/


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5Util {
    private static String encryptedString;

    private MD5Util() {
    }

    /**
     * 口令加密
     *
     * @param string
     * @return String
     */
    public static String encrypt(String string) {
        encryptedString = encryptString(string);
        return encryptedString;
    }

    /**
     * Compares the supplied plain text string to the encrypted string.
     *
     * @param string - The plain text string
     * @return boolean
     */
    public static boolean compareEncrypted(String string) {
        if ((encryptedString == null) ||
                !encryptedString.equals(encryptString(string))) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Compares the supplied plain text string to supplied the encrypted string.
     *
     * @param crypt  - The encrypted string.
     * @param string - The plain text string.
     * @return boolean
     */
    public static boolean compareEncrypted(String crypt, String string) {
        if ((crypt == null) || !crypt.equals(encryptString(string))) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * bytes to hexs.
     */
    public static String byte2hex(byte[] b) {
        String hs = "";
        String stmp = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int n = 0; n < b.length; n++) {
            stmp = (Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1) {
                stringBuilder.append("0" + stmp);
            } else {
                stringBuilder.append(stmp);
            }
            hs = stringBuilder.toString();
            //if (n<b.length-1)  hs=hs+":";
        }

        return hs.toUpperCase();
    }

    /**
     * hexs to bytes.
     */
    public static byte[] hex2byte(String b) {
        byte[] bb = new byte[b.length() / 2];

        for (int n = 0, i = 0; n < (b.length()); i++, n += 2) {
            bb[i] = (byte) (Integer.parseInt(b.substring(n, n + 2), 16) & 0XFF);
        }

        return bb;
    }

    /**
     * encrypt the string
     *
     * @param str
     * @return String
     */
    private static String encryptString(String str) {
        if ((str == null) || (str.length() == 0)) {
            return null;
        }

        byte[] val = new byte[0];
        try {
            val = str.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
        }
        MessageDigest algorithm = null;

        try {
            algorithm = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }

        algorithm.reset();
        algorithm.update(val);

        byte[] digest = algorithm.digest();
        String crypt = byte2hex(digest);

        return crypt;
    }

    public static String encryptToMd5(String str) {
        if ((str == null) || (str.length() == 0)) {
            return null;
        }
        byte[] val = new byte[0];
        try {
            val = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
        }
        MessageDigest algorithm = null;

        try {
            algorithm = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            return null;
        }

        algorithm.reset();
        algorithm.update(val);

        byte[] digest = algorithm.digest();
        String crypt = byteTohex(digest);

        return crypt;
    }

    /**
     * bytes to hexs.
     */
    public static String byteTohex(byte[] b) {
        String hs = "";
        String stmp = "";

        for (int n = 0; n < b.length; n++) {
            stmp = (Integer.toHexString(b[n] & 0XFF));

            if (stmp.length() == 1) {
                hs = hs + "0" + stmp;
            } else {
                hs = hs + stmp;
            }
        }
        return hs.toUpperCase();
    }
}
