package com.consultorio.br.Service;

import com.consultorio.br.Model.Paciente;

import java.util.List;

public interface PacienteService {
    
    public List<Paciente> obterTodos();

    public Paciente obterPorCod(String cod);

    public Paciente criar(Paciente paciente);
}
