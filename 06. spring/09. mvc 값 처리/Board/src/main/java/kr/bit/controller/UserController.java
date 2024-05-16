package kr.bit.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.bit.beans.User;
import kr.bit.service.UserService;
import kr.bit.validator.UserValidator;

@Controller
@RequestMapping("/user") //공통된 경로 맵핑
public class UserController {
	
	@Autowired
	private UserService userService; //컨트롤러 전후단계에서 작동하는 비즈니스 로직.
	
	@Resource(name="loginBean")
	private User loginBean; //로그인 여부확인을 위해 세션영역에 담아놓은 값 자동 주입 받음
	
	@GetMapping("/modify")
	public String modify(@ModelAttribute("modifyBean") User modifyBean) {
		userService.getModifyUser(modifyBean);
		return "user/modify";
	}
	
	@PostMapping("/modify_pro")
	public String modify_pro(@Valid @ModelAttribute("modifyBean") User modifyBean, BindingResult result) {
		if(result.hasErrors()) {
			return "user/modify";
		}
		userService.modifyUser(modifyBean);
		return "user/modify_success";
	}
	
	@GetMapping("/logout")
	public String logout() {
		loginBean.setUserLogin(false); //로그인 되어있는 상태 아님
		return "user/logout";
	}
	
	@GetMapping("/login")
	public String login(@ModelAttribute("loginProBean") User loginProBean, 
						@RequestParam(value="fail", defaultValue = "false") boolean fail, 
						Model model) {
		model.addAttribute("fail",fail); //fail값은 false로 담김
		
		return "user/login";
	}
	
	@PostMapping("/login_pro")
	public String login_pro(@Valid @ModelAttribute("loginProBean") User loginProBean, BindingResult result) {
		if(result.hasErrors()) {
			return "user/login";
		}
		userService.getLoginUser(loginProBean); //로그인 성공하면 user_idx, user_name 추출
		
		if(loginBean.isUserLogin()==true) {
			return "user/login_success";
		}else {
			return "user/login_fail";
		}
	}
	
	@GetMapping("/join")
	public String join(@ModelAttribute("joinBean") User joinBean) {
		return "user/join";
	}
	
	@PostMapping("/join_pro") //join
	public String join_pro(@Valid @ModelAttribute("joinBean") User joinBean, BindingResult result) {
		if(result.hasErrors()) {
			return "user/join";
		}
		userService.addUser(joinBean); //DB에 삽입(insert)
		return "user/join_success";
	}
	
	@GetMapping("/not_login")
	public String not_login() {
		return "user/not_login";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		UserValidator v1 = new UserValidator();
		binder.addValidators(v1);
	}

}
