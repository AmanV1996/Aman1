package Components;


import Services.BlogCollector;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component
public class MainComponent {

    @Reference
    BlogCollector blogCollector;
}