package com.example.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson07.entity.StudentEntity;

@RequestMapping("/lesson07")
@RestController
public class Lesson07Ex01RestController {
	@Autowired
	private StudentBO studentBO;
	
	// C: create
	@GetMapping("/ex01/create")
	public StudentEntity create() {
//		String name = "신보람";
//		String phoneNumber = "010-1111-2222";
//		String email = "sbr@kakao.com";
//		String dreamJob = "개발자";
		String name = "조세호";
		String phoneNumber = "010-1111-0000";
		String email = "josep@gmail.com";
		String dreamJob = "변호사";
		
		// save 된 객체를 리턴하므로 id값이 채워져 있다.
		return studentBO.addStudent(name, phoneNumber, email, dreamJob);
	}
	
	// U: update
	// http://localhost/lesson07/ex01/update
	@GetMapping("/ex01/update")
	public StudentEntity update() {
		// id가 3번인 dreamJob 변경
		return studentBO.updateStudentDreamJobById(3, "기획자");
	}
	
	// D: delete
	// http://localhost/lesson07/ex01/delete
	@GetMapping("/ex01/delete")
	public String delete() {
		// id:2 삭제
		studentBO.deleteStudentById(2);
		return "삭제 완료";
	}
	
	
	
	
	
}
