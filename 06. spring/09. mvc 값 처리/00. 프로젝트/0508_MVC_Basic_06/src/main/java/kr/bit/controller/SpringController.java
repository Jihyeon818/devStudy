package kr.bit.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import kr.bit.beans.Data;
import kr.bit.beans.Data2;

@Controller
public class SpringController {
	@GetMapping("/t1")	//t1?data1=10&data2=20&data3=30&data3=40 1과 2는 Map으로 받고 3은 List로 받음
	public String t1(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
		String data1=map.get("data1");
		String data2=map.get("data2");
		//String data33=map.get("data3");
		
		System.out.println(data1);
		System.out.println(data2);
		//System.out.println(data33);
		
		for(String str:data3) {
			System.out.println(str);
		}
		
		return "final";
	}
	
	@GetMapping("/t2") //index.jsp에서 값을 /t2로 넘길 때 → Data객체 필드에 주입됨(넘긴 값)
	public String t2(@ModelAttribute Data bean1, @ModelAttribute Data2 bean2) {
		System.out.println(bean1.getData1());
		System.out.println(bean1.getData2());
		
		for(int n:bean1.getData3()) {
			System.out.println(n);
		}
		
		System.out.println(bean2.getData1());
		System.out.println(bean2.getData2());
		
		return "final";
	}
}
