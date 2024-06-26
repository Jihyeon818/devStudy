package kr.bit.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.bit.beans.Data;

@Controller
public class SpringController {

	@GetMapping("/t1")
	public String t1(Data data) {
		return "test1";
	}
	
	@PostMapping("/test_proc") //입력한 값 유효성 검사 > 유효성 검사에 대한 결과값
	public String test_proc(@Valid Data data, BindingResult result) {
		if(result.hasErrors()){
			return "test1";
		}else {
			return "test2";
		}
		
	}

}