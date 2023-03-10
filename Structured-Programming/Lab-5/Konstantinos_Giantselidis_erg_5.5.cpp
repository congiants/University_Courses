/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 5.5
HMEROMHNIA : 12/12/2021
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include <stdio.h>
#include <stdlib.h>

main()
{
	int a, b, p;
	
	printf("Give a: \n");
	scanf ("%d", &a);
	
	printf("Give b: \n");
	scanf ("%d", &b);
	
	p = a * b;
	
	printf("a * b = %d \n", p);
	
	p = 0;
	
	while (b > 0)
	{
		if (b % 2 != 0)
		    p = p + a;
		    a = a * 2;
		    b = b / 2;
		    printf("a = %d, b = %d, p = %d \n", a, b, p);
	}
	
system("Pasue");
}
