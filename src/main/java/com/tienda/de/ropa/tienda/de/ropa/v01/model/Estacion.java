    package com.tienda.de.ropa.tienda.de.ropa.v01.model;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;
    @Entity
    public class Estacion {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private int id_estacion;
    private  String nombre;

        public int getId_estacion() {
            return id_estacion;
        }

        public void setId_estacion(int id_estacion) {
            this.id_estacion = id_estacion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
