def call(String repoUrl) {
  pipeline {
       agent any
       stages {
          stage("Checkout Code") {
            steps {
             git branch: 'master',
              url: "${repoUrl}"
               }
           }
       }
  }
}
