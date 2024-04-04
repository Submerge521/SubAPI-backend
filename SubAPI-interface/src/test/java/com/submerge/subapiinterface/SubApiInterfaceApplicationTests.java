package com.submerge.subapiinterface;

import cn.hutool.core.util.RandomUtil;
import com.submerge.subapiclientsdk.client.SubApiClient;
import com.submerge.subapiclientsdk.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SubApiInterfaceApplicationTests {

    @Resource
    private SubApiClient subapiClient;

    @Test
    void contextLoads() {
        String s = RandomUtil.randomNumbers(5);
        System.out.println(s);

    }

    @Test
    void testInterface(){
        String userNameByGet = subapiClient.getUserNameByGet("haha");
        String userNameByPost = subapiClient.getUserNameByPost("subi");
        User user = new User();
        user.setName("abc");
        String userName = subapiClient.getUserName(user);
        System.out.println(userNameByGet);
        System.out.println(userNameByPost);
        System.out.println(userName);
    }

}
