package com.teknofest.turizm.service;

import com.teknofest.turizm.model.Event;

public interface EventService  {
    Event createEvent(Event event);
    Event getEventById(int id);
    Event updateEvent(Event updatedEvent, int id);
    void deleteEvent(int id);
}
