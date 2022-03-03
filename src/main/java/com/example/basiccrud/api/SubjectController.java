package com.example.basiccrud.api;

import com.example.basiccrud.dto.SubjectRequestDto;
import com.example.basiccrud.service.SubjectService;
import com.example.basiccrud.utills.PagingResult;
import com.example.basiccrud.utills.Wrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class SubjectController {

    private final SubjectService subjectService;



    //과목 저장
    @PostMapping("/api/subjects")
    public void postSubject(@RequestBody SubjectRequestDto subjectRequestDto){
        subjectService.setSubject(subjectRequestDto);
    }

    //과목 조회
    @GetMapping("/api/subjects/{curPage}")
    public PagingResult getSubject(@PathVariable Integer curPage){
        return subjectService.getSubject(curPage);
    }

    //과목 변경
    @PutMapping("/api/subjects/{id}")
    public String putSubject(@PathVariable Long id,@RequestBody SubjectRequestDto subjectRequestDto){
        return subjectService.updateSubject(id,subjectRequestDto);
    }

    //과목 삭제
    @DeleteMapping("/api/subjects")
    public void deleteSubject(@RequestBody Wrapper subjects){
        subjectService.deleteSubject(subjects);
    }



}