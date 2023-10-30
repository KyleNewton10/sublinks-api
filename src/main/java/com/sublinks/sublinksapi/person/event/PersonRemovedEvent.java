package com.sublinks.sublinksapi.person.event;

import com.sublinks.sublinksapi.person.Person;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class PersonRemovedEvent extends ApplicationEvent {
    private final Person person;

    public PersonRemovedEvent(final Object source, final Person person) {
        super(source);
        this.person = person;
    }
}