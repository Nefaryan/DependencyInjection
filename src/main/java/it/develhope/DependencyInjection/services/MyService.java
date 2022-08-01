package it.develhope.DependencyInjection.services;

import it.develhope.DependencyInjection.conponent.MyComponent;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {


    private MyComponent component;

    public void setComponent(MyComponent component) {
        this.component = component;
    }

    @Autowired
    public MyService(MyComponent myComponent){
        System.out.println("Constructor metod of Myservice as called");
        this.setComponent(myComponent);
    }

    public String getName(){
        System.out.println("MyService constructor has called");
        return component.getMyConmponentname();
    }


}
