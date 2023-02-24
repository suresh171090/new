def call(String project, String hubUser) {
    sh "docker image build -t ${hubUser}/${project} ."
    sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:${BUILD_NUMBER}"
     sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:latest"
}
