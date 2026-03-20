## 🧩 Use Case 6: Reservation Confirmation & Room Allocation

### 🎯 Goal

Confirm booking requests by assigning rooms safely while ensuring inventory consistency and preventing double-booking under all circumstances.

---

### 👥 Actors

* **Booking Service** – Processes queued booking requests and performs room allocation
* **Inventory Service** – Maintains and updates room availability state

---

### 🔄 Flow

1. Booking request is dequeued from the request queue (FIFO)
2. The system checks availability for the requested room type
3. A unique room ID is generated and assigned
4. The room ID is recorded to prevent reuse
5. Inventory count is decremented immediately
6. Reservation is confirmed

---

### 🧠 Key Concepts Used

* **Problem of Double Booking**
  Without controlled allocation, the same room may be assigned multiple times, leading to inconsistent system state.

* **Set Data Structure**
  A `Set<String>` is used to store allocated room IDs and ensure uniqueness.

* **Uniqueness Enforcement**
  Duplicate room IDs are prevented automatically using a set.

* **Mapping Room Types to Assigned Rooms**
  A `HashMap<String, Set<String>>` tracks allocated rooms per room type.

* **Atomic Logical Operations**
  Room assignment and inventory update are performed together to maintain consistency.

* **Inventory Synchronization**
  Availability is updated immediately after allocation to reflect real-time state.

---

### 📌 Key Requirements

* Process booking requests in FIFO order
* Generate a unique room ID for each booking
* Prevent duplicate room assignments
* Update inventory immediately after allocation
* Maintain consistent system state

---

### ✅ Key Benefits

* Guarantees unique room assignments
* Prevents double-booking scenarios
* Keeps inventory and booking data synchronized

---

### ⚠️ Drawbacks of Previous Use Case

* Use Case 5 handled request ordering but did not confirm bookings
* No mechanism existed to prevent duplicate or conflicting room assignments

---

### 🖥️ Sample Output

```text id="u7v4r9"
Room Allocation Processing
Booking confirmed for Guest: Abhi, Room ID: Single Room-1
Booking confirmed for Guest: Subha, Room ID: Single Room-2
Booking confirmed for Guest: Vanmathi, Room ID: Suite Room-1
```
