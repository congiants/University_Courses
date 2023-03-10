/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 3.5
HMEROMHNIA : 21/11/2021
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include<stdlib.h>
#include<stdio.h>

main()
{
	int misthos;
	double tmisthos, sos, unicef;
	
	printf("Arxikos misthos: \n");
    scanf("%d", &misthos);
    
    if (misthos <= 800)
	{
		sos = (5.0 / 100) * misthos;
		
		unicef = (4.0 / 100) * misthos;
		
		tmisthos = misthos - sos - unicef;
		
		printf("SOS: %lf \nUnicef: %lf \nTelikos misthos: %lf \n", sos, unicef, tmisthos);
	}
	 
	if (misthos > 800 && misthos <= 1200)
	{
		sos = (7.5 / 100) * misthos;
		
		unicef = (6.0 / 100) * misthos;
		
		tmisthos = misthos - sos - unicef;
		
		printf("SOS: %lf \nUnicef: %lf \nTelikos misthos: %lf \n", sos, unicef, tmisthos);
    }
    
    if (misthos > 1200 && misthos <= 2000)
	{
		sos = (9.5 / 100) * misthos;
		
		unicef = (8.0 / 100) * misthos;
		
		tmisthos = misthos - sos - unicef;
		
		printf("SOS: %lf \nUnicef: %lf \nTelikos misthos: %lf \n", sos, unicef, tmisthos);
	}
	
	if (misthos >= 2000)
	{
		sos = (12.0 / 100) * misthos;
		
		unicef = (11.0 / 100) * misthos;
		
		tmisthos = misthos - sos - unicef;
		
		printf("SOS: %lf \nUnicef: %lf \nTelikos misthos: %lf \n", sos, unicef, tmisthos);
	} 
	 
system("Pause");
}


