package boot.practice.jpa.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/healthCheck")
public class HealthController {

    @GetMapping(produces = "application/json")
    public ResponseEntity<String> healthCheck(){
        log.info("HealthCheck success .... !!!");
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
