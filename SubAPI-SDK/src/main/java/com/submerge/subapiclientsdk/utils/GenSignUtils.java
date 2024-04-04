package com.submerge.subapiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * ClassName: GenSign
 * Package: com.submerge.subapiinterface.utils
 * Description: 签名加密工具类
 *
 * @Author Submerge--WangDong
 * @Create 2024-03-19 14:27
 * @Version 1.0
 */
public class GenSignUtils {

    public static String genSign(String body, String secretKey) {
        Digester md5 = new Digester(DigestAlgorithm.SHA256);
        String content = body + "." + secretKey;
        return md5.digestHex(content);
    }

}
