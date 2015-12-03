package com.alimuya.frameplu.core.auth;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/hello")
public class HelloWord {
	
	@ResponseBody
	@RequestMapping(value="/lala")
	public Object lala(){
		Logger.getLogger("dsadasdaa").info("dasda");
		//
		Map map=new HashMap();
		map.put("das", 1223);
		map.put("dsadaasad", "fsdsfd");
		return map;
	}

	@RequestMapping("/delete")
	public void delete(){
		//asdad
	}
}
