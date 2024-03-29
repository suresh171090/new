def call(String project, String hubUser) {
    sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:${BUILD_NUMBER}"
    sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:latest"
    withCredentials([string(credentialsId: 'dockerPass', variable: 'dockerPassword')]) {
    sh "docker login -u suresh171090 -p ${dockerPassword}"
    }
    sh "docker push ${hubUser}/${project}:${BUILD_NUMBER}"
    sh "docker push ${hubUser}/${project}:latest"
}
