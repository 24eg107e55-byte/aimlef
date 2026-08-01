package jar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.repo.StudentRepo;

@RestController
@RequestMapping("/delete")
public class Delete {

    @Autowired
    StudentRepo db;

    @DeleteMapping("/{id}")
    Map<Object, Object> deleteStudent(@PathVariable Long id) {
        Map<Object, Object> res = new HashMap<>();
        db.deleteById(id);
        res.put("status", 203);
        res.put("msg", "User deleted successfully");
        return res;
    }
}
