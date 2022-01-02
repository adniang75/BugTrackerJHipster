package com.alassaneniang.bugtracker.repository;

import com.alassaneniang.bugtracker.domain.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Label entity.
 */
@SuppressWarnings( "unused" )
@Repository
public interface LabelRepository extends JpaRepository<Label, Long> {
}
