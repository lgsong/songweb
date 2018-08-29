/**
 * Copyright (c) 1999-2012 www.huilan.com
 *
 * Licensed under the Huilan License, Version 1.0 (the "License");
 */
package com.song.songweb.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import sun.misc.BASE64Decoder;

import com.song.songweb.system.entity.User;
import com.song.songweb.system.service.IUserService;


/**  
 * <STRONG>类描述</STRONG> :  <p>
 *   
 * @version 1.0 <p>
 * @author songlg@huilan.com<p>
 * 
 * <STRONG>创建时间</STRONG> : 2018-8-28 下午4:40:20<p>
 * <STRONG>修改历史</STRONG> :<p>
 *<pre>
 * 修改人                      修改时间                        修改内容
 * ---------------         -------------------         -----------------------------------
 * songlg@huilan.com        2018-8-28 下午4:40:20
 *</pre>  
 */
@Controller
@RequestMapping(value="/login")
public class LoginController {
	
	@Autowired
	private IUserService userService;

	@RequestMapping(value="/toLogin",method=RequestMethod.GET)
	public ModelAndView login(){
		ModelAndView mav = new ModelAndView();
		/*BASE64Decoder decoder =new BASE64Decoder();
		User user = new User();
		try {
			user = userService.findUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		mav.setViewName("/login");
		return mav;
	}
}
