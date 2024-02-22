# Microservices in Docker with Gradle
This project demonstrates the creation of microservices using Gradle as the build tool, Docker for containerization, Docker Compose for orchestration, and NGINX as a reverse proxy. The microservices, ms1 and ms2, each expose a simple "Hello" API. The project also includes a Dockerized database managed by Docker Compose to persist a counter value.

## Tools Used
Docker: Containerization platform used to package and distribute microservices as containers.

Docker Compose: Tool for defining and running multi-container Docker applications, utilized for managing microservices and the database.

Gradle: Build tool used to manage the build lifecycle of the project, including building Docker images.

NGINX: Reverse proxy server used to route incoming requests to the appropriate microservice based on the URL path.
## Prerequisites
Docker installed: Docker Installation Guide
Docker Compose installed: Docker Compose Installation Guide
Gradle installed: Gradle Installation Guide
## Running the Project
Clone the Git repository:

git clone <repository-url>
Navigate to the project root:

cd project-root
Build and run the microservices with Docker Compose:

docker-compose up
Access the services:

http://localhost:8000/ms1/hello: Returns the message from ms1.
http://localhost:8000/ms2/hello: Returns the message from ms2.
Gradle Tasks for Docker
Building Docker Images
To build and push Docker images for both ms1 and ms2, run the tasks in gradle


The project uses Git tags for versioning. Each commit and push to the repository will automatically update the Git tag.
