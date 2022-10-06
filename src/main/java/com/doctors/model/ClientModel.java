package com.doctors.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="clients")
public class ClientModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private Integer age;
    private String contraseña;



    public ClientModel() {
    }


    public ClientModel(String name, String email, Integer age, String contraseña) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.contraseña = contraseña;
    }


    public ClientModel(Integer id, String name, String email, Integer age, String contraseña) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.contraseña = contraseña;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContraseña() { return contraseña; }

    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

   @Override
    public String toString() {
        return "ClientModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age + '\'' +
                ", contraseña=" + contraseña +
                '}';
    }
}
