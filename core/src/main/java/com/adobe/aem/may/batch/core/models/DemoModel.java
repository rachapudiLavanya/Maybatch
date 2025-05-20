package com.adobe.aem.may.batch.core.models;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.Resource;

@Model(adaptables=Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class DemoModel {
    @ValueMapValue
    private String text;
    @ValueMapValue
    private String des;
    @ValueMapValue
    private int num;
    @ValueMapValue
    private String color;
    @ValueMapValue
    private String date;
    @ValueMapValue
    private String password;
    public String getText() {
        return text;
    }
    public String getDes() {
        return des;
    }
    public int getNum() {
        return num;
    }
    public String getColor() {
        return color;
    }
    public String getDate() {
        return date;
    }
    
}