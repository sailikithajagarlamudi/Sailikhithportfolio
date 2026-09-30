package com.likhithas.functionhall;

import java.util.List;

public class Booking {
    private String bookingId;
    private String customerName;
    private String phone;
    private String eventType;
    private String eventDate;
    private int guests;
    private String foodType;
    private String foodPackage;
    private List<String> facilities;
    private String decoration;
    private double totalAmount;
    private String status;

    public Booking(String bookingId, String customerName, String phone,
                   String eventType, String eventDate, int guests,
                   String foodType, String foodPackage,
                   List<String> facilities, String decoration,
                   double totalAmount) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.phone = phone;
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.guests = guests;
        this.foodType = foodType;
        this.foodPackage = foodPackage;
        this.facilities = facilities;
        this.decoration = decoration;
        this.totalAmount = totalAmount;
        this.status = "Confirmed";
    }

    public String getBookingId() { return bookingId; }
    public String getCustomerName() { return customerName; }
    public String getPhone() { return phone; }
    public String getEventType() { return eventType; }
    public String getEventDate() { return eventDate; }
    public int getGuests() { return guests; }
    public String getFoodType() { return foodType; }
    public String getFoodPackage() { return foodPackage; }
    public List<String> getFacilities() { return facilities; }
    public String getDecoration() { return decoration; }
    public double getTotalAmount() { return totalAmount; }
    public String getStatus() { return status; }

    public void cancel() { this.status = "Cancelled"; }
}
