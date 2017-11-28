BRANCH_NAME = "${env.BRANCH_NAME}"

node {
    stage('Build') {
        echo 'Building..'
        sh "rm -rf *"
        checkout scm
        grdl('build')
    }
    stage('Test') {
        grdl('test')
    }
}

def cleanWorkspace() {
    sh "rm -rf *"
}

def checkout(repo) {
    checkout(repo, BRANCH_NAME)
}

def checkout(repo, branch) {
    git branch: branch, url: repo
}

def grdl(task) {
    println "gradlew ${task}"
    sh "./gradlew ${task}"
}