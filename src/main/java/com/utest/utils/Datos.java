package com.utest.utils;

import com.github.javafaker.Faker;

public class Datos {

    static Faker faker = new Faker();

    private String correo;
    private String nombre;
    private String apellido;
    private String contrasena;
    private String pais;
    private String ciudad;
    private String codigoZip;

    public Datos() {
        //Datos aleatorios
        this.nombre = faker.name().firstName();
        this.apellido = faker.name().lastName();
        this.correo = faker.internet().emailAddress();
        this.contrasena = faker.internet().password(10, 20, true, true);
        this.pais = faker.country().name();
        this.ciudad = faker.country().capital();
        this.codigoZip = Long.toString(faker.number().numberBetween(1000,99999));
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCodigoZip() {
        return codigoZip;
    }
}


