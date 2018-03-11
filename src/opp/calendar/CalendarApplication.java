package opp.calendar;

import java.util.Scanner;

public class CalendarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        oop.calendar.CalendarMonth calendarMonth = oop.calendar.CalendarMonth.of("March", 2018, 3, 31, 4);
        do {
            System.out.println("1. Show month");  // tutaj nazw miesieca   TODO
            System.out.println("2. Switch month {year month}");
            System.out.println("3. Next month");
            System.out.println("0. End");
            answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1:
                    showMonth(scanner, calendarMonth);
                    break;
                case 2:
                    switchMonth(scanner);

                    break;
                default:
                    System.out.println("Invalid command");
            }

        } while (answer != 0);
    }

    private static void showMonth(Scanner scanner, oop.calendar.CalendarMonth calendarMonth) {
        int option;
        do {
            System.out.println(calendarMonth);
            System.out.println("1. Add note, 2. Show note, 3. Remove note");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    addNote(scanner, calendarMonth);
                    break;
                case 2:
                    showNote(scanner, calendarMonth);
                    scanner.nextInt();
                    scanner.nextInt();
                    break;
                case 3:
                    int dayNumber = scanner.nextInt();
                    calendarMonth.setNoteForDay(null, dayNumber);
                    break;
                default:
                    option = 0;
            }
        } while (option != 0);
    }

    private static void addNote(Scanner scanner, oop.calendar.CalendarMonth calendarMonth) {
        int dayNumber = scanner.nextInt();
        String note = scanner.nextLine();
        calendarMonth.setNoteForDay(note, dayNumber);
    }

    private static void showNote(Scanner scanner, oop.calendar.CalendarMonth calendarMonth) {
        int numberOfDayToShow = scanner.nextInt();
        calendarMonth.getCalendarDay(numberOfDayToShow);
        if (calendarDay.hasNote()){
            System.out.println(calendarDay.getNotes);
        }
    }

    private static void switchMonth(Scanner scanner) {

    }

//    public static void main(String[] args) {
//
//    }
}