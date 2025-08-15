package com.example.trabalhoRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trabalhoRest.model.Tarefa;

@Repository
public interface TarefaRepository  extends JpaRepository <Tarefa, Long>{

}
