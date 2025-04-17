# Microservices Architecture for E-Commerce Platform

This repository contains four containerized microservices for an e-commerce platform: Customer, Order, Article, and Shopservice. Each service is developed using **Spring Boot**, a framework that streamlines the creation of production-ready applications. They are packaged with **Docker** to ensure consistent deployment across different environments.

These microservices are designed to run within a robust infrastructure powered by **Kubernetes** for orchestration, **Istio** for service mesh capabilities, and **Gloo Edge** as the API gateway. This architecture supports scalability, secure service-to-service communication, and high availability.

## Services Overview

### 1. **ArticleService**
   - **Purpose**: Manages articles or products available in the e-commerce platform.
   - **Built With**: **Spring Boot**
   - **Responsibilities**:
     - CRUD operations for articles.
     - Managing article metadata such as descriptions, prices, and categories.

### 2. **CustomerService**
   - **Purpose**: Handles customer-related operations.
   - **Built With**: **Spring Boot**
   - **Responsibilities**:
     - CRUD operations for customers.
     - Managing customer profiles and preferences.

### 3. **OrderService**
   - **Purpose**: Manages orders placed by customers.
   - **Built With**: **Spring Boot**
   - **Responsibilities**:
     - CRUD operations for orders.
     - Creating, updating, and tracking orders.

### 4. **ShopService**
   - **Purpose**: Acts as the orchestrator and entry point for the platform.
   - **Built With**: **Spring Boot**
   - **Responsibilities**:
     - Aggregating data from other services.
     - Providing a unified API for external clients.

## Repository Structure

The repository is organized into separate directories for each microservice. Each service is a standalone Maven project with its own dependencies and configurations.

The following diagram provides an overview of the application architecture, including Docker, Kubernetes, Istio, and Gloo Edge components.

![Overview diagram of the application architecture](/E-Commerce_Overview_Diagram.png)