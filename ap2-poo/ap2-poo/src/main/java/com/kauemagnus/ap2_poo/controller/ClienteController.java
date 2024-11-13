package com.kauemagnus.ap2_poo.controller;

import com.kauemagnus.ap2_poo.model.Cliente;
import com.kauemagnus.ap2_poo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    // GET
    @GetMapping
    public List<Cliente> listarTodos() {
        return clienteService.listarTodos();
    }

    // POST
    @PostMapping
    public Cliente adicionarCliente(@RequestBody Cliente cliente) {
        return clienteService.adicionarCliente(cliente);
    }

    // PUT
    @PutMapping("/{id}")
    public Cliente atualizarCliente(@PathVariable Long id, @RequestBody Cliente clienteAtualizado) {
        return clienteService.atualizarCliente(id, clienteAtualizado);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void removerCliente(@PathVariable Long id) {
        clienteService.removerCliente(id);
    }

    // GET
    @GetMapping("/{id}")
    public Cliente obterClientePorId(@PathVariable Long id) {
        return clienteService.obterClientePorId(id);
    }

    // GET
    @GetMapping("/filtro")
    public List<Cliente> filtrarPorIdade(@RequestParam int idade) {
        return clienteService.filtrarPorIdade(idade);
    }
}
