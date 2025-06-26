package com.csrent.dto;

import java.time.LocalDate;

public class ReservationDTO {

    private String userEmail;
    private Integer spaceId;
    private LocalDate dateReservation;
    private String status;

    public ReservationDTO() {
    } // without parameters

    public ReservationDTO(String userEmail, Integer spaceId, LocalDate dateReservation, String status) {
        this.userEmail = userEmail;
        this.spaceId = spaceId;
        this.dateReservation = dateReservation;
        this.status = status;
    } // with parameters

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public Integer getSpaceId() {
        return spaceId;
    }
    public void setSpaceId(Integer spaceId) {
        this.spaceId = spaceId;
    }
    public LocalDate getDateReservation() {
        return dateReservation;
    }
    public void setDateReservation(LocalDate dateReservation) {
        this.dateReservation = dateReservation;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }



}//end of class
