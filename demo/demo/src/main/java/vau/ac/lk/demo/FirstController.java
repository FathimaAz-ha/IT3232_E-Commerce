package vau.ac.lk.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    //http://localhost:8080/Welcome
    @GetMapping("/Welcome")
    public String greeting(){
        return "Welcome to my page";
    }

    @GetMapping("/Welcome-page")

    //http://localhost:8080/Welcome-page?name=Azha
    public String greeting1(@RequestParam String name){
        return "Welcome to my page" + name;
    }
}
