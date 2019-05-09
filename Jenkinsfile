pipeline {
   //agent any
   agent { 
      //label 'docker'
      dockerfile true
   }
   /*agent {
      docker {
         label 'dockerserver'
         image 'maven:3-alpine'
      }
   }*/
   stages {
      stage('Compile') {
         steps {
            //sh 'mvn compile'
            sh 'mvn clean package'
         }
      }
      stage('Deploy') {
         steps {
            sh 'mvn deploy'
         }
      }
      
      /*stage('Docker Build') {
         steps {
            sh 'docker build -t sebenner/project_03 -f Dockerfile'
            sh 'docker push sebenner/project_03'
         }
      }*/
   }
}
