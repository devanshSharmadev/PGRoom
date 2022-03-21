package com.example.PGRoomBookingApp.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document
public class Room {

    private String roomMemberName;
    @Id
    private Integer roomNumber;
    private Integer roomSharingType;
    private Integer rent;
    private Boolean wifi;
    private Boolean balcony;
    private String color;

}
