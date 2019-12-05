pipeline {
   agent any
   tools {
      jdk 'JAVA_HOME'
      maven 'MAVEN_HOME'
    }
    stages{
       stage('Build'){
          steps {
                sh 'mvn clean package'       
                sh "docker build -t addapi:${env.BUILD_ID} ."
                sh "docker build -t addsvc:${env.BUILD_ID} ."               
                sh 'docker login -u skumar24 -p kukku@240892'
                sh "echo sameer"
                sh "docker tag addapi:${env.BUILD_ID} skumar24/addapi:${env.BUILD_ID}"
                sh "docker tag addsvc:${env.BUILD_ID} skumar24/addasvc:${env.BUILD_ID}"                   
                sh "docker push skumar24/addapi:${env.BUILD_ID}"
                sh "docker push skumar24/addsvc:${env.BUILD_ID}"
          }
       }
   }
}