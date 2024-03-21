package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller
public class Lesson01Ex01Controller {
	// http://localhost:8080/lesson01/ex01/test1
	@ResponseBody
	@RequestMapping("/2")
	public Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("사과", 30);
		map.put("라즈베리", 222);
		map.put("바나나", 10);
		map.put("딸기", 16);
		
		// map을 리턴하면 JSON이 된다.
		// web starter에 jackson 라이브러리가 포함되어 있기 때문
		return map;
	}
}
