# 🌸 Veda Bloom API

The **Veda Bloom API** is a backend service that powers the prediction engine for the Veda Bloom menstrual health tracking application.

This API processes cycle data provided by users and calculates predictions for the **next period date, ovulation date, and fertile window** using a Java-based algorithm.

The service is built with **Spring Boot** and deployed as a cloud-hosted REST API.

---

# 🚀 Live API

Base URL
https://veda-bloom-api.onrender.com

Prediction Endpoint

```
POST /api/predict
```

---

# 📌 Overview

The API receives menstrual cycle data from the frontend application and performs calculations to predict future cycle events.

It acts as the **prediction engine** for the Veda Bloom application and communicates with the frontend through RESTful API requests.

---

# ✨ Features

### 🔮 Cycle Prediction Engine

Calculates important cycle events including:

• Next period date
• Ovulation date
• Fertile window start date

### ⚡ REST API

Provides a simple REST endpoint that processes prediction requests from the frontend application.

### ☁️ Cloud Deployment

The API is deployed on **Render** and can be accessed publicly through HTTPS.

### 🔗 Frontend Integration

Designed to integrate with the **Veda Bloom React frontend**.

---

# 🧠 Prediction Logic

The API calculates predictions using the following formula:

```
nextPeriodDate = lastPeriodDate + cycleLength

ovulationDate = nextPeriodDate - 14 days

fertileWindowStart = ovulationDate - 5 days
```

These calculations are implemented using the **Java LocalDate API**.

---

# 📡 API Endpoint

## POST /api/predict

### Request Body

```
{
  "lastPeriodDate": "2026-03-01",
  "averageCycleLength": 28
}
```

### Response

```
{
  "nextPeriodDate": "2026-03-29",
  "fertileWindowStart": "2026-03-10",
  "ovulationDate": "2026-03-15"
}
```

---

# 🏗 System Architecture

```
User
 │
 ▼
React Frontend (Vercel)
 │
 │ REST API Request
 ▼
Spring Boot API (Render)
 │
 ▼
Prediction Results Returned to Frontend
```

---

# 🛠 Tech Stack

Backend Framework
Spring Boot

Language
Java

API
REST API

Deployment
Render

---

# 📂 Project Structure

```
src/main/java/com/vedabloom/api

 ├── PredictionController.java
 ├── PredictionRequest.java
 ├── PredictionResponse.java
 └── VedaBloomApiApplication.java
```

---

# ⚙️ Running Locally

Clone the repository

```
git clone https://github.com/AaryaRai01/Veda-Bloom-api.git
```

Navigate into the project

```
cd Veda-Bloom-api
```

Build the project

```
mvn clean install
```

Run the application

```
mvn spring-boot:run
```

The API will start at

```
http://localhost:8080
```

---

# 🔗 Frontend Repository

The frontend application for Veda Bloom is available here:

https://github.com/AaryaRai01/Veda-Bloom

---

# 🔒 Security

CORS is configured to allow requests from the frontend deployment domains.

```
@CrossOrigin(origins = {
 "http://localhost:3000",
 "https://veda-bloom.vercel.app"
})
```

---

# 👨‍💻 Author

Aarya Rai

GitHub
https://github.com/AaryaRai01

---

# 📄 License

This project is licensed under the MIT License.
