/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 6.5
HMEROMHNIA : 19/12/2021
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include <stdio.h>
#include <stdlib.h>

main()
{
	int n = 0, i, ginomeno;
	
	for ( ; (1 > n) || (n > 10) ;)
	{
		printf("Give 1 <= n <= 10: ");
	    scanf("%d", &n);
	}
	
	for (i =1; i <= 10 ; i++)
	{
		ginomeno = n * i;
		printf("%d * %d = %d \n", n, i, ginomeno);
	}

system("Pause");
}
