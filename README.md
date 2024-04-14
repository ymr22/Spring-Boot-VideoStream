# Spring Boot Video Stream

Spring Boot Video Stream is a simple video streaming application built using Spring Boot.

## Purpose

This project serves as an example of how to create a basic video streaming application with Spring Boot. It demonstrates how to stream video content over HTTP using Spring Boot's capabilities.

## Features

- **Video Streaming**: Stream video files over HTTP to clients.
- **Basic UI**: Includes a basic user interface to navigate and view available video streams.

## Technologies Used

- **Spring Boot**: For building the backend application.
- **Thymeleaf**: For server-side templating and rendering of HTML pages.
- **HTML/CSS/JavaScript**: For building the user interface.
- **FFmpeg**: For video encoding and decoding.

## Getting Started

To run the application locally, follow these steps:

1. **Clone the Repository**: Clone this repository to your local machine.

2. **Build the Project**: Navigate to the project directory and run the following command to build the project:

    ```bash
    mvn clean package
    ```

3. **Run the Application**: Once the project is built successfully, run the following command to start the Spring Boot application:

    ```bash
    java -jar target/Spring-Boot-VideoStream-0.0.1-SNAPSHOT.jar
    ```

4. **Access the Application**: Open a web browser and navigate to `http://localhost:8080` to access the application.

## Usage

- Upon accessing the application, you will be presented with a list of available video streams.
- Click on a video stream to start streaming the video.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
