package com.adobe.aem.may.batch.core.models;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.scripting.sightly.engine.ResourceResolution;

import com.day.cq.wcm.api.Page;


@Model(adaptables ={Resource.class,SlingHttpServletRequest.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ArticlePropertiesModel {

    @ValueMapValue(name = "articletitle")
    private String articleTitle;

    @ValueMapValue(name = "articledescription")
    private String articleDescription;

    @ValueMapValue(name = "articlenum")
    private Integer articleNum;

    @ScriptVariable
    Page currentPage;

    @ValueMapValue
    @Named(value = "jcr:createdBy")
    public String author;

    public String getArticleAuthorName()
    {
        return author;
    }

    @Inject
    ResourceResolver resolver;

    public String getArticleTitle()
    {
        return currentPage.getTitle();
    }

    public String getArticlePagePath()
    {
        return currentPage.getPath();
    }

    public Page getArticlePageParent()
    {
        return currentPage.getParent();
    }

    public String getWebContentNode()
    {
        return resolver.getUserID();
    }

    @ChildResource(name = "bookdetailswithchmap")
    private List<BookDetail> bookDetailsWithChMap;

    public String getArticletitle() {
        return articleTitle;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public Integer getArticleNum() {
        return articleNum;
    }

    public List<BookDetail> getBookDetailsWithChMap() {
        return bookDetailsWithChMap;
    }


}
