package com.bn.school.controllers;

import com.bn.school.models.ProfessorModel;
import com.bn.school.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @PostMapping
    public ProfessorModel criarProfessor(@RequestBody ProfessorModel professorModel){
        return  professorService.criarProfessor(professorModel);
    }
    @GetMapping
    public List<ProfessorModel> buscarTodosProfessores(){
        return  professorService.buscarTodosProfessores();
    }
    @DeleteMapping("/{id}")
    public void deletarProfessor( @PathVariable Long id){
        professorService.deletarProfessores(id);
    }




}
