package com.huayun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	@RequestMapping("toIndex")
	public String toIndex() {
		System.out.println("主页方法。。。。");
		return "/user/index";
	}
}
