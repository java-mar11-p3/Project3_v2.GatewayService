pipeline {
   agent any
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
