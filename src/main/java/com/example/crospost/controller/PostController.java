package com.example.crospost.controller;

import com.example.crospost.entity.Pessoa;
import com.example.crospost.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
public class PostController {

    @Autowired
    private PessoaService service;

    @PostMapping
    public ResponseEntity<Void> cadastrar(@RequestBody Pessoa pessoa) {
        this.service.cadastrar(pessoa);

        return ResponseEntity.noContent().build();
    }
}
