package ttn.Assignment.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import ttn.Assignment.pojos.Blog;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.util.*;

@Component(service = Servlet.class,
        property = {
                "sling.servlet.paths=project/components/blogs"
        }
)
public class BlogServlet extends SlingSafeMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");

        List<Blog> blogs= new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            blogs.add(new Blog("Title_"+(i+1),"Content_"+(i+1),new Date()));
        }
        Map<String,List<Blog>> map = new HashMap<>();
        Collections.sort(blogs, new Comparator<Blog>() {
            @Override
            public int compare(Blog o1, Blog o2) {
                return o1.getCreationDate().compareTo(o2.getCreationDate());
            }
        });

        map.put("Ascending",blogs);

        Collections.sort(blogs, new Comparator<Blog>() {
            @Override
            public int compare(Blog o1, Blog o2) {
                return -o1.getCreationDate().compareTo(o2.getCreationDate());
            }
        });

        map.put("Descending",blogs);

//        Gson gson = new Gson();
//
//        String output =  gson.toJson(map);
        response.getWriter().write(map.toString());

    }
}