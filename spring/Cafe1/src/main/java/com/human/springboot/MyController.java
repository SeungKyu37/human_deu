package com.human.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
	
	@RequestMapping("/test1")	// web browser에서 "/test1"를 입력하면
	public /*String*/ ModelAndView test1(/*Model model*/) {
		ArrayList<String> arName=new ArrayList<String>();
		arName.add("Latte");
		arName.add("Mocca");
		arName.add("Americano");
		arName.add("Cappuccino");
//		model.addAttribute("menu", arName);
//		model.addAttribute("myname", "김승규"); // myname이라는 이름의 attribute에 들어가는 데이터는 "김승규"라는 문자열
//		model.addAttribute("others", "Alan parson's Project");
//		return "test1";		// web browser에게 "test1.jsp"를 보내준다.
		ModelAndView mv = new ModelAndView();
		mv.addObject("menu", arName);
		mv.setViewName("test1");
		return mv;
	}
	
	@RequestMapping("/login")
	public String doLogin() {
		return "login";	
		}
	@RequestMapping("/checkuser")
//	public String doCheckUser(HttpServletRequest req, Model model) {
//		String loginid = req.getParameter("userid");
//		String pw = req.getParameter("password");
		
	public String doCheckUser(@RequestParam("userid") String loginid,
							  @RequestParam("password") String pw, Model model) {
	
		// log, debug code
		System.out.println("loginid="+loginid);
		System.out.println("password="+pw);
		
		model.addAttribute("uid", loginid);
		model.addAttribute("pwd", pw);
		if(loginid.equals("xaexal")) {
		return "userinfo";
		} else {
			return "redirect:/login";
		}
	}
	
	@RequestMapping("/signin")
	public String doSignin() {
		return "register";	
	}
	
	@RequestMapping("/logout")
	public String doLogout() {
		return "logout";		
	}
	
	@RequestMapping("/name")
	@ResponseBody	// AJAX에서 사용
	public String doName() {
		return "<h1>서울 영등포구 영중로4길6</h1>";	// 단순 문자열, No more JSP		
	}
	@RequestMapping("/plus")
	public String plus() {
		return "plus";		
	}
	@RequestMapping("/doplus")
	public String doPlus(HttpServletRequest req, Model model) {
		int A = Integer.parseInt(req.getParameter("a"));
		int B = Integer.parseInt(req.getParameter("b"));
		int C = A + B;

		model.addAttribute("C", C);
		return "doplus";		
	}
	
	@RequestMapping("/gugu")
	public String gugu() {
		return "gugu";		
	}
	@RequestMapping("/dogugu")
	public String dogugu(HttpServletRequest req, Model model) {
		int a = Integer.parseInt(req.getParameter("a"));
		String d="";
		
		for(int i=1;i<10;i++) {
			d = d +a+" X "+ i + "=" +(a*i)+"<br>";
		}
		model.addAttribute("d", d);
		return "dogugu";		
	}
}
