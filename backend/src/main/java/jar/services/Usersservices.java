package jar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jar.model.Student;

@Service
public class Usersservices {

    @Autowired
    jar.repo.StudentRepo db;

    public List<Student> all() {
        return db.findAll();
    }
}
