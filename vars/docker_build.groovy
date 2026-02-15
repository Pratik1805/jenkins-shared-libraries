def call(String DockerHubUser, String ProjectName, String ImageTag){
  echo  "Building the code"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo "Code builiding successfully"
}
