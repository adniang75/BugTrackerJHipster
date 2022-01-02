package com.alassaneniang.bugtracker.repository;

import com.alassaneniang.bugtracker.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Project entity.
 */
@SuppressWarnings( "unused" )
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
