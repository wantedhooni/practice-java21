package com.revy.virtual_thread_test.endpoint;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thread")
public class ThreadController {
    protected final Log logger = LogFactory.getLog(getClass());


    @GetMapping("/name")
    public String getThreadName() {
        logger.info("call");
        return Thread.currentThread().toString();
    }
}
