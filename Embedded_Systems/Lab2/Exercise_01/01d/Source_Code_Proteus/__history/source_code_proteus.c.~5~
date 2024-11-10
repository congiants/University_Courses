#include <main-proteus.h>

#byte PORTB = 0xF81
#byte PORTD = 0xF83

void main(){
   
   set_tris_d(0xFF);
   set_tris_b(0x00);
   
   int a;

   while(true){
      a = PORTD;
      a = a/2;
      PORTB = a;
   }
}
