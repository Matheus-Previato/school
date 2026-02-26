package com.bn.school.services;

import com.bn.school.models.ProfessorModel;
import com.bn.school.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public ProfessorModel criarProfessor(ProfessorModel professorModel){
        return  professorRepository.save(professorModel);
    }

    public List<ProfessorModel> buscarTodosProfessores(){
        return  professorRepository.findAll();
    }

    public void deletarProfessores(Long id){
        professorRepository.deleteById(id);
    }

}
