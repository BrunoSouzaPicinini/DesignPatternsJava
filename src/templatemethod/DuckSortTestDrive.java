package templatemethod;

import java.util.Arrays;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        DuckBasic[] ducks = {
                new DuckBasic("Daffy", 8),
                new DuckBasic("Dewey", 2),
                new DuckBasic("Howard", 7),
                new DuckBasic("Louie", 2),
                new DuckBasic("Donald", 10),
                new DuckBasic("Huey", 2)
        };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);

        System.out.println("\nAfter sorting by name:");

        Duck[] ducksDecorated = new Duck[ducks.length];
        for (int i = 0; i < ducks.length; i++) {
            ducksDecorated[i] = new DuckSortByNameDecorator(ducks[i]);
        }

        Arrays.sort(ducksDecorated);
        display(ducksDecorated);
    }

    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }

}
