FROM centos

RUN mkdir -p /docker_home/local

ADD tomcat7 /docker_home/local/tomcat7
ADD java18 /docker_home/local/java18
ENV JAVA_HOME /docker_home/local/java18/
ENV CATALINA_HOME /docker_home/local/tomcat7
ENV PATH $PATH:$JAVA_HOME/bin:$CATALINA_HOME/bin

EXPOSE 8080

CMD ["/docker_home/local/tomcat7/bin/catalina.sh","run"]
