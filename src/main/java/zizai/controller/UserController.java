package zizai.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import zizai.model.User;
import zizai.service.StudentService;
import zizai.service.UserService;

@Controller  
@RequestMapping("/user") 
public class UserController {
	@Resource
	private UserService userService;
	@Resource
	private StudentService studentService;
	 @RequestMapping("/showUser")  
	    public String showUser(HttpServletRequest request,Model model){  
	        int userId = Integer.parseInt(request.getParameter("id"));  
	        User user = this.userService.getUserById(userId);  
	        model.addAttribute("user", user);  
	        return "showUser";  
} 
	 @RequestMapping("/table")  
	 public ModelAndView showTable(HttpServletRequest request){  
	 ModelAndView view = new ModelAndView("tables");
		return view; 
	       
} 
	 @RequestMapping("/index")  
	    public ModelAndView toIndex(HttpServletRequest request){  
		 ModelAndView view = new ModelAndView("login");
		return view;
} 
	 @RequestMapping("/login2")  
	 public ModelAndView login(HttpServletRequest request,Model model){
		 String  username = request.getParameter("name");
		 String pwd = request.getParameter("pwd");
		 User user = this.userService.getUserByName(username);
		 String url="login";
		 if(user!=null&&pwd.equals(user.getPwd())){
			 url="sucess";
		 }else{
			 url="fail";
		 }
		 ModelAndView view = new ModelAndView(url);
		 return view;
	 } 
	 @RequestMapping("/register")  
	 public ModelAndView register(HttpServletRequest request,Model model){	 
		 String  username = request.getParameter("name");
		 String pwd = request.getParameter("pwd");
		 User user = new User(); 
		 user.setName(username);
		 user.setPwd(pwd);
		 int i=this.userService.addUser(user);
		 String url="register";
		 if(username!=null||pwd!=null){		
		 if(i>0){
			 url="login";
		 }else{
			 url="fail";
		 }				 
		}
		 ModelAndView view = new ModelAndView(url);
		return view;
	 } 
	
	 @RequestMapping("/updateUserPwd")  
		public String updateUserPwd(HttpServletRequest request,Model model){
	    String name=request.getParameter("name");
	    String pwd=request.getParameter("pwd");
	    String pwd1=request.getParameter("pwd1");
	    if(pwd1.equals(pwd)&&pwd1!=null){	    
	    User user=new User();
	    user.setPwd(pwd);
	    user.setName(name);
	    int i=this.userService.updateUserPwdByName(user);	    
		return "success";
	    }
	    else{
	    	return "fail2";
	    }
		 }
	 @RequestMapping("/getUserByName")  
	 public ModelAndView selectByName(HttpServletRequest request,Model model){
		String name = request.getParameter("name");
		User user=new User();
		user=this.userService.getUserByName(name);
		String url="getUserByName";
		if(name!=null){
			url="updateUserPwd";
		}		
		ModelAndView view = new ModelAndView();
		view.setViewName(url);
		view.addObject("xxx", user);
		
	    return view;
	 }
	

}
