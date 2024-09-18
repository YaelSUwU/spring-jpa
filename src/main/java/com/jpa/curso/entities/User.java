package com.jpa.curso.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class User {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    private String name;
    @Column(name="correo")
    private String correo;
    @Column(name="monto_deuda")
    private Long deuda;

    
//CONSTRUCTORES

    public User() {
    }

    public User(Long id, String name, String correo, Long deuda) {
        this.id = id;
        this.name = name;
        this.correo = correo;
        this.deuda = deuda;
    }



//GETTERS AND SETTERS

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Long getDeuda() {
        return deuda;
    }
    public void setDeuda(Long deuda) {
        this.deuda = deuda;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + ", correo=" + correo + ", deuda=" + deuda + "]";
    }


    

}
