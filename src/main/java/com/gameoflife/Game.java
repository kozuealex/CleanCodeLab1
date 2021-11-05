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

    public int[][] getBoard() {
        return board;
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

    public int getCellStatus(int x, int y) {
        return this.board[x][y];
    }

    public int findAliveCellsAround(int x, int y) {
        int aliveCells = 0;
        aliveCells += checkState(x - 1, y - 1);
        aliveCells += checkState(x, y - 1);
        aliveCells += checkState(x + 1, y - 1);
        aliveCells += checkState(x - 1, y);
        aliveCells += checkState(x + 1, y);
        aliveCells += checkState(x - 1, y + 1);
        aliveCells += checkState(x, y + 1);
        aliveCells += checkState(x + 1, y + 1);
        return aliveCells;
    }

    public int checkState(int x, int y) {
        if (x < 0 || x >= width) {
            return 0;
        }
        if (y < 0 || y >= height) {
            return 0;
        }
        return board[x][y];
    }

    public void nextGeneration() {
        int[][] nextGen = new int[width][height];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int aliveNeighbors = findAliveCellsAround(x, y);
                if (checkState(x, y) == 1) {
                    if (aliveNeighbors < 2) {
                        nextGen[x][y] = 0;
                    } else if (aliveNeighbors > 3) {
                        nextGen[x][y] = 0;
                    } else {
                        nextGen[x][y] = 1;
                    }
                } else {
                    if (aliveNeighbors == 3) {
                        nextGen[x][y] = 1;
                    }
                }
            }
        }
        this.board = nextGen;
    }
}
