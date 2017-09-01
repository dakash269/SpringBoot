package com.javasampleapproach.angularjs.controller;

import com.javasampleapproach.angularjs.model.Data;
import com.javasampleapproach.angularjs.service.Dataservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * Created by akash on 19/7/17.
 */
@RestController
@RequestMapping("/")
public class DataController {
    @Autowired
    private Dataservice dataservice;

    @RequestMapping(value="/addData",method = RequestMethod.POST)
        public void addData( @RequestBody Data data) {
        dataservice.addData(data);
    }
    @RequestMapping(value="/updateData",method = RequestMethod.POST)
    public void updateData( @RequestBody Data data) {
        dataservice.updateData(data);
    }
    @RequestMapping(value="/deleteData",method = RequestMethod.POST)
    public void deleteData( @RequestBody Data data) {dataservice.deleteData(data);}

    @RequestMapping(value="/getDoing",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List> getDoing() {
        List responseBody = Collections.emptyList();
        HttpStatus httpStatus = HttpStatus.OK;
        responseBody=dataservice.getAllDoing();
        return new ResponseEntity<>(responseBody,httpStatus);
    }
    @RequestMapping(value="/getTo_do",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List> getTo_do() {
        List responseBody = Collections.emptyList();
        HttpStatus httpStatus = HttpStatus.OK;
        responseBody=dataservice.getAllTo_do();
        return new ResponseEntity<>(responseBody,httpStatus);
    }
    @RequestMapping(value="/getDone",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List> getDone() {
        List responseBody = Collections.emptyList();
        HttpStatus httpStatus = HttpStatus.OK;
        responseBody=dataservice.getAllDone();
        return new ResponseEntity<>(responseBody,httpStatus);
    }
    @RequestMapping(value="/getBacklog",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List> getBacklog() {
        List responseBody = Collections.emptyList();
        HttpStatus httpStatus = HttpStatus.OK;
        responseBody=dataservice.getAllBacklog();
        return new ResponseEntity<>(responseBody,httpStatus);
    }
}
