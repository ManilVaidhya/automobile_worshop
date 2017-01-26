<%-- 
    Document   : index
    Created on : Jan 19, 2017, 5:54:23 AM
    Author     : oem
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!--Import Google Icon Font-->
      <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
      <link type="text/css" rel="stylesheet" href="css/style.css"/>
      <link href="css/mdb.min.css" rel="stylesheet">
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>
    <body>
                <%@include file="menu1.jsp" %> 
        
            <section id ="image-slider">
               <div class="row">
                 <div class="col s12">
                   <div class="slider">
                     <ul class="slides">
                       <li> <img class="img-fluid" src="images/bike1.jpg">
                         <div class="caption center-align">
                           <h3>Yamaha</h3>
                           <h5 class="text">Here's our new ride</h5>
                         </div>
                       </li>
                       <li> <img class="img-fluid" src="images/car1.jpg">
                         <div class="caption center-align">
                           <h3>Mercedes</h3>
                           <h5 class="text">Expensive but classy</h5>
                         </div>
                       </li>
                       <li> <img class="img-fluid" src="images/bike2.jpg">
                         <div class="caption center-align">
                           <h3>R1</h3>
                           <h5 class="text">Stylish and demanding</h5>
                         </div>
                       </li>
                       <li> <img class="img-fluid" src="images/car2.jpg">
                         <div class="caption center-align">
                           <h3>SUV</h3>
                           <h5 class="text">Comfy for family</h5>
                         </div>
                       </li> 
                     </ul>
                   </div>

                 </div>
               </div>
             </section>
        
        
        
         <div class="divider-new">
         <h2 class="h2-responsive wow fadeInUp">Contact us</h2>
        </div>
            <section id = "contact-sec">
              
              <div class="row">
              <div class="col m6">
                 <div id="map-container" class="z-depth-1 wow fadeInUp" style="height:300px"></div>
              </div>
             <div class="col m6">
              <ul class="text-xs-center">
                <li class="wow fadeInUp" data-wow-delay="0.2s"> <i class="material-icons">location_on</i> Maitighar, Kathmandu, Nepal

                </li>
                <li class="wow fadeInUp" data-wow-delay="0.3s"> <i class="material-icons">call</i> +977-9876543210

                </li>
                <li class="wow fadeInUp" data-wow-delay="0.4s"> <i class="material-icons">email</i> admin@gmail.com

                </li>
              </ul>


             </div>
           </div>
        </section>
                 <%@include file="footer.jsp" %> 
            
        
        
           <!--Import jQuery before materialize.js-->
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
            <script>
              $(document).ready(function(){
                $('select').material_select();
                $('.datepicker').pickadate();
                $('.dropdown-button').dropdown();
                $('.button-collapse').sideNav();
                $('.slider').slider({
                  full_width: true,
                  height: 600,
                  indicators: true,
                  interval: 3000
                });
            });
            
            </script>
            <script src="http://maps.google.com/maps/api/js"></script>
            <script>
             function init_map() {
                 var var_location = new google.maps.LatLng(27.693717,85.320856);

                 var var_mapoptions = {
                     center: var_location,
                     zoom: 30
                 };

                 var var_marker = new google.maps.Marker({
                     position: var_location,
                     map: var_map,
                     title: "Nepal"
                 });

                 var var_map = new google.maps.Map(document.getElementById("map-container"),
                     var_mapoptions);

                 var_marker.setMap(var_map);

            }

             google.maps.event.addDomListener(window, 'load',init_map,'resize');
             
        </script>
    </body>
</html>
