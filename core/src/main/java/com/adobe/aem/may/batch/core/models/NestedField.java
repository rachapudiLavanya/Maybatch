
package com.adobe.aem.may.batch.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
    public class NestedField {

        @ValueMapValue(name = "text")
        private String text;

        @ValueMapValue(name = "dsc")
        private String dsc;

        // Getters
        public String getText() {
            return text;
        }

        public String getDsc() {
            return dsc;
        }
    }