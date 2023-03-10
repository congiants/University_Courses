/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 10.1
HMEROMHNIA : 16/1/2022
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <cstring>

struct ypallhlos
{
	char onoma[50];
	int am;
	int eidosP;
	int oresYp;
	double basikosM;
};

ypallhlos gemismaPedion (char o[50], int am, int eidosP, int oresYp, double basikosM)
{
	struct ypallhlos yp;
	strcpy (yp.onoma, o);
	yp.am = am;
	yp.eidosP = eidosP;
	yp.oresYp = oresYp;
	yp.basikosM = basikosM;
	return yp;
}

void emfanishPedion(ypallhlos yp)
{
	printf("\nOnoma: %s \nArithmos Mitroou: %d \nEidos Ptyxioy: %d \nOres Yperorias: %d \nBasikos Misthos: %lf\n", yp.onoma, yp.am, yp.eidosP, yp.oresYp, yp.basikosM);
}

void findTMisthos(ypallhlos yp)
{
	double telikosM;
	double temp;
	temp = (double)yp.oresYp * 20.0;
	switch(yp.eidosP)
	{
		case(1):
			telikosM = yp.basikosM + temp  + 300.0;
			break;
		case(2):
			telikosM = yp.basikosM + temp  + 150.0;
			break;
		case(3):
			telikosM = yp.basikosM + temp + 100.0;
			break;
		case(4):
			telikosM = yp.basikosM + temp + 50.0;
			break;
		case(5):
			telikosM = yp.basikosM + temp + 0.0;
			break;
	}
	printf("\nTelikos Misthos: %lf\n", telikosM);
}

double returnTMisthos(ypallhlos yp)
{
	double telikosM;
	double temp;
	temp = (double)yp.oresYp * 20.0;
	switch(yp.eidosP)
	{
		case(1):
			telikosM = yp.basikosM + temp  + 300.0;
			break;
		case(2):
			telikosM = yp.basikosM + temp  + 150.0;
			break;
		case(3):
			telikosM = yp.basikosM + temp + 100.0;
			break;
		case(4):
			telikosM = yp.basikosM + temp + 50.0;
			break;
		case(5):
			telikosM = yp.basikosM + temp + 0.0;
			break;
	}
    return telikosM;
}

void findMaxTM (ypallhlos yp1, ypallhlos yp2)
{
	if (returnTMisthos(yp1) > returnTMisthos(yp2))
	{
		printf("Telikos Misthos Ypalliloy 1: %lf > Teliko Mistho Ypalliloy 2: %lf\n", returnTMisthos(yp1), returnTMisthos(yp2));
	}
	else
	{
		printf("Telikos Misthos Ypalliloy 1: %lf < Teliko Mistho Ypalliloy 2: %lf\n", returnTMisthos(yp1), returnTMisthos(yp2));	
	}
}

void swapYp1Yp2 (ypallhlos yp1, ypallhlos yp2)
{
	struct ypallhlos temp = yp2;
	yp2 = yp1;
	yp1 = temp;
}

main()
{
	char onoma[50];
	int am;
	int eidosP;
	int oresYp;
	double basikosM;
	double telikosM;
	struct ypallhlos yp1, yp2;
	
	yp1 = gemismaPedion("ioannou", 191234, 1, 7, 600.0);
	
	emfanishPedion(yp1);
	
	findTMisthos(yp1);
	
	printf("\nDose Onoma: ");
	scanf("%s", &onoma);
	printf("\nDose Arithmo Mitroou: ");
	scanf("%d", &am);
	printf("\nDose Eidos Ptyxioy: ");
	scanf("%d", &eidosP);
	printf("\nDose Ores Yperorias: ");
	scanf("%d", &oresYp);
	printf("\nDose Basiko Mistho: ");
	scanf("%lf", &basikosM);
	
	yp2 = gemismaPedion(onoma, am, eidosP, oresYp, basikosM);
	
	emfanishPedion(yp2);
	
	findTMisthos(yp2);
	
	findMaxTM(yp1, yp2);
	
	struct ypallhlos temp = yp2;
	yp2 = yp1;
	yp1 = temp;
	
	printf("\nYpallhlos 1 meta thn allagh: ");
	emfanishPedion(yp1);
	
	printf("\nYpallhlos 2 meta thn allagh: ");
	emfanishPedion(yp2);
	
	swapYp1Yp2(yp1, yp2);
	
	printf("\nYpallhlos 1 meta thn allagh: ");
	emfanishPedion(yp1);
	
	printf("\nYpallhlos 2 meta thn allagh: ");
	emfanishPedion(yp2);

system("Pause");	
}
