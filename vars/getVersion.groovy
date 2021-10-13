#!/usr/bin/env groovy
import com.example.Docker

@NonCPS
def call (){
  def m ="Hello"
  // def m = readFile('pom.xml') =~ '<version>(.+)</version>'
  return m
 // def version= m[0][1]
 // env.IMAGE_NAME= "$version-$BUILD_NUMBER"
}

  