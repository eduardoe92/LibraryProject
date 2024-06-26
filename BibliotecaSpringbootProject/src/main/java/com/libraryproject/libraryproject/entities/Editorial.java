package com.libraryproject.libraryproject.entities;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Editorial {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String uuid;
    private String nombre;

    public Editorial() {
    }

    public String getUuid() {
        return uuid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
