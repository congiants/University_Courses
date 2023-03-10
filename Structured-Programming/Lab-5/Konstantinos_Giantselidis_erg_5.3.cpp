/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 5.3
HMEROMHNIA : 12/12/2021
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include <stdio.h>
#include <stdlib.h>

main()
{
	int xoritikotita = 0, xaithousa = 0, epitirites = 0, arithmos_aithouson = 0, thesis;
	
	do
	{
	printf("Xoritikotita aithousas: ");
	scanf("%d", &xaithousa);
	
	if (xaithousa <= 15)
	{
		epitirites = epitirites + 1;
		printf("Apaitountai 1 epithrhtes \n");
	}
	
    else if ((xaithousa > 15) && (xaithousa <=23))
	{
		epitirites = epitirites + 2;
		printf("Apaitountai 2 epithrhtes \n");
	}
	
	else if (xaithousa > 23)
	{
		epitirites = epitirites + 3;
		printf("Apaitountai 3 epithrhtes \n");
	}
	
	xoritikotita = xoritikotita + xaithousa;
	arithmos_aithouson++;
	}
	while (xoritikotita < 100);
	
	thesis = epitirites + 100;
	
	printf("Synolo aithouson = %d \nSynolo Epitiriton = %d \nSynolo Theseon = %d \n", arithmos_aithouson, epitirites, thesis);
	
system("Pause");	
}
