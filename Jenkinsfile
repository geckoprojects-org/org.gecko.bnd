pipeline  {
    agent any

    tools {
        jdk 'OpenJDK11'
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '5'))
    }

    stages {
        stage('Main branch release') {
            when { 
                branch 'main' 
            }
            steps {
                echo "Building branch ${env.BRANCH_NAME}"
                sh "mkdir -p cnf/release"
                sh "mkdir -p cnf/release-ws"
                sh "./gradlew clean build release -Drelease.dir=$JENKINS_HOME/repo.gecko/release/org.geckoprojects.bnd.template --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "mkdir -p $JENKINS_HOME/repo.gecko/bndtemplates/org.geckoprojects.bnd.template"
                sh "rm -rf $JENKINS_HOME/repo.gecko/bndtemplates/org.geckoprojects.bnd.template/*"
                sh "cp -r cnf/release-ws/* $JENKINS_HOME/repo.gecko/bndtemplates/org.geckoprojects.bnd.template"
            }
        }
        stage('Snapshot branch release') {
            when { 
                branch 'snapshot'
            }
            steps  {
                echo "Building branch ${env.JOB_NAME}"
                sh "mkdir -p cnf/release"
                sh "./gradlew release --info --stacktrace -Dmaven.repo.local=${WORKSPACE}/.m2"
                sh "mkdir -p $JENKINS_HOME/repo.gecko/snapshot/org.geckoprojects.bnd.template"
                sh "rm -rf $JENKINS_HOME/repo.gecko/snapshot/org.geckoprojects.bnd.template/*"
                sh "cp -r cnf/release/* $JENKINS_HOME/repo.gecko/snapshot/org.geckoprojects.bnd.template"
            }
        }
    }

}