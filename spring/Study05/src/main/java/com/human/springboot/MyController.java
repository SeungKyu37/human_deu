package com.human.springboot;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@Autowired
	private MemDAO mem;
	@Autowired
	private PostDAO pdao;
	
	@RequestMapping("/")
	public String home(HttpServletRequest req, Model model){
		HttpSession s = req.getSession();
		ArrayList<Posting> post = pdao.list();
		model.addAttribute("postlist", post);
		model.addAttribute("gUserid",(String) s.getAttribute("gUserid"));
		return "home";
	}
	@RequestMapping("/signin")
	public String doSignin() {
		return "signin";
	}
	@RequestMapping("/login")
	public String dologin() {
		return "login";
	}
	
	@RequestMapping("/signout")
	@ResponseBody
	public String doSignout(HttpServletRequest req) {
		String retval="";
		try{
			HttpSession session=req.getSession();
			session.invalidate();
			retval = "ok";
		} catch(Exception e) {
			retval="fail";
		}
		return retval;
	}
	
	@RequestMapping("/checkDup")
	@ResponseBody
	public String doCheckDup(HttpServletRequest req) {
		
		int n = mem.checkDup(req.getParameter("userid"));
		return Integer.valueOf(n).toString();
	}
	
	@RequestMapping("/checkuser")
	@ResponseBody
	public String doCheck(HttpServletRequest req) {
		String retval="";
		try {
			String id = req.getParameter("userid");
			String pw = req.getParameter("password");
			int cnt = mem.MemberCnt(id, pw);
			
			if(cnt == 1) {
				HttpSession session=req.getSession();				// 초기화
				session.setAttribute("gUserid", id);				// 값 설정
				session.setAttribute("gUserpw", pw);
				retval= "ok";
			} else retval="fail";
		} catch(Exception e) {
			retval="fail";
		}
		return retval;
	}
	
	@RequestMapping("/logincheck")
	@ResponseBody
	public String doLoginCheck(HttpServletRequest req) {
		String str="";
		HttpSession session=req.getSession();
		String userid = (String) session.getAttribute("gUserid");
		if(userid==null || userid.equals("")) {
			str="";
//			str="<a href='/login'>로그인하기</a>&nbsp;&nbsp;<a href='/signin'>회원가입</a><br><br>";
		} else {
			str=userid;
//			str="<label>"+userid+"</label>&nbsp;&nbsp;<label id='lblSignout'>로그아웃</label><br><br>"
//					+ "<input type=button id=btnWrite value='글작성'>";
		}
		return str;
	}
	
	@RequestMapping("/register")
	@ResponseBody
	public String doUser(HttpServletRequest req) {
		String retval="";
		try {
			String id = req.getParameter("userid");
			String pw = req.getParameter("password");
			String name = req.getParameter("name");
			String mobile = req.getParameter("mobile");
			
			mem.insertMember(id,pw,name,mobile);
			retval="ok";
		} catch(Exception e) {
			retval="fail";
		}
		return retval;
	}
	
	@RequestMapping("/write")
	public String write(){
		return "write";
	}
	@RequestMapping("/insert")
	public String doWrite(HttpServletRequest req){
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		HttpSession session=req.getSession();
		String userid = (String) session.getAttribute("gUserid");
		pdao.insertContent(title, content, userid);
		return "redirect:/";
	}
	
	@RequestMapping("/delete")
	public String doDelete(HttpServletRequest req){
		int post_id = Integer.parseInt(req.getParameter("post_id"));
		pdao.deletePosting(post_id);
		return "redirect:/";
	}
//	@RequestMapping("/getPosting")
//	@ResponseBody
//	public String doGetRoomType() {
//		ArrayList<Posting> post = pdao.list();
//		
//		System.out.println("size["+post.size()+"]");
//		JSONArray ja = new JSONArray();
//		for(int i=0; i<post.size(); i++) {
//			JSONObject jo = new JSONObject();
//			jo.put("post_id",post.get(i).getPost_id());
//			jo.put("title", post.get(i).getTitle());
//			jo.put("writer", post.get(i).getWriter());
//			jo.put("created", post.get(i).getCreated());
//			jo.put("updated", post.get(i).getUpdated());
//			ja.add(jo);
//		}
//		return ja.toString();
//	}
	
	@RequestMapping("/view")
	public String doView(HttpServletRequest req, Model model){
		int post_id = Integer.parseInt(req.getParameter("post_id"));
		View view = pdao.viewPosting(post_id);
		
		model.addAttribute("viewlist", view);
		return "view";
	}
	
	@RequestMapping("/update")
	public String doUpdate(HttpServletRequest req, Model model){
		int post_id = Integer.parseInt(req.getParameter("post_id"));
		View view = pdao.viewPosting(post_id);
		model.addAttribute("view", view);
		return "update";
	}
	@RequestMapping("/doUpdate")
	public String dodoUpdate(HttpServletRequest req){
		int post_id = Integer.parseInt(req.getParameter("post_id"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println(post_id);
		System.out.println(title);
		System.out.println(content);
		pdao.updatePosting(post_id, title, content);
		return "redirect:/";
	}
}
