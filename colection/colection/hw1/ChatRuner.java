package oop.getcourse.dmdev.colection.colection.hw1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ChatRuner {
    public static void main(String[] args) {
        List<Chat> chats = new ArrayList<>();
        chats.add(new Chat("Futbol", 1700));
        chats.add(new Chat("Space ", 203));
        chats.add(new Chat("Animals", 1600));
        chats.add(new Chat("World news 18+", 1600));
        chats.add(new Chat("Poker 18+", 999));
        for (Iterator<Chat> iterator = chats.iterator(); iterator.hasNext(); ) {
            Chat chat = iterator.next();
            if (chat.getNumberOfUsers() < 1000) {
                iterator.remove();
            }
        }
        chats.sort(Comparator.comparing(Chat::getNumberOfUsers, Comparator.reverseOrder()).thenComparing(Chat::getName));
        System.out.println(chats);
    }
}
