package net.killarexe.littlerage.engine.observers.events;

public class Event {

    public EventType type;

    public Event(EventType type){
        this.type = type;
    }

    public Event(){
        this.type = EventType.UserEvent;
    }
}
