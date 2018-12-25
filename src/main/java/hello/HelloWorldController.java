package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello-world")
    public Greeting sayHello() {
        return new Greeting(111,"안녕하세요. 나는 슈퍼맨입니다.");
    }

}