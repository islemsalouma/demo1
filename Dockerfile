FROM tomcat:9.0.1-jre8
COPY /target/monapp-1.0.0-BUILD-SNAPSHOT.war  /usr/local/tomcat/webapps/
