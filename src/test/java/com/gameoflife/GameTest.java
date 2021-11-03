package com.gameoflife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void constructorWillThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Game testSimulation1 = new Game(-1, 5);
            Game testSimulation2 = new Game(5, -3);
        });
    }

    @Test
    void printBoardWillMakeAGrid() {
        Game testSimulation = new Game(8, 4);
        boolean test = testSimulation.printBoard();
        assertTrue(test);
    }

    @Test
    void setAliveCellReturns1() {
        Game testSimulation = new Game(8, 4);
        testSimulation.setAliveCell(3, 3);
        int cell = testSimulation.getCellStatus(3, 3);
        assertEquals(1, cell);
    }


}