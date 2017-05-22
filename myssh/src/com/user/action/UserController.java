package com.user.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

 

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.user.entity.User;
import com.wulian.common.CommonUtils;
 
 
 

@Controller("loginAction") 

public class UserController extends ActionSupport {
	public String username;
	public String password;
	public User user;
	public String id;
	
	private InputStream inputStream;
	
	@Autowired
	public com.user.service.UserService service;

	public String execute() {
		String __cmd;
		HttpServletRequest request=ServletActionContext.getRequest();
		__cmd = request.getParameter("cmd");
		
//		if(null==__cmd){
//			 inputStream=ReturnString.ErrortoJson(ComConst.CMDError);
//			return SUCCESS;			
//		} 
		switch (__cmd) {
		case "push":
			successtoJson("www.baidu.com");			
			
			break;

		default: 		
		String name=getUsername();
		String pwd=getPassword();	
		
		if(CommonUtils.isEmpty(name)||CommonUtils.isEmpty(pwd)){
			failtoJson("");			
		}
		
		
//		String name=request.getParameter("username");
//		String pwd=request.getParameter("password");		
		System.out.println("name:"+name+";pwd:"+pwd);
		
		User user=new User();
		user.setAge(1);
		user.setName(name);
		user.setPassword(pwd);
//		service.addUser(user);
		
		
		
		if(1==service.addUser(user)){
			successtoJson("ok");
//			ReturnString.RighttoJson(ComConst.LoginSuccess);
		}else{
			failtoJson("");
//			ReturnString.ErrortoJson(ComConst.CMDError);
		}
		
		break;
	}
	
		return "success";
	}

	public void  deleteUser(){
		service.deleteUser(id);
	}
	
	
	public String showUser(){
		user=service.findById("8a88ce795606ebd4015606ec454c0000");
		return "show";
	}
	
	public void updateUser(){
		user.setAge(222);
		service.updateUser(user);
	}
	

	public InputStream getInputStream()
	{
		return this.inputStream;
	}
	
	public void setInputStream(InputStream inputStream)
	{
		this.inputStream = inputStream;
	}	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	private void successtoJson(String cause)
	{
		JSONObject json = new JSONObject();		
		json.put("flag", 1);
		json.put("data", cause);
		
//		System.out.println(json.toString());
		try {
			inputStream = new ByteArrayInputStream((json.toString()).getBytes("UTF-8"));//json.toString()
			setInputStream(inputStream);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void failtoJson(String cause)
	{
		JSONObject json = new JSONObject();		
		json.put("flag", 0);
		json.put("data", cause);
		
//		System.out.println(json.toString());
		try {
			inputStream = new ByteArrayInputStream((json.toString()).getBytes("UTF-8"));//json.toString()
			setInputStream(inputStream);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
