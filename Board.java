package snakeLadder;

import java.util.HashMap;
import java.util.Map;

public class Board {
    int grid;
    Map<Integer, Integer> snake = new HashMap<>();
    Map<Integer, Integer> ladder = new HashMap<>();
    int winingPositon;

    public void Snake(int head, int tail) {
        snake.put(head, tail);
    }

    public void Ladder(int start, int end) {
        ladder.put(start, end);
    }

    void setWiningPositon(int positon) {
        winingPositon = positon;
    }

    void setGrid(int size) {
        grid = size;
    }

    public Board() {
        grid = 100;
        winingPositon = 100;
    }

    public void advanced(User user, int value) {
        if (user.position + value > grid) {
            return;
        }
        user.position += value;
        if (snake.get(user.position) != null) {
            System.out.println(" " + user.name + " bit by a snakeeee!!!! ");
            user.position = snake.get(user.position);
        }
        if (ladder.get(user.position) != null) {
            System.out.println(" " + user.name + " Hurrayyyy Ladder!!");
            user.position = ladder.get(user.position);
        }
    }

}