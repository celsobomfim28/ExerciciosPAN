package com.consultorio.br.controller;

import com.consultorio.br.Model.Medico;
import com.consultorio.br.Service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<Medico> obterTodos() {
        return this.medicoService.obterTodos();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Medico> obterPorCodigo(@PathVariable String id) {
        Medico obj = this.medicoService.obterPorCod(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public Medico criar(@RequestBody Medico medico) {

        return this.medicoService.criar(medico);
    }
}
