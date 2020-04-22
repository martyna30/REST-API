call runcrud.bat gradlew build
if "%ERRORLEVEL%" == "0" goto start
echo.
echo GRADLEW BUILD has errors - breaking work
goto fail

:start
start chrome http://localhost:8080/crud/v1/task/getTasks
goto end

:fail
echo.
echo There were error

:end
echo.
echo Work is finished.