package com.submerge.subapi.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Submerge
 * @Date: 2023/09/10 12:21:53
 * @Version: 1.0
 * @Description: 电子邮件配置
 */
@Configuration
@ConfigurationProperties(prefix = "spring.mail")
@Data
public class EmailConfig {
    private String emailFrom = "2821410432@qq.com";
}
