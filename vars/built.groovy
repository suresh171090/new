def call(){
def mvnHome =  tool name: 'maven3', type: 'maven'   
      sh "${mvnHome}/bin/mvn clean package"
	  sh 'mv target/myweb*.war target/newapp.war'
	sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:${BUILD_NUMBER}"
        sh "docker tag ${hubUser}/${project} ${hubUser}/${project}:latest"
}
