<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="common.User_Bean"%>
<%@page import="common.industry_events_bean"%>
<%@page import="common.industry_query_bean"%>
<%@page import="CRUD.Read_Values"%>
<%@page import="CRUD.industry_events"%>
<%@page import="CRUD.read_industry_query"%>
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
    <style>
      #indu{
        font-size: 100px;
        letter-spacing: 1px;
      }

      #home_name{
        font-size: 40px;
        font-weight: bold;
        padding: 10px;
      }
    </style>
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
              <li class="active"><a href="index.jsp">Home</a></li>
              <li><a href="industry.jsp">Industry</a></li>
              <li><a href="university.jsp">University</a></li>
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
                  
                  <li><a href="industry_events.jsp">All industry Events</a></li>
                  <li><a href="university_events.jsp">All University Events</a></li>
                  <li><a href="course-single.html">Course Single</a></li>
                  <li><a href="gallery.html">Gallery</a></li>
                  <li><a href="about.html">About Us</a></li>
                  
                  
                </ul>
              </li>
              <li><a href="../signin.jsp">Login</a></li>
            </ul>
          </div>
        </div>
      </nav>

      <section class="flexslider">
        <ul class="slides">
          <li style="background-image: url(img/slider_1.jpg)" class="overlay">
            <div class="container">
              <div class="row">
                <div class="col-md-8 col-md-offset-2">
                  <div class="probootstrap-slider-text text-center">
                    <h1 class="probootstrap-heading probootstrap-animate" id="indu"><b>INDUSTRIES</b></h1>
                    <br>
                    <h2 class="probootstrap-heading probootstrap-animate">Your Bright Future is Our Mission</h2>
                  </div>
                </div>
              </div>
            </div>
          </li>
          <li style="background-image: url(img/slider_2.jpg)" class="overlay">
            <div class="container">
              <div class="row">
                <div class="col-md-8 col-md-offset-2">
                  <div class="probootstrap-slider-text text-center"> 
                    <h1 class="probootstrap-heading probootstrap-animate" id="indu"><b>UNIVERSITIES</b></h1>
                    <br>
                    <h1 class="probootstrap-heading probootstrap-animate">Education is Life</h1>
                  </div>
                </div>
              </div>
            </div>
            
          </li>
          <li style="background-image: url(img/slider_3.jpg)" class="overlay">
            <div class="container">
              <div class="row">
                <div class="col-md-8 col-md-offset-2">
                  <div class="probootstrap-slider-text text-center">
                    <h1 class="probootstrap-heading probootstrap-animate" id="indu"><b>STUDENTS</b></h1>
                    <br>
                    <h1 class="probootstrap-heading probootstrap-animate">Helping Each of Our Students Fulfill the Potential</h1>
                  </div>
                </div>
              </div>
            </div>
          </li>
        </ul>
      </section>
      
      <section class="probootstrap-section probootstrap-section-colored">
        <div class="container">
          <div class="row">
            <div class="col-md-12 text-left section-heading probootstrap-animate">
              <h2>Welcome To The Next Generation Collaboration</h2>
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
                  <h3>About HUB</h3>
                  <p>Our main target is to colloboration between industries , universities and the students. In here you can share your events,workshops,academic calenders,queries with these three parties. A strong collaboration can do lot more than this. <b>Haven't an account in HUB yet ?? </b></p>
                  <p><a href="../Sign up.jsp" class="btn btn-primary">Get you registered</a></p>
                </div>
                <div class="probootstrap-image probootstrap-animate" style="background-image: url(img/slider_4.jpg)">
                  <a href="https://vimeo.com/45830194" class="btn-video popup-vimeo"><i class="icon-play3"></i></a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>

      <section class="probootstrap-section" id="probootstrap-counter">
        <div class="container">
          
          <div class="row">
            <div class="col-md-3 col-sm-6 col-xs-6 col-xxs-12 probootstrap-animate">
              <div class="probootstrap-counter-wrap">
                <div class="probootstrap-icon">
                  <i class="icon-users2"></i>
                </div>
                <div class="probootstrap-text">
                  <span class="probootstrap-counter">
                    <span class="js-counter" data-from="0" data-to="20203" data-speed="5000" data-refresh-interval="50">1</span>
                  </span>
                  <span class="probootstrap-counter-label">Students Enrolled</span>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-6 col-xs-6 col-xxs-12 probootstrap-animate">
              <div class="probootstrap-counter-wrap">
                <div class="probootstrap-icon">
                  <i class="icon-user-tie"></i>
                </div>
                <div class="probootstrap-text">
                  <span class="probootstrap-counter">
                    <span class="js-counter" data-from="0" data-to="200" data-speed="5000" data-refresh-interval="50">1</span>
                  </span>
                  <span class="probootstrap-counter-label">Industries Enrolled</span>
                </div>
              </div>
            </div>
            <div class="clearfix visible-sm-block visible-xs-block"></div>
            <div class="col-md-3 col-sm-6 col-xs-6 col-xxs-12 probootstrap-animate">
              <div class="probootstrap-counter-wrap">
                <div class="probootstrap-icon">
                  <i class="icon-library"></i>
                </div>
                <div class="probootstrap-text">
                  <span class="probootstrap-counter">
                    <span class="js-counter" data-from="0" data-to="99" data-speed="5000" data-refresh-interval="50">1</span>%
                  </span>
                  <span class="probootstrap-counter-label">Universities Enrolled</span>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-6 col-xs-6 col-xxs-12 probootstrap-animate">
               
               <div class="probootstrap-counter-wrap">
                <div class="probootstrap-icon">
                  <i class="icon-smile2"></i>
                </div>
                <div class="probootstrap-text">
                  <span class="probootstrap-counter">
                    <span class="js-counter" data-from="0" data-to="100" data-speed="5000" data-refresh-interval="50">1</span>%
                  </span>
                  <span class="probootstrap-counter-label">People Satisfaction</span>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>

      <section class="probootstrap-section probootstrap-section-colored probootstrap-bg probootstrap-custom-heading probootstrap-tab-section" style="background-image: url(img/Upcoming_Events2.jpg)">
        <div class="container">
          <div class="row">
            <div class="col-md-12 text-center section-heading probootstrap-animate">
              <h2 class="mb0"><b>Highlights</b></h2>
            </div>
          </div>
        </div>
        <div class="probootstrap-tab-style-1">
          <ul class="nav nav-tabs probootstrap-center probootstrap-tabs no-border">
            <li class="active"><a data-toggle="tab" href="#featured-news">Upcoming Industry Events</a></li>
            <li><a data-toggle="tab" href="#upcoming-events">Upcoming University Events</a></li>
          </ul>
        </div>
      </section>

      <section class="probootstrap-section probootstrap-section">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              
              <div class="tab-content">

                <div id="featured-news" class="tab-pane fade in active">
                  <div class="row">
                    <div class="col-md-12">
                      <div class="owl-carousel" id="owl1">
                        
                      <%
                            industry_events obj_industry_events = new industry_events();
                            List<industry_events_bean> com_events = obj_industry_events.get_com_events();
                            Iterator<industry_events_bean> it_list2 = com_events.iterator();

                        %> 
                        <%
                              while (it_list2.hasNext()) {
                                 industry_events_bean obj_industry_events_bean = new industry_events_bean();
                                 obj_industry_events_bean = it_list2.next();
                                 
                            //Start Event DATE TIME Split
                            String start_event = obj_industry_events_bean.getstart_event();
                            String[] start_parts = start_event.split(" ");
                            String start_date = start_parts[0];
                            String start_time = start_parts[1];
                        %> 

                        <div class="item">
                          <a href="#" class="probootstrap-featured-news-box">
                            <figure class="probootstrap-media"><img src="img/event.jpg" alt="Free Bootstrap Template by uicookies.com" class="img-responsive"></figure>
                            <div class="probootstrap-text">
                              <h3><b><%=obj_industry_events_bean.gettitle()%></b></h3>
                              <p><%=obj_industry_events_bean.getdescription()%></p>
                              <span class="probootstrap-date" style="color:red;"><i class="icon-calendar" style="color:blue;"></i>Date - <%=start_date%></span>
                              <span class="probootstrap-date" style="color:red;"><i class="icon-calendar" style="color:blue;"></i>Time - <%=start_time%></span>
                              <span class="probootstrap-date" style="color:orange;"><i class="icon-location" style="color:blue;"></i>Place - <b><%=obj_industry_events_bean.getorganization()%></b></span>
                              
                            </div>
                          </a>
                        </div>

                        <%
                            }
                        %> 
                        <!-- END item -->
                        
                        <!-- END item -->
                      </div>
                    </div>
                  </div>
                  <!-- END row -->
                  <div class="row">
                    <div class="col-md-12 text-center">
                      <p><a href="industry_events.jsp" class="btn btn-primary">View all Industry Events</a></p>  
                    </div>
                  </div>
                </div>                               
                  
                <div id="upcoming-events" class="tab-pane fade">
                  <div class="row">
                    <div class="col-md-12">
                      <div class="owl-carousel" id="owl2">
                          
                        <%
                            Read_Values obj_Read_Values = new Read_Values();
                            List<User_Bean> list = obj_Read_Values.get_values();
                            Iterator<User_Bean> it_list = list.iterator();

                        %> 
                        <%
                              while (it_list.hasNext()) {
                                 User_Bean obj_User_Bean = new User_Bean();
                                 obj_User_Bean = it_list.next();
                                 
                            //Start Event DATE TIME Split
                            String start_event = obj_User_Bean.getstart_event();
                            String[] start_parts = start_event.split(" ");
                            String start_date = start_parts[0];
                            String start_time = start_parts[1];
                        %>
                          
                        <div class="item">
                          <a href="#" class="probootstrap-featured-news-box">
                            <figure class="probootstrap-media"><img src="img/uni_events.png" alt="Free Bootstrap Template by uicookies.com" class="img-responsive"></figure>
                            <div class="probootstrap-text">
                              <h3><%=obj_User_Bean.gettitle()%></h3>
                              <p></i><%=obj_User_Bean.getdescription()%></p>
                              <span class="probootstrap-date" style="color:red;"><i class="icon-calendar" style="color:blue;"></i>Date - <%=start_date%></span>
                              <span class="probootstrap-date" style="color:red;"><i class="icon-calendar" style="color:blue;"></i>Time - <%=start_time%></span>
                              <span class="probootstrap-date" style="color:orange;"><i class="icon-location" style="color:blue;"></i>By - <b><%=obj_User_Bean.getorganization()%></b></span>
                            </div>
                          </a>
                        </div>
                        
                        <%
                            }
                        %> 
                        <!-- END item -->
                        
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12 text-center">
                      <p><a href="university_events.jsp" class="btn btn-primary">View all events</a></p>  
                    </div>
                  </div>
                </div>

              </div>
            
            </div>
          </div>
        </div>
      </section>

      <section class="probootstrap-section probootstrap-bg-white probootstrap-border-top">
        <div class="container">
          <div class="row">
            <div class="col-md-6 col-md-offset-3 text-center section-heading probootstrap-animate">
              <h2>SOME SCENARIOS</h2>
              <p class="lead">Here are some problem scenarios to be solved which are uploaded by some of our industry partners</p>
            </div>
          </div>
          <!-- END row -->
          
                        <%
                            read_industry_query obj_read_industry_query = new read_industry_query();
                            List<industry_query_bean> scenarios = obj_read_industry_query.get_scenarios();
                            Iterator<industry_query_bean> it_list3 = scenarios.iterator();

                        %> 
                        <%
                              while (it_list3.hasNext()) {
                                 industry_query_bean obj_industry_query_bean = new industry_query_bean();
                                 obj_industry_query_bean = it_list3.next();
                                 
                            //Start Event DATE TIME Split
                            //String start_event = obj_industry_events_bean.getstart_event();
                            //String[] start_parts = start_event.split(" ");
                            //String start_date = start_parts[0];
                            //String start_time = start_parts[1];
                        %> 


          <div class="row">
            <div class="col-md-6">
              <div class="probootstrap-service-2 probootstrap-animate">
                <div class="image">
                  <div class="image-bg">
                    <img src="img/img_sm_1.jpg" alt="Free Bootstrap Template by uicookies.com">
                  </div>
                </div>
                <div class="text">
                  <span class="probootstrap-meta"><i class="icon-calendar2"></i><%=obj_industry_query_bean.getdate()%></span>
                  <h3><b><%=obj_industry_query_bean.getquery_title()%></b></h3>
                  <p><%=obj_industry_query_bean.getdescription()%></p>
                  <p><a href="#" class="btn btn-primary"><%=obj_industry_query_bean.getcompany_name()%></a> <span class="enrolled-count">2,928 students enrolled</span></p>
                </div>
              </div>
               
             


            </div>

            <div class="col-md-6">
              <div class="probootstrap-service-2 probootstrap-animate">
              
                 <div class="image">
                  <div class="image-bg">
                    <img src="img/img_sm_2.jpg" alt="Free Bootstrap Template by uicookies.com">
                  </div>
                </div> 
                
              </div>
              
            </div>
                
          </div>
                <%
                     }
                 %>      
        </div>
                
      </section>

                
      
      <section class="probootstrap-section">
        <div class="container">
          <div class="row">
            <div class="col-md-6 col-md-offset-3 text-center section-heading probootstrap-animate">
              <h2>Meet Our Qualified Teachers</h2>
              <p class="lead">Sed a repudiandae impedit voluptate nam Deleniti dignissimos perspiciatis nostrum porro nesciunt</p>
            </div>
          </div>
          <!-- END row -->

          <div class="row">
            <div class="col-md-3 col-sm-6">
              <div class="probootstrap-teacher text-center probootstrap-animate">
                <figure class="media">
                  <img src="img/person_1.jpg" alt="Free Bootstrap Template by uicookies.com" class="img-responsive">
                </figure>
                <div class="text">
                  <h3>Chris Worth</h3>
                  <p>Physical Education</p>
                  <ul class="probootstrap-footer-social">
                    <li class="twitter"><a href="#"><i class="icon-twitter"></i></a></li>
                    <li class="facebook"><a href="#"><i class="icon-facebook2"></i></a></li>
                    <li class="instagram"><a href="#"><i class="icon-instagram2"></i></a></li>
                    <li class="google-plus"><a href="#"><i class="icon-google-plus"></i></a></li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-6">
              <div class="probootstrap-teacher text-center probootstrap-animate">
                <figure class="media">
                  <img src="img/person_5.jpg" alt="Free Bootstrap Template by uicookies.com" class="img-responsive">
                </figure>
                <div class="text">
                  <h3>Janet Morris</h3>
                  <p>English Teacher</p>
                  <ul class="probootstrap-footer-social">
                    <li class="twitter"><a href="#"><i class="icon-twitter"></i></a></li>
                    <li class="facebook"><a href="#"><i class="icon-facebook2"></i></a></li>
                    <li class="instagram"><a href="#"><i class="icon-instagram2"></i></a></li>
                    <li class="google-plus"><a href="#"><i class="icon-google-plus"></i></a></li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="clearfix visible-sm-block visible-xs-block"></div>
            <div class="col-md-3 col-sm-6">
              <div class="probootstrap-teacher text-center probootstrap-animate">
                <figure class="media">
                  <img src="img/person_6.jpg" alt="Free Bootstrap Template by uicookies.com" class="img-responsive">
                </figure>
                <div class="text">
                  <h3>Linda Reyez</h3>
                  <p>Math Teacher</p>
                  <ul class="probootstrap-footer-social">
                    <li class="twitter"><a href="#"><i class="icon-twitter"></i></a></li>
                    <li class="facebook"><a href="#"><i class="icon-facebook2"></i></a></li>
                    <li class="instagram"><a href="#"><i class="icon-instagram2"></i></a></li>
                    <li class="google-plus"><a href="#"><i class="icon-google-plus"></i></a></li>
                  </ul>
                </div>
              </div>
            </div>
            <div class="col-md-3 col-sm-6">
              <div class="probootstrap-teacher text-center probootstrap-animate">
                <figure class="media">
                  <img src="img/person_7.jpg" alt="Free Bootstrap Template by uicookies.com" class="img-responsive">
                </figure>
                <div class="text">
                  <h3>Jessa Sy</h3>
                  <p>Physics Teacher</p>
                  <ul class="probootstrap-footer-social">
                    <li class="twitter"><a href="#"><i class="icon-twitter"></i></a></li>
                    <li class="facebook"><a href="#"><i class="icon-facebook2"></i></a></li>
                    <li class="instagram"><a href="#"><i class="icon-instagram2"></i></a></li>
                    <li class="google-plus"><a href="#"><i class="icon-google-plus"></i></a></li>
                  </ul>
                </div>
              </div>
            </div>
          </div>

        </div>
      </section>
      <section class="probootstrap-section probootstrap-bg probootstrap-section-colored probootstrap-testimonial" style="background-image: url(img/slider_4.jpg);">
        <div class="container">
          <div class="row">
            <div class="col-md-6 col-md-offset-3 text-center section-heading probootstrap-animate">
              <h2>Alumni Testimonial</h2>
              <p class="lead">Sed a repudiandae impedit voluptate nam Deleniti dignissimos perspiciatis nostrum porro nesciunt</p>
            </div>
          </div>
          <!-- END row -->
          <div class="row">
            <div class="col-md-12 probootstrap-animate">
              <div class="owl-carousel owl-carousel-testimony owl-carousel-fullwidth">
                <div class="item">

                  <div class="probootstrap-testimony-wrap text-center">
                    <figure>
                      <img src="img/person_1.jpg" alt="Free Bootstrap Template by uicookies.com">
                    </figure>
                    <blockquote class="quote">&ldquo;Design must be functional and functionality must be translated into visual aesthetics, without any reliance on gimmicks that have to be explained.&rdquo; <cite class="author"> &mdash; <span>Mike Fisher</span></cite></blockquote>
                  </div>

                </div>
                <div class="item">
                  <div class="probootstrap-testimony-wrap text-center">
                    <figure>
                      <img src="img/person_2.jpg" alt="Free Bootstrap Template by uicookies.com">
                    </figure>
                    <blockquote class="quote">&ldquo;Creativity is just connecting things. When you ask creative people how they did something, they feel a little guilty because they didn’t really do it, they just saw something. It seemed obvious to them after a while.&rdquo; <cite class="author"> &mdash;<span>Jorge Smith</span></cite></blockquote>
                  </div>
                </div>
                <div class="item">
                  <div class="probootstrap-testimony-wrap text-center">
                    <figure>
                      <img src="img/person_3.jpg" alt="Free Bootstrap Template by uicookies.com">
                    </figure>
                    <blockquote class="quote">&ldquo;I think design would be better if designers were much more skeptical about its applications. If you believe in the potency of your craft, where you choose to dole it out is not something to take lightly.&rdquo; <cite class="author">&mdash; <span>Brandon White</span></cite></blockquote>
                  </div>
                </div>
                
              </div>
            </div>
          </div>
          <!-- END row -->
        </div>
      </section>

      <section class="probootstrap-section">
        <div class="container">
          <div class="row">
            <div class="col-md-6 col-md-offset-3 text-center section-heading probootstrap-animate">
              <h2>Why Choose Enlight School</h2>
              <p class="lead">Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto provident qui tempore natus quos quibusdam soluta at.</p>
            </div>
          </div>
          <div class="row">
            <div class="col-md-6">
              <div class="service left-icon probootstrap-animate">
                <div class="icon"><i class="icon-checkmark"></i></div>
                <div class="text">
                  <h3>Consectetur Adipisicing</h3>
                  <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto provident qui tempore natus quos quibusdam soluta at.</p>
                </div>  
              </div>
              <div class="service left-icon probootstrap-animate">
                <div class="icon"><i class="icon-checkmark"></i></div>
                <div class="text">
                  <h3>Aliquid Dolorum Saepe</h3>
                  <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto provident qui tempore natus quos quibusdam soluta at.</p>
                </div>
              </div>
              <div class="service left-icon probootstrap-animate">
                <div class="icon"><i class="icon-checkmark"></i></div>
                <div class="text">
                  <h3>Eveniet Tempora Anisi</h3>
                  <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto provident qui tempore natus quos quibusdam soluta at.</p>
                </div>
              </div>
            </div>
            <div class="col-md-6">
              <div class="service left-icon probootstrap-animate">
                <div class="icon"><i class="icon-checkmark"></i></div>
                <div class="text">
                  <h3>Laboriosam Quod Dignissimos</h3>
                  <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto provident qui tempore natus quos quibusdam soluta at.</p>
                </div>  
              </div>
              
              <div class="service left-icon probootstrap-animate">
                <div class="icon"><i class="icon-checkmark"></i></div>
                <div class="text">
                  <h3>Asperiores Maxime Modi</h3>
                  <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto provident qui tempore natus quos quibusdam soluta at.</p>
                </div>
              </div>
              
              <div class="service left-icon probootstrap-animate">
                <div class="icon"><i class="icon-checkmark"></i></div>
                <div class="text">
                  <h3>Libero Maxime Molestiae</h3>
                  <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Iusto provident qui tempore natus quos quibusdam soluta at.</p>
                </div>
              </div>

            </div>
          </div>
          <!-- END row -->
        </div>
      </section>
      
     <section class="probootstrap-cta">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <h2 class="probootstrap-animate" data-animate-effect="fadeInRight">Share Your Organization With Us now!    <i class="icon-hand"></i></h2>
              <a href="../Sign up.jsp" role="button" class="btn btn-primary btn-lg btn-ghost probootstrap-animate" data-animate-effect="fadeInLeft"> Quickly Enroll</a>
            </div>
          </div>
        </div>
      </section>
      <footer class="probootstrap-footer probootstrap-bg">
        <div class="container">
          <div class="row">
            <div class="col-md-4">
              <div class="probootstrap-footer-widget">
                <h3>About The HUB</h3>
                <p>Our main target is to colloboration between industries , universities and the students. In here you can share your events,workshops,academic calenders,queries with these three parties. A strong collaboration can do lot more than this. </p>
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
                  <li><a href="index.jsp">Home</a></li>
              <li><a href="industry.jsp">Industry</a></li>
              <li ><a href="university.jsp">University</a></li>
              <li><a href="students.jsp">Students</a></li>
              <li><a href="../signin.jsp">Login</a></li>
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
                <p>&copy; 2019. All Rights Reserved. Designed &amp; Developed with <i class="icon icon-heart"></i> by <a href="#">THeHUB.com</a></p>
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