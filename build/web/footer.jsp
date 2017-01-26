<%-- 
    Document   : footer
    Created on : Jan 25, 2017, 1:09:36 PM
    Author     : oem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <div class="divider-new" id="qwry">
         <h2 class="h2-responsive wow fadeInUp">Queries</h2>
        </div>
        <section id="queries">
            <div class="row">
                <div class="col m6">
                    <form action="JsController" method ="post">
                    <div class="input-field">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="name" type="text" name="name" class="validate">
                        <label for="name">Name</label>
                    </div>
                    <div class="input-field">
                        <i class="material-icons prefix">phone</i>
                        <input id="phone" type="tel" name="phone" class="validate">
                        <label for="phone">Telephone</label>
                    </div>
                    <div class="input-field">
                        <i class="material-icons prefix">mode_edit</i>
                        <input id="message" type="text" name="message" class="validate">
                        <label for="message">Message</label>
                    </div>
                    <button class="btn waves-effect waves-light" type="submit" name="submit" id="submit">Submit
                    <i class="material-icons right">send</i>
                    </button>
                    </form>
                </div>
                <div class="col m6">
                    <div id="scroll">
                        <table id="query-table" class="table table-hover table-responsive">
                            <thead>
                                <tr>
                                    <td> Name </td>
                                    <td> Message </td>
                                </tr>
                            </thead>
                            <tbody>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </section>
                                    
        <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>
          
    </body>
</html>
