package com.adobe.aem.may.batch.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TabsModel {

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String des;

    @ValueMapValue
    private Long num;

    @ValueMapValue
    private String color;

    @ChildResource(name = "bookdetails")
    private List<BookDetails> bookdetails;

    @ValueMapValue
    private String productname;

    @ChildResource(name = "productdetails")
    private List<ProductDetails> productdetails;

    public String getText() {
        return text;
    }

    public String getDes() {
        return des;
    }

    public Long getNum() {
        return num;
    }

    public String getColor() {
        return color;
    }

    public List<BookDetails> getBookdetails() {
        return bookdetails;
    }

    public String getProductname() {
        return productname;
    }

    public List<ProductDetails> getProductdetails() {
        return productdetails;
    }
}