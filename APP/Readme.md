# 📌 Use Case 12: Data Persistence & System Recovery

## 📖 Overview

This module introduces persistence by saving and restoring system state using file storage.

---

## 🎯 Goal

To ensure that inventory data survives application restarts.

---

## 👤 Actors

* **System** – triggers save/load
* **Persistence Service** – manages file storage

---

## 🔄 Flow

1. System starts
2. Inventory loaded from file
3. Data restored into memory
4. System runs
5. Inventory saved before exit

---

## 🧠 Key Concepts

### ✔ Persistence

* Data stored in file

### ✔ Serialization (Simple)

* Convert objects → text format

### ✔ Deserialization

* Read file → restore objects

### ✔ Failure Handling

* Missing file handled safely

---

## 🛠️ Classes

* `RoomInventory`
* `FilePersistenceService`
* `UseCase12DataPersistenceRecovery`

---

## ▶️ How to Run

```bash
javac UseCase12DataPersistenceRecovery.java
java UseCase12DataPersistenceRecovery
```

---

## ✅ Benefits

* No data loss
* Persistent system state
* Prepares for database usage

---

## ⚠️ Previous Limitation

Earlier system lost all data after restart.

---

## 🚀 Future Enhancements

* Database integration
* JSON/XML storage
* Backup recovery

---

## 👨‍💻 Author

Praneet
