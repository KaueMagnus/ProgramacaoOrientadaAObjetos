package com.kauemagnus.ap2_poo.service;

import com.kauemagnus.ap2_poo.model.Cliente;
import com.kauemagnus.ap2_poo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {


    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodos() {
        return clienteRepository.listarTodos();
    }

    public Cliente adicionarCliente(Cliente cliente) {
        return clienteRepository.salvar(cliente);
    }

    public Cliente atualizarCliente(Long id, Cliente clienteAtualizado) {
        return clienteRepository.atualizar(id, clienteAtualizado);
    }

    public void removerCliente(Long id) {
        clienteRepository.deletar(id);
    }

    public Cliente obterClientePorId(Long id) {
        return clienteRepository.buscarPorId(id);
    }

    public List<Cliente> filtrarPorIdade(int idade) {
        return clienteRepository.filtrarPorIdade(idade);
    }
}
