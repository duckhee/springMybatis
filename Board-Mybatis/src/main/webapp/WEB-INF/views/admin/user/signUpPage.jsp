<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 2 | Registration Page</title>
  <!-- shortcut icon show -->
  <link rel="shortcut icon" type="image/x-icon" href="<c:url value='/resources/logo_iot.png'/>" >
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="<c:url value='/resources/admin/bootstrap/css/bootstrap.min.css'/>">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="<c:url value='/resources/admin/dist/css/AdminLTE.min.css'/>">
  <!-- sweetalert2 -->
  <link rel='stylesheet' href='https://cdn.rawgit.com/t4t5/sweetalert/v0.2.0/lib/sweet-alert.css'>
  <!-- iCheck -->
  <link rel="stylesheet" href="<c:url value='/resources/admin/plugins/iCheck/square/blue.css'/>">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body class="hold-transition register-page">
<div class="register-box">
  <div class="register-logo">
    <a href="<c:url value='/'/>"><b>Admin</b>LTE</a>
  </div>

  <div class="register-box-body">
    <p class="login-box-msg">Register a new membership</p>

    <form action="<c:url value='/admin/users/signup'/>" method="post" name="registeForm">
      <div class="form-group has-feedback">
        <input type="text" class="form-control" placeholder="Full name" name="name" id="name" >
        <span class="glyphicon glyphicon-user form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="email" class="form-control" placeholder="Email" name="email" id="email">
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" placeholder="Password" name="password" id="password" >
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" id="confirmPassword" placeholder="Retype password">
        <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
      </div>
      <div class="row">
        <div class="col-xs-8">
          <div class="checkbox icheck">
            <label>
              <input type="checkbox"> I agree to the <a href="#">terms</a>
            </label>
          </div>
        </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="button" id="createBtn" class="btn btn-primary btn-block btn-flat">Register</button>
        </div>
        <!-- /.col -->
      </div>
    </form>

    <div class="social-auth-links text-center">
      <p>- OR -</p>
      <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-facebook"></i> Sign up using
        Facebook</a>
      <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-google-plus"></i> Sign up using
        Google+</a>
    </div>

    <a href="<c:url value='/admin/users/login'/>" class="text-center">I already have a membership</a>
  </div>
  <!-- /.form-box -->
</div>
<!-- /.register-box -->

<!-- jQuery 2.2.3 -->
<script src="<c:url value='/resources/admin/plugins/jQuery/jquery-2.2.3.min.js'/>"></script>
<!-- Bootstrap 3.3.6 -->
<script src="<c:url value='/resources/admin/bootstrap/js/bootstrap.min.js'/>"></script>
<!-- sweetalert2 -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/8.11.8/sweetalert2.all.min.js"></script>
<!-- iCheck -->
<script src="<c:url value='/resources/admin/plugins/iCheck/icheck.min.js'/>"></script>
<script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' // optional
    });
    /** Reg Email */
    function reEmail(_Email){
        let re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
        return re.test(_Email);
    }
    
    /** Get User Name */
    function UserNameCheck(){
    		/** Get User Name by Element ID */
    		let GetName = $("#name").val();
    		/** null value */
    		if(GetName == "" || Getname == null){
    			swal.fire({
    				title:'Not Null name',
    				type:'warning'
    			});
    			return false;
    		}
    		/** space value */
    		if(GetName.indexOf(' ') != -1){
    			swal.fire({
    				title:"Name do not have space value",
    				type:"warning"
    			});
    			return false;
    		}
    		/** Name value */
    		return true;
    }
    /** Get Uer Email */
    function UserEmailCheck(){
    		/** Get User Email by Element ID */
    		let GetEmail = $("#email").val();
    		/** null value */
    		if(GetEmail == "" || GetEmail == null){
    			swal.fire({
    				type:'warning',
    				title:"Not Null Email"
    			});
    			return false;
    		}
    		/** space value */
    		if(GetEmail.indexOf(" ") != -1){
    			swal.fire({
    				title:'Email do not have space value',
    				type:'warning'
    			});
    			return false;
    		}
    		/** Email value */
    		if(!reEmail(GetEmail)){
    			swal.fire({
    				type:'warning',
    				title:"not email type"
    			});
    			return false;
    		}
    		return true;
    }
    /** Get User Password */
    function UserPassCheck(){
    		/** Get User Password Element ID */
    		let GetPass = $("#password").val();
    		/** Get User Confirm Password Element ID */
    		let GetConfirmPass = $("#confirmPassword").val();
    		/** null value Password */
    		if(GetPass == null || GetPass == ""){
    			swal.fire({
    				type:'warning',
    				title:'Not Null Password'
    			});
    			return false;
    		}
    		/** space value Password */
    		if(GetPass.indexOf(" ") != -1){
    			swal.fire({
    				type:'warning',
    				title:'Password do not have space value'
    			});
    			return false;
    		}
    		/** null value Confirm Password */
    		if(GetConfirmPass == null || GetConfirmPass == ""){
    			swal.fire({
    				type:'warning',
    				title:'Not Null Cofirm Password'
    			});
    			return false;
    		}
    		/** space value Confirm Password */
    		if(GetConfirmPass.indexOf(" ") != -1){
    			swal.fire({
    				type:'warning',
    				title:'Confirm Password do not have space value'
    			});
    			return false;
    		}
    		/** compare Password to Confirm Password */
    		if(GetConfirmPass != GetPass){
    			swal.fire({
    				type:'warning',
    				title:"Not Match password"
    			});
    			/** Confirm Password value Reset */
    			$("#confirmPassword").empty();
    			return false;
    		}
    		return true;
    }
    
    /** Registe User */
    $("#createBtn").click(function(e){
    		/** Prevent Event */
    		e.preventDefault();
    		/** Value Check */
    		if(UserNameCheck() && UserEmailCheck() && UserPassCheck()){
    			/** Form Send */
    			document.registeForm.submit();
    		}
    });
    /** Confirm Password Enter Event */
    $("#confirmPassword").keydown(function(key){
    		/** Enter key Value */
    		if(key.code == 13){
    			/** Value Check */
        		if(UserNameCheck() && UserEmailCheck() && UserPassCheck()){
        			/** Form Send */
        			document.registeForm.submit();
        		}
    		}
    });
  });
</script>
</body>
</html>
