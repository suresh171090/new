def call(String project, String hubUser) {
success {
emailext body: 'A Test EMail', 
recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], 
subject: 'success'
}
failure {
emailext body: 'failed', 
recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], 
subject: 'failed'
}
}
