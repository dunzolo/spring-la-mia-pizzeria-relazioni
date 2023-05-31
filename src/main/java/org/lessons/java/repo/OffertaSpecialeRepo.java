package org.lessons.java.repo;

import org.lessons.java.pojo.OffertaSpeciale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffertaSpecialeRepo extends JpaRepository<OffertaSpeciale, Integer>{

}
