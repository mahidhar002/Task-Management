# 🗂️ Task Management System

A full-featured task management platform built using **React**, **Spring Boot**, and **Microservices Architecture**. This system supports real-time task handling, role-based authentication, and robust backend communication with **Eureka**, **OpenFeign**, and **Spring Security**.

## Key Features

-  **Create, Assign, Update, and Delete Tasks**
-  **Role-based task assignment and collaboration**
-  **Filter Tasks** with custom logic
-  **Task Submission Module** with admin approval
-  **JWT-secured Authentication**
-  **Spring Cloud + Eureka + OpenFeign** for service communication
-  **Modern UI** using MUI and TailwindCSS
-  **State management** using Redux Toolkit

##  Tech Stack

| Layer       | Stack |
|-------------|-------|
| Frontend    | React, Redux Toolkit, TailwindCSS, MUI (Material UI) |
| Backend     | Spring Boot, Spring Security, Spring Cloud |
| Communication | OpenFeign, Eureka Server |
| API Gateway | Spring Cloud Gateway |
| Database    | MySQL or PostgreSQL |
| Auth        | JWT-based authentication |

## How to run
    
### Backend (Spring Boot)
1. Check if Git is present or not
    ```bash
    git --version
    ```

2. Clone the repository:
    ```bash
   git clone https://github.com/mahidhar002/Task-Management.git
   cd Task-Management/
   ```

3. Check if Java is present or not
    ```bash
    java -version
    ```

4. Create databases in MySQL
    ```bash
    mysql -u root -p
    CREATE DATABASE yt_task_user_service;
    CREATE DATABASE yt_task_submission_service;
    CREATE DATABASE yt_task_service;
    ```

5. Make following changes in the **\Task-Management\src\main\resources\application.yaml** 
    ```bash
    spring.datasource.password=ENTER_YOUR_PASSWORD_INSTEAD_OF_THIS_TEXT
    ```
    on above line add password value as your MySQL application password.

6. Install Dependencies and run
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```
### Frontend (React.js)
7. Navigate to frontend
    ```bash
    cd Task-Management/frontend
    ```

8. Check if npm is present or not.
    ```bash
    npm -version
    ```

9. If above command fails due to security issues even though npm is present in system then try
    ```bash
    npm.cmd -version
    ```

10. Install Dependencies and run
    ```bash
    npm install
    npm install -D tailwindcss@3
    npx tailwindcss init
    npm install @reduxjs/toolkit
    npm install @mui/material @emotion/react @emotion/styled
    npm start
    ```

11. If above commands fail due to security issues even though npm is present in system then try
    ```bash
    npm.cmd install
    npm.cmd start
    ```
Once the application is up and running you will be able to see following pages as you navigate through the application
1. Login Page
![image](https://github.com/user-attachments/assets/c0ac156a-db50-48e4-b047-f821a3416b53)
2. Signup Page
![image](https://github.com/user-attachments/assets/068a5b1b-bfb3-41a6-84c9-77dc38bf6630)
3. This allows the user to add a new task by entering a title, image URL, description, tags, and a deadline, and then clicking the "Create" button to submit
![image](https://github.com/user-attachments/assets/a75ebe65-87fb-4ab5-8e1f-2024429822ca)
4. This displays the list of created tasks with their titles, descriptions, and associated technologies. Each task has a dropdown menu that allows the user to assign it to others, view submissions, edit details, or delete the task.
![image](https://github.com/user-attachments/assets/10fb796e-06bf-445e-a1b7-1a8c126f7345)
5. This allows the admin to assign a selected task to any user from the list by clicking the "SELECT" button next to their profile.
![image](https://github.com/user-attachments/assets/1a6fcab1-da86-4e32-ba55-54b4fb2f7df6)
6. This confirms that once a task is assigned to a user (e.g., Namratha), it becomes visible in their "ASSIGNED" section upon login.
![image](https://github.com/user-attachments/assets/838b62e1-95c5-43db-849f-ca01743900ce)
7. This displays the remaining unassigned tasks under the NOT ASSIGNED section, helping the admin quickly identify which tasks (like Movie Recommendation) still need to be delegated.
![image](https://github.com/user-attachments/assets/32c495df-4fe4-4364-b251-3e1f3d82c335)
8. This shows that Namratha, as an assigned user, can click the Submit option to upload or mark the completion of the assigned task (in this case, the Restaurant project).
![image](https://github.com/user-attachments/assets/a9f23ea0-6d68-4683-b074-51009aa432db)
9. This shows that the admin can review a submitted task, view the GitHub link, check the submission time, and either approve or decline the submission.
![image](https://github.com/user-attachments/assets/9e0e2ec6-9cf7-44cd-bf33-5ea51fc242b0)
10. This shows that once a task submission is approved by the admin, it moves to the DONE section for the user, indicating successful task completion.
![image](https://github.com/user-attachments/assets/36778d83-fc10-4590-93da-6265347cbae6)
11. You can test the complete flow of the Task Management system using API endpoints—such as user signup, login, and profile retrieval for authentication. Task-related operations like create, update, get all tasks, and mark as complete can also be validated via respective endpoints. Similarly, submission actions and admin approvals are accessible through Submission APIs, enabling full backend interaction without the UI.
![image](https://github.com/user-attachments/assets/838c89c8-1065-4b47-8227-0adb5ab81f63)


##  Module Overview

| Module              | Description                                                      |
|---------------------|------------------------------------------------------------------|
| **User Service**     | Handles registration, login, and user data                       |
| **Task Service**     | Handles task creation, update, delete, and filtering             |
| **Submission Service** | Enables users to submit tasks and admins to approve              |
| **Gateway**          | Routes requests to microservices securely                        |
| **Eureka**           | Registers services and enables dynamic discovery                 |


##  State Management with Redux Toolkit

All frontend state — including **authentication**, **task operations**, and **submissions** — is managed using [`@reduxjs/toolkit`](https://redux-toolkit.js.org/).  
Redux state slices are modular and organized by feature for scalability and maintainability.

Key aspects include:
- `createSlice` and `createAsyncThunk` for reducers and async logic.
- React hooks (`useDispatch`, `useSelector`) for interaction.
- Integration with middleware and dev tools for easier debugging.
