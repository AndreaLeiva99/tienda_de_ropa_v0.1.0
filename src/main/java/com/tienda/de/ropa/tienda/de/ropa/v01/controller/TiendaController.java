    package com.tienda.de.ropa.tienda.de.ropa.v01.controller;

    import com.tienda.de.ropa.tienda.de.ropa.v01.model.*;
    import com.tienda.de.ropa.tienda.de.ropa.v01.repository.*;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.Optional;

    @RestController
    @RequestMapping (path = "/tienda/de/ropa/v01/")

    public class TiendaController {


        @Autowired
        private talleRepository talleRepository;

        @GetMapping(path = "talle/all")
        public @ResponseBody
        Iterable<Talle> getalltalle() {
            return talleRepository.findAll();
        }

        @GetMapping(path = "talle/{id_talle}")
        public @ResponseBody
        Optional<Talle> gatTalleById(@PathVariable ("id_talle") int id_talle) {
            return talleRepository.findById(id_talle); }

        @Autowired
        private colorRepository colorRepository;

        @GetMapping(path = "color/all")
        public @ResponseBody
        Iterable<Color> getallcolor() { return colorRepository.findAll(); }


        @Autowired
        private estacionRepository estacionRepository;

        @GetMapping(path = "estacion/all")
        public @ResponseBody
        Iterable<Estacion> getallestacion() { return estacionRepository.findAll(); }


        @Autowired
        private generoRepository generoRepository;

        @GetMapping(path = "genero/all")
        public @ResponseBody
        Iterable<Genero> getallgenero() { return generoRepository.findAll(); }


        @Autowired
        private precioRepository precioRepository;

        @GetMapping(path = "precio/all")
        public @ResponseBody
        Iterable<Precio> getallprecio() { return precioRepository.findAll(); }


        @Autowired
        private tipo_prendaRepository tipo_prendaRepository ;

        @GetMapping(path = "tipo_prenda/all")
        public @ResponseBody
        Iterable<Tipo_prenda> getalltipo_prenda() { return tipo_prendaRepository.findAll(); }


        @Autowired
        private prenda_finalRepository prenda_finalRepository;


        @GetMapping(path = "prenda_final/all")
        public @ResponseBody
        Iterable<Prenda_final> getallprenda_final() {
            return prenda_finalRepository.findAll(); }

        @GetMapping(path = "prenda_final/{id_prenda_final}")
        public @ResponseBody
        Optional<Prenda_final> getprenda_finalById(@PathVariable ("id_prenda_final") int id_prenda_final) {
            return prenda_finalRepository.findById(id_prenda_final); }

        //======================create=================================


        @PostMapping(path = "talle/create", consumes = "application/json", produces = "application/json")
        public Talle createTalle (@RequestBody Talle newtalle) {
            return talleRepository.save(newtalle);
        }

        //======================update=================================

        @PutMapping(path = "talle/update")
        public Talle updateTalle (@RequestBody Talle updatetalle) {
            return talleRepository.save(updatetalle);

        }

        //======================delete=================================

        @DeleteMapping(path = "talle/delete/{id_talle}")
        public @ResponseBody
        Iterable<Talle> deleteTalleById(@PathVariable ("id_talle") int id_talle) {
        talleRepository.deleteById(id_talle);
            return talleRepository.findAll(); }


    }

