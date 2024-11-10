#include <main.h>

#byte PORTB = 0xF81
#byte PORTD = 0xF83

void main(){
   
   set_tris_d(0xFF);
   set_tris_b(0x00);
   
   int a;
   int name = 9;
   int last_name = 12;

   while(true){
      a = PORTD;
      a = a + name + last_name;
      PORTB = a;
   }
}
