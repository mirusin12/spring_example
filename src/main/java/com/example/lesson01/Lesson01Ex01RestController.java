package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("lesson01/ex01")
@RestController // @Controller + @ResponseBody
public class Lesson01Ex01RestController {
	
	// http://localhost:8080/lesson01/ex01/3
	@RequestMapping("/3")
	public String ex01_3() {
		return "<h3>@RestController를 사용해 String을 리턴한다.</h3>";
	}
	
	// http://localhost:8080/lesson01/ex01/4
	@RequestMapping("/4")
	public Map<String, String> ex01_4() {
		Map<String, String> map1 = new HashMap<>();
		map1.put("aaa", "1111");
		map1.put("bbb", "2222");
		map1.put("ccc", "3333");
		
		return map1;
	}
	
	@RequestMapping("/5")
	public Data ex01_5() {
		Data data = new Data();
		data.setId(100);
		data.setName("전승훈");
		
		return data; // 일반 bean 객체도 JSON으로 변함
	}
	
	// http://localhost:8080/lesson01/ex01/6
		@RequestMapping("/6")
		public ResponseEntity<Data> ex01_6() {
			Data data = new Data();
			data.setId(1);
			data.setName("바다");
			
			return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	
	
	
	
}
