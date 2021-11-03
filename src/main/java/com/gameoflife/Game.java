package com.gameoflife;

public class Game {

    private int width;
    private int height;
    private int[][] board;

    public Game(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Numbers should be natural");
        }
        this.width = width;
        this.height = height;
        this.board = new int[width][height];
    }

    public boolean printBoard() {
        for (int y = 0; y < height; y++) {
            StringBuilder mark = new StringBuilder();
            for (int x = 0; x < width; x++) {
                if (this.board[x][y] == 0) {
                    mark.append(".");
                } else {
                    mark.append("*");
                }
            }
            System.out.println(mark);
        }
        System.out.println("\n");
        return true;
    }

    public void setAliveCell(int x, int y) {
        this.board[x][y] = 1;
    }

    // For testing purpose
    public int getCellStatus(int x, int y) {
        return this.board[x][y];
    }

    public int findAliveCells(int x, int y) {
        int aliveCells = 0;
        aliveCells += board[x - 1][y - 1];
        aliveCells += board[x][y - 1];
        aliveCells += board[x + 1][y - 1];
        aliveCells += board[x - 1][y];
        aliveCells += board[x + 1][y];
        aliveCells += board[x - 1][y + 1];
        aliveCells += board[x][y + 1];
        aliveCells += board[x + 1][y + 1];
        return aliveCells;
    }

}
