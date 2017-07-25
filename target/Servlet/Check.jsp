

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Example of Making GET Request using Ajax in jQuery</title>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
$("button").click(function(){
$.get("/CheckServlet", function(data){
// Display the returned data in browser
$("#result").html(data);
});
});
});
</script>
</head>
<body>
<div id="result">
<h2>Content of the result DIV box will be replaced by the /CheckServlet Data</h2>
</div>
<button type="button">Load Data Form Servlet</button>
</body>
</html>  