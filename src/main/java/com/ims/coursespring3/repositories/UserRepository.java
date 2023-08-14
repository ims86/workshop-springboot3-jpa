package com.ims.coursespring3.repositories;

import com.ims.coursespring3.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
