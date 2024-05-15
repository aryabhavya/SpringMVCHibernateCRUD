package com.crud.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/bhavya")
public class HelloControler {
	
	@RequestMapping (value = "/Hello", method= RequestMethod.GET)
	@ResponseBody
public String hello() {
	
	System.out.println("Hello I'm from controller");
	return "Hello";
}
}
