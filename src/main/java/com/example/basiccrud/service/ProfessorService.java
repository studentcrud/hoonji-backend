package com.example.basiccrud.service;

import com.example.basiccrud.domain.Professor;
import com.example.basiccrud.dto.ProfessorRequestDto;
import com.example.basiccrud.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    @Transactional
    public void setProfessor(ProfessorRequestDto professorRequestDto){
        Professor professor = new Professor(professorRequestDto);
        professorRepository.save(professor);
    }



}
