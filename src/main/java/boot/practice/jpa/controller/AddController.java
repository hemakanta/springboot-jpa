package boot.practice.jpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa-test")
public class AddController {

    @GetMapping(value="")
    public String home(){
        return "home.jsp";
    }
}
