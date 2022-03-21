package com.example.PGRoomBookingApp.service;

import com.example.PGRoomBookingApp.exceptions.RoomNotFound;
import com.example.PGRoomBookingApp.model.Room;

import java.util.List;

public interface IRoomService {

    void addRoom(Room room);
    void updateRoom(Room room);
    void deleteRoom(int roomNumber);

    List<Room> getAllRooms();

    Room getByRoomNumber(int roomNumber) throws RoomNotFound;

    List<Room> getByRoomMember(String roomMemberName) throws RoomNotFound;

    List<Room> getByRoomSharingType(Integer roomSharingType) throws RoomNotFound;

    List<Room> getByRent(Integer rent) throws RoomNotFound;

    List<Room> getByWifi(Boolean wifi) throws RoomNotFound;

    List<Room> getByBalcony(Boolean balcony) throws RoomNotFound;

    List<Room> getByColor(String color) throws RoomNotFound;


}
