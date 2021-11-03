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

}
