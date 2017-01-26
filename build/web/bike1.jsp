<%-- 
    Document   : bike1
    Created on : Jan 25, 2017, 2:11:07 PM
    Author     : oem
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bikes</title>
           <!--Import Google Icon Font-->
      <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
      <link type="text/css" rel="stylesheet" href="css/style.css"/>
      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        
    </head>
    <body>
          <%@include file="menu1.jsp" %> 
          
          <section id ="bikeslider">
             
               <c:forEach items="${retrieve}" var="image">
                    
              <div class="row">
                  <div class="col s9">
                     
                      <div class="slider">
                          <ul class="slides">
                              
                              <li>
                                  <img class="img-fluid" src="images/${image.image1}.jpg">
                              </li>
                              <li>
                                  <img class="img-fluid" src="images/${image.image2}.jpg">
                              </li>
                              <li>
                                  <img class="img-fluid" src="images/${image.image3}.jpg">
                              </li>
                            
                          </ul>
                          
                     
                      </div>
                  </div>
                      <div class="col s3">
                          <ul cl>
                              <li>${image.name}</li>
                              <li>${image.price}</li>
                              <li>${image.description}</li>
                          </ul>
                      </div>
                      
              </div>
             </c:forEach>
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
    </body>
</html>
