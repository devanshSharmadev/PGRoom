package com.example.PGRoomBookingApp.exceptions;

public class RoomNotFound extends RuntimeException{

    public RoomNotFound() {
        super();
    }

    public RoomNotFound(String message) {
        super(message);
    }
}
