package com.cxp.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: cxp
 * @Date: 2021/5/17
 * @Time: 15:42
 * @Description: mybatisPlus配置
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.cxp.mapper")
public class MybatisPlusConfig {

    /*
     * 分页插件
     **/
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }

}
