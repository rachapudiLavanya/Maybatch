package com.adobe.aem.may.batch.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class LemonParent {

    @ValueMapValue
    private String articletitle;

    @ValueMapValue
    private String articledes;

    @ValueMapValue
    private String articlenum;

    @ChildResource
    private List<LemonChild> bookdetailswitchmap;

    public String getArticletitle() {
        return articletitle;
    }

    public String getArticledes() {
        return articledes;
    }

    public String getArticlenum() {
        return articlenum;
    }

    public List<LemonChild> getBookdetailswitchmap() {
        return bookdetailswitchmap;
    }
}
