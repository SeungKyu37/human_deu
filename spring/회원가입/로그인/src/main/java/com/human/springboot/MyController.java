package com.human.springboot;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@Autowired
	private MemDAO mem;
	
	@RequestMapping("/")
	public String home(HttpServletRequest req, Model model) {
//		HttpSession session=req.getSession();
//		String sess_info = (String) session.getAttribute("gUserid");
//		model.addAttribute("userid", sess_info);
		return "home";
	}
		
	@RequestMapping("/login")
	public String doLogin() {
		return "login";
	}
	
	@RequestMapping("/signout")
	public String doSignout(HttpServletRequest req) {
		HttpSession session=req.getSession();
		session.invalidate();
//		session.setAttribute("gUserid", null);
		return "redirect:/";
	}
	
	@RequestMapping("/checkuser")
	public String doCheck(HttpServletRequest req, Model model) {
		String id = req.getParameter("userid");
		String pw = req.getParameter("password");
		int cnt = mem.MemberCnt(id, pw);
		
		if(cnt == 1) {
			HttpSession session=req.getSession();				// 초기화
			session.setAttribute("gUserid", id);				// 값 설정
			session.setAttribute("gUserpw", pw);
			return "redirect:/";
		} else {
			return "redirect:/login";
		}
		
//		model.addAttribute("uid", id);
//		model.addAttribute("upw", pw);
//		
//		return "loginok";
	}
	
	@RequestMapping("/signin")
	public String doSignin() {
		return "signin";
	}
	
	@RequestMapping("/register")
	public String doUser(HttpServletRequest req, Model model) {
		String id = req.getParameter("userid");
		String pw = req.getParameter("password");
		String name = req.getParameter("name");
		String mobile = req.getParameter("mobile");
		
		ArrayList<Member> member = mem.list();
		model.addAttribute("loginid", member);
		mem.insertMember(id,pw,name,mobile);
		return "redirect:/login";
	}
	
}
