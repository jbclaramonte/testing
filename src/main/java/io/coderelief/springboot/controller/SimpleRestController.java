package io.coderelief.springboot.controller;

import com.fasterxml.jackson.annotation.JsonView;
import io.coderelief.springboot.model.User;
import io.coderelief.springboot.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    @Autowired
    SimpleService simpleService;

    @RequestMapping(value = "/user/public", method = RequestMethod.GET)
    @JsonView(User.Views.Public.class)
    public User getUserWithPublicData() {
        return simpleService.loadUser();
    }


    @RequestMapping(value = "/user/internal", method = RequestMethod.GET)
    @JsonView(User.Views.Internal.class)
    public User getUserWithInternalData() {
        return simpleService.loadUser();
    }
}
