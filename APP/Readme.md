# 📌 Use Case 11: Concurrent Booking Simulation

## 📖 Overview

This module demonstrates how multiple users can book rooms simultaneously and how synchronization ensures correctness.

---

## 🎯 Goal

To prevent race conditions and ensure thread-safe booking operations.

---

## 👤 Actors

* Multiple Guests (threads)
* Booking Processor
* Shared Inventory

---

## 🔄 Flow

1. Multiple booking requests added
2. Threads process requests concurrently
3. Queue access synchronized
4. Inventory updates synchronized
5. System maintains consistency

---

## 🧠 Key Concepts

### ✔ Race Condition

* Multiple threads modify shared data

### ✔ Thread Safety

* Ensures correct behavior under concurrency

### ✔ Synchronized Blocks

* Protect critical sections

### ✔ Shared Resources

* Queue & Inventory

---

## 🛠️ Classes

* `Reservation`
* `BookingRequestQueue`
* `RoomInventory`
* `RoomAllocationService`
* `ConcurrentBookingProcessor`
* `UseCase11ConcurrentBookingSimulation`

---

## ▶️ How to Run

```bash
javac UseCase11ConcurrentBookingSimulation.java
java UseCase11ConcurrentBookingSimulation
```

---

## ✅ Benefits

* Prevents double booking
* Ensures consistent inventory
* Simulates real-world concurrent users

---

## ⚠️ Previous Limitation

Earlier system assumed single-thread execution.

---

## 👨‍💻 Author

Praneet
