package Services.Configuration;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="MarketBlogConfig", description = "Configuration for market Blog")
public @interface MarketBlogConfig {

    @AttributeDefinition(name = "Blog Category",type= AttributeType.STRING,description = "Blog Category")
    String BLOG_CATEGORY() default "Marketing";

    @AttributeDefinition(name = "Blog Rank",type= AttributeType.INTEGER,description = "Blog Rank")
    int RANK() default 2;
}
