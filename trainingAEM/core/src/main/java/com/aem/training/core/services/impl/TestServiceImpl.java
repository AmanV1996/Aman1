package com.aem.training.core.services.impl;

import com.aem.training.core.configurations.APIConfigs;
import com.aem.training.core.services.TestService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = TestService.class)
@Designate(ocd = APIConfigs.class)
public class TestServiceImpl implements TestService {

    @Activate
    private APIConfigs apiConfigs;

    @Activate
    void activate(){
        Logger log = LoggerFactory.getLogger(this.getClass());
        log.info(apiConfigs.URL());
        log.info(""+apiConfigs.API_KEY());
    }
}
