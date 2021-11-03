package com.gameoflife;

public class Main {
    public static void main(String[] args) {

        Game simulation1 = new Game(8, 4);
        simulation1.printBoard();
        simulation1.setAliveCell(3, 3);
        System.out.println(simulation1.getCellStatus(3, 3) + "\n");
        simulation1.printBoard();
        // simulation1.setAliveCell(8, 4);
        Game simulation2 = new Game(8, 4);
        simulation2.setAliveCell(1, 2);
        simulation2.setAliveCell(2, 2);
        simulation2.setAliveCell(3, 2);
        simulation2.printBoard();
        System.out.println(simulation2.findAliveCells(2, 2));
        System.out.println(simulation2.findAliveCells(3, 2));
        System.out.println(simulation2.findAliveCells(0, 0));
        System.out.println(simulation2.findAliveCells(5, 2) + "\n");

    }
}
