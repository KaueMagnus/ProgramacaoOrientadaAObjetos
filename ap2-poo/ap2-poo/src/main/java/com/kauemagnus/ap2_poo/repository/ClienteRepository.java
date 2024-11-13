package com.kauemagnus.ap2_poo.repository;

import com.kauemagnus.ap2_poo.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {

    private List<Cliente> clientes = new ArrayList<>();
    private Long contadorId = 1L;

    public List<Cliente> listarTodos() {
        return clientes;
    }

    public Cliente salvar(Cliente cliente) {
        cliente.setId(contadorId++);
        clientes.add(cliente);
        return cliente;
    }

    public Cliente atualizar(Long id, Cliente clienteAtualizado) {
        Cliente cliente = clientes.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
        cliente.setNome(clienteAtualizado.getNome());
        cliente.setIdade(clienteAtualizado.getIdade());
        cliente.setProfissao(clienteAtualizado.getProfissao());
        return cliente;
    }

    public void deletar(Long id) {
        clientes.removeIf(cliente -> cliente.getId().equals(id));
    }

    public Cliente buscarPorId(Long id) {
        return clientes.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    public List<Cliente> filtrarPorIdade(int idade) {
        List<Cliente> result = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getIdade() == idade) {
                result.add(cliente);
            }
        }
        return result;
    }
}
