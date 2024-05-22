package org.application.jetbill.enums.set_map;
import java.util.EnumSet;
import java.util.EnumMap;
public class Schedule {

    public static void main(String[] args) {
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        EnumSet<Day> weekdays = EnumSet.complementOf(weekend);

        System.out.println("Weekend days: " + weekend);
        System.out.println("Weekdays: " + weekdays);

        EnumMap<Day, String> dayMap = new EnumMap<>(Day.class);
        dayMap.put(Day.MONDAY, "Work");
        dayMap.put(Day.SATURDAY, "Rest");
        dayMap.put(Day.SUNDAY, "Rest");

        for (Day day : Day.values()) {
            System.out.println(day + ": " + dayMap.getOrDefault(day, "Work"));
        }
    }
}
