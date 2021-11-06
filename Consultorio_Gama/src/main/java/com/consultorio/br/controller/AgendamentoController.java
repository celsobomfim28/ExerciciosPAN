package com.consultorio.br.controller;

import com.consultorio.br.Model.Agendamento;
import com.consultorio.br.Service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @GetMapping
    public List<Agendamento> obterTodos() {
        return this.agendamentoService.obterTodos();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Agendamento> obterPorCodigo(@PathVariable String id) {
        Agendamento obj = this.agendamentoService.obterPorCod(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public Agendamento criar(@RequestBody Agendamento agendamento) {
        return this.agendamentoService.criar(agendamento);
    }
}
