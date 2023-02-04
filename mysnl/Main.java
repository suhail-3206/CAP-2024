import snakeLadder.Board;
import snakeLadder.SnakeLadder;
import java.util.*;

import snakeLadder.User;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        List<User> users = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter player 1 Name :");
        String user1 = s.nextLine();
        System.out.print("Enter player 2 Name :");
        String user2 = s.nextLine();
        User u1 = new User(user1, 0);
        User u2 = new User(user2, 0);
        s.close();
        users.add(u1);
        users.add(u2);
        SnakeLadder snakeL = new SnakeLadder(board, users);
        // snakeL.addUser(new User("User3", 0));
        snakeL.board.Ladder(51, 87);
        snakeL.board.Ladder(22, 78);
        snakeL.board.Ladder(10, 56);

        snakeL.board.Snake(10, 4);
        snakeL.board.Snake(32, 13);
        // snakeL.board.addSnake(67, 9);
        // snakeL.board.addSnake(68, 8);
        // snakeL.board.addSnake(97, 3);
        snakeL.simulate();
    }
}
