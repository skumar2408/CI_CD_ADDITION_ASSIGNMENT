FROM abrtech/alpine-oraclejdk8
ADD  target/*.jar service.jar
EXPOSE 3306
CMD ["java","-jar","/service.jar"]
