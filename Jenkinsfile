pipeline {
   agent any
   //agent { dockerfile true }
   /*agent {
      docker {
         label 'dockerserver'
         image 'maven:3-alpine'
      }
   }*/
   stages {
      /*
      stage('Preparation') {
         steps {
            sh 'mvn clean'
         }
      }*/
      stage('Compile') {
         steps {
            //sh 'mvn compile'
            sh 'mvn clean package'
         }
      }
      /*stage('Deploy') {
         steps {
            sh 'mvn package'
         }
      }*/
      /*
      stage('Docker Build') {
         steps {
            sh 'docker build -t sebenner/project_03:discover -f Dockerfile'
            sh 'docker push sebenner/project_03:discover'
         }
      }*/
   }
}
