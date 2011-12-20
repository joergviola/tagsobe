# .bash_profile

# Get the aliases and functions
if [ -f ~/.bashrc ]; then
	. ~/.bashrc
fi

# User specific environment and startup programs

PATH=$PATH:$HOME
PATH=$PATH:~/apache-maven-3.0.3/bin

export PATH

export JAVA_HOME=/usr/lib/jvm/java-1.6.0-openjdk-1.6.0.0
export TOMCAT_HOME=/usr/share/tomcat6
