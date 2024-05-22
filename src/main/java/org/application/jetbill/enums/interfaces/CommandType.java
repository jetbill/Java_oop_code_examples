package org.application.jetbill.enums.interfaces;
//Los enums pueden implementar interfaces para garantizar que las
//constantes de enum sigan un comportamiento específico.
public enum CommandType implements Command {
    START {
        @Override
        public void execute() {
            System.out.println("Starting...");
        }
    },
    STOP {
        @Override
        public void execute() {
            System.out.println("Stopping...");
        }
    },
    RESTART {
        @Override
        public void execute() {
            System.out.println("Restarting...");
        }
    };

    public static void main(String[] args) {
        for (CommandType command : CommandType.values()) {
            command.execute();
        }
    }
}
