package com.sky.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.alioss")
@Data
public class AliOssProperties {

    // 阿里云API的内或外网域名
    private String endpoint;

    // 阿里云API的密钥Access Key ID
    private String accessKeyId;

    // 阿里云API的密钥Access Key Secret
    private String accessKeySecret;

    // 阿里云API的bucket名称
    private String bucketName;

}
