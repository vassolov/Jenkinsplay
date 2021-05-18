pipeline {
    agent any

    options {
        // Configure an overall timeout for the build of one hour.
        timeout(time: 1, unit: 'HOURS')
        // When we have test-fails e.g. we don't need to run the remaining steps
        skipStagesAfterUnstable()
    }

    stages {
         stage('Build') {
            steps {

                // echo 'Run Maven on a Unix agent.'
                // sh "mvn -Dmaven.test.failure.ignore=true clean package"

                echo 'Run Maven on a Windows agent'
                bat "mvn clean package"
//                 bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                failure {
                    echo 'failure'
                 }

                 // If this build didn't fail, but there were failing tests, send an email to the list.
                 unstable {
                    echo 'unstable'
                 }
               // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    echo 'run the test on success'
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
                always {
                    echo 'always'
                }
            }
        }
    }
}
