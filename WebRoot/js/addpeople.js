function submitbbsforum()
	{
		if (document.bbsforum.u_username.value =="")
		{
			alert('用户名不能为空！');
			document.forms["bbsforum"].elements["u_username"].focus();
			return false;
		}

		if (document.bbsforum.r_id.value =="")
		{
			alert('r_id不能为空！');
			document.forms["bbsforum"].elements["r_id"].focus();
			return false;
		}

		
		if (document.bbsforum.u_password.value =="")
		{
			alert('密码不能为空！');
			document.forms["bbsforum"].elements["u_password"].focus();
			return false;
		}
		
		return true;
	}
	
