package cn.keepingthepiggy.letus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ask")
public class HelloWorld {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("")
    public String helloAsk() {
        logger.info("Hello ASK~");
        return "Hello ASK~";
    }

    @RequestMapping("/hello")
    public String helloWorld() {
        logger.info("Hello World~");
        return "Hello World~";
    }

    @RequestMapping("/register")
    public Map register() {
        logger.info("register");
        Map responsible = new HashMap();
        responsible.put("flag","1");
        return responsible;
    }

}
