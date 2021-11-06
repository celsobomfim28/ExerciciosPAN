package com.consultorio.br.Service;

import com.consultorio.br.Model.Agendamento;

import java.util.List;

public interface AgendamentoService {

    public List<Agendamento> obterTodos();

    public Agendamento obterPorCod(String cod);

    public Agendamento criar(Agendamento agendamento);
}
