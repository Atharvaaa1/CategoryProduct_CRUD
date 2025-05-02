// src/main/java/com/nimap/repository/CategoryRepository.java
package com.nimap.repository;

import com.nimap.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
