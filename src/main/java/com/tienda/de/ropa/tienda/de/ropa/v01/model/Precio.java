    package com.tienda.de.ropa.tienda.de.ropa.v01.model;

    import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;

    @Entity
    public class Precio {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)

        private int id_precio ;
        private int valor ;


        public int getId_precio() {
            return id_precio;
        }

        public void setId_precio(int id_precio) {
            this.id_precio = id_precio;
        }

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }
    }
