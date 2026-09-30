# Likhitha's Function Hall - Online Booking Application

A beautiful full-stack function hall booking project containing:
- Frontend: HTML, CSS, JavaScript
- Node.js + Express backend
- Java backend/controller/model examples
- Veg and Non-Veg food selection
- Facilities and decoration
- Online booking
- Booking list
- Booking cancellation
- Automatic total calculation
- JSON data storage for the Node.js application

## Project structure

Likhithas_Function_Hall_Booking/
├── frontend/
│   ├── index.html
│   ├── css/style.css
│   └── js/app.js
├── node-backend/
│   ├── package.json
│   ├── server.js
│   ├── routes/bookings.js
│   └── data/bookings.json
└── java-backend/
    ├── Booking.java
    ├── BookingController.java
    └── BookingService.java

## Run the Node.js application

1. Install Node.js 18+.
2. Open a terminal inside `node-backend`.
3. Run:
   npm install
4. Run:
   npm start
5. Open:
   http://localhost:5000

The Node.js backend serves the frontend automatically.

## API endpoints

GET    /api/bookings
POST   /api/bookings
DELETE /api/bookings/:bookingId
GET    /api/health

The Java files are included as a separate backend layer example for projects that require Java/controller/service concepts. The runnable web application in this package uses Node.js + Express.
