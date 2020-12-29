package com.company;

public enum Species {
    CAT {
        @Override
        public void printMessage() {
            System.out.println("it is cat");

        }
    },

    DOG {
        @Override
        public void printMessage() {
            System.out.println("it is dog");
        }
    },

    FISH {
        @Override
        public void printMessage() {
            System.out.println("it is fish");
        }
    },

    OTHER {
        @Override
        public void printMessage() {
            System.out.println("it is pet");
        }
    };

    public abstract void printMessage();
}
