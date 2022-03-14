package com.example.basiccrud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class SubjectRequestDto {

    private String subjectName;


    public SubjectRequestDto(String subjectName) {
        this.subjectName = subjectName;
    }
}
