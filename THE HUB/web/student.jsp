<!DOCTYPE html>
<html lang="en">
<head>
	<title>Student Registration</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="Student/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Student/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Student/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Student/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Student/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Student/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Student/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="sStudent/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Student/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="Student/css/util.css">
	<link rel="stylesheet" type="text/css" href="Student/css/main.css">
<!--===============================================================================================-->
</head>
<body>


	<div class="container-contact100">
		<div class="wrap-contact100">
			<form action="Student_reg" class="contact100-form validate-form" method="post">
                            
				<span class="contact100-form-title">
					Get your admission from here!
				</span>                         
                                
				<label class="label-input100" for="first-name">Tell us your name *</label>
				<div class="wrap-input100 rs1-wrap-input100 validate-input" data-validate="Type first name">
					<input id="first-name" class="input100" type="text" name="first_name" placeholder="First name">
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100 rs2-wrap-input100 validate-input" data-validate="Type last name">
					<input class="input100" type="text" name="last_name" placeholder="Last name">
					<span class="focus-input100"></span>
				</div>

				<label class="label-input100" for="email">Enter your email *</label>
				<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
					<input id="email" class="input100" type="text" name="email" placeholder="Eg. example@email.com">
					<span class="focus-input100"></span>
				</div>

				<label class="label-input100" for="phone">Enter phone number</label>
				<div class="wrap-input100 validate-input" data-validate = "Valid phone number is required: ex. +94 12 345 6789">
					<input id="phone" class="input100" type="text" name="phone" placeholder="Eg. +94 12 345 6789">
					<span class="focus-input100"></span>
				</div>

				<label class="label-input100" for="phone">Enter you're university and faculty</label>
				<div class="wrap-input100 validate-input" data-validate = "Valid university and faculty is required: ex. ABC university, computing faculty">
					<input id="university and faculty" class="input100" type="text" name="faculty" placeholder="Eg. ABC university, computing faculty">
					<span class="focus-input100"></span>
				</div>

				<label class="label-input100" for="Age">Age *</label>
				<div class="wrap-input100 validate-input" data-validate = "Valid Age is required: ex. 18 years and above">
					<input id="Age" class="input100" type="text" name="Age" placeholder="Eg. 18 years and above">
					<span class="focus-input100"></span>
				</div>

				<div class="container-contact100-form-btn">
					<button class="contact100-form-btn">
						Submit
					</button>
				</div>
			</form>

			<div class="contact100-more flex-col-c-m" style="background-image: url('Student/images/bg-01.jpg');">
				<div class="flex-w size1 p-b-47">
					<div class="txt1 p-r-25">
						<span class="lnr lnr-map-marker"></span>
					</div>

					<div class="flex-col size2">
						<span class="txt1 p-b-20">
							Address
						</span>

						<span class="txt2">
							309 Dampe,<br>
							Pitipana Rd,<br>
							kottawa<br> 
							Sri Lanka.
						</span>
					</div>
				</div>

				<div class="dis-flex size1 p-b-47">
					<div class="txt1 p-r-25">
						<span class="lnr lnr-phone-handset"></span>
					</div>

					<div class="flex-col size2">
						<span class="txt1 p-b-20">
							Lets Talk
						</span>

						<span class="txt3">
							011 5 446 005,<br>
							+94 76 216 2374 (Sudesh Fernandez)
						</span>
					</div>
				</div>

				<div class="dis-flex size1 p-b-47">
					<div class="txt1 p-r-25">
						<span class="lnr lnr-envelope"></span>
					</div>

					<div class="flex-col size2">
						<span class="txt1 p-b-20">
							General Support
						</span>

						<span class="txt3">
							sudeshfernandez98@gmail.com
						</span>
					</div>
				</div>
			</div>
		</div>
	</div>



	<div id="dropDownSelect1"></div>

<!--===============================================================================================-->
	<script src="Student/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="Student/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="Student/vendor/bootstrap/js/popper.js"></script>
	<script src="Student/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="Student/vendor/select2/select2.min.js"></script>
	<script>
		$(".selection-2").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect1')
		});
	</script>
<!--===============================================================================================-->
	<script src="Student/vendor/daterangepicker/moment.min.js"></script>
	<script src="Student/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="Student/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="Student/js/main.js"></script>
	<!-- Global site tag (gtag.js) - Google Analytics -->
	<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
	<script>
	  window.dataLayer = window.dataLayer || [];
	  function gtag(){dataLayer.push(arguments);}
	  gtag('js', new Date());

	  gtag('config', 'UA-23581568-13');
	</script>
</body>
</html>
