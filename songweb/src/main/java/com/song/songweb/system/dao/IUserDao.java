/**
 * Copyright (c) 1999-2012 www.huilan.com
 *
 * Licensed under the Huilan License, Version 1.0 (the "License");
 */
package com.song.songweb.system.dao;

import org.springframework.stereotype.Repository;

import com.song.songweb.system.entity.User;

/**  
 * <STRONG>类描述</STRONG> :  <p>
 *   
 * @version 1.0 <p>
 * @author songlg@huilan.com<p>
 * 
 * <STRONG>创建时间</STRONG> : 2018-8-29 上午9:30:08<p>
 * <STRONG>修改历史</STRONG> :<p>
 *<pre>
 * 修改人                      修改时间                        修改内容
 * ---------------         -------------------         -----------------------------------
 * songlg@huilan.com        2018-8-29 上午9:30:08
 *</pre>  
 */

@Repository("userDao")
public interface IUserDao {
	User findUser(User user);
}
