node{
   stage('SCM Checkout'){
     git 'https://github.com/mohamedBAF/SpringApp.git'
   }
   stage('Compile-Package'){
      // Get maven home path
      def mvnHome =  tool name: 'MAVEN_HOME', type: 'maven'   
      sh "${mvnHome}/bin/mvn package"
   }
   
   stage('SonarQube Analysis') {
        def mvnHome =  tool name: 'MAVEN_HOME', type: 'maven'
        withSonarQubeEnv('sonar-6') { 
          sh "${mvnHome}/bin/mvn sonar:sonar"
        }
    }
}
