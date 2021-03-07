package com.devsuperior.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslearnbds.entities.Course;
import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.entities.Lesson;
import com.devsuperior.dslearnbds.entities.Reply;
import com.devsuperior.dslearnbds.entities.Resource;
import com.devsuperior.dslearnbds.entities.Role;
import com.devsuperior.dslearnbds.entities.Section;
import com.devsuperior.dslearnbds.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
