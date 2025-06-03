package com.adobe.aem.may.batch.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public class BookDetail {

        @ValueMapValue(name = "bookname")
        private String bookName;

        @ValueMapValue(name = "booksubject")
        private Integer bookSubject;

        @ValueMapValue(name = "bookpublishdate")
        private String bookPublishDate; 

         @ChildResource(name = "nestedfield")
        private List<NestedField> nestedField;

       
        public String getBookName() {
            return bookName;
        }

        public Integer getBookSubject() {
            return bookSubject;
        }

        public String getBookPublishDate() {
            return bookPublishDate;
        }

         public List<NestedField> getNestedField() {
            return nestedField;
        }
    }