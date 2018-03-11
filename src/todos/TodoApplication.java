package todos;

import java.util.Scanner;

public class TodoApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] todos = new String[3];
        int index = 0;
        int decision;
    }

    private static void addTodo(Scanner scanner, String[] todos, int index) {
        //pobieranie od usera
        TodoViews.newTodoMessage();
        String newTodo = scanner.nextLine();
        //wstawianie do tablicy
        todos[index] = newTodo;
    }

    private static void listTodos(String[] todos, int todosToDisplay) {
        //wyswietlanie tablicy
        if (todosToDisplay == 0) {
            TodoViews.noTodosToDisplayMessage();
        }
        for (int i = 0; i < todosToDisplay; i++) {
            System.out.println(i + ". " + todos[i]);
        }
    }
}