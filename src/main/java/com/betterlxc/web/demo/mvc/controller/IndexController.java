package com.betterlxc.web.demo.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by LXC on 2017/4/5.
 */
@RestController
public class IndexController {

  @GetMapping(value = "/")
  public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView();
    mav.setViewName("index");
    return mav;
  }
}
