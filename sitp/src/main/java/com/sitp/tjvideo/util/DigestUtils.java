package com.sitp.tjvideo.util;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * 加密相关工具类
 */
public class DigestUtils extends org.springframework.util.DigestUtils {

    
    /**
     * Return a hexadecimal string representation of the MD5 digest of the given bytes.
     * @param bytes the bytes to calculate the digest over
     * @return a hexadecimal digest string
     */
    public static String md5Hex(final byte[] bytes) {
        return DigestUtils.md5DigestAsHex(bytes);
    }
    
    /**
     * 使用shiro的hash方式
     * @param algorithmName 算法
     * @param source 源对象
     * @param salt 加密盐
     * @param hashIterations hash次数
     * @return 加密后的字符
     */
    public static String hashByShiro(String algorithmName, Object source, Object salt, int hashIterations) {
        return new SimpleHash(algorithmName, source, salt, hashIterations).toHex();
    }
    
}
