package com.programs;

class NoteCounter {
    int[] notes = new int[]{2000, 500, 200, 100, 50, 20, 10, 5, 1};
    int[] noteCounter = new int[9];

    public void countCurrency(int amount) {
        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }

        }


    }

    public void printCurencyCount() {
        for (int i = 0; i < notes.length; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }
}


public class VendingMachine {
    public static void main(String[] args) {

        System.out.println("Enter Amount");
        int amount = UtilityClass.scannerInt();
        NoteCounter obj = new NoteCounter();
        obj.countCurrency(amount);
        obj.printCurencyCount();
    }

}

