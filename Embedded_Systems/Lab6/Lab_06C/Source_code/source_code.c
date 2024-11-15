#include <main.h>
#byte PORTB         =0xF81    
                              
void init (void);             
void timer0_int(void);        
int16 counter1=2;  
int16 counter2=3;
int16 counter3=4;  
int16 counter4=6; 
                             
void main(){            
   init();                       
   while (TRUE){}
}

#INT_TIMER0                  

void timer0_int(void){
   set_timer0(60858);                                  
   counter1--;
   counter2--;
   counter3--;
   counter4--;
   if (counter1==0){
         counter1=2;
         PORTB=PORTB^0b00000001;              
   }
   
   if (counter2==0){
         counter2=3;
         PORTB=PORTB^0b00000010;              
   }
   
   if (counter3==0){
         counter3=4;
         PORTB=PORTB^0b00000100;              
   }
   
   if (counter4==0){
         counter4=6;
         PORTB=PORTB^0b00001000;              
   }   
}       

                             
void init (void) {       

   SETUP_TIMER_0(T0_INTERNAL | T0_DIV_64 ); 
   
   set_timer0(60858);                       
   
   enable_interrupts(INT_TIMER0);
   
   enable_interrupts(GLOBAL);
   
   set_tris_b(0x00);
   
   PORTB=0x00;                              
   }
