#include <main-proteus.h>

#byte PORTB = 0xF81

void main(){

   set_tris_b(0x00);

   while(true){
      PORTB = 0x00;
      delay_ms(200);
      PORTB = 0xFF;
      delay_ms(200);
   }

}