package ie.atu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Person")
public class RequestController {
    @GetMapping("greet/{name}")
    public String sayHello(){
        return("Hi There :");
    }
}
