package com.example.basiccrud.api;

import com.example.basiccrud.dto.SubjectRequestDto;
import com.example.basiccrud.service.SubjectService;
import com.example.basiccrud.utills.PagingResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class SubjectController {

    private final SubjectService subjectService;



    //과목 저장
    @PostMapping("/api/subjects")
    public void setSubjectInfo(@RequestBody SubjectRequestDto subjectRequestDto){
        subjectService.setSubject(subjectRequestDto);
    }

    //과목 조회
    @GetMapping("/api/subjects/{curPage}")
    public PagingResult getSubject(@PathVariable Integer curPage){
        return subjectService.getSubjects(curPage);
    }



}