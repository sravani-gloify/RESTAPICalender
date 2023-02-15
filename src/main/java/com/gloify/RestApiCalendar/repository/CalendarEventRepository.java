package com.gloify.RestApiCalendar.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gloify.RestApiCalendar.Entity.CalendarEvent;

import jakarta.transaction.Transactional;
@Repository
public interface CalendarEventRepository extends JpaRepository<CalendarEvent,Long> {
	
	  @Transactional
	    public List<CalendarEvent> findByEventDateTimeBetween(LocalDateTime startDateTime, LocalDateTime endDateTime);
	
}
