package com.learn.Calc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.catalina.util.*;

@RestController
public class CalcController {

	
	
	@GetMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b) {
		System.out.println("This is a mandatory line");
		System.out.println("This is an important line");
		return a + b;
		
	}
	
	@GetMapping("/sub/{a}/{b}")
	public int sub(@PathVariable int a, @PathVariable int b) {
		return a - b;
	}
	
//	StringUtils.
}
