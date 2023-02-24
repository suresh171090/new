def call(String project, String hubUser, String contname) {
	try{
		sh "docker rm -f ${contname}"
	}catch(error){
		//  do nothing if there is an exception
	}
  sh "docker run -d -p 8090:8080 --name ${contname} ${hubUser}/${project}:latest"
}
  
