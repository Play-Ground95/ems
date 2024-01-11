package ijse.lk.dep11.employeemanagementsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/kavindu")
    public String doSomething(){
        return "I am Prepare for my interview in acenture";
    }
}
