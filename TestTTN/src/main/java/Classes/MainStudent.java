package Classes;

import Assignment.StudentServices;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component
public class MainStudent {
    @Reference
    StudentServices studentServices;

}