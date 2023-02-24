def call(String project, String hubUser) {
    sh "docker image build -t ${hubUser}/${project} ."
}
