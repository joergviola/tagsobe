#!/bin/sh

sudo yum -y install git
sudo yum -y install java-1.6.0-openjdk-devel
sudo yum -y install tomcat6-webapps
sudo yum -y install ant

curl http://mirror.netcologne.de/apache.org//maven/binaries/apache-maven-3.0.3-bin.zip > maven.zip
unzip maven.zip

git clone git://github.com/joergviola/tagbrowser.git
cd tagbrowser
ant
cd 

mkdir log
