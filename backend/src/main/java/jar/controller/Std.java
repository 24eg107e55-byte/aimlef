package jar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.model.Student;

@RestController
@RequestMapping("/std")
public class Std {

    @GetMapping()
    Map<Object, Object> m1() {
        Map<Object, Object> res = new HashMap<>();
        res.put("api", "welcome to get api");
        return res;

    }

    @PostMapping()
    Map<Object, Object> m2(@RequestBody Student s) {
        Map<Object, Object> res = new HashMap<>();
        String name=s.getName();
        String email=s.getEmail();
        String ip=s.getIp();
        System.out.println("\n\t Name : "+name);
        System.out.println("\n\t Email : "+email);
        System.out.println("\n\t IP : "+ip);
        res.put("api", "welcome to post api");
        return res;

    }

}
