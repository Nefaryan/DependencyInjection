package it.develhope.DependencyInjection.conponent;

import lombok.Data;
import org.springframework.stereotype.Component;


@Component
public class MyComponent {

    String myConmponentname;

     public MyComponent(){
         System.out.println("This is a Constructor of my component");
         this.setMyConmponentname("Nefaryan Component");
     }

    public String getMyConmponentname() {
        System.out.println("MyComponent.getComponedName() has called");
        return myConmponentname;
    }

    public void setMyConmponentname(String myConmponentname) {
        this.myConmponentname = myConmponentname;
    }
}
