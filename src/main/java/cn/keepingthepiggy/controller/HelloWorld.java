package cn.keepingthepiggy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/ask")
@RequestMapping()
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



}
