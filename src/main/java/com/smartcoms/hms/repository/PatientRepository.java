package com.smartcoms.hms.repository; import com.smartcoms.hms.entity.Patient; import org.springframework.data.jpa.repository.*; import java.util.*;
public interface PatientRepository extends JpaRepository<Patient,Long>{ List<Patient> findByFullNameContainingIgnoreCaseOrPatientCodeContainingIgnoreCase(String name,String code); }
