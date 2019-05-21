<?php
//index.php




?>
<!DOCTYPE html>
<html>
 <head>
  <title>Event Calender</title>
  <link rel="stylesheet" href="fullcalendar.css" />
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha.6/css/bootstrap.css" />
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.1/moment.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/3.4.0/fullcalendar.min.js"></script>

  <!--header css-->

 <!------------------------------------------------------------------header css added by sudesh the legend -->

   <!-- <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,500,700|Open+Sans" rel="stylesheet">
    <link rel="stylesheet" href="css/styles-merged.css">
    <link rel="stylesheet" href="css/style.min.css">
    <link rel="stylesheet" href="css/custom.css">  -->
  <script>
   
  $(document).ready(function() {
   var calendar = $('#calendar').fullCalendar({
    editable:true,
    header:{
     left:'prev,next today',
     center:'title',
     right:'month,agendaWeek,agendaDay'
    },
    events: 'load.php',
    selectable:true,
    selectHelper:true,
    

   });
  });
   
  </script>
  <style type="text/css">
    body{
      background-image: url('S.jpg');
    }
    .container{
      background: rgba(255, 255, 255, 0.7);
      border-radius: 10px;
      padding-top: 25px;
      padding-bottom: 25px;
      z-index: 0;
    }
    .hedding{
      color: red;
      font-size: 50px;
      font-family: 'Roboto', inky;
      src: url('https://fonts.googleapis.com/css?family=Roboto'); 
    }
  </style>
 </head>
 <body>

   <!--header-->

   <!---------------------------------------------- header added by sudesh..bt ur shit didnt allow me to create it properly -->

<!-- <div class="probootstrap-search" id="probootstrap-search">
      <a href="#" class="probootstrap-close js-probootstrap-close"><i class="icon-cross"></i></a>
      <form action="#">
        <input type="search" name="s" id="search" placeholder="Search a keyword and hit enter...">
      </form>
    </div>
    
    <div class="probootstrap-page-wrapper">
      
      
      <div class="probootstrap-header-top">
        <div class="container">
          <div class="row">
            <div class="col-lg-9 col-md-9 col-sm-9 probootstrap-top-quick-contact-info">
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
                  <li><a href="courses.html">Courses</a></li>
                  <li><a href="Homepage\course-single.html">Course Single</a></li>
                  <li><a href="Homepage\gallery.html">Gallery</a></li>
                  <li><a href="Homepage\news.html">News</a></li>
                  <li><a href="Homepage\about.html">About Us</a></li>
                </ul>
              </li>
              <li><a href="../signin.jsp">Login</a></li>
            </ul>
          </div>
        </div>
      </nav> -->

      <!-- header end -->

  <br />
  <h2 align="center" class="hedding">Events</h2>
  <br />
  <div class="container">
    <div id="calendar"></div>
 </div>

 <!-- END wrapper -->
   
   <!--------------------------------------------------------------------js part related to the header also added by sudesh the legend -->

<!-- 
    <script src="js/scripts.min.js"></script>
    <script src="js/main.min.js"></script>
    <script src="js/custom.js"></script> -->

 </body>
</html>