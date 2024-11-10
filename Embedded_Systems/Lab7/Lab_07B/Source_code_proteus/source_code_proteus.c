#include<main-proteus.h>
#include<flex_lcd-proteus.h>

#byte PORTB = 0xf81

void main(void){
   
   lcd_init();
   
   lcd_putc("\f");
   
   lcd_gotoxy(4,1);
   
   lcd_putc("MIKROLAB");
   
   while(TRUE){
   
   lcd_gotoxy(5,2);
   
   lcd_putc("*****");
   
     delay_ms(500);
   
   lcd_gotoxy(5,2);
   
   lcd_putc("     ");
   
      delay_ms(500);  
    }
}
