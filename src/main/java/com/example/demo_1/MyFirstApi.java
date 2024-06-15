package com.example.demo_1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstApi {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello Class";
    }
    @RequestMapping("/hello/{name}/{times}")
    public  String sayHelloName(@PathVariable("name") String name,@PathVariable("times") int times){
        String str="";
        for(int i=0;i<times;i++){
            str+="Hello"+ name + (i+1);
            str+= "<br>";

        }
        return str;
    }

}
