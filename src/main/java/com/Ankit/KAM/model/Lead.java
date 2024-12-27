package com.Ankit.KAM.model;

//import javax.persistence.*;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String status;

    @OneToMany(mappedBy = "lead", cascade = CascadeType.ALL)
    private List<Contact> contacts;

    @OneToMany(mappedBy = "lead", cascade = CascadeType.ALL)
    private List<Interaction> interactions;

    @OneToOne(mappedBy = "lead", cascade = CascadeType.ALL)
    private CallPlan callPlan;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Default constructor
    public Lead() {}

    // Getters and setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Interaction> getInteractions() {
        return interactions;
    }

    public void setInteractions(List<Interaction> interactions) {
        this.interactions = interactions;
    }

    public CallPlan getCallPlan() {
        return callPlan;
    }

    public void setCallPlan(CallPlan callPlan) {
        this.callPlan = callPlan;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}




//package com.Ankit.KAM.model;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
////import javax.persistence.*;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Entity
//@Getter
//@Setter
//public class Lead {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private String status;
//
//    @OneToMany(mappedBy = "lead", cascade = CascadeType.ALL)
//    private List<Contact> contacts;
//
//    @OneToMany(mappedBy = "lead", cascade = CascadeType.ALL)
//    private List<Interaction> interactions;
//
//    @OneToOne(mappedBy = "lead", cascade = CascadeType.ALL)
//    private CallPlan callPlan;
//
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;
//
//    // Default constructor
//    public Lead() {}
//}



//package com.Ankit.KAM.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Entity
//@Data
//public class Lead {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private String status; // New, In Progress, Converted
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;
//
//    @OneToMany(mappedBy = "lead", cascade = CascadeType.ALL)
//    private List<Contact> contacts;
//
//    @OneToMany(mappedBy = "lead", cascade = CascadeType.ALL)
//    private List<Interaction> interactions;
//
//    @OneToOne(mappedBy = "lead", cascade = CascadeType.ALL)
//    private CallPlan callPlan;
//}
//
