package cn.keepingthepiggy.controller.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/ask")
public class HelloWorld {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("")
    public String helloAsk() {
        logger.info("Hello ASK~");
        return "Hello ASK~";
    }

    @RequestMapping("/ask/hello")
    public String helloWorld() {
        logger.info("Hello World~");
        return "Hello World~";
    }


    @RequestMapping(value ="/auth", method = RequestMethod.GET)
    public String auth2() {
        return "authorize";
    }



}
