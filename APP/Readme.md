# 📌 Use Case 9: Error Handling & Validation

## 📖 Overview

This module introduces structured validation and error handling into the Book My Stay App. It ensures that invalid inputs are detected early and handled gracefully using custom exceptions.

---

## 🎯 Goal

To prevent invalid bookings by validating user input and maintaining system consistency.

---

## 👤 Actors

* **Guest** – provides booking input
* **Reservation Validator** – validates inputs
* **System** – handles errors safely

---

## 🔄 Flow

1. User enters booking details
2. System validates input
3. If invalid → exception thrown
4. Error message displayed
5. System continues safely

---

## 🧠 Key Concepts

### ✔ Input Validation

* Ensures correct data before processing

### ✔ Custom Exception

* `InvalidBookingException`
* Improves clarity of errors

### ✔ Fail-Fast Design

* Stops execution immediately on error

### ✔ Graceful Handling

* Errors handled without crashing

### ✔ State Protection

* Prevents invalid updates to system

---

## 🛠️ Classes Used

* `InvalidBookingException` → Custom error
* `ReservationValidator` → Validation logic
* `RoomInventory` → Availability check
* `BookingRequestQueue` → Stores valid requests
* `UseCase9ErrorHandlingValidation` → Main class

---

## ▶️ How to Run

```bash
javac UseCase9ErrorHandlingValidation.java
java UseCase9ErrorHandlingValidation
```

---

## 💻 Sample Output

```
Booking Validation
Enter guest name: Abhisheak
Enter room type: single
Booking failed: Invalid room type selected.
```

---

## ✅ Key Benefits

* Prevents invalid input
* Improves system stability
* Clear error messages
* Avoids data corruption

---

## ⚠️ Previous Limitation

Earlier use cases assumed valid input, which could lead to incorrect system states.

---

## 🚀 Future Enhancements

* Advanced validation rules
* Logging system
* Retry mechanisms
* UI validation

---

## 👨‍💻 Author

**Praneet**
