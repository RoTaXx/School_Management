package com.inforamtics.schoolmanagment.data.repository;

import com.inforamtics.schoolmanagment.data.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
