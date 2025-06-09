package com.adobe.aem.may.batch.core.schedulers;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
@ObjectClassDefinition(name="ArticleExpiryConfiguration")
public @interface ArticleExpiryConfiguration {
    @AttributeDefinition(
        name="saiLodge",
        description="excellent Lodge"
    )

    public String scheduler_name();
    @AttributeDefinition(
        name="saiLodge",
        description="excellent Lodge"
    )

    
    public String scheduler_cronExpression() default "*/1* * * * ?";
    @AttributeDefinition(
        name="saiLodge",
        description="excellent Lodge"
    )

    public boolean scheduler_enabled() default true;
    @AttributeDefinition(
        name="saiLodge",
        description="excellent Lodge"
    )

    public boolean scheduler_croncurrent() default true;
    


}
