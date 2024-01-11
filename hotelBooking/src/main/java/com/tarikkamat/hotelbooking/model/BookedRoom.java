package com.tarikkamat.hotelbooking.model;

import java.time.LocalDate;

public class BookedRoom {
    private Long bookingId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String guestFullName;
    private String guestEmail;
    private int numberOfAdults;
    private int numberOfChildren;
}
