
pipeline{
agent any
  stages{
    stage('clean'){
    echo "Cleaning the project";
      bat 'mvn sonar:sonar';
    }
  }
}
