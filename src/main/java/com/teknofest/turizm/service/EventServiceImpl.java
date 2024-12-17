package com.teknofest.turizm.service;

import com.teknofest.turizm.exception.ResourceNotFoundException;
import com.teknofest.turizm.model.Event;
import com.teknofest.turizm.repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EventServiceImpl implements  EventService {
    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event getEventById(int id) {
        return eventRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ID:" + id + " ile eşleşen kayıt bulunamadı."));

    }

    @Override
    public Event updateEvent(Event updatedEvent, int id) {
        Event dbEvent = eventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ID:" + id + " ile eşleşen kayıt bulunamadı."));
        dbEvent.setDescription(updatedEvent.getDescription());
        dbEvent.setTitle(updatedEvent.getTitle());

        return eventRepository.save(dbEvent);
    }

    @Override
    public void deleteEvent(int id) {
        Optional<Event> eventId = eventRepository.findById(id);
        if (eventId.isPresent()) {
            eventRepository.delete(eventId.get());
        }
        else{
            throw new ResourceNotFoundException("ID:" + id + " ile eşleşen kayıt bulunamadı.");
        }


    }




}