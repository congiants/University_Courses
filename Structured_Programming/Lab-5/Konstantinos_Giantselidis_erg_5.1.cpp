/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 5.1
HMEROMHNIA : 12/12/2021
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

main()
{
	int num, ekthetis;
	double apotelesma;
	
	ekthetis = 1;
	
	while ((num < 2) || (num > 10))
	{
		printf("Give a number between 2 and 10 : \n");
        scanf("%d", &num);
	}
	
	while(apotelesma < 100)
	{
		apotelesma = pow(num, ekthetis);
		printf("dynami = %d^%d = %lf \n",num, ekthetis, apotelesma);
		ekthetis = ekthetis + 1;
	}
	
return 0;
}
