FROM abrtech/alpine-oraclejdk8
VOLUME /tmp
ADD  target/*.jar service.jar
EXPOSE 8060
ENTRYPOINT ["java","-jar","/service.jar"]