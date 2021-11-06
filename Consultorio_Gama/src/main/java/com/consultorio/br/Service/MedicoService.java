package com.consultorio.br.Service;

import com.consultorio.br.Model.Medico;

import java.util.List;

public interface MedicoService {

    public List<Medico> obterTodos();

    public Medico obterPorCod(String cod);

    public Medico criar(Medico medico);
}
