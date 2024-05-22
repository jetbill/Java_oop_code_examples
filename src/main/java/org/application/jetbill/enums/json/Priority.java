package org.application.jetbill.enums.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.ObjectMapper;
//En aplicaciones web, los enums se pueden utilizar para mapear directamente desde/para
//JSON usando bibliotecas como Jackson.
public enum Priority {

    LOW("low"),
    MEDIUM("medium"),
    HIGH("high");

    private final String value;

    Priority(String value) {
        this.value = value;
    }
    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static Priority fromValue(String value) {
        for (Priority priority : Priority.values()) {
            if (priority.getValue().equalsIgnoreCase(value)) {
                return priority;
            }
        }
        throw new IllegalArgumentException("Unknown priority: " + value);
    }

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        // Serializar
        String json = mapper.writeValueAsString(Priority.HIGH);
        System.out.println("Serialized JSON: " + json);

        // Deserializar
        Priority priority = mapper.readValue("\"medium\"", Priority.class);
        System.out.println("Deserialized Priority: " + priority);
    }
}
