package com.adobe.aem.may.batch.core.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;

@Component(service = DemoService.class,immediate = true,enabled = true)
public class DemoService {

    private static final Logger LOG=LoggerFactory.getLogger(DemoService.class);

    

    @Activate
    public void activate()
    {
        LOG.info("msg coming from the  Demo Service activate()");
    }

     @Deactivate
    public void DeActivate()
    {
        LOG.info("msg coming from the  Demo Service Deactivate()");
    }

     @Modified
    public void Modified()
    {
        LOG.info("msg coming from the  Demo Service Deactivate()");
    }





}
