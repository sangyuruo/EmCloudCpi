package com.emcloud.cpi.repository;

import com.emcloud.cpi.domain.Compoint;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;
import java.util.List;


/**
 * Spring Data JPA repository for the Compoint entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CompointRepository extends JpaRepository<Compoint, Long> {
    List<Compoint> findAll();
    List<Compoint> findAllByCompanyCode(String companyCode);
    Compoint findByComPointCodeAndCompanyCode(String  compointCode, String  companyCode);
//    Compoint findByComPointCode(String  compointCode);
//    List<Compoint> findByRegisterName(String registerName);
}

