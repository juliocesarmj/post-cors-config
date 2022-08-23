package com.example.crospost.service;

import com.example.crospost.entity.Pessoa;
import com.example.crospost.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public void cadastrar(Pessoa pessoa) {
        Pessoa objeto = new Pessoa();
        objeto.setNome(pessoa.getNome());
        objeto.setIdade(pessoa.getIdade());

        pessoaRepository.save(objeto);
    }
}
