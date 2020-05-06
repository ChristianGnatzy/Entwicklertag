package de.entwicklertag.graphqldemo.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import de.entwicklertag.graphqldemo.EventRepository;
import de.entwicklertag.graphqldemo.model.Event;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EventQueryResolver implements GraphQLQueryResolver {
    private EventRepository eventRepository;

    public EventQueryResolver(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public Collection<Event> getAllEvents() {
            return eventRepository.getAllEvents();
    }
}
