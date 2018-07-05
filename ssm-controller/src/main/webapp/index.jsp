<html>
	<body>
		<h1 align="center">Create New Account</h1>
		<!-- <p>
			Username<input type="text" id="userName" value=""/>
			<button onclick="getUserInfo();" type="button" class="button btn">Sign up</button>
		</p> -->
		<form>
			Username<br/>
			<input type="text" id="name" /><br/>
			Email<br/>
			<input type="text" id="email" /><br/>
			Password<br/>
			<input type="text" id="password" /><br/>
			Confirm Password<br/>
			<input type="text" id="confirm" />
		</form>
		<p>
			<button onclick="signUp();" type="button" class="button btn">Sign up</button>
		</p>
	</body>
	<script type="text/javascript" src="./js/jquery-1.7.min.js"></script>
	<script type="text/javascript">
		function signUp() {
			var name = $('#name').val();
			var email = $('#email').val();
			var password = $('#password').val();
			$.ajax({
				type : "post",
				url : "${pageContext.request.contextPath}/userController/addUser",
				timeout:30000,
				data : {
					userName : name,
					email : email,
					password : password
				},
				dataType : "json",
				success : function(data) {
					alert("done")
				},
				error : function(data) {
				}
			});
		}
		function getUserInfo() {
			var name = $('#userName').val();
			$.ajax({
				type : "post",
				url : "${pageContext.request.contextPath}/userController/getUserInfo",
				timeout:30000,
				data : {
					userName : name
				},
				dataType : "json",
				success : function(data) {
					alert("done!")
				},
				error : function(data) {
				}
			});
		}
	</script>
</html>
