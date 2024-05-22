package org.application.jetbill.enums.maquina_estados;

//Estados y transiciones de una maquina de estados

public class StateMachine {

    private State currentState;

    public StateMachine() {
        currentState = State.INIT;
    }

    public void onEvent(Event event) {
        currentState = currentState.transition(event);
        System.out.println("State transitioned to: " + currentState);
    }

    public State getCurrentState() {
        return currentState;
    }

    public static void main(String[] args) {
        StateMachine machine = new StateMachine();
        machine.onEvent(Event.START);
        machine.onEvent(Event.PAUSE);
        machine.onEvent(Event.RESUME);
        machine.onEvent(Event.STOP);
    }
}
