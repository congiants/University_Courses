#include <main-proteus.h>
#byte PORTB         =0xF81    
                              
void init (void);             
void timer0_int(void);        
int16 counter1=20;            
                              
void main(){            
   init();                       
   while (TRUE){}
}

#INT_TIMER0                  

void timer0_int(void){
   set_timer0(63661);                                  
   counter1--;
   if (counter1==0){
         counter1=20;
         PORTB=PORTB^0b11111111;              
   }            
   }

                             
void init (void) {       

   SETUP_TIMER_0(T0_INTERNAL | T0_DIV_64 ); 
   
   set_timer0(63661);                       
   
   enable_interrupts(INT_TIMER0);
   
   enable_interrupts(GLOBAL);
   
   set_tris_b(0x00);
   
   PORTB=0x00;                              
}
