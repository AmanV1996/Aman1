package ttn.Assignment.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component(service = Servlet.class,
        property = {
                "sling.servlet.paths=project/components/even"
        }
)
public class ServletByPath extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        List<Integer> even = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            if(i%2==0){
                even.add(i);
            }
        }
        response.getWriter().write(even.toString());
    }
}