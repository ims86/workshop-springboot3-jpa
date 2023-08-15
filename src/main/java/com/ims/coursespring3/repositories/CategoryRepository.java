package com.ims.coursespring3.repositories;

import com.ims.coursespring3.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
