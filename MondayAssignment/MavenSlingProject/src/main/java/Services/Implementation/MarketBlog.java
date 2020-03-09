package Services.Implementation;

import org.apache.log4j.Logger;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import  Services.BlogService;
import Services.Configuration.MarketBlogConfig;
import Services.Configuration.TechBlogConfig;

@Component(service = BlogService.class,property = {"version=MB_1.0"})
@Designate(ocd = MarketBlogConfig.class)
public class MarketBlog implements BlogService {

    private MarketBlogConfig marketBlogConfig;

    @Activate @Modified
    protected void activate(final MarketBlogConfig marketBlogConfig) {
        Logger log = Logger.getLogger("Weekend Assignment Logger");
        log.info(" MarketBlog started");
        this.marketBlogConfig = marketBlogConfig;
    }

    @Override
    public String getBlogCategory() {
        return marketBlogConfig.BLOG_CATEGORY();
    }

    @Override
    public int getRank() {
        return marketBlogConfig.RANK();
    }
}