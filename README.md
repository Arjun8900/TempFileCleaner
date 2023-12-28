## DELETES temp file from windows temp location
1. C:\Users\kanwa\AppData\Local\Temp 
2. C:\Windows\Temp 
3. C:\Windows\Prefetch

## Steps to follow:
1. This is applicable only for `Windows OS`.
2. Update temp folder's location in `Input.txt`
3. Run `run.bat` (This file run the jar file with Input.txt file).


## `run.bat` content
```shell
@echo off
java -cp "TempFileCleaner-1.0-SNAPSHOT.jar" "org.example.Main" Input.txt
pause
```

## Output
![Temp_File_Deleted](https://github.com/Arjun8900/TempFileCleaner/assets/30146648/2296eced-3e7b-4cd2-a7ca-fffa23d68016)
