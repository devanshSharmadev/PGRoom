package com.example.PGRoomBookingApp.service;

import com.example.PGRoomBookingApp.exceptions.RoomNotFound;
import com.example.PGRoomBookingApp.model.Room;
import com.example.PGRoomBookingApp.repository.IRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements IRoomService{

    private IRoomRepository roomRepository;

    @Autowired
    public void setRoomRepository(IRoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public void addRoom(Room room) {
        roomRepository.insert(room);
    }

    @Override
    public void updateRoom(Room room) {
        roomRepository.save(room);
    }

    @Override
    public void deleteRoom(int roomNumber) {
        roomRepository.deleteById(roomNumber);
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public Room getByRoomNumber(int roomNumber) throws RoomNotFound {
        return roomRepository.findById(roomNumber).orElseThrow(()->new RoomNotFound("Invalid Room Number"));
    }

    @Override
    public List<Room> getByRoomMember(String roomMemberName) throws RoomNotFound {
        List<Room> rooms=roomRepository.findByRoomMemberName(roomMemberName);
        if(rooms.isEmpty())
            throw new RoomNotFound("No such Room Member Exists with this room member name");
        return rooms;
    }

    @Override
    public List<Room> getByRoomSharingType(Integer roomSharingType) throws RoomNotFound {
        List<Room> rooms=roomRepository.findByRoomSharingType(roomSharingType);
        if(rooms.isEmpty())
            throw new RoomNotFound("No such Room Exists for such sharing type");
        return rooms;
    }

    @Override
    public List<Room> getByRent(Integer rent) throws RoomNotFound {
        List<Room> rooms=roomRepository.findByRent(rent);
        if(rooms.isEmpty())
            throw new RoomNotFound("No such Room Exists with lower given rent");
        return rooms;
    }

    @Override
    public List<Room> getByWifi(Boolean wifi) throws RoomNotFound {
        List<Room> rooms=roomRepository.findByWifi(wifi);
        if(rooms.isEmpty())
            throw new RoomNotFound("No such Room Exists with wifi facility");
        return rooms;
    }

    @Override
    public List<Room> getByBalcony(Boolean balcony) throws RoomNotFound {
        List<Room> rooms=roomRepository.findByBalcony(balcony);
        if(rooms.isEmpty())
            throw new RoomNotFound("No such Room Exists with balcony facility");
        return rooms;
    }

    @Override
    public List<Room> getByColor(String color) throws RoomNotFound {
        List<Room> rooms=roomRepository.findByColor(color);
        if(rooms.isEmpty())
            throw new RoomNotFound("No such Room Exists with this color of wall");
        return rooms;
    }

    @Override
    public List<Room> getByBalconyAndWifi(Boolean wifi, Boolean balcony) throws RoomNotFound{
        List<Room> rooms=roomRepository.findByBalcanyAndWifi(wifi,balcony);
        if(rooms.isEmpty())
            throw new RoomNotFound("No such room exists with having facility of wifi and balcony both");
        return rooms;
    }

    @Override
    public List<Room> getByWifiBalconyRoomrent(Boolean wifi, Boolean balcony, int rent) throws RoomNotFound{
        List<Room> rooms=roomRepository.findByWifiBalconyRoomrent(wifi,balcony,rent);
        if(rooms.isEmpty())
            throw new RoomNotFound("No such room exists with this facilitities");
        return rooms;
    }

}
