#include <main-proteus.h>

#byte PORTB = 0xF81
#byte PORTD = 0xF83

void main(){
set_tris_b(0xFF);

set_tris_d(0x00);

   while(TRUE){
      while(input(PIN_B4)){
         
      }
      
      delay_ms(50);
      
      while(input(PIN_B4) == 0){
         
      }
      
      delay_ms(50);
      
      PORTD = PORTD +1;
   }
}
