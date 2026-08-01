package jar.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.model.Student;
import jar.repo.StudentRepo;

@RestController
@RequestMapping("/std")
public class Std {

    @GetMapping()
    Map<Object, Object> m1() {
        Map<Object, Object> res = new HashMap<>();
        res.put("api", "welcome to get api");
        res.put("status", 200);
        res.put("student data", all());
        return res;

    }
    @Autowired
    StudentRepo db;

    @PostMapping()
    Map< Object, Object> m2(@RequestBody Student d) {
        Map<Object, Object> res = new HashMap<>();
        String x = d.getName();
        String y = d.getEmail();
        String z = d.getIp();
        Student entity = new Student();
        entity.setName(x);
        entity.setEmail(y);
        entity.setIp(z);
        db.save(entity);

        System.out.println("\n\t Name : " + x);
        System.out.println("\n\t Email : " + y);
        System.out.println("\n\t IP : " + z);

        res.put("api", "welcome to post api");
        res.put("status", 201);
        res.put("name", x);
        res.put("email", y);
        return res;

    }

    List<Student> all() {
        return db.findAll();
    }
}
