package de.entwicklertag.graphqldemo.model;

import java.time.LocalDate;
import java.util.List;

public class Event {
    private int id;
    private String title;
    private String description;
    private LocalDate eventDate;
    private List<Participant> participants;

    public Event(int id, String title, String description, LocalDate eventDate, List<Participant> participants) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.eventDate = eventDate;
        this.participants = participants;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
