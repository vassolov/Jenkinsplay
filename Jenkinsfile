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

                 bat "mvn -Dmaven.test.failure.ignore=true clean package"
             }
             post {
                 // If Maven was able to run the tests, even if some of the test
                 // failed, record the test results and archive the jar file.
                 success {
                     echo 'run the test on success'
                     // junit '**/target/surefire-reports/TEST-*.xml'
                     archiveArtifacts 'target/*.jar'
                 }
             }
         }

        stage('Deploy') {
             steps {
                 echo 'stage Deploy'
             }
         }
     }
     post {
         // If this build failed, send an email to the list.
         failure {
             echo 'failure'
         }

         // If this build didn't fail, but there were failing tests, send an email to the list.
         unstable {
             echo 'unstable'
         }

         // Send an email, if the last build was not successful and this one is.
         success {
             echo 'sucsess'
         }

         always {
             echo 'always'
         }
     }
}
