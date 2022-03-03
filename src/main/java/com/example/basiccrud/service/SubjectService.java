package com.example.basiccrud.service;

import com.example.basiccrud.domain.Subject;
import com.example.basiccrud.dto.SubjectRequestDto;
import com.example.basiccrud.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class SubjectService {

    private  final SubjectRepository subjectRepository;

    //과목 저장 및 중복 저장 x
    @Transactional
    public void setSubject(SubjectRequestDto subjectRequestDto){

        String sub = subjectRequestDto.getName();
        Optional<Subject> found = subjectRepository.findByName(sub);
        if(found.isPresent()){
            throw new IllegalArgumentException("이미있는 학과명 입니다");
        } else {
            Subject subject = new Subject(sub);
            subjectRepository.save(subject);

        }



    }

}
