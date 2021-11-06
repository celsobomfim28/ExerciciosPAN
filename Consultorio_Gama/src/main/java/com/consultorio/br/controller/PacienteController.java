package com.consultorio.br.controller;

import com.consultorio.br.Model.Paciente;
import com.consultorio.br.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public List<Paciente> obterTodos() {
        return this.pacienteService.obterTodos();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Paciente> obterPorCodigo(@PathVariable String id) {
        Paciente obj = this.pacienteService.obterPorCod(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public Paciente criar(@RequestBody Paciente paciente) {
        return this.pacienteService.criar(paciente);
    }
}