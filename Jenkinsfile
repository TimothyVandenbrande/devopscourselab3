BRANCH_NAME = "${env.BRANCH_NAME}"

node {
    stage('Build') {
        echo 'Building..'
        cleanup()
        git credentialsId: 'c6255d12-883c-4aee-ae6a-836802a28780', url: 'https://github.com/TimothyVandenbrande/devopscourselab3.git'
        grdl('build')
    }
    stage('Test') {
        grdl('test')
    }
}

def cleanup() {
  sh "rm -rf *"
}

def grdl(task) {
    println "gradlew ${task}"
    sh "./gradlew ${task}"
}

def checkout(repo) {
    checkout(repo, BRANCH_NAME)
}

def checkout(repo, branch) {
    //git branch: branch, url: repo
    git branch: 'master', credentialsId: '12345-1234-4696-af25-123455', url: 'ssh://git@bitbucket.org:company/repo.git'
}
