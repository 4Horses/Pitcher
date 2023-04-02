package com.fourhorses.pitcherbe.project.repository;

import com.fourhorses.pitcherbe.project.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
    List<ProjectEntity> findAllByIsDeletedFalse();

    Long countByUserAccountIdAndIsDeletedFalse(Long userId);

    @Query("""
            SELECT COUNT(p)
            FROM ProjectEntity p
            JOIN p.organizations o
            WHERE o.id =?1
            AND p.isDeleted = false
            """)
    Long countSponsoredProjects(Long accountId);

    @Query("""
            SELECT COUNT(p)
            FROM ProjectEntity p
            JOIN p.participants u
            WHERE u.id =?1
            AND p.isDeleted = false
            """)
    Long countPitchedProjects(Long userId);

    @Query("""
            SELECT COUNT(p)
            FROM ProjectEntity p
            JOIN p.participants u
            WHERE (p.id = ?1 OR u.id = ?1)
            AND p.isDeleted = false
            AND p.endDate < CURRENT_DATE
            """)
    Long countCompletedProjects(Long userId);

    List<ProjectEntity> findAllByCategoryIdAndIsDeletedFalse(Long categoryId);
}
