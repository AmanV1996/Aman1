package Services.Implementation;

import org.apache.log4j.Logger;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import Services.BlogService;
import Services.BlogCollector;

@Component(service = BlogCollector.class)
public class BlogCollectorImpl implements BlogCollector {

    @Reference(target="(version=TB_1.0)")
    BlogService techBlogService;

    @Reference(target="(version=MB_1.0)")
    BlogService marketBlogService;

    @Activate
    public void activate(){
        Logger log = Logger.getLogger("Weekend Assignment Logger");
        log.info("BlogCollector");
        log.info(techBlogService.getBlogCategory()+ " " + techBlogService.getRank());
        log.info(marketBlogService.getBlogCategory() + " " + marketBlogService.getRank());
    }


}