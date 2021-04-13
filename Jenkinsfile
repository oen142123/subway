def notifyStarted(){
  slackSend (channel: '#jenkins', color: '#FFFF00', message: "STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
}

def notifyEnd(){
    slackSend (channel: '#jenkins', color: '#000000', message: "End: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
}

def notifySuccessful(stage){
    slackSend (channel: '#jenkins', color: '#00FF00', message: "SUCCESSFUL ${stage}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
}

def notifyFailed(stage){
    slackSend (channel: '#jenkins', color: '#FF0000', message: "FAILED ${stage} : Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
}

pipeline{
    agent any


    stages {
        stage('START'){
            steps {
                notifyStarted()
            }
        }

        stage('End'){
            steps{
                notifyEnd()
            }
        }
    }

}
