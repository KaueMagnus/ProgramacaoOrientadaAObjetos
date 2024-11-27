package com.kauemagnus.AS_poo.controller;

import com.kauemagnus.AS_poo.model.Carro;
import com.kauemagnus.AS_poo.service.CarroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private final CarroService service;

    public CarroController(CarroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Carro> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public Carro salvar(@RequestBody Carro carro) {
        return service.salvar(carro);
    }

    @GetMapping("/{id}")
    public Carro buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Carro atualizar(@PathVariable Long id, @RequestBody Carro carroAtualizado) {
        return service.atualizar(id, carroAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }


}
