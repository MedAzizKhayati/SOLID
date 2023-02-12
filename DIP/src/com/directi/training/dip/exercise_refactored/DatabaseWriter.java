package com.directi.training.dip.exercise_refactored;

class DatabaseWriter implements Writer {
    private final MyDatabase database;

    public DatabaseWriter(MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(String encodedLine) {
        database.write(encodedLine);
    }
}
