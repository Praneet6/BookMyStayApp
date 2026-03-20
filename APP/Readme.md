## 🧩 Use Case 4: Room Search & Availability Check

### 🎯 Goal

Enable guests to view available rooms and their details **without modifying system state**, reinforcing safe data access and clear separation of responsibilities.

---

### 👥 Actors

* **Guest** – Initiates a search to view available room options
* **Search Service** – Handles read-only access to inventory and room information

---

### 🔄 Flow

1. Guest initiates a room search request
2. The system retrieves availability data from the centralized inventory
3. Room details and pricing are obtained from Room objects
4. Unavailable room types are filtered out
5. Available room types and their details are displayed
6. System state remains unchanged

---

### 🧠 Key Concepts Used

* **Read-Only Access**
  Search operations only retrieve data without modifying it, ensuring system stability.

* **Defensive Programming**
  Only room types with valid availability are displayed, preventing incorrect or misleading output.

* **Separation of Concerns**
  Search logic is independent of booking and inventory update logic.

* **Inventory as State Holder**
  Inventory acts as a centralized data source for availability.

* **Domain Model Usage**
  Room objects encapsulate details like pricing, size, and beds.

* **Validation Logic**
  Rooms with zero availability are excluded from results.

---

### 📌 Key Requirements

* Retrieve room availability from centralized inventory
* Display only room types with availability > 0
* Show room details using Room domain objects
* Ensure inventory is not modified during search
* Maintain separation between search and booking logic

---

### ✅ Key Benefits

* Accurate availability visibility without modifying system state
* Prevents accidental inventory corruption
* Clean separation between read-only and write operations

---

### ⚠️ Drawbacks of Previous Use Case

* Use Case 3 introduced centralized inventory but did not separate read and write operations
* Risk of unintended inventory modification during non-booking actions

---

### 🖥️ Sample Output

```
Room Search

Single Room:
Beds: 1
Size: 250 sqft
Price per night: 1500.0
Available: 5

Double Room:
Beds: 2
Size: 400 sqft
Price per night: 2500.0
Available: 3

Suite Room:
Beds: 3
Size: 750 sqft
Price per night: 5000.0
Available: 2
```
