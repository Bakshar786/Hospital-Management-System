package com.smartcoms.hms.repository; import com.smartcoms.hms.entity.Appointment; import org.springframework.data.jpa.repository.JpaRepository; import java.time.LocalDate; import java.util.*;
public interface AppointmentRepository extends JpaRepository<Appointment,Long>{ List<Appointment> findTop8ByDateOrderByTimeAsc(LocalDate date); long countByDate(LocalDate date); }
