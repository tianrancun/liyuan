<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>百度后台管理登录界面-www.phpjz.cn</title>
    <link href="comm/css/alogin.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <form id="loginform"  action="login" method="post">
    <div class="Main">
        <ul>
            <li class="top"></li>
            <li class="top2"></li>
            <li class="topA"></li>
            <li class="topB"><span>
                <img src="comm/images/login/logo.gif" alt="" style="" />
            </span></li>
            <li class="topC"></li>
            <li class="topD">
                <ul class="login">
                    <li><span class="left">用户名：</span> <span style="left">
                        <input name="username" type="text" class="txt" />  
                     
                    </span></li>
                    <li><span class="left">密 码：</span> <span style="left">
                       <input name="password" type="text" class="txt" />  
                    </span></li>
                         <li><span class="left">验证码：</span> <span style="left">
                    <input id="Text3" type="text" class="txtCode" />  
                    </span>
                    </li>
                    <li>
                    <span class="left">记住我：</span>
                        <input id="Checkbox1" type="checkbox" />
                    </li>
                </ul>
            </li>
            <li class="topE"></li>
            <li class="middle_A"></li>
            <li class="middle_B"></li>
            <li class="middle_C">
            <a type="submit" class="btn" href="javascript:userLogin()">
                <img alt="" src="comm/images/login/btnlogin.gif" />
            </a>
            </li>
            <li class="middle_D"></li>
            <li class="bottom_A"></li>
            <li class="bottom_B">
            PHP建站网 www.phpjz.cn
            </li>
        </ul>
    </div>
    </form>
</body>
<script type="text/javascript">
	function userLogin() {
		 document.getElementById("loginform").submit();
		
	}
</script>
</html>
