/**
 * Copyright (c) 1999-2012 www.huilan.com
 *
 * Licensed under the Huilan License, Version 1.0 (the "License");
 */
package com.song.songweb.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.song.songweb.system.dao.IUserDao;
import com.song.songweb.system.entity.User;
import com.song.songweb.system.service.IUserService;

/**  
 * <STRONG>类描述</STRONG> :  <p>
 *   
 * @version 1.0 <p>
 * @author songlg@huilan.com<p>
 * 
 * <STRONG>创建时间</STRONG> : 2018-8-29 上午9:28:03<p>
 * <STRONG>修改历史</STRONG> :<p>
 *<pre>
 * 修改人                      修改时间                        修改内容
 * ---------------         -------------------         -----------------------------------
 * songlg@huilan.com        2018-8-29 上午9:28:03
 *</pre>  
 */
@Component
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao userDao;

	@Override
	public User findUser(User user) throws Exception {
		return userDao.findUser(user);
	}

}
