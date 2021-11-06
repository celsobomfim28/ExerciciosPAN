package com.consultorio.br.Repository;

import com.consultorio.br.Model.Medico;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicoRepository extends MongoRepository<Medico, String> {
}
