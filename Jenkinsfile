pipeline {
    agent any

    stages {
        stage('Build') {
            steps {

                // echo 'Run Maven on a Unix agent.'
                // sh "mvn -Dmaven.test.failure.ignore=true clean package"

                echo 'Run Maven on a Windows agent'
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    echo 'run the test on success'
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
