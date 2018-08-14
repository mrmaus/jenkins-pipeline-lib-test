pipeline {
    agent any
  stages {
    stage('Run shared lib...') {
      steps {
          sendNotifications (
            buildStatus: 'buildstatus1'
          )
      }
    }
  }
}