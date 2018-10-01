package com.mongomonguito.xmens.controller;

import com.mongomonguito.xmens.documents.Xmen;
import com.mongomonguito.xmens.services.XmenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XmenController {

    @Autowired
    XmenService xmenService;

    @PostMapping("/xmen")
    public Xmen insertXmen(@RequestBody Xmen xmen){
        return xmenService.insertOne(xmen);
    }

}
