package com.alimuya.redright.core.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/hello")
public class HelloWord {
	
	@RequestMapping(value="/lala")
	public String lala(){
		System.out.println("sdsadsdsa");
		return "index";
	}

}
