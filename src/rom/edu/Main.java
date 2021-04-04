package rom.edu;/*
  @author   Romanyuk Bohdan
  @project   JavaCollections
  @class  Main
  @version  1.0.0 
  @since 02.04.2021 - 15.28
*/

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        // 1.  Створити ArrayList і LinkedList, що містять 100 000 цілих елементів. Порівняти інтервали часу.

        // Створення ArrayList з 100 000 цілих елементів та використання LocalDateTime


        LocalDateTime startArrayList = LocalDateTime.now();

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            integers.add(i);
        }

        LocalDateTime finishArrayList = LocalDateTime.now();

        //Створення LinkedList з 100 000 цілих елементів та використання LocalDateTime


        List<Integer> integersLinked = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            integersLinked.add(i);
        }

        LocalDateTime finishLinkedList = LocalDateTime.now();


        // Порівняння часу створення


        System.out.println();

        System.out.println("Для створення 100000 цілочисельних елементів у ArrayList потрібно " +
                " : "
                + ChronoUnit.MILLIS.between(startArrayList,
                finishArrayList) + " ms");
        System.out.println("Для створення 100000 цілочисельних елементів у LinkedList потрібно: "
                + ChronoUnit.MILLIS.between(finishArrayList,
                finishLinkedList) + " ms");
        System.out.println();
        System.out.println();



        // 2.  Вставте нові 1000 елементів на початку, в середині та в кінці. Порівняйте інтервали часу.

        // Вставка 1000 елементів ArrayList на початку, в середині та в кінці


        LocalDateTime InsertionBeginningStartArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.add(i, i);
        }

        LocalDateTime InsertionBeginningFinishArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.add(i+60000, i);
        }

        LocalDateTime InsertionMiddleFinishArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++){
            integers.add(i);
        }

        LocalDateTime InsertionEndFinishArrayList = LocalDateTime.now();


        //Вставка 1000 елементів LinkedList на початку, в середині та в кінці


        LocalDateTime InsertionBeginningStartLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.add(i, i);
        }

        LocalDateTime InsertionBeginningFinishLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.add(i+60000, i);
        }

        LocalDateTime InsertionMiddleFinishLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.add(i);
        }

        LocalDateTime InsertionEndFinishLinkedList = LocalDateTime.now();



        // Порівняння часових інтервалів: вставка в ArrayList та вставка в LinkedList


        System.out.println("---------------------------------------------------------------");
        System.out.println();

        System.out.println("Додавання 1000 цілочисельних елементів на початок" +
                " у ArrayList потрібно: "
                + ChronoUnit.MILLIS.between(InsertionBeginningStartArrayList,
                InsertionBeginningFinishArrayList)
                + " ms");
        System.out.println("Додавання 1000 цілочисельних елементів на початок" +
                " у LinkedList потрібно: "
                + ChronoUnit.MILLIS.between(InsertionBeginningStartLinkedList,
                InsertionBeginningFinishLinkedList)
                + " ms");


        System.out.println();

        System.out.println("Додавання 1000 цілочисельних елементів посередині в ArrayList: "
                + ChronoUnit.MILLIS.between(InsertionBeginningFinishArrayList,
                InsertionMiddleFinishArrayList) + " ms");
        System.out.println("\n" + "Додавання 1000 цілочисельних елементів посередині у LinkedList: "
                + ChronoUnit.MILLIS.between(InsertionBeginningFinishLinkedList,
                InsertionMiddleFinishLinkedList) + " ms");


        System.out.println();

        System.out.println("Додавання 1000 цілочисельних елементів наприкінці у ArrayList потрібно: "
                + ChronoUnit.MILLIS.between(InsertionMiddleFinishArrayList,
                InsertionEndFinishArrayList) + " ms");
        System.out.println("Додавання 1000 цілочисельних елементів наприкінці у LinkedList потрібно: "
                + ChronoUnit.MILLIS.between(InsertionMiddleFinishLinkedList,
                InsertionEndFinishLinkedList) + " ms");



        // 3.Оновіть 1000 елементів з початку, з середини та з кінця елементів. Порівняйте інтервали часу.

        //Оновлення 1000 елементів з початку, з середини та з кінця ArrayList


        LocalDateTime UpdatingBeginningStartArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.set(i, i+100);
        }

        LocalDateTime UpdatingBeginningFinishArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.set(i+60000, i+100);
        }

        LocalDateTime UpdatingMiddleFinishArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++){
            integers.set(i+102000, i+100);
        }

        LocalDateTime UpdatingEndFinishArrayList = LocalDateTime.now();



        // Оновлення 1000 елементів з початку, з середини та з кінця LinkedList


        LocalDateTime UpdatingBeginningStartLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(i, i+100);
        }

        LocalDateTime UpdatingBeginningFinishLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(i+60000, i+100);
        }

        LocalDateTime UpdatingMiddleFinishLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.set(i+102000, i+100);
        }

        LocalDateTime UpdatingEndFinishLinkedList = LocalDateTime.now();



        // Порівняння часових інтервалів: оновлення в ArrayList та оновлення у пов’язаному списку


        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        System.out.println("Оновлення 1000 цілочисельних елементів на початку в ArrayList потрібно: "
                + ChronoUnit.MILLIS.between(UpdatingBeginningStartArrayList, UpdatingBeginningFinishArrayList) + " ms");
        System.out.println("\n" + "Оновлення 1000 цілочисельних елементів на початку в LinkedList потрібно: "
                + ChronoUnit.MILLIS.between(UpdatingBeginningStartLinkedList, UpdatingBeginningFinishLinkedList) + " ms");

        System.out.println();

        System.out.println("\n" + "Оновлення 1000 цілочисельних елементів посередині в ArrayList потрібно: "
                + ChronoUnit.MILLIS.between(UpdatingBeginningFinishArrayList, UpdatingMiddleFinishArrayList) + " ms");
        System.out.println("\n" + "Оновлення 1000 цілочисельних елементів посередині у LinkedList потрібно: "
                + ChronoUnit.MILLIS.between(UpdatingBeginningFinishLinkedList, UpdatingMiddleFinishLinkedList) + " ms");

        System.out.println();

        System.out.println("Оновлення 1000 цілочисельних елементів у ArrayList потрібно: "
                + ChronoUnit.MILLIS.between(UpdatingMiddleFinishArrayList, UpdatingEndFinishArrayList) + " ms");
        System.out.println("Оновлення 1000 цілочисельних елементів у LinkedList потрібно: "
                + ChronoUnit.MILLIS.between(UpdatingMiddleFinishLinkedList, UpdatingEndFinishLinkedList) + " ms");



        // 4.  Видаліть 1000 елементів з початку, з середини та з кінця елементів. Порівняйте інтервали часу.

        //Видалення 1000 елементів з початку, з середини та з кінця ArrayList


        LocalDateTime RemovingBeginningStartArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.remove(integers.size() - 103000 + i);
        }

        LocalDateTime RemovingBeginningFinishArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integers.remove(integers.size() - 42000);
        }

        LocalDateTime RemovingMiddleFinishArrayList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++){
            integers.remove(integers.size() - 1000 + i);
        }

        LocalDateTime RemovingEndFinishArrayList = LocalDateTime.now();


        //Видалення 1000 елементів з початку, з середини та з кінця LinkedList


        LocalDateTime RemovingBeginningStartLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(integersLinked.size() - 103000 + i);
        }

        LocalDateTime RemovingBeginningFinishLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(integersLinked.size() - 42000);
        }

        LocalDateTime RemovingMiddleFinishLinkedList = LocalDateTime.now();

        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(integersLinked.size() - 1000 + i);
        }

        LocalDateTime RemovingEndFinishLinkedList = LocalDateTime.now();



        //Порівняння часових інтервалів: видалення в ArrayList та видалення у пов’язаному списку


        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        System.out.println("\n" + "Видалення 1000 цілочисельних елементів на початку у ArrayList потрібно: "
                + ChronoUnit.MILLIS.between(RemovingBeginningStartArrayList, RemovingBeginningFinishArrayList) + " ms");
        System.out.println("Видалення 1000 цілочисельних елементів на початку в LinkedList потрібно: "
                + ChronoUnit.MILLIS.between(RemovingBeginningStartLinkedList, RemovingBeginningFinishLinkedList) + " ms");

        System.out.println();

        System.out.println("\n" + "Видалення 1000 цілочисельних елементів посередині в ArrayList потрібно: "
                + ChronoUnit.MILLIS.between(RemovingBeginningFinishArrayList, RemovingMiddleFinishArrayList) + " ms");
        System.out.println("\n" + "Видалення 1000 цілочисельних елементів посередині у LinkedList потрібно: "
                + ChronoUnit.MILLIS.between(RemovingBeginningFinishLinkedList, RemovingMiddleFinishLinkedList) + " ms");

        System.out.println();

        System.out.println("Видалення 1000 цілочисельних елементів в кінці в ArrayList потрібно: "
                + ChronoUnit.MILLIS.between(RemovingMiddleFinishArrayList, RemovingEndFinishArrayList) + " ms");
        System.out.println("Видалення 1000 цілочисельних елементів врешті-решт у  LinkedList потрібно: "
                + ChronoUnit.MILLIS.between(RemovingMiddleFinishLinkedList, RemovingEndFinishLinkedList) + " ms");


    }
}
