window.onload = function() {
	let name = document.getElementById("buyaoshow").value;
	document.getElementById("show").innerHTML = name;
	if (document.getElementById("username") != null)
		document.getElementById("username").innerHTML = name;
	let nowd = new Date();
	let nowh = nowd.getHours();
	// 23 - 4 夜深了
	// 5 - 11 上午好
	// 12 - 18 下午好
	// 19 - 21 晚上好
	if (nowh >= 5 && nowh <= 11) {
		document.getElementById("sayhi").innerHTML = "上午好";
	}
	else if (nowh >= 12 && nowh <= 18) {
		document.getElementById("sayhi").innerHTML = "下午好";
	}
	else if (nowh >= 19 & nowh <= 22) {
		document.getElementById("sayhi").innerHTML = "晚上好";
	}
	else if (nowh == 23 || nowh <= 4) {
		document.getElementById("sayhi").innerHTML = "夜深了";
	}
}
