package com.fourhorses.pitcherbe.project.repository;

import com.fourhorses.pitcherbe.project.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
    List<ProjectEntity> findAllByIsDeletedFalse();
}
