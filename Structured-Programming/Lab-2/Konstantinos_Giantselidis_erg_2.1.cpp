/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 2.1
HMEROMHNIA : 14/11/2021
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include <stdlib.h>
#include <stdio.h>

main()
{
	double dmo, dsum;
	
	int i1, i2, isum;
	i1 = 5;
	i2 = 6;
	isum = i1 + i2;
	dmo = isum / 2;
	printf("isum = %d dmo = %f \n", isum, dmo);
	dsum = i1 + i2;
	dmo = dsum / 2;
	printf("dsum = %f dmo = %f \n", dsum, dmo);
	
	short s1, s2, ssum;
	s1 = 5;
	s2 = 6;
	ssum = s1 + s2;
	dmo = ssum /2;
	printf("ssum = %d dmo = %f \n", ssum, dmo);
	dsum = s1 + s2;
	dmo = dsum / 2;
	printf("dsum = %f dmo = %f \n", dsum, dmo);
	
	long l1, l2, lsum;
	l1 = 5;
	l2 = 6;
	lsum = l1 + l2;
	dsum = l1 + l2;
	dmo = dsum /2;
	printf("lsum = %d dmo = %f \n", lsum, dmo);
	dmo = dsum / 2;
	printf("dsum = %f dmo = %f \n", dsum, dmo);
	
	float f1, f2, fsum;
	f1 = 5;
	f2 = 6;
	fsum = f1 + f2;
	dmo = fsum / 2;
	printf("fsum = %f dmo = %f \n", fsum, dmo);
	dsum = f1 + f2;
	dmo = dsum / 2;
	printf("dsum  = %f dmo = %f \n", dsum, dmo);
	
	double d1, d2;
	d1 = 5;
	d2 = 6;
	dsum = f1 + f2;
	dmo = dsum / 2;
	printf("fsum = %f dmo = %f \n", dsum, dmo);
	dsum = d1 + d2;
	dmo = dsum / 2;
	printf("dsum  = %f dmo = %f \n", dsum, dmo);
	
	system("Pause");
}
