package de.entwicklertag.graphqldemo;

import de.entwicklertag.graphqldemo.model.Event;
import de.entwicklertag.graphqldemo.model.Participant;
import de.entwicklertag.graphqldemo.model.Skill;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EventRepository {
    private Collection<Event> events = new ArrayList<>();

    public EventRepository() {
        Skill skillJava = new Skill(1, "Java");
        Skill skillMicrosoft = new Skill(2, "MS .NET");

        Participant participantMax = new Participant(1, "Max", "Mustermann", List.of(skillJava));
        Participant participantKarl = new Participant(2, "Karl", "Kleister", List.of(skillJava, skillMicrosoft));

        Event eventEntwicklertag = new Event(1, "Entwicklertag", "1. Remote Entwicklertag", LocalDate.of(2020, 04, 19), List.of(participantMax, participantKarl));
        events.add(eventEntwicklertag);
    }

    public Collection<Event> getAllEvents() {
        return events;
    }
}
