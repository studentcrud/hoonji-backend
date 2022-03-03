package com.example.basiccrud.repository;


import com.example.basiccrud.domain.Subject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Long> {


    Optional<Subject> findByName(String name);

    Page<Subject> findAllByOrderByCreatedAtDesc(Pageable pageable);







}