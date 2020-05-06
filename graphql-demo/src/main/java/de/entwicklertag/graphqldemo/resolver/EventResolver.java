package de.entwicklertag.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import de.entwicklertag.graphqldemo.model.Event;
import de.entwicklertag.graphqldemo.model.Participant;
import org.springframework.stereotype.Service;

@Service
public class EventResolver implements GraphQLResolver<Event> {

    public Participant getParticipant(Event event, int id) {
        return event.getParticipants().stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}
