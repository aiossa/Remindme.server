package com.qoobico.remindme.server.entity;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="remind")
public class Remind {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name ="increment", strategy = "increment")
    private long id;

    @Column(name="title", nullable = false, length = 50)
    private String title;
    @Column(name="remindDate", nullable = false)
    private Date remindDate;

    public Remind() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public long getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getRemindDate() {
        return remindDate;
    }
}
