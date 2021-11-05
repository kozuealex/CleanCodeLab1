package com.gameoflife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Game testSimulation = new Game(8, 4);

    @Test
    void constructorWillThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Game testSimulation1 = new Game(-1, 5);
            Game testSimulation2 = new Game(5, -3);
        });
    }

    @Test
    void printBoardWillMakeAGrid() {
        boolean test = testSimulation.printBoard();
        assertTrue(test);
    }

    @Test
    void setAliveCellReturns1() {
        testSimulation.setAliveCell(3, 3);
        int cell = testSimulation.getCellStatus(3, 3);
        assertEquals(1, cell);
    }

    @Test
    void setAliveCellWillThrowArrayIndexOutOfBoundsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () ->
            testSimulation.setAliveCell(8, 4));
    }

    @Test
    void findAliveCellsWillCountNeighboringAliveCells() {
        testSimulation.setAliveCell(1, 2);
        testSimulation.setAliveCell(2, 2);
        testSimulation.setAliveCell(3, 2);
        int cell1 = testSimulation.findAliveCells(2,2);
        int cell2 = testSimulation.findAliveCells(3,2);
        int cell3 = testSimulation.findAliveCells(5,2);
        assertEquals(2, cell1);
        assertEquals(1, cell2);
        assertEquals(0, cell3);
    }

    @Test
    void supportEdgeCasesWithCheckState() {
        int cell = testSimulation.checkState(0, 0);
        assertEquals(0, cell);
    }

}