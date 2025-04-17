# Microservices Architecture for E-Commerce Platform

This repository contains a collection of microservices that together form an e-commerce platform. Each service is designed to handle a specific domain of the platform, ensuring modularity, scalability, and maintainability.

## Services Overview

### 1. **ArticleService**
   - **Purpose**: Manages articles or products available in the e-commerce platform.
   - **Responsibilities**:
     - CRUD operations for articles.
     - Managing article metadata such as descriptions, prices, and categories.

### 2. **CustomerService**
   - **Purpose**: Handles customer-related operations.
   - **Responsibilities**:
     - Customer registration and authentication.
     - Managing customer profiles and preferences.

### 3. **OrderService**
   - **Purpose**: Manages orders and transactions.
   - **Responsibilities**:
     - Creating, updating, and tracking orders.
     - Handling payment processing and order fulfillment.

### 4. **ShopService**
   - **Purpose**: Acts as the orchestrator and entry point for the platform.
   - **Responsibilities**:
     - Aggregating data from other services.
     - Providing a unified API for external clients.
     - Managing platform-wide configurations and logging.

## Repository Structure

The repository is organized into separate directories for each microservice. Each service is a standalone Maven project with its own dependencies and configurations.
