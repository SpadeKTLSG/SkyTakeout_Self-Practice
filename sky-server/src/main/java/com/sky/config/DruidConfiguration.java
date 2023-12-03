package com.sky.config;

import javax.annotation.PostConstruct;

public class DruidConfiguration {

    //解决druid 日志报错：discard long time none received connection:xxx
    @PostConstruct
    public void setProperties() {
        System.setProperty("druid.mysql.usePingMethod", "false");
    }
}
