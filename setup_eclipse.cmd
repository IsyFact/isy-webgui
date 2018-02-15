set MAVEN_OPTS="-Xmx1024m"

call mvn -Dtest=false -DfailIfNoTests=false eclipse:clean eclipse:eclipse -U

pause