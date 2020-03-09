package Services.Implementation;

import org.apache.log4j.Logger;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import Services.BlogService;
import Services.Configuration.TechBlogConfig;

@Component(service = BlogService.class,property = {"version=TB_1.0"})
@Designate(ocd = TechBlogConfig.class)
public class TechBlog implements BlogService {

    private TechBlogConfig techBlogConfig;

    @Activate @Modified
    protected void activate(final TechBlogConfig techBlogConfig) {
        Logger log = Logger.getLogger("Weekend Assignment Logger");
        log.info("TechBlog started");
        this.techBlogConfig = techBlogConfig;
    }



    @Override
    public String getBlogCategory() {
        return techBlogConfig.BLOG_CATEGORY();
    }

    @Override
    public int getRank() {
        return techBlogConfig.RANK();
    }
}