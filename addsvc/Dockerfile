FROM abrtech/alpine-oraclejdk8
VOLUME /tmp
ADD  target/*.jar service.jar
EXPOSE 80
CMD ["java","-jar","/service.jar"]
