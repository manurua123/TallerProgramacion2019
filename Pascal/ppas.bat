@echo off
SET THEFILE=d:\documentos\facultad\1er año\taller programacion\pascal\untitl~1.exe
echo Linking %THEFILE%
d:\dev-pas\bin\ldw.exe  -s   -b base.$$$ -o "d:\documentos\facultad\1er año\taller programacion\pascal\untitl~1.exe" link.res
if errorlevel 1 goto linkend
goto end
:asmend
echo An error occured while assembling %THEFILE%
goto end
:linkend
echo An error occured while linking %THEFILE%
:end
