package com.soares.OOP.arrays.aula4.entities;

public class Rent {

    private String name;
    private String email;

    private int room;

    public Rent(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "%d: %s, %s".formatted(room, name, email);
    }
}
