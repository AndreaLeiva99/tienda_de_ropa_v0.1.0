    package com.tienda.de.ropa.tienda.de.ropa.v01.model;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;

    @Entity
    public class Talle {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_talle;
    private String nombre ;
        public int getId_talle() {
            return id_talle;
        }

        public void setId_talle(int id_talle) {
            this.id_talle = id_talle;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }