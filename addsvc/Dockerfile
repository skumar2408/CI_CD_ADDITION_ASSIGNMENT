FROM abrtech/alpine-oraclejdk8
ADD  target/addsvc-0.0.1-SNAPSHOT.jar service.jar
EXPOSE 80
CMD ["java","-jar","/service.jar"]
