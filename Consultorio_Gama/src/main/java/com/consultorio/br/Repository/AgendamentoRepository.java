package com.consultorio.br.Repository;

import com.consultorio.br.Model.Agendamento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgendamentoRepository extends MongoRepository<Agendamento, String> {
}
