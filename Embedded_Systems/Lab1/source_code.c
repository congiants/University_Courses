#include<main-proteus.h>

#byte PORTB = 0xF81

void main(){
   set_tris_b(0x00);
   
   PORTB = 0xF0;
   
   while(true){
   }
}
