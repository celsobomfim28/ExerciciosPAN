package com.consultorio.br.Service;

import com.consultorio.br.Model.Medico;
import com.consultorio.br.Repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServiceImpl implements MedicoService{

    @Autowired
    MedicoRepository medicoRepository;

    @Override
    public List<Medico> obterTodos() {
        return this.medicoRepository.findAll();
    }

    @Override
    public Medico obterPorCod(String cod) {
        return this.medicoRepository
                .findById(cod)
                .orElseThrow(() -> new IllegalArgumentException("Medico inexistente!"));
    }

    @Override
    public Medico criar(Medico medico) {
        return this.medicoRepository.save(medico);
    }
}
