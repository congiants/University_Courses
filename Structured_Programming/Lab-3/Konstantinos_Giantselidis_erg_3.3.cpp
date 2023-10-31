/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 3.3
HMEROMHNIA : 21/11/2021
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include<stdlib.h>
#include<stdio.h>

main() 
{
	int age, weight, height;
	double heightm, bmi;
	
	printf("Age: \n");
	scanf("%d", &age);
	
	printf("Weight: \n");
	scanf("%d", &weight);
	
	printf("Height: \n");
	scanf("%d", &height);
	
	heightm = ((double)height) / 100;
	
	if (age > 18)
	{
		heightm = ((double)height) / 100;
		bmi = weight / (heightm * heightm);
		printf("BMI = %lf \n", bmi);
		
		if (bmi < 18.5)
		    printf("Adynato atomo \n");
		else if (bmi >= 18.5 && bmi < 25.0)
		    printf("Kanoniko atomo \n");
		else if (bmi >= 25.0 && bmi < 30.0)
		    printf("Vary atomo \n");
		else if (bmi > 30.0)
		    printf("Poly vary atomo \n");
	}
	else
	    printf("Den mporei na  emfanistei to BMI \n");
	
    system("Pause");	
}
