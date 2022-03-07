package com.example.basiccrud.domain;


import com.example.basiccrud.dto.SubjectRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Subject extends TimeStamped{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String subjectName;

    public Subject(SubjectRequestDto subjectRequestDto){
        this.subjectName = subjectRequestDto.getSubjectName();
    }

    public Subject(String subjectName){
        this.subjectName = subjectName;
    }

    public Subject update(SubjectRequestDto  subjectRequestDto){
        this.subjectName = subjectRequestDto.getSubjectName();

        return this;
    }



}

