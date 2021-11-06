package com.consultorio.br.Service;

import com.consultorio.br.Model.Paciente;
import com.consultorio.br.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService{

    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public List<Paciente> obterTodos() {
        return this.pacienteRepository.findAll();
    }

    @Override
    public Paciente obterPorCod(String cod) {
        return this.pacienteRepository
                .findById(cod)
                .orElseThrow(() -> new IllegalArgumentException("Paciente inexistente!"));
    }

    @Override
    public Paciente criar(Paciente paciente) {
        return this.pacienteRepository.save(paciente);
    }
}
