package org.application.jetbill.enums.maquina_estados;
import java.util.EnumMap;
import java.util.Map;
public enum State {
    INIT {
        @Override
        public State next(Event event) {
            switch (event) {
                case START:
                    return RUNNING;
                default:
                    throw new IllegalStateException("Unexpected event: " + event);
            }
        }
    },
    RUNNING {
        @Override
        public State next(Event event) {
            switch (event) {
                case STOP:
                    return STOPPED;
                case PAUSE:
                    return PAUSED;
                default:
                    throw new IllegalStateException("Unexpected event: " + event);
            }
        }
    },
    PAUSED {
        @Override
        public State next(Event event) {
            switch (event) {
                case RESUME:
                    return RUNNING;
                case STOP:
                    return STOPPED;
                default:
                    throw new IllegalStateException("Unexpected event: " + event);
            }
        }
    },
    STOPPED {
        @Override
        public State next(Event event) {
            throw new IllegalStateException("No transitions allowed from STOPPED state");
        }
    };






    private static final Map<State, Map<Event, State>> transitions = new EnumMap<>(State.class);
    static {
        for (State state : State.values()) {
            transitions.put(state, new EnumMap<>(Event.class));
        }
        transitions.get(INIT).put(Event.START, RUNNING);
        transitions.get(RUNNING).put(Event.STOP, STOPPED);
        transitions.get(RUNNING).put(Event.PAUSE, PAUSED);
        transitions.get(PAUSED).put(Event.RESUME, RUNNING);
        transitions.get(PAUSED).put(Event.STOP, STOPPED);
    }

    public abstract State next(Event event);

    public State transition(Event event) {
        if (!transitions.get(this).containsKey(event)) {
            throw new IllegalStateException("No transition defined from " + this + " with event " + event);
        }
        return transitions.get(this).get(event);
    }
}
