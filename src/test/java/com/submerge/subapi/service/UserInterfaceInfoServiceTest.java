package com.submerge.subapi.service;


import com.submerge.subapicommon.service.inner.InnerUserInterfaceInfoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * ClassName: UserInterfaceInfoServiceTest
 * Package: com.submerge.subapi.service
 * Description:
 *
 * @Author Submerge--WangDong
 * @Create 2024-03-24 21:12
 * @Version 1.0
 */
@SpringBootTest
public class UserInterfaceInfoServiceTest {

    @Resource
    private InnerUserInterfaceInfoService userInterfaceInfoService;

    @Test
    public void invokeCountTest() {
        boolean b = userInterfaceInfoService.invokeCount(1L, 1L,1);
        Assertions.assertTrue(b);
    }
}