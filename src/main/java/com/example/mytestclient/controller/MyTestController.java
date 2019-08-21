package com.example.mytestclient.controller;

import com.simo.vsim.MyServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alexouyang
 * @Date 2019-08-21
 */
@RestController
public class MyTestController {

    @Autowired
    MyServer myServer;

    @GetMapping("/getserver")
    public String getSPIServer(){
        return myServer.toString();
    }

}
