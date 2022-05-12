package com.example.basiccrud.domain;


import com.example.basiccrud.dto.ProfessorRequestDto;
import com.example.basiccrud.dto.SubjectRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Professor extends TimeStamped {
 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;


    public Professor(ProfessorRequestDto professorRequestDto){
        this.name = professorRequestDto.getName();
        this.age = professorRequestDto.getAge();


    }

    public Professor update(ProfessorRequestDto professorRequestDto){
        this.name = professorRequestDto.getName();
        this.age = professorRequestDto.getAge();

        return this;
    }


}
