package com.betterlxc.web.demo.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by LXC on 2017/3/28.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

  /**
   * spring-boot配置外部静态资源的方法
   *
   * @param registry
   */
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
  }
}
