package com.gloify.RestApiCalendar.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gloify.RestApiCalendar.Entity.Calendar;
@Repository
public interface CalendarRepository extends  JpaRepository<Calendar,Long>{

}
