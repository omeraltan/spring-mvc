package com.spring.mvc.studies.putandpatch;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HeavyResourceRepository extends JpaRepository<HeavyResource, Long> {

}
