package it.develhope.DependencyInjection.controller;

import it.develhope.DependencyInjection.services.MyService;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService service;

    public void setService(MyService service) {
        this.service = service;
    }

    public MyController(){
        System.out.println("Constructor metod called");
        this.setService(service);
    }

    @GetMapping("/getName")
    public String getName(){
        return service.getName();
    }

}
