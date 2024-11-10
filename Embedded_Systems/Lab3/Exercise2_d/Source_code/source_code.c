#include <main.h>
#byte PORTB = 0xF81
#byte PORTD = 0xF83

void push_button (void);

void main(){
set_tris_b(0xFF);

set_tris_d(0x00);

   while(TRUE){
   
   push_button();
   PORTD=PORTD+1; }}
   
   void push_button (void){
   
   while(INPUT(PIN_B4)){
   
   
   }
   delay_ms(50);
   
   while(INPUT(PIN_B4)==0){
   
   
   
   }
   delay_ms(50);
   
      
   }
