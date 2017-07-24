   <html>
   <head>
<title>Login</title>
<meta charset='utf-8'>
	<link rel='shortcut icon' href='fav.jpg' type='image' />
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

<style>
.login{
    border: 10px solid skyblue;
    margin-top:25px;
    margin-left:500px;
    padding:50px;
    width:300px;
}

</style>

   </head>

<div class="login">

    <form action="LoginValidation" method="post">  
    User Name:<input type="text" name="username"/><br/><br/>  
    Password:<input type="password" name="userpass"/><br/><br/>  
   <label name="user">user: </label>
					<select name='user'>  
     
    <option>Existing User</option>  
    <option>Admin</option>  
    </select>  
    <input type="submit" value="Sign in"/>  
    
    </form>  

    </div>
    </html>