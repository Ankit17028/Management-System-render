#  Management System

## Project Overview
The  Management System is designed to help 

## System Requirements
- Java Development Kit (JDK) 11 or higher
- PostgreSQL Database
- Maven 3.6.0 or higher
- An IDE (e.g., IntelliJ IDEA, VSCode, Eclipse)

## Installation Instructions
1. **Clone the Repository**
    ```sh
    git clone https://github.com/your-repo/management-system.git
    cd management-system
    ```

2. **Configure the Database**
    - Ensure PostgreSQL is running.
    - Create a database named `management`.
    - Update `src/main/resources/application.properties` with your database credentials.

3. **Build the Project**
    ```sh
    ./mvnw clean install
    ```

## Running Instructions
1. **Run the Application**
    ```sh
    ./mvnw spring-boot:run
    ```

2. **Access the Application**
    - Swagger UI: `http://localhost:8080/swagger-ui.html`

## Test Execution Guide
1. **Run Unit Tests**
    ```sh
    mvn test
    ```

2. **Check Test Coverage**
    - Ensure all unit tests pass and check the coverage reports.

## API Documentation
The API documentation is available through Swagger UI at `http://localhost:8080/swagger-ui.html`.

## Sample Usage Examples
Here are some sample JSON payloads for the API endpoints:

- **Create a New Lead**
    ```json
    {
        "name": "Moonlight Bistro",
        "status": "Pending",
        "contacts": [
            {
                "name": "Emily Brown",
                "role": "Assistant Manager",
                "email": "emily.brown@example.com",
                "phone": "1122334455"
            }
        ],
        "interactions": [
            {
                "details": "Discussed catering options for an upcoming event",
                "interactionDate": "2024-12-28T15:45:00"
            }
        ],
        "callPlan": {
            "frequency": 10,
            "notes": "Follow-up every 10 days to finalize the contract"
        }
    }
    ```

## Video Demonstration
To help you understand the setup process and major features of this application, we have created a video demonstration. 

### Video Contents
- Code setup process
- Application running
- Major features demonstration
- Sample inputs/outputs

The video is available in MP4 format at the following link: [Video Demonstration](https://link-to-video.com)

---

Feel free to customize this documentation according to your project specifics. If you need more details or assistance, let me know!
