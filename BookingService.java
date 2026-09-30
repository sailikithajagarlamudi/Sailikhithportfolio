package com.likhithas.functionhall;

import java.util.ArrayList;
import java.util.List;

public class BookingService {
    private final List<Booking> bookings = new ArrayList<>();

    public Booking createBooking(Booking booking) {
        bookings.add(booking);
        return booking;
    }

    public List<Booking> getAllBookings() {
        return new ArrayList<>(bookings);
    }

    public boolean cancelBooking(String bookingId) {
        for (Booking booking : bookings) {
            if (booking.getBookingId().equals(bookingId)) {
                booking.cancel();
                return true;
            }
        }
        return false;
    }
}
