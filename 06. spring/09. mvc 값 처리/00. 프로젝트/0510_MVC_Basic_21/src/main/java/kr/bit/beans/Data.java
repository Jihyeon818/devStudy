package kr.bit.beans;

import javax.validation.constraints.*;

public class Data {

	@AssertTrue //True가 아닌 값이 들어오면 오류
	private boolean num1;
	
	@AssertFalse //False가 아닌 값이 들어오면 오류
	private boolean num2;
	
	@Max(200)
	@Min(20)
	private String num3;
	
	@Null //값이 들어오면 오류
	private String num4;
	
	@NotNull //값이 들어오지 않으면 오류
	private String num5;
	
	@Digits(integer=3, fraction=2) //integer: 정수 자리수 / Fraction: 실수 자리수
	private String num6;
	
	@Size(min=2, max=10) //지정된 글자수보다 짧거나 길면 오류
	private String num7;
	
	@Pattern(regexp="[a-zA-Z]*") //정규 표현식, 소문자 영문자+대문자 영문자+숫자
	private String num8;
	
	public Data() { //생성자 초기화
		this.num1=true;
		this.num2=false;
		this.num3="50";
		this.num4=null;
		this.num5="spring";
		this.num6="123.45";
		this.num7="java";
	}

	public boolean isNum1() {
		return num1;
	}

	public void setNum1(boolean num1) {
		this.num1 = num1;
	}

	public boolean isNum2() {
		return num2;
	}

	public void setNum2(boolean num2) {
		this.num2 = num2;
	}

	public String getNum3() {
		return num3;
	}

	public void setNum3(String num3) {
		this.num3 = num3;
	}

	public String getNum4() {
		return num4;
	}

	public void setNum4(String num4) {
		this.num4 = num4;
	}

	public String getNum5() {
		return num5;
	}

	public void setNum5(String num5) {
		this.num5 = num5;
	}

	public String getNum6() {
		return num6;
	}

	public void setNum6(String num6) {
		this.num6 = num6;
	}

	public String getNum7() {
		return num7;
	}

	public void setNum7(String num7) {
		this.num7 = num7;
	}

	public String getNum8() {
		return num8;
	}

	public void setNum8(String num8) {
		this.num8 = num8;
	}
	
	
	
}
