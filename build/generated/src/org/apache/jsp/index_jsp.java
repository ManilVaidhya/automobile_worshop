package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/menu1.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("      <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("      <!--Import materialize.css-->\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\"/>\n");
      out.write("      <link href=\"css/mdb.min.css\" rel=\"stylesheet\">\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("      <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("      <!--Import materialize.css-->\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("      <!--Let browser know website is optimized for mobile-->\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("    </head>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"navbar-fixed\">\n");
      out.write("            <nav>\n");
      out.write("             <div class=\"nav-wrapper container\">\n");
      out.write("               <a href=\"index.jsp\" class=\"brand-logo\">Auto-mobile</a>\n");
      out.write("               <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                    <li><a href=\"car.jsp\">Cars</a></li>\n");
      out.write("                    <li><a href=\"bike.jsp\">Bikes</a></li>\n");
      out.write("                    <li><a href=\"#qwry\">Query</a></li>\n");
      out.write("                    <li><a href=\"#contact-sec\">Contact</a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("               </ul>\n");
      out.write("             </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--Import jQuery before materialize.js-->\n");
      out.write("      <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("            <section id =\"image-slider\">\n");
      out.write("               <div class=\"row\">\n");
      out.write("                 <div class=\"col s12\">\n");
      out.write("                   <div class=\"slider\">\n");
      out.write("                     <ul class=\"slides\">\n");
      out.write("                       <li> <img class=\"img-fluid\" src=\"images/bike1.jpg\">\n");
      out.write("                         <div class=\"caption center-align\">\n");
      out.write("                           <h3>Yamaha</h3>\n");
      out.write("                           <h5 class=\"text\">Here's our new ride</h5>\n");
      out.write("                         </div>\n");
      out.write("                       </li>\n");
      out.write("                       <li> <img class=\"img-fluid\" src=\"images/car1.jpg\">\n");
      out.write("                         <div class=\"caption center-align\">\n");
      out.write("                           <h3>Mercedes</h3>\n");
      out.write("                           <h5 class=\"text\">Expensive but classy</h5>\n");
      out.write("                         </div>\n");
      out.write("                       </li>\n");
      out.write("                       <li> <img class=\"img-fluid\" src=\"images/bike2.jpg\">\n");
      out.write("                         <div class=\"caption center-align\">\n");
      out.write("                           <h3>R1</h3>\n");
      out.write("                           <h5 class=\"text\">Stylish and demanding</h5>\n");
      out.write("                         </div>\n");
      out.write("                       </li>\n");
      out.write("                       <li> <img class=\"img-fluid\" src=\"images/car2.jpg\">\n");
      out.write("                         <div class=\"caption center-align\">\n");
      out.write("                           <h3>SUV</h3>\n");
      out.write("                           <h5 class=\"text\">Comfy for family</h5>\n");
      out.write("                         </div>\n");
      out.write("                       </li> \n");
      out.write("                     </ul>\n");
      out.write("                   </div>\n");
      out.write("\n");
      out.write("                 </div>\n");
      out.write("               </div>\n");
      out.write("             </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <div class=\"divider-new\">\n");
      out.write("         <h2 class=\"h2-responsive wow fadeInUp\">Contact us</h2>\n");
      out.write("        </div>\n");
      out.write("            <section id = \"contact-sec\">\n");
      out.write("              \n");
      out.write("              <div class=\"row\">\n");
      out.write("              <div class=\"col m6\">\n");
      out.write("                 <div id=\"map-container\" class=\"z-depth-1 wow fadeInUp\" style=\"height:300px\"></div>\n");
      out.write("              </div>\n");
      out.write("             <div class=\"col m6\">\n");
      out.write("              <ul class=\"text-xs-center\">\n");
      out.write("                <li class=\"wow fadeInUp\" data-wow-delay=\"0.2s\"> <i class=\"material-icons\">location_on</i> Maitighar, Kathmandu, Nepal\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <li class=\"wow fadeInUp\" data-wow-delay=\"0.3s\"> <i class=\"material-icons\">call</i> +977-9876543210\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("                <li class=\"wow fadeInUp\" data-wow-delay=\"0.4s\"> <i class=\"material-icons\">email</i> admin@gmail.com\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("           </div>\n");
      out.write("        </section>\n");
      out.write("                 ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"divider-new\" id=\"qwry\">\n");
      out.write("         <h2 class=\"h2-responsive wow fadeInUp\">Queries</h2>\n");
      out.write("        </div>\n");
      out.write("        <section id=\"queries\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col m6\">\n");
      out.write("                    <form action=\"JsController\" method =\"post\">\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <i class=\"material-icons prefix\">account_circle</i>\n");
      out.write("                        <input id=\"name\" type=\"text\" name=\"name\" class=\"validate\">\n");
      out.write("                        <label for=\"name\">Name</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <i class=\"material-icons prefix\">phone</i>\n");
      out.write("                        <input id=\"phone\" type=\"tel\" name=\"phone\" class=\"validate\">\n");
      out.write("                        <label for=\"phone\">Telephone</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <i class=\"material-icons prefix\">mode_edit</i>\n");
      out.write("                        <input id=\"message\" type=\"text\" name=\"message\" class=\"validate\">\n");
      out.write("                        <label for=\"message\">Message</label>\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"btn waves-effect waves-light\" type=\"submit\" name=\"submit\" id=\"submit\">Submit\n");
      out.write("                    <i class=\"material-icons right\">send</i>\n");
      out.write("                    </button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col m6\">\n");
      out.write("                    <div id=\"scroll\">\n");
      out.write("                        <table id=\"query-table\" class=\"table table-hover table-responsive\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td> Name </td>\n");
      out.write("                                    <td> Message </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("                                    \n");
      out.write("        <!--Import jQuery before materialize.js-->\n");
      out.write("      <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("          \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("           <!--Import jQuery before materialize.js-->\n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("            <script>\n");
      out.write("              $(document).ready(function(){\n");
      out.write("                $('select').material_select();\n");
      out.write("                $('.datepicker').pickadate();\n");
      out.write("                $('.dropdown-button').dropdown();\n");
      out.write("                $('.button-collapse').sideNav();\n");
      out.write("                $('.slider').slider({\n");
      out.write("                  full_width: true,\n");
      out.write("                  height: 600,\n");
      out.write("                  indicators: true,\n");
      out.write("                  interval: 3000\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            </script>\n");
      out.write("            <script src=\"http://maps.google.com/maps/api/js\"></script>\n");
      out.write("            <script>\n");
      out.write("             function init_map() {\n");
      out.write("                 var var_location = new google.maps.LatLng(27.693717,85.320856);\n");
      out.write("\n");
      out.write("                 var var_mapoptions = {\n");
      out.write("                     center: var_location,\n");
      out.write("                     zoom: 30\n");
      out.write("                 };\n");
      out.write("\n");
      out.write("                 var var_marker = new google.maps.Marker({\n");
      out.write("                     position: var_location,\n");
      out.write("                     map: var_map,\n");
      out.write("                     title: \"Nepal\"\n");
      out.write("                 });\n");
      out.write("\n");
      out.write("                 var var_map = new google.maps.Map(document.getElementById(\"map-container\"),\n");
      out.write("                     var_mapoptions);\n");
      out.write("\n");
      out.write("                 var_marker.setMap(var_map);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("             google.maps.event.addDomListener(window, 'load',init_map,'resize');\n");
      out.write("             \n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${retrieve}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("msg");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                        <td> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
