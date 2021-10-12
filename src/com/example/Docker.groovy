#!/usr/bin/env groovy
package com.example

class Docker implements Serializable {
    def script
    Docker(script){
        this.script=script
    }

    def buildDockerImage(String imageName){
        script.echo "Building Image...."
        script.sh "docker build -t $imageName ."

    }

    def DockerLogin(){
        script.withCredentials([script.usernamePassword(credentialsId:'docker-hub-account',usernameVariable:'user',passwordVariable:'pass')])
                {

                    script.sh "echo $script.pass |docker login --username $script.user --password-stdin"

                }
    }
    def DockerPush(String imageName){
        script.sh "docker push $imageName"
    }
}
