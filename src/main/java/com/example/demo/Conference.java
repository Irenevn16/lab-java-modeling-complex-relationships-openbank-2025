package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Conference extends Event{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private List<Speaker> speakerList;

    public Conference() {
    }

    public Conference(LocalDate date, int duration, String location, String title, List<Guest> guestList, List<Speaker> speakerList) {
        super(date, duration, location, title, guestList);
        this.speakerList = speakerList;
    }

    public List<Speaker> getSpeakerList() {
        return speakerList;
    }

    public void setSpeakerList(List<Speaker> speakerList) {
        this.speakerList = speakerList;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "id=" + id +
                ", speakerList=" + speakerList +
                '}';
    }
}
