/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 2.2
HMEROMHNIA : 14/11/2021
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include <stdlib.h>
#include <stdio.h>

main()
{
	int N, cm, m, km, mt;
	
	printf("Give steps: ");
	scanf("%d", &N);
	
	cm = (N * 80);
	km = (cm / 100000);
	m = (cm % 100000);
	mt = (m / 100);
	cm = (m % 100);
	
	
	printf("%d km %d m %d cm \n", km, mt, cm);
	
	system("Pause");	
} 
