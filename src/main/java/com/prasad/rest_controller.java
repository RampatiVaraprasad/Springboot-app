package com.prasad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
@ResponseBody
public class rest_controller {
	@GetMapping("/")
	public String welcome() {
		return "Welcome to Ashokit";
	}	
	@GetMapping("/greet")
	public String greet() {
		return "Welcome to Hyd";	
	}
}
