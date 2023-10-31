/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 5.4
HMEROMHNIA : 12/12/2021
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

main()
{
	int num = 0, thetikos =0, arnitikos = 0, ekatodiakosia = 0, ekthetis = 1;
	double apotelesma;
	
	do
	{
		printf("Give a number: \n");
        scanf("%d", &num);
        
        if (num % 2 == 0)
        {
		    do
	        {
		        apotelesma = pow(num, ekthetis);
		        printf("dynami = %d^%d = %lf \n",num, ekthetis, apotelesma);
		        ekthetis = ekthetis + 1;
	        }
	        while(ekthetis <= 10);
	        
	        ekthetis = 1;
	    }
		
		if (num >= 0)
		thetikos++;
		
		if (num < 0)
		arnitikos++;
		
		if ((num >= 100) && (num <= 200))
		ekatodiakosia++;
	}
	while((num <= 15) || (num >= 25));
	
	printf("Thetikoi = %d \nArnitikoi = %d \nAnamesa 100 kai 200 = %d \n", thetikos, arnitikos, ekatodiakosia);
	
system("Pause");
}
