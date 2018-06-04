setlocal
echo Setting JAVA_HOME to %JAVA8_HOME%.
set JAVA_HOME=%JAVA8_HOME%
call mvnDebug clean install --fail-at-end
endlocal