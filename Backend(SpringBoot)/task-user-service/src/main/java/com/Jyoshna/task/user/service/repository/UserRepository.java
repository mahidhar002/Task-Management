package com.Jyoshna.task.user.service.repository;

import com.Jyoshna.task.user.service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
   public User findByEmail(String email);
}
