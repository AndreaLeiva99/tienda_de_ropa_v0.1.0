        package com.tienda.de.ropa.tienda.de.ropa.v01.model;

        import javax.persistence.*;

        @Entity
        public class Prenda_final {
            @Id
            @GeneratedValue(strategy= GenerationType.IDENTITY)
            private int id_prenda_final;

            @OneToOne
            @JoinColumn(name = "id_color", referencedColumnName = "id_color")
            private Color id_color ;


            @OneToOne
            @JoinColumn(name = "id_estacion", referencedColumnName = "id_estacion")
            private Estacion id_estacion ;

            @OneToOne
            @JoinColumn(name = "id_genero", referencedColumnName = "id_genero")
            private Genero id_genero ;

            @OneToOne
            @JoinColumn(name = "id_precio", referencedColumnName = "id_precio")
            private Precio id_precio ;

            @OneToOne
            @JoinColumn(name = "id_talle", referencedColumnName = "id_talle")
            private Talle id_talle ;

            public int getId_prenda_final() {
                return id_prenda_final;
            }

            public void setId_prenda_final(int id_prenda_final) {
                this.id_prenda_final = id_prenda_final;
            }

            public Color getId_color() {
                return id_color;
            }

            public void setId_color(Color id_color) {
                this.id_color = id_color;
            }

            public Estacion getId_estacion() {
                return id_estacion;
            }

            public void setId_estacion(Estacion id_estacion) {
                this.id_estacion = id_estacion;
            }

            public Genero getId_genero() {
                return id_genero;
            }

            public void setId_genero(Genero id_genero) {
                this.id_genero = id_genero;
            }

            public Precio getId_precio() {
                return id_precio;
            }

            public void setId_precio(Precio id_precio) {
                this.id_precio = id_precio;
            }

            public Talle getId_talle() {
                return id_talle;
            }

            public void setId_talle(Talle id_talle) {
                this.id_talle = id_talle;
            }

            public Tipo_prenda getId_tipo_prenda() {
                return id_tipo_prenda;
            }

            public void setId_tipo_prenda(Tipo_prenda id_tipo_prenda) {
                this.id_tipo_prenda = id_tipo_prenda;
            }

            @OneToOne
            @JoinColumn(name = "id_tipo_prenda", referencedColumnName = "id_tipo_prenda")
            private Tipo_prenda id_tipo_prenda ;






    }
