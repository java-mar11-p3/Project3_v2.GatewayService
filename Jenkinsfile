pipeline {
   //agent any
   agent { dockerfile true }
   /*agent {
      docker {
         label 'dockerserver'
         image 'maven:3-alpine'
      }
   }*/
   stages {
      stage('Preparation') {
         steps {
            sh 'mvn clean'
         }
      }
      stage('Compile') {
         steps {
            sh 'mvn compile'
         }
      }
      stage('Deploy') {
         steps {
            sh 'mvn package'
         }
      }
   }
}
