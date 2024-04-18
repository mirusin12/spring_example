package com.example.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lesson05Controller {
	
	// http://localhost/lesson05/ex01
	@GetMapping("/lesson05/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@GetMapping("/lesson05/ex02")
	public String ex02(Model model) {
		// List<String>
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("melon");
		fruits.add("peach");
		fruits.add("grape");
		fruits.add("mango");
		model.addAttribute("fruits", fruits);
		
		// List<Map<String, Object>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name", "신보람");
		user.put("age", 28);
		user.put("hobby", "영화보기");
		users.add(user);
		
		user = new HashMap<>();
		user.put("name", "바다");
		user.put("age", 6);
		user.put("hobby", "사냥하기");
		users.add(user);
		
		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	}
	
	// http://localhost/lesson05/ex03
	@GetMapping("/lesson05/ex03")
	public String ex03(Model model) {
		Date now = new Date();
		model.addAttribute("now", now);
		return "lesson05/ex03";
	}
	
	// http://localhost/lesson05/ex04
	@GetMapping("/lesson05/ex04")
	public String ex04() {
		return "lesson05/ex04";
	}
	
}
