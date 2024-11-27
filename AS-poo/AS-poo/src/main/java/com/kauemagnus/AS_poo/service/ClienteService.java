package com.kauemagnus.AS_poo.service;

import com.kauemagnus.AS_poo.model.Cliente;
import com.kauemagnus.AS_poo.repository.ClienteRepository;
import org.hibernate.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não foi encontrado!"));
    }

    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente atualizar(Long id, Cliente clienteAtualizado) {
        Cliente clienteAtual = buscarPorId(clienteAtualizado.getId());
        clienteAtual.setNome(clienteAtualizado.getNome());
        clienteAtual.setEmail(clienteAtualizado.getEmail());
        clienteAtual.setTelefone(clienteAtualizado.getTelefone());
        return clienteRepository.save(clienteAtual);
    }
}
