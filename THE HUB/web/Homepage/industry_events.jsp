<%@page import="java.util.Iterator"%>
<%@page import="common.industry_events_bean"%>
<%@page import="java.util.List"%>
<%@page import="CRUD.industry_events"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>The Hub</title>
    <meta name="description" content="Free Bootstrap Theme by uicookies.com">
    <meta name="keywords" content="free website templates, free bootstrap themes, free template, free bootstrap, free website template">
    
    <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,500,700|Open+Sans" rel="stylesheet">
    <link rel="stylesheet" href="css/styles-merged.css">
    <link rel="stylesheet" href="css/style.min.css">
    <link rel="stylesheet" href="css/custom.css">

    <!--[if lt IE 9]>
      <script src="js/vendor/html5shiv.min.js"></script>
      <script src="js/vendor/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>

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

              <li><a href="index.jsp">Home</a></li>
              <li><a href="industry.jsp">Industry</a></li>
              <li ><a href="university.jsp">University</a></li>
              <li><a href="students.jsp">Students</a></li>

              <li class="dropdown">
                <a href="#" data-toggle="dropdown" class="dropdown-toggle">More Pages</a>
                <ul class="dropdown-menu">

                   <li class="dropdown-submenu dropdown">
                    <a href="#" data-toggle="dropdown" class="dropdown-toggle"><span>Academic calenders</span></a>
                    <ul class="dropdown-menu">

                     <li><a href="..\Cal_insert.jsp">Add An Event</a></li>
                      <li><a href="http://localhost/calender/index.php">View Calender</a></li>
                      <li><a href="..\Calender\Cal_edit_delete.jsp">Edit Or Delete Events</a></li>
                      <li><a href="#">Second Level Menu</a></li>

                    </ul>
                  </li>
                  <li><a href="industry_events.jsp">All Industry Events</a></li>
                  <li><a href="university.jsp">All University Events</a></li>
                  <li><a href="course-single.html">Course Single</a></li>
                  <li><a href="gallery.html">Gallery</a></li>
                  <li><a href="about.html">About Us</a></li>
                </ul>
              </li>
                  <li><a href="../signin.jsp">Login</a></li>
                </ul>
              </li>
              <li><a href="contact.html">Contact</a></li>
            </ul>
          </div>
        </div>
      </nav>
      
      <section class="probootstrap-section probootstrap-section-colored">
        <div class="container">
          <div class="row">
            <div class="col-md-12 text-left section-heading probootstrap-animate">
              <h1>School Events</h1>
            </div>
          </div>
        </div>
      </section>

      <section class="probootstrap-section">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <div class="probootstrap-flex-block">
                <div class="probootstrap-text probootstrap-animate">
                  <div class="text-uppercase probootstrap-uppercase">Featured News</div>
                  <h3>Students Math Competition for The Year 2017</h3>
                  <p>Quis explicabo veniam labore ratione illo vero voluptate a deserunt incidunt odio aliquam commodi </p>
                  <p>
                    <span class="probootstrap-date"><i class="icon-calendar"></i>July 9, 2017</span>
                    <span class="probootstrap-location"><i class="icon-user2"></i>By Admin</span>
                  </p>
                  <p><a href="#" class="btn btn-primary">Learn More</a></p>
                </div>
                <div class="probootstrap-image probootstrap-animate" style="background-image: url(img/slider_4.jpg)">
                  <a href="https://vimeo.com/45830194" class="btn-video popup-vimeo"><i class="icon-play3"></i></a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>


      
      
      <section class="probootstrap-section">
        <div class="container">

          <div class="row">
            <div class="col-md-4 col-sm-6 col-xs-6 col-xxs-12 probootstrap-animate">
              <a href="#" class="probootstrap-featured-news-box">
                <figure class="probootstrap-media"><img src="img/img_sm_1.jpg" alt="Free Bootstrap Template by uicookies.com" class="img-responsive"></figure>
                <div class="probootstrap-text">
                  <h3>Tempora consectetur unde nisi</h3>
                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis, quaerat?</p>
                  <span class="probootstrap-date"><i class="icon-calendar"></i>July 9, 2017</span>
                  <span class="probootstrap-location"><i class="icon-user2"></i>By Admin</span>
                </div>
              </a>
            </div>
            <div class="col-md-4 col-sm-6 col-xs-6 col-xxs-12 probootstrap-animate">
              <a href="#" class="probootstrap-featured-news-box">
                <figure class="probootstrap-media"><img src="img/img_sm_2.jpg" alt="Free Bootstrap Template by uicookies.com" class="img-responsive"></figure>
                <div class="probootstrap-text">
                  <h3>Tempora consectetur unde nisi</h3>
                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nihil, unde?</p>
                  <span class="probootstrap-date"><i class="icon-calendar"></i>July 9, 2017</span>
                  <span class="probootstrap-location"><i class="icon-user2"></i>By Admin</span>
                </div>
              </a>
            </div>
            <div class="clearfix visible-sm-block visible-xs-block"></div>
            <div class="col-md-4 col-sm-6 col-xs-6 col-xxs-12 probootstrap-animate">
              <a href="#" class="probootstrap-featured-news-box">
                <figure class="probootstrap-media"><img src="img/img_sm_3.jpg" alt="Free Bootstrap Template by uicookies.com" class="img-responsive"></figure>
                <div class="probootstrap-text">
                  <h3>Tempora consectetur unde nisi</h3>
                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus, possimus!</p>
                  <span class="probootstrap-date"><i class="icon-calendar"></i>July 9, 2017</span>
                  <span class="probootstrap-location"><i class="icon-user2"></i>By Admin</span>
                </div>
              </a>
            </div>

            <div class="clearfix visible-md-block"></div>

            <div class="col-md-4 col-sm-6 col-xs-6 col-xxs-12 probootstrap-animate">
              <a href="#" class="probootstrap-featured-news-box">
                <figure class="probootstrap-media"><img src="img/img_sm_1.jpg" alt="Free Bootstrap Template by uicookies.com" class="img-responsive"></figure>
                <div class="probootstrap-text">
                  <h3>Tempora consectetur unde nisi</h3>
                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet, sunt!</p>
                  <span class="probootstrap-date"><i class="icon-calendar"></i>July 9, 2017</span>
                  <span class="probootstrap-location"><i class="icon-user2"></i>By Admin</span>
                </div>
              </a>
            </div>
            <div class="clearfix visible-sm-block visible-xs-block"></div>
            <div class="col-md-4 col-sm-6 col-xs-6 col-xxs-12 probootstrap-animate">
              <a href="#" class="probootstrap-featured-news-box">
                <figure class="probootstrap-media"><img src="img/img_sm_2.jpg" alt="Free Bootstrap Template by uicookies.com" class="img-responsive"></figure>
                <div class="probootstrap-text">
                  <h3>Tempora consectetur unde nisi</h3>
                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Delectus, voluptatem.</p>
                  <span class="probootstrap-date"><i class="icon-calendar"></i>July 9, 2017</span>
                  <span class="probootstrap-location"><i class="icon-user2"></i>By Admin</span>
                </div>
              </a>
            </div>
            <div class="col-md-4 col-sm-6 col-xs-6 col-xxs-12 probootstrap-animate">
              <a href="#" class="probootstrap-featured-news-box">
                <figure class="probootstrap-media"><img src="img/img_sm_3.jpg" alt="Free Bootstrap Template by uicookies.com" class="img-responsive"></figure>
                <div class="probootstrap-text">
                  <h3>Tempora consectetur unde nisi</h3>
                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Corrupti, magnam.</p>
                  <span class="probootstrap-date"><i class="icon-calendar"></i>July 9, 2017</span>
                  <span class="probootstrap-location"><i class="icon-user2"></i>By Admin</span>
                </div>
              </a>
            </div>
            <div class="clearfix visible-sm-block visible-xs-block"></div>

          </div>

        </div>
      </section>
      
      <section class="probootstrap-cta">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <h2 class="probootstrap-animate" data-animate-effect="fadeInRight">Get your admission now!</h2>
              <a href="#" role="button" class="btn btn-primary btn-lg btn-ghost probootstrap-animate" data-animate-effect="fadeInLeft">Enroll</a>
            </div>
          </div>
        </div>
      </section>
      <footer class="probootstrap-footer probootstrap-bg">
        <div class="container">
          <div class="row">
            <div class="col-md-4">
              <div class="probootstrap-footer-widget">
                <h3>About The School</h3>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Porro provident suscipit natus a cupiditate ab minus illum quaerat maxime inventore Ea consequatur consectetur hic provident dolor ab aliquam eveniet alias</p>
                <h3>Social</h3>
                <ul class="probootstrap-footer-social">
                  <li><a href="#"><i class="icon-twitter"></i></a></li>
                  <li><a href="#"><i class="icon-facebook"></i></a></li>
                  <li><a href="#"><i class="icon-github"></i></a></li>
                  <li><a href="#"><i class="icon-dribbble"></i></a></li>
                  <li><a href="#"><i class="icon-linkedin"></i></a></li>
                  <li><a href="#"><i class="icon-youtube"></i></a></li>
                </ul>
              </div>
            </div>
            <div class="col-md-3 col-md-push-1">
              <div class="probootstrap-footer-widget">
                <h3>Links</h3>
                <ul>
                  <li><a href="#">Home</a></li>
                  <li><a href="#">Courses</a></li>
                  <li><a href="#">Teachers</a></li>
                  <li><a href="#">News</a></li>
                  <li><a href="#">Contact</a></li>
                </ul>
              </div>
            </div>
            <div class="col-md-4">
              <div class="probootstrap-footer-widget">
                <h3>Contact Info</h3>
                <ul class="probootstrap-contact-info">
                  <li><i class="icon-location2"></i> <span>198 West 21th Street, Suite 721 New York NY 10016</span></li>
                  <li><i class="icon-mail"></i><span>info@domain.com</span></li>
                  <li><i class="icon-phone2"></i><span>+123 456 7890</span></li>
                </ul>
              </div>
            </div>
           
          </div>
          <!-- END row -->
          
        </div>

        <div class="probootstrap-copyright">
          <div class="container">
            <div class="row">
              <div class="col-md-8 text-left">
                <p>&copy; 2017 <a href="https://uicookies.com/">uiCookies:Enlight</a>. All Rights Reserved. Designed &amp; Developed with <i class="icon icon-heart"></i> by <a href="https://uicookies.com/">uicookies.com</a></p>
              </div>
              <div class="col-md-4 probootstrap-back-to-top">
                <p><a href="#" class="js-backtotop">Back to top <i class="icon-arrow-long-up"></i></a></p>
              </div>
            </div>
          </div>
        </div>
      </footer>

    </div>
    <!-- END wrapper -->
    

    <script src="js/scripts.min.js"></script>
    <script src="js/main.min.js"></script>
    <script src="js/custom.js"></script>

  </body>
</html>