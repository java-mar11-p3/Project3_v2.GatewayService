pipeline {
   agent any
   stages {
      stage('Compile') {
         steps {
            sh 'mvn clean package'
         }
      }
      stage('Docker') {
         steps {
            sh 'sudo docker build -t sebenner/project_03:gateway-service .'
            sh 'sudo docker login -u sebenner -p password_123 docker.io'
            sh 'sudo docker push sebenner/project_03:gateway-service'
            sh 'sudo docker login -u sebenner -p password_123 docker.io'
            sh 'sudo docker run -p 443: sebenner/project_03:gateway-service'
         }
      }
      /*stage('Deploy') {
         steps {
            sh 'mvn package'
         }
      }*/
   }
}
