package JavaFSE.DeepsKilling.Module7_Spring_Rest_using_SpringBoot3.spring_rest_handson.src.main.java.org.example.springresthandson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!!";
    }
}