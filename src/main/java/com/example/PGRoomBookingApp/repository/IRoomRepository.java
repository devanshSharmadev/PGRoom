package com.example.PGRoomBookingApp.repository;

import com.example.PGRoomBookingApp.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoomRepository extends MongoRepository<Room,Integer> {

    List<Room> findByRoomMemberName(String roomMemberName);

    List<Room> findByRoomSharingType(Integer roomSharingType);

    List<Room> findByWifi(Boolean wifi);

    List<Room> findByBalcony(Boolean balcony);

    List<Room> findByColor(String color);

    @Query("{rent:{$lte:?0}}")
    List<Room> findByRent(int rent);

    @Query("{$and:[{wifi:?0},{balcony:?1}]}")
    List<Room> findByBalcanyAndWifi(Boolean wifi, Boolean balcony);

}
