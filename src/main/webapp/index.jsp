<html>
<head>
<script>
function onload()
{
document.getElementById('if').src="http://localhost:9090/ViewServlet";
}
</script>
</head>
<style>
body {
    background-image: url("http://www.isiqiri-multi-touch.com/wp-content/uploads/2011/09/animation2.jpg");
    }
</style>
<body onload='onload();'>
<h2>!    Welcome   !</h2>
<pre>
<form action="SaveServlet" method="post">
Id       :<input type="text" name="id">      </br>
Username :<input type="text" name="username"></br>
Password :<input type="text" name="password"></br>
<input type="submit" name="summit"></form></pre>

<br/>  
<a href="ViewServlet">view LoginUser</a>  
<iframe  name='if' id="if" height="300px" width="600px">
 
</iframe>




</body>
</html>
