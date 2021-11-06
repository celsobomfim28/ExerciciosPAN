package com.consultorio.br.Repository;

import com.consultorio.br.Model.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PacienteRepository extends MongoRepository<Paciente, String> {
}
