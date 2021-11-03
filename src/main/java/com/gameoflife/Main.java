package com.gameoflife;

public class Main {
    public static void main(String[] args) {

        Game simulation = new Game(8, 4);
        simulation.printBoard();
        simulation.setAliveCell(3, 3);
        System.out.println(simulation.getCellStatus(3, 3) + "\n");
        simulation.printBoard();

    }
}
