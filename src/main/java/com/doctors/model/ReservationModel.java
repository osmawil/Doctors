package com.doctors.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="reservation")
public class ReservationModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date dates;

    private Date dated;

    private String status="created";

    public ReservationModel() {
    }

    public ReservationModel(Date dates, Date dated, String status) {
        this.dates = dates;
        this.dated = dated;
        this.status = status;
    }

    public ReservationModel(Integer id, Date dates, Date dated, String status) {
        this.id = id;
        this.dates = dates;
        this.dated = dated;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public Date getDated() {
        return dated;
    }

    public void setDated(Date dated) {
        this.dated = dated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ReservationModel{" +
                "id=" + id +
                ", dates='" + dates + '\'' +
                ", dated='" + dated + '\'' +
                ", status=" + status +
                '}';
    }

}
