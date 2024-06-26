package kr.bit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class SpringController {
	//사용자가 값을 전달할 때 컨트롤러에서 받는 작업(URL에 쿼리스트링으로 들어옴)
	@GetMapping("/t1")
	public String t1(HttpServletRequest request) {
		String d1 = request.getParameter("data1"); //10
		String d2 = request.getParameter("data2"); //20
		String d3[] = request.getParameterValues("data3"); 
		
		System.out.println(d1);
		System.out.println(d2);
		for(String str:d3) {
			System.out.println(str);
		}
		return "final";
	}
	
	@PostMapping("/t2")
	public String t2(HttpServletRequest request) {
		String d1 = request.getParameter("d1");
		String d2 = request.getParameter("d2");
		String d3[] = request.getParameterValues("d3"); 
		
		System.out.println(d1);
		System.out.println(d2);
		for(String str:d3) {
			System.out.println(str);
		}
		return "final";
	}
	
	@GetMapping("/t3")
	public String t3(WebRequest request) {
		String d1 = request.getParameter("data1");
		String d2 = request.getParameter("data2");
		String d3[] = request.getParameterValues("data3"); 
		
		System.out.println(d1);
		System.out.println(d2);
		for(String str:d3) {
			System.out.println(str);
		}
		return "final";
	}
	
	@GetMapping("t4/{data1}/{data2}/{data3}") //{}안에는 임의의 이름
	public String t4(@PathVariable int data1, @PathVariable int data2, @PathVariable int data3) {
		//@PathVariable: 데이터 요청주소에 값이 있을 경우 값을 주입받을 수 있음
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		
		return "final";
	}
	
	@GetMapping("/t5")
	public String t5(@RequestParam int data1, @RequestParam int data2, @RequestParam int[] data3) {
		System.out.println(data1);
		System.out.println(data2);
		for(int str:data3) {
			System.out.println(str);
		}
		return "final";
	}
	
	@GetMapping("/t6") //변수의 이름을 바꾸고 싶을 경우 value 속성을 사용하여 파라미터 이름을 지정할 수 있음
	public String t6(@RequestParam(value="data1") int n1, @RequestParam(value="data2") int n2, @RequestParam(value="data3") int[] n3) {
		System.out.println(n1);
		System.out.println(n2);
		for(int str:n3) {
			System.out.println(str);
		}
		return "final";
	}
	
	@GetMapping("/t7")									//null값 들어감                            //기본값을 0으로 넣겠다
	public String t7(@RequestParam int data1, @RequestParam(required=false) String data2, @RequestParam(defaultValue="0") int data3) {
		System.out.println(data1); //10
		System.out.println(data2); //null
		System.out.println(data3); //0
		
		return "final";
	}	
}
