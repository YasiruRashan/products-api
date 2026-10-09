package westminster.ac.uk.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello(){
        return "Welcome to SpringBoot";
    }

    @GetMapping("/status")
    public String Status(){
        return "The API is running in the tutorial 01";
    }



}
