package com.zwc.core.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
 * @ClassName MyBatisPlusConfig
 * @Desc TODO   mybatis-plus 配置
 * @Date 2019/4/6 10:21
 * @Version 1.0
 */
@Configuration
@PropertySource("classpath:system.properties")
public class MyBatisPlusConfig {

    /*
     * @ClassName MyBatisPlusConfig
     * @Desc TODO   mybatis-plus 配置拦截
     * @Date 2019/4/6 10:21
     * @Version 1.0
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置方言
        paginationInterceptor.setDialectType("mysql");
        return paginationInterceptor;
    }

}
