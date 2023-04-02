package com.fourhorses.pitcherbe.category.repository;

import com.fourhorses.pitcherbe.category.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    @Query(value = """
            SELECT COUNT(c)
            FROM CategoryEntity c
            JOIN c.projectEntities p
            JOIN p.userAccount u
            WHERE c.id = ?2
            AND u.id = ?1
            AND p.isDeleted = false""")
    Long countCategoryFrequency(Long userId, Long categoryId);
}
