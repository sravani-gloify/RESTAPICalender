package com.gloify.RestApiCalendar.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gloify.RestApiCalendar.Entity.Calendar;
import com.gloify.RestApiCalendar.Entity.CalendarEvent;
import com.gloify.RestApiCalendar.repository.CalendarEventRepository;
import com.gloify.RestApiCalendar.repository.CalendarRepository;
@Service
public class CalendarService {
	@Autowired
    private CalendarRepository calenderRepository;
	@Autowired
	private CalendarEventRepository calenderEventRepository;
	
	public Calendar retrieveCalendar(long id) {
		Optional<Calendar> calender = calenderRepository.findById(id);

		if (!calender.isPresent())
		{
			return null;
		}
		return calender.get();
	}

	public List<Calendar> retrieveAllCalendars() {
		return calenderRepository.findAll();
	}
	
	public Calendar addCalendar(Calendar calendar)
	{
		return calenderRepository.save(calendar);
	}
	public Calendar updateCalendar(Calendar calendar) {
		Calendar searchedCalendar = retrieveCalendar(calendar.getId());
		if(searchedCalendar != null)
		{
			searchedCalendar.setName(calendar.getName());
			searchedCalendar.setAdminUser(calendar.getAdminUser());
			return calenderRepository.saveAndFlush(calendar);
		}
		else return null;			
	}
	
	public void deleteCalendar(Calendar calendar)
	{
		calenderRepository.delete(calendar);
	}
	
	public List<CalendarEvent> findByEventDateTimeBetween(LocalDateTime start, LocalDateTime end)
	{
		return calenderEventRepository.findByEventDateTimeBetween(start, end);
	}	
	
	
	public CalendarRepository getCalenderRepository() {
		return calenderRepository;
	}
	public void setCalenderRepository(CalendarRepository calenderRepository) {
		this.calenderRepository = calenderRepository;
	}
	public CalendarEventRepository getCalenderEventRepository() {
		return calenderEventRepository;
	}
	public void setCalenderEventRepository(CalendarEventRepository calenderEventRepository) {
		this.calenderEventRepository = calenderEventRepository;
	}
	
}
