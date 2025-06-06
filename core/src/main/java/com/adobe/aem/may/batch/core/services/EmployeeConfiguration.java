package com.adobe.aem.may.batch.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="EmployeeConfiguration")
public @interface EmployeeConfiguration {
    @AttributeDefinition
            (name = "Sai",
            description = "Sai is a good boy",
                    required = true,
                    defaultValue = "EmployeeName"
            )
    public String name();
    @AttributeDefinition
            (name = "Employeeid",
                    description = "Sai employee id",
                    required = true,
                    defaultValue = "2000"
            )
    public int id();
    @AttributeDefinition
            (name = "Employeesalary",
                    description = "Sai salary",
                    required = true,
                    defaultValue = "5000"
            )
    public double salary();
}