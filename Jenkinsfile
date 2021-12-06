pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'build app'
            }
        }
        stage('test')
        {
            steps{
               sh 'mvn verify'
            }
        }
          stage('deploy')
        {
            steps{
                echo 'deploy app'
            }
        }
    }
}
