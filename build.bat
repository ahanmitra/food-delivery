for %%I in (.) do set CurrDirName=%%~nxI
call title %CurrDirName%
call cls
call mvn clean
call mvn dependency:resolve
call mvn dependency:sources
call mvn dependency:resolve -Dclassifier=javadoc
call mvn compile
call mvn eclipse:eclipse -DdownloadSources -DdownloadJavadocs
call mvn package
call mvn install