package com.ucacue.springboot.controlador;

import com.ucacue.springboot.infraestructura.repositorio.BusRepositorio;
import com.ucacue.springboot.modelo.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/")
public class BusControlador {


    @Autowired
    BusRepositorio busRepositorio;

    @GetMapping("/getbus")
    public List<Bus> buses()
    {

        return busRepositorio.findAll();
    }

    @PostMapping("/getbus")
    public Bus insertarNuevoBus(@RequestBody Bus bus)
    {
        return busRepositorio.save(bus);

    }
   @GetMapping("/getbus/{id}")
    public ResponseEntity<Bus> buscarBusId(@PathVariable int id) {
        Bus buscarBus = busRepositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No exite bus: " + id));
       return ResponseEntity.ok(buscarBus);


    }
    @PutMapping("/getbus/{id}")
    public ResponseEntity<Bus> editarBusId(@PathVariable int id,@RequestBody Bus busedit ) {
        Bus updateBus = busRepositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No exite bus: " + id));

        updateBus.setId(busedit.getId());
        updateBus.setNombus(busedit.getNombus());
        updateBus.setFecha(busedit.getFecha());
        updateBus.setVelobus(busedit.getVelobus());
        updateBus.setLatitud(busedit.getLatitud());
        updateBus.setLongitud(busedit.getLongitud());

        Bus busactualizado = busRepositorio.save(updateBus);

        return ResponseEntity.ok(busactualizado);


    }

//Metodo eliminacion datos
    @DeleteMapping("/getbus/{id}")
    public ResponseEntity<Map<String,Boolean>> eliminarBus(@PathVariable int id) {
        Bus bus = busRepositorio.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No exite bus: " + id));

        busRepositorio.delete(bus);
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminar", Boolean.TRUE);
        return  ResponseEntity.ok(respuesta);
    }
}
