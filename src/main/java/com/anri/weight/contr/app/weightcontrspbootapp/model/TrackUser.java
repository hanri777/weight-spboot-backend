package com.anri.weight.contr.app.weightcontrspbootapp.model;

import javax.persistence.*;
import java.sql.Date;
//import java.util.Date;

@Entity
@Table(name = "track_user")
public class TrackUser {

    public TrackUser() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "track_id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "start")
    private String start;

    @Column(name = "date")
    private Date date;

    @Column(name = "weight")
    private String weight;

    @Column(name = "difference")
    private String difference;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(name = "user", joinColumns = @JoinColumn(name = "user_id"))
//    private User user;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getUserId() {return userId; }

    public void setUserId(int userId) { this.userId = userId; }


    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }


    public String getDifference() {
        return difference;
    }

    public void setDifference(String difference) {
        this.difference = difference;
    }


//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
}
