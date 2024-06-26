package kr.bit.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Inter4 implements HandlerInterceptor{
	//요청 발생 시 호출되는 메서드 코드가 중복되는 부분이 있을 때 인터셉터를 통해 처리한다
	//로그인 여부 확인, 등급별 서비스 권한, 관리자/회원 작업처리에서 많이 사용

	//controller 메서드가 호출되기 전에 호출됨(맵핑 전)
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("pre-inter4");
		return true;
	}

	//controller 메서드가 호출된 이후에 호출됨(view처리 수행 전에 호출됨) (맵핑 후)
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("pose-inter4");
	}
	
	//view처리 끝나고 응답결과가 브라우저로 전달되지 전에 호출됨
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("afterCompletion-inter4");
	}
}
