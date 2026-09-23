package controllers;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    private static final Logger log = LoggerFactory.getLogger(MyControllerTest.class);

    @Test
    void sayHello(){

        MyController myController = new MyController();
        log.info(myController.sayHello());
    }

}