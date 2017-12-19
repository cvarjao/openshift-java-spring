pipeline {
  agent none
  stages {
    stage('build') {
      agent {
        node {
          label 'maven'
        }
        
      }
      steps {
        echo 'Hello'
      }
    }
  }
}