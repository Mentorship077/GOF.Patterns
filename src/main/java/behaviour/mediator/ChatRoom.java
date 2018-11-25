package behaviour.mediator;

import java.time.LocalDate;

public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(LocalDate.now().toString() + " [" + user.getName() + " " + user.getAge() + "] : " + message);
    }
}
