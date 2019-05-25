<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="keywords" content="Colorlib Templates">

    <!--Page Title -->
    <title>Add An Event</title>

    <!-- Icons font CSS-->
    <link href="Calender/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="Calender/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="Calender/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="Calender/vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="Calender/css/main.css" rel="stylesheet" media="all">

    <!--header css-->
    <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,500,700|Open+Sans" rel="stylesheet">
    <link rel="stylesheet" href="Homepage/css/styles-merged.css">
    <link rel="stylesheet" href="Homepage/css/style.min.css">
    <link rel="stylesheet" href="Homepage/css/custom.css">

    <!--[if lt IE 9]>
      <script src="js/vendor/html5shiv.min.js"></script>
      <script src="js/vendor/respond.min.js"></script>
    <![endif]-->

    <style>
        .bg-blue {
          background-image: url('Calender/images/fff.jpg');
        }

        #home_name{
        font-size: 40px;
        font-weight: bold;
        padding: 10px;
      }
    </style>
</head>

<body>

<!--header-->
<div class="probootstrap-search" id="probootstrap-search">
      <a href="#" class="probootstrap-close js-probootstrap-close"><i class="icon-cross"></i></a>
      <form action="#">
        <input type="search" name="s" id="search" placeholder="Search a keyword and hit enter...">
      </form>
    </div>
    
    <div class="probootstrap-page-wrapper">
      <!-- Fixed navbar -->
      
      <div class="probootstrap-header-top">
        <div class="container">
          <div class="row">
            <div class="col-lg-9 col-md-9 col-sm-9 probootstrap-top-quick-contact-info" >
              <span><i class="icon-location2"></i>Next Generation Colloboration</span>
              <span><i class="icon-phone2"></i>+1-123-456-7890</span>
              <span><i class="icon-mail"></i>info@thehub.com</span>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-3 probootstrap-top-social">
              <ul>
                <li><a href="#"><i class="icon-twitter"></i></a></li>
                <li><a href="#"><i class="icon-facebook2"></i></a></li>
                <li><a href="#"><i class="icon-instagram2"></i></a></li>
                <li><a href="#"><i class="icon-youtube"></i></a></li>
                <li><a href="#" class="probootstrap-search-icon js-probootstrap-search"><i class="icon-search"></i></a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <nav class="navbar navbar-default probootstrap-navbar">
        <div class="container">
          <div class="navbar-header">
            <div class="btn-more js-btn-more visible-xs">
              <a href="#"><i class="icon-dots-three-vertical "></i></a>
            </div>
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <br>
            <a id="home_name" class="probootstrap-heading probootstrap-animate" href="index.jsp" title="HOME PAGE">THE HUB</a>
          </div>

          <div id="navbar-collapse" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">

              <li><a href="Homepage\index.jsp">Home</a></li>
              <li><a href="Homepage\industry.jsp">Industry</a></li>
              <li ><a href="Homepage\university.jsp">University</a></li>
              <li><a href="Homepage\students.jsp">Students</a></li>
              
              <li class="dropdown">
                <a href="#" data-toggle="dropdown" class="dropdown-toggle">More Pages</a>
                <ul class="dropdown-menu">
                
                <li class="dropdown-submenu dropdown">
                    <a href="#" data-toggle="dropdown" class="dropdown-toggle"><span>Academic calenders</span></a>
                    <ul class="dropdown-menu">

                      <li><a href="http://localhost/calender/index.php">View Calender</a></li>
                      <li><a href="..\Calender\Cal_edit_delete.jsp">Edit Or Delete Events</a></li>
                      <li><a href="#">Second Level Menu</a></li>

                    </ul>
                  </li>
                  <li><a href="Homepage\industry_events.jsp">All Industry Events</a></li>
                  <li><a href="Homepage\university.jsp">All University Events</a></li>
                  <li><a href="Homepage\course-single.html">Course Single</a></li>
                  <li><a href="Homepage\gallery.html">Gallery</a></li>
                  <li><a href="Homepage\about.html">About Us</a></li>
                </ul>
              </li>
              <li><a href="../signin.jsp">Login</a></li>
            </ul>
          </div>
        </div>
      </nav>
      <!--header end-->

    <div class="page-wrapper bg-blue p-t-180 p-b-100 font-robo">
        <div class="wrapper wrapper--w960">
            <div class="card card-2">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Create An Event</h2>
                    
                    <form action="Cal_insert_sevlet" method="post">
                        
                        <div class="input-group">
                            <input class="input--style-2" type="text" placeholder="Event Name" name="name">
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <input class="input--style-2 js-datepicker" type="text" placeholder="Starting Date" name="start_date">
                                    <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <input class="input--style-2 js-datepicker" type="text" placeholder="Ending Date" name="end_date">
                                    <i class="zmdi zmdi-calendar-note input-icon js-btn-calendar"></i>
                                </div>
                            </div>
                            
                        </div>
                        <div class="row row-space">
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="input--style-2">Starting Time</label>
                                    <input class="input--style-2" type="Time" placeholder="Starting Time" name="start_time">
                                  <!--  <i class="fa fa-clock-o input-icon01 js-btn-calendar" aria-hidden="true"></i> -->
                                </div>
                            </div>
                            <div class="col-2">
                                <div class="input-group">
                                    <label class="input--style-2">Ending Time</label>
                                    <input class="input--style-2" type="Time" placeholder="Ending Time" name="end_time">
                                   <!-- <i class="fa fa-clock-o input-icon01 js-btn-calendar" aria-hidden="true"></i> -->
                                </div>
                            </div>
                        </div>
                        <div class="input-group">
                            <input class="input--style-2" type="text" placeholder="Type a Discription about the Event Here" name="discription">
                        </div>
                        
                        <div class="p-t-30">
                            <button class="btn btn--radius btn--green" type="submit">Create Event</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="Calender/vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="Calender/vendor/select2/select2.min.js"></script>
    <script src="Calender/vendor/datepicker/moment.min.js"></script>
    <script src="Calender/vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="Calender/js/global.js"></script>
    <script src="Calender/js/global01.js"></script>

    <!-- END wrapper -->
    

    <script src="Homepage/js/scripts.min.js"></script>
    <script src="Homepage/js/main.min.js"></script>
    <script src="Homepage/js/custom.js"></script>

</body>

</html>
<!-- end document-->

