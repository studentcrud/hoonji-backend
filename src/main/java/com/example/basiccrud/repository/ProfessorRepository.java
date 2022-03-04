package com.example.basiccrud.repository;


import com.example.basiccrud.domain.Professor;
import com.example.basiccrud.domain.Subject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    Page<Professor> findAllByOrderByCreatedAtDesc(Pageable pageable);
}
