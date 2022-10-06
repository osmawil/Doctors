package com.doctors.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="message")
public class MessageModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String text;

    public MessageModel() {
    }

    public MessageModel(String text) {
        this.text = text;
    }

    public MessageModel(Integer id, String text) {
        this.id = id;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "id=" + id + '\''+
                ", text=" + text +
                '}';
    }
}
