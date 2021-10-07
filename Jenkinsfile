pipeline {
  agent any
  stages {
    stage('Dev') {
      steps {
        echo 'Maven Build'
      }
    }

    stage('Deploy to QA') {
      steps {
        echo 'Maven build deployed to QA environment'
      }
    }

    stage('UI Testing (smoke)') {
      parallel {
        stage('UI Testing (smoke)') {
          steps {
            echo 'Selenium Testing'
          }
        }

        stage('API Testing (smoke)') {
          steps {
            echo 'Rest Assured API '
          }
        }

        stage('Perfomance Testing') {
          steps {
            echo 'Jmeter'
          }
        }

      }
    }

    stage('UAT Certify') {
      steps {
        echo 'Manual UAT Certification'
        input 'Do you want to Certify'
      }
    }

    stage('Prod Deploy') {
      steps {
        echo 'Build deployed to prod'
      }
    }

  }
}