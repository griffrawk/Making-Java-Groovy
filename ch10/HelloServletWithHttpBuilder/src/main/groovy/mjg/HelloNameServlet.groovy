package mjg

import groovy.servlet.ServletCategory;

import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


class HelloNameServlet extends HttpServlet {
    void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        use (ServletCategory) {
            request.name = request.getParameter('name') ?: 'World'
        }
        request.getRequestDispatcher('hello.jsp').forward(request,response)
    }
}