package snakeLadder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*;

public class SnakeLadder {
    Scanner in = new Scanner(System.in);
    public Board board;
    List<User> users = new ArrayList<>();
    List<User> winnerList = new ArrayList<>();

    public void addUser(User newUser) {
        users.add(newUser);
    }

    public SnakeLadder(Board board, List<User> userList) {
        this.board = board;
        this.users = userList;
    }

    public int rollDice() {
        Random r = new Random();
        int value = r.nextInt(6) + 1;
        if (value == 6) {
            value += r.nextInt(6) + 1;
        }
        if (value == 12) {
            value += r.nextInt(6) + 1;
        }
        if (value == 18) {
            return 0;
        }
        return value;
    }

    public void simulate() {
        int current = 0;
        int index = 0;

        while (winnerList.size() < users.size()) {
            if (current >= users.size() - 1) {

                current = 0;
            } else {
                current += 1;

            }
            // System.out.println(current);
            User currUser = users.get(current);
            if (currUser.position == 100) {
                continue;
            }
            in.nextLine();
            int rollValue = rollDice();
            board.advanced(currUser, rollValue);
            if (currUser.position == board.winingPositon) {
                winnerList.add(currUser);
                System.out.println(winnerList.size() + " PLACE GOES TO ---> " + currUser.name);
            }
            for (User user : users) {
                System.out.println(" " + user.name + " current Position " + user.position);
            }
            index += 1;
        }
        System.out.println(" Number of Steps took to complete the game : " + index);
    }
}
