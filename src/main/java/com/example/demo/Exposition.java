package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Exposition extends Event{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public Exposition(LocalDate date, int duration, String location, String title, List<Guest> guestList) {
        super(date, duration, location, title, guestList);
    }

    public Exposition() {
    }

    @Override
    public String toString() {
        return "Exposition{" +
                "id=" + id +
                '}';
    }
}
