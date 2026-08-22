package jar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jar.model.Student;
import jar.repo.StudentRepo;

@RestController
public class PostData {

    @Autowired
    StudentRepo db;

    @PostMapping("/api/post")
    String p(@RequestBody Student s) {

        Student data = new Student();
        data.setName(s.getName());
        data.setEmail(s.getEmail());
        data.setIp(s.getIp());
        db.save(data);

        return "user added sucessfull ... ✅  :  " + s.getName();

    }
}
