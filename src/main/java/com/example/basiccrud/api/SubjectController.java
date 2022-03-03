package com.example.basiccrud.api;

import com.example.basiccrud.dto.SubjectRequestDto;
import com.example.basiccrud.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SubjectController {

    private final SubjectService subjectService;



    //과목 저장
    @PostMapping("/api/subjects")
    public void setSubjectInfo(@RequestBody SubjectRequestDto subjectRequestDto){
        subjectService.setSubject(subjectRequestDto);
    }



}