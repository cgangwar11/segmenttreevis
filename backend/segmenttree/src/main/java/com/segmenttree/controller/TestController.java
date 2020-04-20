package com.segmenttree.controller;


import com.segmenttree.model.Request;
import com.segmenttree.model.Response;
import com.segmenttree.service.SegmentTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
public class TestController {

    @Autowired
    SegmentTreeService segmentTreeService;


    @PostMapping("/login/{idvariable}")
    public String value(@PathVariable String idvariable){
        return idvariable;
    }


    @RequestMapping(value = "/initialize",method = RequestMethod.POST)
    public Response createTree(@RequestBody Request request, HttpServletRequest req){
        segmentTreeService.reset();
        return segmentTreeService.initializeSegmentArray(request.getData().size(),request.getData(),false);

    }


}
