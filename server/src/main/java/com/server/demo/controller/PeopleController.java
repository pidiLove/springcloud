package com.server.demo.controller;

import com.server.demo.entity.DO.PeopleDO;
import com.server.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    PeopleService peopleService;

    @RequestMapping(value = "/alllist", method = RequestMethod.GET)
    public List<PeopleDO> getAccounts() {
        return peopleService.selectAll();
    }
}
