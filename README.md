# rate-that-flick
Simple spring boot app with Rest controller to retrieve movie rating data from a mongo instance

To deploy and run the app you will need a docker install. View this [page](https://www.docker.com/community-edition) for the correct installation options.

Once docker is installed, clone the repository. Navigate to the cloned project directory. Follow these simple commands if you  are running on a docker-machine
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
docker-compose -f docker-compose-docker-machine.yml up -d
````
4. Run the following to get the the docker host ip address
````
echo $DOCKER_HOST_IP
````
5. Now start up postman and try to hit the rest endpoints using. The IP address should be the docker host ip.
````
192.168.99.100:8080/ratings/all
````

On a natively installed docker for e.g. on Windows 10 64 bit or Mac OS or Linux there is no need for docker machine.
Simply run steps 2 and 3 from above. The only difference being step 3 needs to be run with
````
docker-compose -f docker-compose.yml up -d
````
Then you can try and hit the end point by running
````
localhost:8080/ratings/all
````