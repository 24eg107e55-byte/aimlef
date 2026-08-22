package jar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import jar.services.*;

@RestController
public class Users {

    @Autowired
    Usersservices u;

    @GetMapping("/all")
    Map<Object, Object> users() {
        Map<Object, Object> res = new HashMap();
        res.put("msg", "all users data");
        res.put("status", 200);
        res.put("data", u.all());
        return res;

    }
}
