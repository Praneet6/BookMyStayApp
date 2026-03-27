# 📌 Use Case 7: Add-On Service Selection

## 📖 Overview

This module extends the **Book My Stay App** by introducing optional add-on services that can be attached to an existing reservation. It demonstrates how real-world features like breakfast, spa, and airport pickup can be integrated without modifying core booking or inventory logic.

---

## 🎯 Goal

To enable guests to select additional services for a confirmed reservation while maintaining separation from core booking functionality.

---

## 👤 Actors

* **Guest** – selects optional services for a reservation
* **Add-On Service** – represents individual services (e.g., Breakfast, Spa)
* **Add-On Service Manager** – manages services linked to reservations

---

## 🔄 Flow of Execution

1. Guest enters a **Reservation ID**
2. Guest selects one or more add-on services
3. Selected services are stored in a list
4. Services are mapped to the reservation ID
5. Total cost of services is calculated
6. Booking and inventory remain unchanged

---

## 🧠 Key Concepts Used

### ✔ One-to-Many Relationship

A single reservation can have multiple services:

```
Reservation ID → [Service1, Service2, Service3]
```

### ✔ Map + List Combination

* `Map<String, List<Service>>`
* Efficient lookup + multiple service support

### ✔ Composition over Inheritance

* Services are **attached** to reservations
* No modification of existing booking classes

### ✔ Separation of Concerns

* Booking system remains untouched
* Add-on logic handled independently

### ✔ Cost Aggregation

* Total service cost calculated dynamically

---

## 🛠️ Implementation Details

### 🔹 Classes Used

* `Service` → Represents an add-on service
* `AddOnServiceManager` → Handles service mapping and cost calculation
* `UseCase7AddOnServiceSelection` → Main driver class

---

## 📦 Data Structure Used

| Data Structure | Purpose                        |
| -------------- | ------------------------------ |
| HashMap        | Map reservation ID to services |
| ArrayList      | Store multiple services        |

---

## ▶️ How to Run

```bash
javac UseCase7AddOnServiceSelection.java
java UseCase7AddOnServiceSelection
```

---

## 💻 Sample Output

```
===== Add-On Service Selection =====
Enter Reservation ID: Single-1

1. Add Breakfast (₹500)
2. Add Spa (₹1000)
3. Add Airport Pickup (₹800)

Breakfast added to Single-1
Spa added to Single-1

Total Add-On Cost: 1500.0
```

---

## ✅ Key Benefits

* Flexible service attachment
* Clean extension of booking system
* No impact on inventory or allocation logic
* Easy to add new services

---

## ⚠️ Limitations of Previous Use Case

Use Case 6 confirmed reservations but did not support additional services.
This use case adds real-world flexibility to enhance booking value.

---

## 🚀 Future Enhancements

* Service removal option
* Discount/coupon system
* Service categories (premium/basic)
* Billing integration

---

## 👨‍💻 Author

**Praneet**

---
