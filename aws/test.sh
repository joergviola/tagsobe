#!/bin/sh
# Usage: ./test.sh <git-repo>

rm -rf probe
git clone $1 probe
cd probe
./install.sh | tee ~/log/install.log

cd
java -Dfmt=java -jar tagbrowser/dist/tagsobe.jar `cat probe/probe.url` | tee ~/log/run.log

mail -s "tagsobe result" viola@objectcode.de <  ~/log/run.log

