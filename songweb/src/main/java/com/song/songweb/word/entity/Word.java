/**
 * Copyright (c) 1999-2012 www.huilan.com
 *
 * Licensed under the Huilan License, Version 1.0 (the "License");
 */
package com.song.songweb.word.entity;

/**  
 * <STRONG>类描述</STRONG> :  <p>
 *   
 * @version 1.0 <p>
 * @author songlg@huilan.com<p>
 * 
 * <STRONG>创建时间</STRONG> : 2018-8-28 上午9:53:53<p>
 * <STRONG>修改历史</STRONG> :<p>
 *<pre>
 * 修改人                      修改时间                        修改内容
 * ---------------         -------------------         -----------------------------------
 * songlg@huilan.com        2018-8-28 上午9:53:53
 *</pre>  
 */
public class Word {

	private String wordId;
	private String wordValue;
	private String wordYear;
	private String isNew;
	private String wordCount;
	public String getWordId() {
		return wordId;
	}
	public void setWordId(String wordId) {
		this.wordId = wordId;
	}
	public String getWordValue() {
		return wordValue;
	}
	public void setWordValue(String wordValue) {
		this.wordValue = wordValue;
	}
	public String getWordYear() {
		return wordYear;
	}
	public void setWordYear(String wordYear) {
		this.wordYear = wordYear;
	}
	public String getIsNew() {
		return isNew;
	}
	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}
	public String getWordCount() {
		return wordCount;
	}
	public void setWordCount(String wordCount) {
		this.wordCount = wordCount;
	}
	
}
