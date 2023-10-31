/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 6.6
HMEROMHNIA : 19/12/2021
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include <stdio.h>
#include <stdlib.h>

main()
{
	int n = 0, i;
	bool protos = true;
	
	for ( ; (2 > n) || (n > 100) ;)
	{
		printf("Give 2 <= n <= 100: ");
	    scanf("%d", &n);
	}
	
	for (i =2; (i <= 2) || (i > n/2); i++)
	{    
		if (n % i == 0)
	    {
	    	protos = false;
		}
		
		if (protos == true)
		{
			printf("n = %d einai protos \n", n);
		}
		
		if (protos == false)
		{
			printf("n = %d den einai protos \n", n);
		}	
    }
    
system("Pause");
}
