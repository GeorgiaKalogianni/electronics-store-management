# Electronics Store Management System

A console-based inventory, sales, and order management application built in Java using Object-Oriented Programming (OOP) principles.

## Features
* **Product Catalog:** Manages 12 pre-loaded electronics across 3 categories (Image & Sound, Gaming, Home Appliances).
* **Sales Processing:** Tracks available stock, applies category-based discounts (10%–25%), updates inventory in real time, and logs customer receipts.
* **Backorder Management:** Allows customers to place orders for out-of-stock items with future arrival date validation, and converts arrived orders into completed sales.

## Class Hierarchy (OOP Design)
* `Device` *(abstract)*: Base class holding common attributes (`code`, `modelName`, `manufacturer`, `year`, `price`, `quantity`).
  * `ImageandSound` *(abstract)* → `Television`, `BluRayPlayer`, `Camera`
  * `GamingDevice` *(abstract)* → `Consoles`
  * `HomeAppliance` *(abstract)* → `Refrigerator`, `WashingMachine`
* `Sale` & `Order`: Model completed transactions and pending backorders.
* `mainApp`: Entry point handling the interactive CLI menu and business logic.

## How to Run
1. Download or clone this repository.
2. Open a terminal in the project folder and compile all Java files:
   ```bash
   javac *.java
   ```
3. Run the application:
   ```bash
   java mainApp
   ```
