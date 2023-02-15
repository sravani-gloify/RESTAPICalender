package com.gloify.RestApiCalendar.Entity;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table
public class CalendarEvent {
	@Id
	private Long id;
	private String title;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime eventDateTime;
	private String location;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<AdminUser> attendees;
	private LocalDateTime reminderDateTime;
	private boolean remindersent;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDateTime getEventDateTime() {
		return eventDateTime;
	}
	public void setEventDateTime(LocalDateTime eventDateTime) {
		this.eventDateTime = eventDateTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<AdminUser> getAttendees() {
		return attendees;
	}
	public void setAttendees(List<AdminUser> attendees) {
		this.attendees = attendees;
	}
	public LocalDateTime getReminderDateTime() {
		return reminderDateTime;
	}
	public void setReminderDateTime(LocalDateTime reminderDateTime) {
		this.reminderDateTime = reminderDateTime;
	}
	public boolean isRemindersent() {
		return remindersent;
	}
	public void setRemindersent(boolean remindersent) {
		this.remindersent = remindersent;
	}

}
