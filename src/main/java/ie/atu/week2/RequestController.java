package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Person")
public class RequestController {
    @GetMapping("/hello")
    public String sayHello(){
        return("Hi There :");
    }
    @GetMapping("greet/{name}")
    public String greetByName(@PathVariable() String name){
        return("Your name is: " + name);
    }

    @GetMapping("/details")
    public String details(@RequestParam () String name, @RequestParam() int age){
        return  name + " " + age;
    }
}
