TITLE Lab2(Even_or_odd_inut)

CODE SEGMENT
    ASSUME CS: CODE DS: DATA
    START:
    ; 1. Initialise the DATA SEGMENT
    ; Set the address of the DATA to DS register. The code segement needs
    ; to know where the variables are.
    MOV AX, DATA
    MOV DS, AX
    
    ;2. I set BH to 0 in order to use it as a counter
    MOV BH, 0
    
input:    
        ;3. SHOW the MSG to call on the user to give a number
        LEA DX, MSG
        MOV AH, 09H
        INT 21H
        
        ;4. Input a character from the keyboard
        MOV AH , 08h
        INT 21H
        
        ;5. Compares if the keyboard input is smaller than the value. 0 If so it goes through v1 again.
        CMP AL, '0'
        JB INPUT
        
        ;6. Compares if the keyboard input is larger than the value 9. If so it goes through v1 again.
        CMP AL, '9'
        JA INPUT
    
        ;7. Move AL result to DL
        MOV DL, AL
        MOV AH, 02H
        INT 21H
           
        ;8. Compare AL (keybaord input) with 0. If so then go to zero   
        CMP AL ,'0'
        JE ZERO
        
        ;9 Move 0 to AH so it can be used to determine if AL is even 
        MOV AH, 0
        MOV BL, 2
        DIV BL
        
        ;10. Compare AH with 0. If it is 0, then go to even
        CMP AH, 0
        JE EVEN
        
        ;11. Since previous ifs have not been correct show odd num message
        LEA DX, MSG_ODD
        MOV AH, 09H
        INT 21H
        
        ;12. Go to check
        JMP CHECK
        
        ;13. Since the input is even print the input message  
even:
        LEA DX, MSG_EVEN
        MOV AH, 09H
        INT 21H
        ;14. Go to check
        JMP CHECK
        
        ;15. Since the input is even print the input message
zero:
        LEA DX, MSG_ZERO
        MOV AH, 09H
        INT 21H
       
       ;16. Every time we go into check BH is increase by 1.
       ;While BH < 5 go back to input  
check:
        INC BH
        CMP BH, 5
        JB input
         
        ;17. Stop the program
        MOV AH, 4CH
        INT 21H                               
    
CODE ENDS

DATA SEGMENT
    ;18. Messages that will be printed on the screen
    MSG DB "ENTER A SINGLE DIGIT NUMBER BETWEEN 0-9: ",10,13,"$"
    MSG_ZERO DB 10,13,"THE NUMBER IS 0",10,13,"$"    
    MSG_EVEN DB 10,13,"THE NUMBER IS EVEN",10,13,"$"   
    MSG_ODD DB 10,13,"THE NUMBER IS ODD",10,13,"$"
    
DATA ENDS

END START