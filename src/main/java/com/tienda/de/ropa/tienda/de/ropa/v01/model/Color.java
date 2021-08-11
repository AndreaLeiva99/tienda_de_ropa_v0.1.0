    package com.tienda.de.ropa.tienda.de.ropa.v01.model;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;

    @Entity
    public class Color {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)

    private int id_color;
    private String nombre ;

        public int getId_color() {
            return id_color;
        }

        public void setId_color(int id_color) {
            this.id_color = id_color;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
