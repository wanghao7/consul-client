package com.wanghao.consul.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@JsonIgnoreProperties("$$beanFactory")
@Configuration
@ConfigurationProperties(prefix = "config")
public class ConsulConfigInfo {

    private String info;
    private String name;

    public void setInfo(String info) {
        this.info = info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }
}
