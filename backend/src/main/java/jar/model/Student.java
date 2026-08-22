package jar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    @Column(unique = true)
    String email;
    String ip;

    public String getName() {
        return name;

    }

    public Long getId() {
        return this.id;

    }

    public void setName(String n) {
        this.name = n;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String i) {
        this.ip = i;
    }

}
