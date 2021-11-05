package com.gameoflife;

public class Main {
    public static void main(String[] args) {

        Game simulation1 = new Game(8, 4);
        simulation1.printBoard();
        simulation1.setAliveCell(3, 3);
        System.out.println(simulation1.getCellStatus(3, 3) + "\n");
        simulation1.printBoard();

        Game simulation2 = new Game(8, 4);
        simulation2.setAliveCell(1, 2);
        simulation2.setAliveCell(2, 2);
        simulation2.setAliveCell(3, 2);
        simulation2.printBoard();
        System.out.println(simulation2.findAliveCellsAround(2, 2));
        System.out.println(simulation2.findAliveCellsAround(3, 2));
        System.out.println(simulation2.findAliveCellsAround(0, 0));
        System.out.println(simulation2.findAliveCellsAround(5, 2) + "\n");

        Game simulation3 = new Game(8, 4);
        simulation3.setAliveCell(3, 2);
        simulation3.setAliveCell(4, 1);
        simulation3.setAliveCell(4, 2);
        simulation3.printBoard();
        simulation3.nextGeneration();
        simulation3.printBoard();
    }
}
