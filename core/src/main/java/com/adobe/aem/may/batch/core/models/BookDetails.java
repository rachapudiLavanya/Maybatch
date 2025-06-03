 package com.adobe.aem.may.batch.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

 @Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public class BookDetails {

        @ValueMapValue
        private String bookname;

        @ValueMapValue
        private String date;

        @ValueMapValue
        private String author;

        @ChildResource(name = "publicationdetails")
        private List<PublicationDetails> publicationdetails;

        public String getBookname() {
            return bookname;
        }

        public String getDate() {
            return date;
        }

        public String getAuthor() {
            return author;
        }

        public List<PublicationDetails> getPublicationdetails() {
            return publicationdetails;
        }
    }
