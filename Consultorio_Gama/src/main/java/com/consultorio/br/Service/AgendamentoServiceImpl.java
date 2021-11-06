package com.consultorio.br.Service;

import com.consultorio.br.Model.Agendamento;
import com.consultorio.br.Model.Medico;
import com.consultorio.br.Model.Paciente;
import com.consultorio.br.Repository.AgendamentoRepository;
import com.consultorio.br.Repository.MedicoRepository;
import com.consultorio.br.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoServiceImpl implements AgendamentoService{

    @Autowired
    AgendamentoRepository agendamentoRepository;

    @Autowired
    MedicoRepository medicoRepository;

    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public List<Agendamento> obterTodos() {
        return this.agendamentoRepository.findAll();
    }

    @Override
    public Agendamento obterPorCod(String cod) {
        return this.agendamentoRepository
                .findById(cod)
                .orElseThrow(() -> new IllegalArgumentException("Agenda inexistente!"));
    }

    @Override
    public Agendamento criar(Agendamento agendamento) {
        Medico medico =
                this.medicoRepository
                        .findById(agendamento.getMedico().getId())
                        .orElseThrow(() -> new IllegalArgumentException("Medico inexistente!"));


        Paciente paciente =
                this.pacienteRepository
                        .findById(agendamento.getPaciente().getId())
                        .orElseThrow(() -> new IllegalArgumentException("Paciente inexistente!"));

        agendamento.setMedico(medico);
        agendamento.setPaciente(paciente);

        return this.agendamentoRepository.save(agendamento);
    }
}
