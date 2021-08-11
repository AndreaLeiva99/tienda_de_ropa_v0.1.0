    package com.tienda.de.ropa.tienda.de.ropa.v01.model;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;

    @Entity
    public class Tipo_prenda {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)

        private int id_tipo_prenda ;
    private String nombre ;

        public int getId_tipo_prenda() {
            return id_tipo_prenda;
        }

        public void setId_tipo_prenda(int id_tipo_prenda) {
            this.id_tipo_prenda = id_tipo_prenda;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
