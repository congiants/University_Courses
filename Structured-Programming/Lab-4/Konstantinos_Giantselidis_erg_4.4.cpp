#include<stdlib.h>
#include<stdio.h>

main()
{
	int month;

    printf("Dose arithmo apo 1 - 12 \n");
    scanf ("%d", &month);

    switch (month)
{
	    case (1):
	    case (2):
	    case (12):
	        printf("Xeimonas \n");
	    break;
	
	    case (3):
	    case (4):
	    case (5):	
		    printf("Anoiksi \n");
	    break;
	
	    case(6):
	    case(7):
	    case(8):
		    printf("Kalokairi \n");
	    break;
	
	    case (9):
	    case (10):
	    case (11):
	        printf("Fthinoporo \n");
	    break;
	
	    default:
		    printf("Mi apodektos minas \n");
	}	
	
	
system("Pause");				
	
}
