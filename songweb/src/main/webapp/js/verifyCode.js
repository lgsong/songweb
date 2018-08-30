
/**
 * 验证code-js
 */
 
// 点击换一张验证码
function changeImg() {
	var imgSrc = $("#imgObj");
	var src = imgSrc.attr("src");
	imgSrc.attr("src", chgUrl(src));
	$("#info").html("");
}
// 时间戳
// 为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
function chgUrl(url) {
	var timestamp = (new Date()).valueOf();
	if(url.indexOf("?")>0){
		url = url.substring(0, url.indexOf("?"));
		url = url + "?timestamp=" + timestamp;
	}else{
		url = url + "?timestamp=" + timestamp;
	}
	return url;
}
// 验证码验证
function isRightCode() {
	var code = $("#veryCode").val();
	$.ajax({
		type : "POST",
		url : $("basePath").val()+"login/checkNum",
		data : {"number":code},
		success : function(data){
			
		}
	});
}
