        package com.tienda.de.ropa.tienda.de.ropa.v01.model;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;

        @Entity
        public class Genero {
            @Id
            @GeneratedValue(strategy= GenerationType.AUTO)
        private int id_genero;
        private String nombre;

            public int getId_genero() {
                return id_genero;
            }

            public void setId_genero(int id_genero) {
                this.id_genero = id_genero;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
    }
