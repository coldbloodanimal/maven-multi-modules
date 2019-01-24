package ice.controller;

import ice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService service;

    @RequestMapping("/haha")
    public String haha() {
        return service.print();
    }
    @RequestMapping("/")
    public String index() {
        return "Greetings from ice-web!";
    }


}
