#include<stdlib.h>
#include<stdio.h>

main()
{
	int posoEisodhmatos, arithmosAkinhtwn, aforologhtoEisodhma;
	printf("Dose arithmo akiniton: ");
	scanf("%d", &arithmosAkinhtwn);
	printf("Dose poso eisodimatos: ");
	scanf("%d", &posoEisodhmatos);
	
	switch (arithmosAkinhtwn)
	{
	    case 0:
	    	aforologhtoEisodhma = 12000;
	    	printf("Aforologhto Eisodhma = %d", aforologhtoEisodhma);
	    break;
		
		case 1:
	    	aforologhtoEisodhma = 10000;
	    	printf("Aforologhto Eisodhma = %d", aforologhtoEisodhma);
	    break;
		
		case 2:
	    	aforologhtoEisodhma = 8000;
	    	printf("Aforologhto Eisodhma = %d", aforologhtoEisodhma);
	    break;
		
		case 3:
	    	aforologhtoEisodhma = 5000;
	    	printf("Aforologhto Eisodhma = %d", aforologhtoEisodhma);
	    break;
		
		default:
		    if (arithmosAkinhtwn < 0)
			    printf("Lathos arithmos akiniton");
			else
		        aforologhtoEisodhma = 0;
				printf("Aforologhto Eisodhma = %d", aforologhtoEisodhma);
	}			    				
}
