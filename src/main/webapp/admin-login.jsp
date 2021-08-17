<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to FlyAway</title>
<style><%@include file="/css/styles.css"%>

</style>
</head>
<body><br><br>
<h2>Login</h2>    
<div class="login"> 

<form action="login" method="post">  
 <label><b>Username     
        </b>  <br>  
        </label><input type="text" name="username" id="Uname" placeholder="Username"/><br/><br/>  
<br>   
        <label><b>Password     
        </b></label><input type="password" name="password" id="Pass" placeholder="Password"/><br/><br/>  
<input type="submit" value="login" id="log"/>  
</form> 
</div>
</body>
</html>