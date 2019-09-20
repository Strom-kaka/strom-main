package com.strom.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class BaseConfig {
    /**
     * 访问链接前缀
     */
    @Value("${option.app.prefix}")
    protected String appPrefix;

    protected Logger logger = LoggerFactory.getLogger(getClass());

}
