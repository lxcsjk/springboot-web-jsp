package com.betterlxc.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by LXC on 2017/3/28.
 */


@Controller
@EnableWebMvc
@ComponentScan(basePackages = {"com.betterlxc.web.demo.conf", "com.betterlxc.web.demo.mvc.controller"})
@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(WebApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(WebApplication.class);
  }
}
