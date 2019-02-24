package cn.nandem.graphqljavaexperiments.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @RequestMapping("/test")
    public ResponseEntity<String> test()
    {
        return ResponseEntity.ok("test ok");
    }
}
