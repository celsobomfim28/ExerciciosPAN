package com.consultorio.br.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document() // registro de um colecao
public class Medico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String nome;
    private String crm;
    private String especialidade;

    public Medico(){}

    public Medico(String id, String nome, String crm, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medico medico = (Medico) o;
        return id.equals(medico.id) && Objects.equals(nome, medico.nome) && crm.equals(medico.crm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, crm);
    }
}
