package com.nickc.todo.config;


import com.nickc.todo.filter.CorsFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/****************************************
 * creatTime:  下午4:01 2018/10/12
 *    author:  weipenghuang
 *        QQ： 280795290
 ****************************************/
@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean buildCorsFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setOrder(2);
        filterRegistrationBean.setFilter(new CorsFilter());
        filterRegistrationBean.setName("corsFilter");
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }


}
