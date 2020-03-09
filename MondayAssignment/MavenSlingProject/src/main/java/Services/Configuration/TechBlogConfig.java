package Services.Configuration;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="TechBlogConfig", description = "Configuration for Tech Blog")
public @interface TechBlogConfig {
    @AttributeDefinition(name = "Blog Category",type= AttributeType.STRING,description = "Blog Category")
    String BLOG_CATEGORY() default "Technology";

    @AttributeDefinition(name = "Blog Rank",type= AttributeType.INTEGER,description = "Blog Rank")
    int RANK() default 1;

}