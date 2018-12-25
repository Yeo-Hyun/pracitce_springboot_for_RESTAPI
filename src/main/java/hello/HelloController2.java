package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController2 {

    @RequestMapping("/index3")
    public String index() {
        return "index test3";
    }

}