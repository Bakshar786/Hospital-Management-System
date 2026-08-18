package com.smartcoms.hms.repository; import com.smartcoms.hms.entity.Bed; import org.springframework.data.jpa.repository.JpaRepository;
public interface BedRepository extends JpaRepository<Bed,Long>{ long countByStatus(String status); }
