# rate-that-flick
Simple spring boot app with Rest controller to retrieve movie rating data from a mongo instance

To deploy and run the app you will need a docker install. View this [page](https://www.docker.com/community-edition) for the correct installation options.

Once docker is installed, clone the repository. Navigate to the cloned project directory. Follow these simple commands
1. Set the environment variables as follow
````
export DOCKER_HOST_IP=$(docker-machine ip default 2>/dev/null)
export SPRING_DATA_MONGODB_URI=mongodb://${DOCKER_HOST_IP}/userregistration
````
2. Run the following maven command
````
mvn clean install
````
3. Run the docker compose command to start up the docker containers
````
docker-compose up -d
````
4. Run the following to get the the docker host ip address
````
echo $DOCKER_HOST_IP
````
5. Now start up postman and try to hit the rest endpoints using. The IP address should be the docker host ip.
````
192.168.99.100:8080/ratings/all
````
