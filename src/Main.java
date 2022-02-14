import exceptions.AccessDeniedException;
import exceptions.UserNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AccessDeniedException, UserNotFoundException {
        Scanner scan = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        users.add(new User("admin", "123123", 25));
        users.add(new User("user1", "456654", 13));
        users.add(new User("user2", "789987", 18));

        String login = scan.next();
        String pass = scan.next();

        boolean found = false;

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getLogin().equals(login) && users.get(i).getPassword().equals(pass)) {
                if (users.get(i).getAge() >=18) {
                    found = true;
                    System.out.println("Access granted");
                }
                else {
                    throw new AccessDeniedException("User's age is under 18");
                }
            }
            else if (users.get(i).getLogin().equals(login) && !users.get(i).getPassword().equals(pass)) {
                throw new UserNotFoundException("Password is incorrect");
            }
        }
        if (!found) {
            throw new UserNotFoundException("User with this login does not exist");
        }
    }
}
