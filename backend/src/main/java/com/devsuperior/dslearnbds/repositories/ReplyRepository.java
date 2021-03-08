package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Course;
import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.entities.Lesson;
import com.devsuperior.dslearnbds.entities.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

}