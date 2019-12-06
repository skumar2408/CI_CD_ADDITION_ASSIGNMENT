FROM abrtech/alpine-oraclejdk8
ADD  target/*.jar service.jar
EXPOSE 80
CMD ["java","-jar","service.jar"]
