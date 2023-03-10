#include<stdlib.h>
#include<stdio.h>

main()
{
 int x;
 printf ("Dose enan akeraio MH ARNHTIKO arithmo gia to x : ");
 scanf("%d", &x);
 
 switch(x)
 {
 	case 0:
 	    printf ("x = 0\n");
 	break;
 	    
 	case 1:
 	case 3:
 	case 5:
 		printf("x = perittos\n");
 	break;
 		
 	case 2:
 	case 4:
 		printf("x = artios\n");
 	break;
 	
 	default:
 		printf(" x > 5\n");
}

system("Pause");
}
