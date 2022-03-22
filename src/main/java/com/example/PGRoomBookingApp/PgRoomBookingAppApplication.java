package com.example.PGRoomBookingApp;

import com.example.PGRoomBookingApp.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PgRoomBookingAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PgRoomBookingAppApplication.class, args);
	}

	@Autowired
	private IRoomService roomService;


	@Override
	public void run(String... args) throws Exception {

		// ADDING ROOMS
	/*
		System.out.println("Adding Rooms");

		Room room=new Room("Devansh",1,3,5000,true,true,"Yellow");
		roomService.addRoom(room);

		Room room2=new Room("Abhishek",2,3,5000,false,false,"Red");
		roomService.addRoom(room2);

		Room room3=new Room("Arvind",3,2,7500,false,true,"Blue");
		roomService.addRoom(room3);

		Room room4=new Room("Arnav",4,1,8000,true,false,"Yellow");
		roomService.addRoom(room4);

		// LISTING ALL ROOMS

		System.out.println("All room List");
		roomService.getAllRooms().forEach(System.out::println);

		// Searching ROOM by ROOM NUMBER

		System.out.println("Room by Room Number");
		Room room5=roomService.getByRoomNumber(1);
		System.out.println("Room --> "+room5);

		// Updating ROOM

		System.out.println("Updating Room");
		room5.setColor("Orange");
		roomService.updateRoom(room5);

		// DELETING ROOM

		System.out.println("Delete Room");
		roomService.deleteRoom(3);

*/

		// SHOWING Rooms By Room Member

		System.out.println("Get By RoomMember");
		roomService.getByRoomMember("Devansh").forEach(System.out::println);

		// Shwoing ROOMS by RoomSharingTYpe

		System.out.println("Get By RoomSharing Type");
		roomService.getByRoomSharingType(3).forEach(System.out::println);

		// Showing Rooms By Rent

		System.out.println("Get By Rent");
		roomService.getByRent(6000).forEach(System.out::println);

		// Showing Rooms by wifi service available

		System.out.println("Get Room by Wifi");
		roomService.getByWifi(true).forEach(System.out::println);

		// Showing Rooms by Balcony available

		System.out.println("Get Room by Balcony");
		roomService.getByBalcony(false).forEach(System.out::println);

		// Showing Room by Color of walls

		System.out.println("Get Room by Color");
		roomService.getByColor("Red").forEach(System.out::println);

		// Get By balcony and WIFI

		System.out.println("Get By balcony and WIFI");
		roomService.getByBalconyAndWifi(true,true).forEach(System.out::println);



	}

}
