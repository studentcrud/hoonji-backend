package com.example.basiccrud.api;

import com.example.basiccrud.dto.ProfessorRequestDto;
import com.example.basiccrud.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class ProfessorController {
    private final ProfessorService professorService;

    // 교수 저장
    @PostMapping("/api/professors")
    public void PostProfessor(@RequestBody ProfessorRequestDto professorDto){
        professorService.setProfessor(professorDto);
    }
}
