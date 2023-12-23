## DELETES temp file from windows temp location
1. C:\Users\kanwa\AppData\Local\Temp 
2. C:\Windows\Temp 
3. C:\Windows\Prefetch

## STEPS to follow:
1. This is applicable only for `Windows OS`.
2. Update temp folder location in `Input.txt`
3. Run `run.bat` (This file run the jar file with Input.txt file).


## Run.bat
```shell
@echo off
java -cp "TempFileCleaner-1.0-SNAPSHOT.jar" "org.example.Main" Input.txt
pause
```