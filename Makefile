install:
	mvn install:install-file -Dfile=lib/WSGlobalWeather-1.0.0.jar -DgroupId=net.webservicex -DartifactId=global-weather -Dversion=1.0.0 -Dpackaging=jar
	
run:
	mvn spring-boot:run