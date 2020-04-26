package ru.ifmo.base.lesson14.hw;

import ru.ifmo.base.lesson14.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class CompareSpeed {

    public static void main(String[] args) {
        Student student1 = new Student("Петр", "Алексеев", 18);
        Student student2 = new Student("Екатерина", "Еремина", 20);
        Student student3 = new Student("Денис", "Попов", 22);
        Student student4 = new Student("Петр", "Попов", 22);

        Date dateLink1 = new Date();
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            studentLinkedList.add(student1);
        }
        Date dateLink2 = new Date();
        System.out.println("Скорость добавления 1 000 000 объектов в конец в LinkedList в мс: " + (dateLink2.getTime()-dateLink1.getTime()));

        ArrayList<Student> studentArrayList = new ArrayList<>();
        Date dateArray1 = new Date();
        for (int i = 0; i < 1_000_000; i++) {
            studentArrayList.add(student1);
        }
        Date dateArray2 = new Date();
        System.out.println("Скорость добавления 1 000 000 объектов в конец в ArrayList в мс: " + (dateArray2.getTime()-dateArray1.getTime()));



        dateLink1 = new Date();
        for (int i = 0; i < 1_000; i++) {
            studentLinkedList.addFirst(student2);
        }
        dateLink2 = new Date();
        System.out.println("Скорость добавления 1 000 объектов в начало в LinkedList в мс: " + (dateLink2.getTime()-dateLink1.getTime()));

        dateArray1 = new Date();
        for (int i = 0; i < 1_000; i++) {
            studentArrayList.add(0,student1);
        }
        dateArray2 = new Date();
        System.out.println("Скорость добавления 1 000 объектов в начало в ArrayList в мс: " + (dateArray2.getTime()-dateArray1.getTime()));



        dateLink1 = new Date();
        for (int i = 0; i < 1_000; i++) {
            studentLinkedList.add(500_000, student3);
        }
        dateLink2 = new Date();
        System.out.println("Скорость добавления 1 000 объектов по индексу в LinkedList в мс: " + (dateLink2.getTime()-dateLink1.getTime()));


        dateArray1 = new Date();
        for (int i = 0; i < 1_000; i++) {
            studentArrayList.add(500_000,student1);
        }
        dateArray2 = new Date();
        System.out.println("Скорость добавления 1 000 объектов по индексу в ArrayList в мс: " + (dateArray2.getTime()-dateArray1.getTime()));

        /////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Сравнение скорости получения элементов");

        dateLink1 = new Date();
        for (int i = 0; i < 100_000; i++) {
            studentLinkedList.get(0);
        }
        dateLink2 = new Date();
        System.out.println("Скорость получения 100 000 объектов из начала в LinkedList в мс: " + (dateLink2.getTime()-dateLink1.getTime()));

        dateArray1 = new Date();
        for (int i = 0; i < 100_000; i++) {
            studentArrayList.get(0);
        }
        dateArray2 = new Date();
        System.out.println("Скорость получения 100 000 объектов из начала в ArrayList в мс: " + (dateArray2.getTime()-dateArray1.getTime()));
//////////////////////////////////////////////////////////////////////

        dateLink1 = new Date();
        for (int i = 0; i < 100_000; i++) {
            studentLinkedList.get(99999);
        }
        dateLink2 = new Date();
        System.out.println("Скорость получения 100 000 объектов из конца в  LinkedList в мс: " + (dateLink2.getTime()-dateLink1.getTime()));

        dateArray1 = new Date();
        for (int i = 0; i < 100_000; i++) {
            studentArrayList.get(99999);
        }
        dateArray2 = new Date();
        System.out.println("Скорость получения 100 000 объектов из конца в ArrayList в мс: " + (dateArray2.getTime()-dateArray1.getTime()));
        //////////////////////////////////////////////////////////
        dateLink1 = new Date();
        for (int i = 0; i < 100_000; i++) {
            studentLinkedList.get(50_000);
        }
        dateLink2 = new Date();
        System.out.println("Скорость получения 100 000 объектов из середины в  LinkedList в мс: " + (dateLink2.getTime()-dateLink1.getTime()));

        dateArray1 = new Date();
        for (int i = 0; i < 100_000; i++) {
            studentArrayList.get(50_000);
        }
        dateArray2 = new Date();
        System.out.println("Скорость получения 100 000 объектов из середины в ArrayList в мс: " + (dateArray2.getTime()-dateArray1.getTime()));
////////////////////////////////////////////////////////////////
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Сравнение скорости удаления элементов");

        dateLink1 = new Date();
        for (int i = 0; i < 10_000; i++) {
            studentLinkedList.removeFirst();
        }
        dateLink2 = new Date();
        System.out.println("Скорость удаления 10 000 объектов из начала в  LinkedList в мс: " + (dateLink2.getTime()-dateLink1.getTime()));

        dateArray1 = new Date();
        for (int i = 0; i < 10_000; i++) {
            studentArrayList.remove(0);
        }
        dateArray2 = new Date();
        System.out.println("Скорость удаления 10 000 объектов из начала в ArrayList в мс: " + (dateArray2.getTime()-dateArray1.getTime()));
//////////////////////////////////////////////////////////////////
        dateLink1 = new Date();
        for (int i = 0; i < 100_000; i++) {
            studentLinkedList.removeLast();
        }
        dateLink2 = new Date();
        System.out.println("Скорость удаления 100 000 объектов из конца в  LinkedList в мс: " + (dateLink2.getTime()-dateLink1.getTime()));

        dateArray1 = new Date();
        for (int i = 0; i < 100_000; i++) {
            studentArrayList.remove(studentArrayList.size()-1);
        }
        dateArray2 = new Date();
        System.out.println("Скорость удаления 100 000 объектов из конца в ArrayList в мс: " + (dateArray2.getTime()-dateArray1.getTime()));
//////////////////////////////////////////////////////////////////
        dateLink1 = new Date();
        for (int i = 0; i < 1_000; i++) {
            studentLinkedList.remove(500_000);
        }
        dateLink2 = new Date();
        System.out.println("Скорость удаления 1 000 объектов из середины в  LinkedList в мс: " + (dateLink2.getTime()-dateLink1.getTime()));

        dateArray1 = new Date();
        for (int i = 0; i < 1_000; i++) {
            studentArrayList.remove(500_000);
        }
        dateArray2 = new Date();
        System.out.println("Скорость удаления 1 000 объектов из середины в ArrayList в мс: " + (dateArray2.getTime()-dateArray1.getTime()));

    }
}
