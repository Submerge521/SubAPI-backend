package com.submerge.subapiclientsdk.client;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName: SubapiClient
 * Package: com.submerge.subapiinterface.client
 * Description: 调用第三方接口客户端
 *
 * @Author Submerge--WangDong
 * @Create 2024-03-18 20:58
 * @Version 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubApiClient {

    private String accessKey;

    private String secretKey;

//    public static final String ADDRESS_HOST = "http://localhost:8090";
//
//
//    public String getUserNameByGet(String name) {
//        //GET请求
//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("name", name);
//        String result = HttpUtil.get(ADDRESS_HOST + "/api/name/", paramMap);
//        System.out.println(result);
//        return result;
//    }
//
//    public String getUserNameByPost(String name) {
//        HashMap<String, Object> paramMap = new HashMap<>();
//        paramMap.put("name", name);
//        String result1 = HttpUtil.post(ADDRESS_HOST + "/api/name/", paramMap);
//        System.out.println(result1);
//        return result1;
//    }
//
//    private Map<String, String> getRHeader(String body) {
//        Map<String, String> hashmap = new HashMap<>();
//        hashmap.put("accessKey", accessKey);
//        hashmap.put("secretKey", secretKey);
//        hashmap.put("body", body);
//        hashmap.put("nonce", RandomUtil.randomNumbers(5));
//        hashmap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
//        hashmap.put("sign", GenSignUtils.genSign(body, secretKey));
//        return hashmap;
//    }
//
//    public String getUserName(User user) {
//        String json = JSONUtil.toJsonStr(user);
//        HttpResponse httpResponse = HttpRequest.post(ADDRESS_HOST + "/api/name/user")
//                .addHeaders(getRHeader(json))
//                .body(json)
//                .execute();
//        System.out.println(httpResponse.getStatus());
//        String result = httpResponse.body();
//        System.out.println(result);
//        return result;
//    }


}
