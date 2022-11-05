/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ontap2.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author DELL
 */
@Entity
@Table(name = "Hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @OneToMany(mappedBy = "hotel")
    private List<Room> listRoom;

    @ManyToMany(mappedBy = "listHotel")
    private List<Guest> listGuest;

    @OneToMany(mappedBy = "hotel")
    private List<Receptionist> listReceptionist;

    public Hotel() {
    }

    public Hotel(int id, String name, String location, List<Room> listRoom, Guest guest, List<Guest> listGuest, List<Receptionist> listReceptionist) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.listRoom = listRoom;

        this.listGuest = listGuest;
        this.listReceptionist = listReceptionist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Room> getListRoom() {
        return listRoom;
    }

    public void setListRoom(List<Room> listRoom) {
        this.listRoom = listRoom;
    }

    public List<Guest> getListGuest() {
        return listGuest;
    }

    public void setListGuest(List<Guest> listGuest) {
        this.listGuest = listGuest;
    }

    public List<Receptionist> getListReceptionist() {
        return listReceptionist;
    }

    public void setListReceptionist(List<Receptionist> listReceptionist) {
        this.listReceptionist = listReceptionist;
    }

}
