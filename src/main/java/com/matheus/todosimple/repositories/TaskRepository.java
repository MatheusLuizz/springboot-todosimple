package com.matheus.todosimple.repositories;

import com.matheus.todosimple.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    List<Task> findByUser_Id(Integer id);
    //    @Query(value = "SELECT t FROM Task t WHERE t.user.id = :")
    //    List<Task> findByUser_Id(@Param("id") Integer id);
    //    @Query(value = "SELECT * FROM task t WHERE t.user_id = :id", nativeQuery = true)
    //    List<Task> findByUser_Id(@Param("id") Integer id);

}
