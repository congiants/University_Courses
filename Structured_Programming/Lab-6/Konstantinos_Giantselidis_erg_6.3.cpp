/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 6.3
HMEROMHNIA : 19/12/2021
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include <stdio.h>
#include <stdlib.h>

main()
{
	int n = 0, tetragono = 0, c, prosthesi =0;
	
	for ( ; (5 > n) || (n > 20) ;)
	{
		printf("Give 5 <= n <= 20: ");
	    scanf("%d", &n);
	}
	
	tetragono = n * n;
	
	for (c=1; (c < ((2*n)-1)); c = c +2)
	{
		prosthesi = prosthesi + c;
	}
	
	prosthesi = prosthesi + ((2*n) -1);
	
	printf("1+3+5+…+(2*%d-1)=%d=%d^2=%d \n", n, prosthesi, n, tetragono);
	
return (0);
}
