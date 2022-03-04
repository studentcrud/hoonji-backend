package com.example.basiccrud.api;

import com.example.basiccrud.dto.ProfessorRequestDto;
import com.example.basiccrud.service.ProfessorService;
import com.example.basiccrud.utills.PagingResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class ProfessorController {
    private final ProfessorService professorService;

    // 교수 저장
    @PostMapping("/api/professors")
    public void postProfessor(@RequestBody ProfessorRequestDto professorDto){
        professorService.setProfessor(professorDto);
    }

    // 교수 목록 조회
    @GetMapping("/api/professors/{curPage}")
    public PagingResult getProfessor(@PathVariable Integer curPage){
        return professorService.getProfessor(curPage);
    }

    // 교수 목록 변경
    @PutMapping("/api/professors/{id}")
    public String putProfessor(@PathVariable Long id, @RequestBody ProfessorRequestDto professorRequestDto){
        return professorService.updateProfessor(id, professorRequestDto);
    }


}
