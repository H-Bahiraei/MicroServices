package org.gfn.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author H-Bahiraei
 * Created on 10/24/2022
 */

public interface AlienRepository extends JpaRepository<Alien, Integer> {
    List<Alien> findByTech(String tech);

    List<Alien> findByAidGreaterThan(int aid);

    @Query("from Alien where tech=?1 order by aname")
    List<Alien> findByMyQuery(String tech);
}
