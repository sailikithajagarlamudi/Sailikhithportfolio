package com.likhithas.functionhall;

/*
 * Java controller example for a Java/Spring-style architecture.
 * The runnable web application in this ZIP uses Node.js + Express.
 * This class demonstrates how booking requests can be delegated
 * from a controller to a service layer.
 */
public class BookingController {
    private final BookingService service = new BookingService();

    public Booking create(Booking booking) {
        return service.createBooking(booking);
    }

    public java.util.List<Booking> list() {
        return service.getAllBookings();
    }

    public String cancel(String bookingId) {
        return service.cancelBooking(bookingId)
                ? "Booking cancelled successfully"
                : "Booking not found";
    }
}
