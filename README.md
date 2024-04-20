This project is meant to be a Web Application of a cinema. 
The cinema operators can add movies, add rooms (in case of an expansion) and create sessions selecting a movie, a room and specifying a date.
The cinema clients can check the movies on exhibtion, check the available sessions and buy tickets.

The Backend is being developed in Java with Spring Boot. 
Hibernate is being used to persist data on a MySQL database.
Authentication will be implemented.
The Frontend is to be made using React.

To test the application easily, you can use the docker-compose file on this repository:
https://github.com/Mcunha19/cinemaApp-JAVA-SPRING/blob/main/docker-compose/docker-compose.yml

Just download the file, open the command prompt and run:
docker compose up

It will download the required images and run the containers automatically.

For now, the movies, rooms and sessions management can be tested using the urls:
localhost:8000/movie
localhost:8000/room
localhost:8000/session

A prettier web page, where the clients can buy tickets, is still under development.
