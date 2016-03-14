#!/bin/bash

mvn clean install -P prod

sudo service tomcat7_teststore stop
	
sudo rm -rf /var/lib/tomcat7_teststore/webapps/ROOT*
sudo cp target/testresultstore.war /var/lib/tomcat7_teststore/webapps/ROOT.war

sudo service tomcat7_teststore start
	
sudo -H -u tomcat7 ln -s /1/ci-deploy/test_page_snapshots/ /var/lib/tomcat7_teststore/webapps/ROOT/test_page_snapshots
