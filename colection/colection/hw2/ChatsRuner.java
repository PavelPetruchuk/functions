package oop.getcourse.dmdev.colection.colection.hw2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatsRuner {
    public static void main(String[] args) {
        List<People>people= new ArrayList<>();
        people.add(new People(1,"Ignat",11));
        people.add(new People(2,"Ivan",20));
        people.add(new People(3,"Andrey",47));
        people.add(new People(4,"Anastasya",28));
        people.add(new People(5,"Evgeny",32));
        people.add(new People(6,"Slava",55));
        people.add(new People(7,"Sveta",288));
        people.add(new People(8, "Stas", 28));

        List<People> peopleOverEighteen = new ArrayList<>();


        List<Chat> chats = new ArrayList<>();
        chats.add(new Chat("Forbol", new ArrayList<>(List.of(people.get(0), people.get(1)))));
        chats.add(new Chat("Poker", new ArrayList<>(List.of(people.get(2), people.get(3)))));
        chats.add(new Chat("Space", new ArrayList<>(List.of(people.get(4), people.get(5)))));
        chats.add(new Chat("News", new ArrayList<>(List.of(people.get(6), people.get(7)))));
        chats.add(new Chat("Bodybuilding", new ArrayList<>(List.of(people.get(0), people.get(1)))));

        int quantity = 0;
        int ageSum = 0;
        int age;
        for (Chat chat : chats) {
            if (chat.getPeople().size() > 0) {
                for (Iterator<People> iterator = chat.getPeople().iterator(); iterator.hasNext(); ) {
                    People user = iterator.next();
                    age = user.getAge();
                    if (age > 18) {
                       peopleOverEighteen.add(user);
                        iterator.remove();
                    } else {
                        ageSum += age;
                    }
                }
                quantity += chat.getPeople().size();
            }
        }
        System.out.println(ageSum / quantity);
    }
}
