<form method="POST" action="Login_NewStore" onsubmit="return checkForm(this);">
<fieldset>
<legend>Sign up for Event</legend>
<p>Username: <input title="Enter your username" type="text" required pattern="\w+" name="username" placeholder="Create Username"></p>
<p>Password: <input title="Password must contain at least 6 characters, including UPPER/lowercase and numbers" placeholder="Create Password"type="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" name="pwd1" onchange="
  this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
  if(this.checkValidity()) form.pwd2.pattern = this.value;
"></p>
<p>Confirm Password: <input title="Please enter the same Password as above" placeholder="Confirm Password"type="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" name="pwd2" onchange="
  this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
"></p>
<p><input type="submit" value="Sign up"></p>
</fieldset>
<a href="Login_Ex.jsp">Sign in</a>
</form>