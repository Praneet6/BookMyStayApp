# 📌 Use Case 8: Booking History & Reporting

## 📖 Overview

This module introduces **historical tracking of confirmed bookings** in the Book My Stay App. It enables administrators to view past reservations and generate reports without modifying the booking system.

---

## 🎯 Goal

To store confirmed reservations and generate reports for operational visibility and analysis.

---

## 👤 Actors

* **Admin** – views booking history and reports
* **Booking History** – stores confirmed reservations
* **Booking Report Service** – generates reports

---

## 🔄 Flow

1. Booking is confirmed
2. Reservation is stored in booking history
3. Data is maintained in order
4. Admin requests report
5. Report is generated and displayed

---

## 🧠 Key Concepts

### ✔ List Data Structure

* `List<Reservation>` used to store bookings
* Maintains insertion order

### ✔ Ordered Storage

* Bookings stored chronologically

### ✔ Separation of Concerns

* Storage → `BookingHistory`
* Reporting → `BookingReportService`

### ✔ Historical Tracking

* Acts as audit trail

### ✔ Reporting Readiness

* Enables summaries without modifying data

---

## 🛠️ Classes Used

* `Reservation` → Booking data
* `BookingHistory` → Stores bookings
* `BookingReportService` → Generates reports
* `UseCase8BookingHistoryReport` → Main class

---

## ▶️ How to Run

```bash
javac UseCase8BookingHistoryReport.java
java UseCase8BookingHistoryReport
```

---

## 💻 Sample Output

```
Booking History and Reporting

Booking History Report
Guest: Abhi, Room Type: Single
Guest: Subha, Room Type: Double
```

---

## ✅ Key Benefits

* Maintains booking history
* Enables reporting and auditing
* Preserves order of transactions
* Prepares system for persistence

---

## ⚠️ Previous Limitation

Earlier use cases did not store booking history, making it impossible to review past transactions.

---

## 🚀 Future Enhancements

* Filter reports (by date, room type)
* Export reports
* Database integration
* Analytics dashboard

---

## 👨‍💻 Author

**Praneet**
