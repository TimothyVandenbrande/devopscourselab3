node {
   stage('This is a stage') {
       echo 'Hello'
   }
   stage('Another stage!') {
       echo 'Hello'
   }
   stage('Proceed?') {
       input "Deploy?"
       milestone()
   }
   stage('Finished') {
       echo 'Hello'
   }
}