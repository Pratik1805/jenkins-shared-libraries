def call(String Project, String ImageTag, String dockerhubuser){
     echo "Push image to docker hub"
     withCredentials([usernamePassword(
                    'credentialsId':"dockerHubCred", 
                    passwordVariable:"dockerHubPass", 
                    usernameVariable:"dockerhubuser")]){
       sh "docker login -u ${dockerhubuser} -p ${dockerHubPass}"
     }
     sh "docker push ${env.dockerhubuser}/${Project}:${ImageTag}"
     echo "Docker Image successfully pushed to ${dockerhubuser}"
}
