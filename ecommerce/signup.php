
<!Doctype html>
<head>
<title> VALIDATION </title>
<style>
    #button{
        color: white;
        background-color: green;
    }
    a{
        color: white;
        text-decoration: none! important;
    }
</style>
<script>
   
   function validate() {
        var name = document.forms["RegForm"]["name"];
        var password = document.forms["RegForm"]["password"];
        var address = document.forms["RegForm"]["address"];
        var email = document.forms["RegForm"]["email"];
        var zipcode = document.forms["RegForm"]["zipcode"];
        
        if (name.value == "") {
            window.alert("Please enter your name.");
            name.focus();
            return false;
        }
        if (password.value == "") {
            window.alert("Please enter your password.");
            password.focus();
            return false;
        }
        if (address.value == "") {
            window.alert("Please enter your address.");
            address.focus();
            return false;
        }
        if (email.value == "") {
            window.alert("Please enter your email.");
            email.focus();
            return false;
        }

        if (zipcode.value.length <5) {
            window.alert("Please enter valid zipcode with 5 digits");
            zipcode.focus();
            return false;
        }
       return true;
   }
</script>
</head> 
<body>
     <strong><h1 style="color:red;">Already A member?</h1>&nbsp;</strong><button id="button"><a href="login.php" target="content" >LOGIN</a></button>
    <form name="RegForm" action="reg.php"  onsubmit="return validate()" method="post">
    <legend><b><font size="15px">Registration Form</font></b></legend>
</br>
<strong>Name:<strong><input type="text" name="name"></br>
</br>
<label for="password"><strong>Password<strong></label>
<input type="password" name="password"></br>
</br>
</br>
<label for="Address"><strong>Address:<strong></label>
<input type="text" name="address" ></br>
</br>
</br>
<label for="zipcode"><strong>ZIP Code:<strong></label>
<input type="digit" name="zipcode" ></br>
</br>
<label for="email"><strong>Email:<strong></label>
<input type="email" name="email"></br>

</br>
</br>
<button type="submit"><b>Submit</button>


</form>

</body>
</html>