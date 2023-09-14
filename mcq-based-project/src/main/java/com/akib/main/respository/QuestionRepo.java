package com.akib.main.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.akib.main.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer>{

}
