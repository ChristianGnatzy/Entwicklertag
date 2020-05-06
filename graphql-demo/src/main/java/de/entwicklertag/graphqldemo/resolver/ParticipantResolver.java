package de.entwicklertag.graphqldemo.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import de.entwicklertag.graphqldemo.model.Participant;
import org.springframework.stereotype.Service;

@Service
public class ParticipantResolver implements GraphQLResolver<Participant> {
    public String getFullName(Participant participant) {
        return participant.getFirstName() + " " + participant.getSurName();
    }
}
