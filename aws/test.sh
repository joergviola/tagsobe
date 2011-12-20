#!/bin/sh
# Usage: ./test.sh <git-repo>

rm -rf probe
git clone $1 probe
cd probe
./install.sh | tee ~/log/install.log

cd
java -jar tagbrowser/dist/tagsobe.jar 1,2,3,4,5,7,10,12,15,17,20,25 100 `cat probe/probe.url` | tee ~/log/run.log 

