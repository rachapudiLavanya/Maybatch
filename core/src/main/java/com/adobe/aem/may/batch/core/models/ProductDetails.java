package com.adobe.aem.may.batch.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public  class ProductDetails {

        @ValueMapValue
        private String source;

        @ValueMapValue
        private String manufacturedate;

        @ChildResource(name = "companydetails")
        private List<CompanyDetails> companydetails;

        public String getSource() {
            return source;
        }

        public String getManufacturedate() {
            return manufacturedate;
        }

        public List<CompanyDetails> getCompanydetails() {
            return companydetails;
        }
    }
