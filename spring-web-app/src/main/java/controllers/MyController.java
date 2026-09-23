package controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import services.GreetingService;
import services.GreetingServiceImpl;

@Controller
public class MyController {

    private static final Logger log = LogManager.getLogger(MyController.class);
    private final GreetingService greetingService;

    public MyController(){
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        log.info("This is a controller");
        return greetingService.sayGreeting();
    }
}
