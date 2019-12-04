package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-12-04T16:05:17.541Z")

@RestSchema(schemaId = "mydemo")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class MydemoImpl {

    @Autowired
    private MydemoDelegate userMydemoDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userMydemoDelegate.helloworld(name);
    }

}
