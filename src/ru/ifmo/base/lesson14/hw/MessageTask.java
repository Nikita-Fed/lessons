package ru.ifmo.base.lesson14.hw;

import ru.ifmo.base.lesson13.PairContainer;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class MessageTask {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
        int countLow = 0;
        int countMedium = 0;
        int countHigh = 0;
        int countUrgent= 0;
        for (Message message: messageList) {
            switch (message.getPriority().ordinal()) {
                case 0: countLow++; break;
                case 1: countMedium++; break;
                case 2: countHigh++; break;
                case 3: countUrgent++; break;
            }
        }
        System.out.println("Количество сообщений для каждого приоритета");
        System.out.println("countLow - " + countLow);
        System.out.println("countMedium - " + countMedium);
        System.out.println("countHigh - " + countHigh);
        System.out.println("countUrgent - " + countUrgent);

    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;

        for (Message message: messageList) {
            switch (message.getCode()) {
                case 0: count0++; break;
                case 1: count1++; break;
                case 2: count2++; break;
                case 3: count3++; break;
                case 4: count4++; break;
                case 5: count5++; break;
                case 6: count6++; break;
                case 7: count7++; break;
                case 8: count8++; break;
                case 9: count9++; break;
            }

        }
        System.out.println("Количество сообщений для каждого кода (от 0 до 9");
        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
        System.out.println(count6);
        System.out.println(count7);
        System.out.println(count8);
        System.out.println(count9);

    }

    private static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        HashSet<Message> messageHashSet = new HashSet<>();
        for (int i = 0; i < messageList.size(); i++) {
            if (!messageHashSet.contains(messageList.get(i))) messageHashSet.add(messageList.get(i));
//            else messageHashSet.add(messageList.get(i));
        }

        int unique = messageHashSet.size();
        System.out.println("Количество уникальных сообщений = " + unique);

    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList){
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < messageList.size(); i++) {
            if (!linkedHashSet.contains(messageList.get(i))) linkedHashSet.add(messageList.get(i));
        }
        messageList.clear();
        messageList.addAll(linkedHashSet);
        return messageList;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        System.out.println("Список ДО удаления сообщениий с приоритетом " + priority);
        System.out.println(messageList);
        for (int i = 0; i < messageList.size(); i++) {
            if(messageList.get(i).getPriority().equals(priority)) messageList.remove(i);

        }
        System.out.println("Список после удаления сообщениий с приоритетом " + priority);
        System.out.println(messageList);
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority){
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        System.out.println("Список ДО удаления всех сообщениий, кроме сообщений с приоритетом " + priority);
        System.out.println(messageList);
        for (int i = 0; i < messageList.size();) {
            if(!messageList.get(i).getPriority().equals(priority)) {
                messageList.remove(i);
            }
            else i++;

        }
        System.out.println("Список ПОСЛЕ удаления всех сообщениий, кроме сообщений с приоритетом " + priority);
        System.out.println(messageList);
    }

    public static void main(String[] args) {
        // вызов методов
        List<Message> messages = MessageGenerator.generate(34);
        countEachPriority(messages);
        countEachCode(messages);
//        System.out.println(messages.get(0));
        System.out.println(messages);
        uniqueMessageCount(messages);
        System.out.println("-------------------------------------------------");
        System.out.println(uniqueMessagesInOriginalOrder(messages));
        System.out.println("-------------------------------------------------");
        removeEach(messages, MessagePriority.LOW);
        System.out.println("-------------------------------------------------");
        removeOther(messages, MessagePriority.HIGH);
    }
}