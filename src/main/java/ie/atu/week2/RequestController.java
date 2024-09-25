package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

@RestController
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
    @GetMapping("calculate")
    public String calculate(@RequestParam () int num1, @RequestParam() int num2, @RequestParam () String operation){
       float total = 0;
        switch(operation){
            case "add":
                total = num1 + num2;
                break;
            case "subtract":
                total = num1 - num2;
                break;
            case "multiply":
                total = num1 * num2;
                break;
            case "divide":
                if(num2 == 0){
                    System.out.print("Cant divide by 0");
                    break;
                }else{
                    total = num1 / num2;
                }
                break;
            default:
                System.out.print("invalid input");
                break;
        }
        return Float.toString(total);
    }
}
