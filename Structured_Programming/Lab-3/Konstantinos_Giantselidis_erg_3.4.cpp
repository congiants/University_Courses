/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 3.4
HMEROMHNIA : 21/11/2021
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include<stdlib.h>
#include<stdio.h>

main()
{
	int grade1, grade2, grade3, diafora, sum;
	double mo, mo2, mo3;
	
	printf("Grade 1: \n");
	scanf("%d", &grade1);
	
	printf("Grade 2: \n");
	scanf("%d", &grade2);
	
	if (grade1 > grade2)
	{
	    diafora = grade1 - grade2;
	
	    if (diafora <= 20)
	    {
		    sum = grade1 + grade2;
		    mo = ((double)sum) / 2;
		    mo2 = mo * 2;
		    mo3 = mo2 / 10.0;
		    printf("Vathmos: %lf \n", mo3);
	    }
	    else
	    {
	        printf("Grade 3: \n");
			scanf("%d", &grade3);
			sum = grade1 + grade2 + grade3;
		    mo = ((double)sum) / 3;
		    mo2 = mo * 2;
		    mo3 = mo2 / 10.0;
		    printf("Vathmos: %lf \n", mo3);
		}
    }
	
	if (grade1 < grade2)
	{
	    diafora = grade2 - grade1;
	    
	    if (diafora <= 20)
	    {
		    sum = grade1 + grade2;
		    mo = ((double)sum) / 2;
		    mo2 = mo * 2;
		    mo3 = mo2 / 10.0;
		    printf("Vathmos: %lf \n", mo3);
	    }
	    else
	    {
	        printf("Grade 3: \n");
			scanf("%d", &grade3);
			sum = grade1 + grade2 + grade3;
		    mo = ((double)sum) / 3;
		    mo2 = mo * 2;
		    mo3 = mo2 / 10.0;
		    printf("Vathmos: %lf \n", mo3);
	    }
    }
	system("Pause");
}
