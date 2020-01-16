package cn.keepingthepiggy.letus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/")
public class HelloWorld {
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello, Piggy~";
    }
}
