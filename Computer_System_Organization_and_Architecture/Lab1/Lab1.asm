TITLE LAB1_(Create_the_function_F(N)=N^2-2N+1)


CODE SEGMENT
    ASSUME CS: CODE DS: DATA
    START:
    ; 1. Initialise the DATA SEGMENT
    ; Set the address of the DATA to DS register. The code segement needs
    ; to know where the variables are.
    MOV AX,DATA
    MOV DS,AX
    
    ; 2. Print the string to Screen
    ; 2.1 Find the address of the start of the string 
    LEA DX,MSG
    ; 2.2 Call DOS service 09H To print string in screen
    MOV AH,09H
    ; 2.3 Call DOS service 21H To interupt the process
    INT 21H
    
    ; 3. Calculate the function F(N)=N^2-2N+1
    
    ; Calculate N^2
    ; 3.1 Move N to AL
    MOV AL, N
    ; 3.2 Multiply AL with itself (Create N^2). Result is saved into AX
    MUL AL
    ; 3.3 Move AX to CX so it won't be lost after the next multiplication
    MOV CX, AX
    
    ; Calculate 2N
    ; 3.4 Move N to AL
    MOV AL, N
    ; 3.5 Move 2 to BL
    MOV BL, 2
    ; 3.6 Multiply BL with N. Result heads into AX
    MUL BL
    
    ; 3.7 Subtract from CX-AX (N^2 - N)
    SUB CX, AX
    
    ; 3.8 Increment by 1 (N^2 - N + 1)
    INC CX
              
    ; 3.9 Move CX to AX
    MOV AX, CX
      
    ; 3.10 Move 10 to CL
    MOV CL, 10
    ; 3.11 Divide AX by CL so result will not be a single two-digit number, but two one-digit numbers
    DIV CL
    
    ; 3.12 Move AX to BX for temporary storage
    MOV BX, AX
    
    ; 3.13 Move BL to DL
    MOV DL,BL
    ; 3.14 Add to DL 48 so the number turns into its ASCII equivalent 
    ADD DL,48
    ; 3.15 Move to AH the number 2 so the result can be printed
    MOV AH,2
    ; 3.16 Call DOS service 21H To interupt the process
    INT 21H
    
    ; 3.17 Move BH to DL
    MOV DL,BH
    ; 3.18 Add to DL 48 so the number turns into its ASCII equivalent 
    ADD DL,48
    ; 3.19 Move to AH the number 2 so the result can be printed
    MOV AH,2
    ; 3.20 Call DOS service 21H To interupt the process
    INT 21H 
    
    ; 4. Terminate Program: Call DOS service 04Ch to terminate program
    MOV AH,04CH
    INT 21H

CODE ENDS

DATA SEGMENT
    ; 1. Set value of N to 6
    N DB 6
    ; 2. Set value of MSG to "THE RESULT IS: "  
    MSG DB "THE RESULT IS: $"
DATA ENDS

END START