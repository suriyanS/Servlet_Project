

<!Doctype html>
<html>

<head>
	<title> Event Registration </title>

	<meta charset='utf-8'>
	<link rel='shortcut icon' href='fav.jpg' type='image' />
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

	<style>
		.well {
			background-color: #3d40db;
			padding-left:400px;
			font-size: 30px;
			color: white;
		}

		.jumbotron {
			color: #db443d;
			background-color: #e4e8dc;
		}

		label {
			display: inline-block;
			width: 140px;
			text-align: center;
		}
	.out{
		margin-left:300px;
	}


	</style>


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


<script>
function onload()
{
document.getElementById('if').src="http://localhost:9090/ViewServlet";
}
</script>

</head>

<body onload='onload();'>
	<div class='container-fluid'>
		<br/>
		<div class='well'>Event Registration-Admin Home
		
	
		<a href="/Logout"><button class="btn btn-danger out">Sign Out</button></a>
		
		</div>
		<br/>

		<div class='jumbotron'>
			<form action='admin_SaveServlet' class='form-inline' method='post'>
				<div class='row'>

					<div class='col-sm-4'>
						<label>First Name:</label> <input type='text' required placeholder='First Name' name='firstname'/><br/><br/>  
    <label>Last Name:</label> <input type='text'  placeholder='Initial'  name='lastname' /><br/><br/>
					</div>

					<div class='col-sm-4'>
						<label>Email Id:</label> <input type='email' placeholder='Email' required name='email' /><br/><br/>
						<label>Date:</label> <input type='date' required placeholder='Date' name='date' /><br/><br/>
					</div>

					<div class='col-sm-4'>
						<label>Time:</label> <input type='time' placeholder='Time' required name='time' /><br/><br/>
						<label>Topic:</label> <input type='text' placeholder='Topic' required name='topic' /><br/><br/>
					</div>

					<label>Location: </label>
					<select name='location'>  
    <option>Coimbatore</option>  
    <option>Bangalore</option>  
    <option>other</option>  
    </select>
					<br/><br/>

					<div class='span12'>
						<button  name="Register" class='btn btn-primary' type='submit'>Register <span class='glyphicon glyphicon-save'></span></button>

						<button  class='btn btn-danger' type='reset'>Cancel <span class='glyphicon glyphicon-remove'></span></button>
						
					</div>
				</div>
			</form>
		</div>


<iframe name='if' id="if"  height="300px" width="1330px" frameborder="0">

</iframe>

		

	</div>

</body>

</html>