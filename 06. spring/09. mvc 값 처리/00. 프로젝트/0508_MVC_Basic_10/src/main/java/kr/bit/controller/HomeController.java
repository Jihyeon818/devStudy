package kr.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //controller임을 지정
public class HomeController {
   @RequestMapping(value="/", method=RequestMethod.GET)
   public String home() {
      System.out.println("home");
      return "index";
   }
}