package com.company;


public enum Species {
    CAT {
        @Override
        public Record createSpecies() {
            return new CAT();

        }
    },

    DOG {
        @Override
        public Record createSpecies() {
            return new DOG();
        }
    },

    FISH {
        @Override
        public Record createSpecies() {
            return new FISH();
        }
    },

    OTHER {
        @Override
        public Record createSpecies() {
            return new OTHER();
        }
    };


    public abstract Record createSpecies();
}
