def clonecode(String GitUrl, String GitBranch{
  echo "Cloning the code"
  git url: "${GitUrl}", branch:"${GitBranch}"
  echo "Code Cloning successfull"
}
