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
  <br />
  <h2 align="center" class="hedding">Events</h2>
  <br />
  <div class="container">
    <div id="calendar"></div>
 </div>
 </body>
</html>