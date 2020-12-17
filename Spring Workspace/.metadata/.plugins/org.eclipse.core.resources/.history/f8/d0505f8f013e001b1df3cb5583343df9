package com.example.demo.repository;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
	@Transactional
	@Query("update Todo set Status = true where id=?1")
	@Modifying
	public void update(int id);
	@Query( value="select * from Todo where userid=?1",nativeQuery=true)
	public List<Todo> findAllById(int id);

}
