#include<main.h>
#include<flex_lcd.h>
#byte PORTB = 0xf81


#byte PORTB = 0xf81

int counter;

int seconds;

void init(void){

   lcd_init();
   
   lcd_putc("\f");
   
   //lcd_gotoxy(5,1);
   
   //lcd_putc(" Seconds:");
   
  SETUP_TIMER_0(T0_INTERNAL | T0_DIV_64 );
   
   enable_interrupts(INT_TIMER0);   
   
   enable_interrupts(GLOBAL);
   
   set_timer0(56161);
   
   counter = 0;
   
   seconds =0;
}

void main(void){
   init();
   while(TRUE){}
}


#INT_TIMER0    

void int_timer_0(void){
   set_timer0(56161);
   
   if(counter == 8){
      lcd_putc("\f");
      lcd_gotoxy(5,2);
      printf(lcd_putc," Seconds= %d\n",seconds);
      seconds++;
   }
   
   counter++;
}
