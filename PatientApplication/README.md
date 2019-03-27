#Consul
	
	Consul is a peer to peer, strongly consistent data store that uses a gossip protocol to manage
	membership and form dynamic clusters and a raft protocol to provide consistency. It supports 
	variety of network protocols such as HTTP, TTL, and TCP. It supports health checking, such as
	whether the web server is unavailable (not returning a 200 HTTP code), memory utilization (let’s
	say > 90%, etc). Consul also supports multi-datacenter out of the box.
	
	There are a few other products in the market to choose from for service discovery, such as Eureka
	or Zookeeper. Eureka is a Netflix product which has a less consistent communication protocol, but
	is easy to integrate with other Netflix products, such as Ribbon and Hysterix. Zookeeper is a
	clustered system that is mostly geared towards big data architecture such as Hadoop and Kafka.
	
#Ribbon
	
	Ribbon is a client-side load balancer which rotates requests between a list of servers based on
	logic such as round robin or weigh based. 

#Feign Client
	
	Feign provides an abstraction over REST-based calls via annotation, by which microservices can use 
	to communicate with each other without writing detailed REST client code.

#App Detail
	
	The application is a replica sample taken from an example from DZone articles for Consul, Ribbon &,
	Fiegn Cient.
	
#Set up
	
	2 separate micro-services for Volunteer and, Patient
	
	1 consul agent is required to be running where the above micr-services could be registered.
	The consul agent could be downloaded: https://www.consul.io/downloads.html
	Add the path in Path variables[The path where exe is stored locally]
	refreshenv --> to refresh env variables

#App Test
	
	1. Start consul Agent: 
	docker run -d -p 8500:8500 -p 8600:8600/udp --network=gradle_docker_net --name=consul consul:latest
	agent -server -bootstrap -ui -client=0.0.0.0
	2. Start both the micro-services:
		The micro - services works as docker containers
		After starting the consul agent follow the steps:
		-> build the volunteer app -> gradle build docker
		-> docker run -d --name volunteer --network=gradle_docker_net -p 7002:7002 -p 7003:7002 -p
		7004:7002 -t springio/gs-rest-service
		-> build the patient app -> gradle build docker
		-> docker run -d --name patient --network=gradle_docker_net -p 7005:7005 -p 7006:7005 -p
		7007:7005 -t springio/gs-rest-service
	3. Check docker container -> docker container ls
	4. Check consul agent ui --> localhost:8005 --> Check the services/instances for both the apps
	
	Application could be tested using the deployed Patient service which internally calls the Volunteer
	Service App based on registered Application name rather than the relative url.
	For eg: http://localhost:7004/volunteers/donateblood --> will invoke the "http://VolunteerApp"
	
	The App uses the ribbon lb to invoke the instance for serving the request.
	
  	
