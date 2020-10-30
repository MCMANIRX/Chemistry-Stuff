@ECHO OFF
CLS

:begin

ECHO 1. Atoms, mols, g converter
ECHO 2. Formula weight calculator (with % composition)
ECHO 3. Standard deviation calculator
ECHO 4. Stoichiometry calculator
ECHO 5. Credits
ECHO 6. Exit
ECHO.

cd %~dp0\chemprograms

CHOICE /C 123456 /M "Enter your choice:"

:: Note - list ERRORLEVELS in decreasing order
IF ERRORLEVEL 6 GOTO realEnd
IF ERRORLEVEL 5 GOTO SwitchUser
IF ERRORLEVEL 4 GOTO sto
IF ERRORLEVEL 3 GOTO std
IF ERRORLEVEL 2 GOTO fwc
IF ERRORLEVEL 1 GOTO amg

:amg
java amg.java
GOTO End

:fwc
java Formulaweight.java
GOTO End

:std
java stddev.java
GOTO End

:sto
java Stochiometry.java
GOTO End

:SwitchUser
ECHO Mateo Smith, 2020
ECHO mjsmith11@aggies.ncat.edu #ncat24
GOTO End

:End
PAUSE
GOTO begin
:realEnd
