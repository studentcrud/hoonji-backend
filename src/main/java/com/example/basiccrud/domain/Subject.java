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
public class Subject {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    public Subject(SubjectRequestDto subjectRequestDto){
        this.name = subjectRequestDto.getName();
    }

    public Subject(String name){
        this.name = name;
    }



}

