package jar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.model.Student;
import jar.repo.StudentRepo;

@RestController
@RequestMapping("/update")
public class Update {

    @Autowired
    StudentRepo db;

    @PutMapping("/{id}")
    Map<Object, Object> updateStudent(@PathVariable Long id, @RequestBody Student d) {
        Map<Object, Object> res = new HashMap<>();
        Student entity = db.findById(id).orElse(null);

        String x = d.getName();
        String y = d.getEmail();
        String z = d.getIp();
        entity.setName(x);
        entity.setEmail(y);
        entity.setIp(z);

        db.save(entity);

        res.put("status", 200);
        res.put("name", x);
        res.put("email", y);
        res.put("msg", "user updated sucefully");
        return res;
    }

}
