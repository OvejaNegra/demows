# Demo WS #
#### Intro. ####
This demo project call the soap web service "Global Weather" from "webservicex.net"

#### Installation ####
run
	
	$ make install
or
	
	$ mvn install:install-file -Dfile=lib/WSGlobalWeather-1.0.0.jar -DgroupId=net.webservicex -DartifactId=global-weather -Dversion=1.0.0 -Dpackaging=jar

#### Run ####
	$ make run
or

	mvn spring-boot:run