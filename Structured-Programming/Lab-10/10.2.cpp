/* PX Supermarket gia tin eksetastiki tou erg. Sigoura tha exei kai taksinomisi. Min, Max gia struct pinaka. Vres tin proti fora pou emfanizetai o TM = 720 px. Ksana ask 7-8. Mallon oxi seiriaki anazitisi alla des tin */

#include <stdio.h>
#include <stdlib.h>
#include <cstring>

struct ypallhlos
{
	char onoma[50];
	int aM;
	int eidosP;
	int oresY;
	double basikosM;
	double telikosM;
};

struct ypallhlos gemismaPedion(char o[], int aM, int eidosP, int oresY, double basikosM)
{
	struct ypallhlos yp;
	strcpy(yp.onoma, o);
	yp.aM = aM;
	yp.eidosP = eidosP;
	yp.oresY = oresY;
	yp.basikosM = basikosM;
	return yp;
}

double returnTMisthos(ypallhlos yp)
{
	switch(yp.eidosP)
	{
		case(1):
			yp.telikosM = yp.basikosM + (yp.oresY * 20.0) + 300;
			break;
		case(2):
			yp.telikosM = yp.basikosM + (yp.oresY * 20.0) + 150;
			break;
		case(3):
			yp.telikosM = yp.basikosM + (yp.oresY * 20.0) + 100;
			break;
		case(4):
			yp.telikosM = yp.basikosM + (yp.oresY * 20.0) + 50;
			break;
		default:
			yp.telikosM = yp.basikosM + (yp.oresY * 20.0);
	    return yp.telikosM;
	}
}
	
void telikosMisthosOlon(ypallhlos yp[], int n)
{
	int i;
	for (i=0; i < n; i++)
	{
		yp[i].telikosM = returnTMisthos(yp[i]);
	}
}

void emfanishPedion(ypallhlos yp[], int n)
{
	int i;
	for(i=0; i < n; i++)
	{
		printf("Onoma: %s \n", yp[i].onoma);
	    printf("AM: %d \n", yp[i].aM);
	    printf("Eidos Ptyxiou: %d \n", yp[i].eidosP);
	    printf("Ores Yperorias: %d \n", yp[i].oresY);
        printf("Basikos Misthos: %lf \n", yp[i].basikosM);
	    printf("Telikos Misthos: %lf \n", yp[i].telikosM);
	}
	
}

void swapYp1Yp2 (ypallhlos yp[], int i, int j)
{
	struct ypallhlos temp = yp[j];
	yp[j] = yp[i];
	yp[i] = temp;
}

int returnThesiMaxTM(ypallhlos yp[], int n)
{
	int i;
	int maxthesi = 0;
	double max;
	max = yp[0].telikosM;
	for(i = 0; i < n - 1; i++)
	{
		if (yp[i].telikosM > max)
		{
			max = yp[i].telikosM;
			maxthesi = i;
		}
	}
	return maxthesi;
}

main()
{
	char onoma[50];
	int aM;
	int eidosP;
	int oresY;
	double basikosM;
	double telikosM;
	int n;
	int i;
	int index;
	
	do
	{
		printf("Give me n <= 50: ");
	    scanf("%d", &n);
	}
	while(n > 50 || n < 0);
	
	struct ypallhlos yp[n];
	
	for (i = 0; i < n; i++)
	{
		printf("Onoma: ");
		scanf("%s", onoma);
	    printf("\nAM: ");
	    scanf("%d", &aM);
	    printf("\nEidos Ptyxiou: ");
	    scanf("%d", &eidosP);
	    printf("\nOres Yperorias: ");
	    scanf("%d", &oresY);
	    printf("\nBasikos Misthos: ");
	    scanf("%lf", &basikosM);
	    
	    yp[i] = gemismaPedion(onoma, aM, eidosP, oresY, basikosM);
	}
	
	telikosMisthosOlon(yp, n);
	
	emfanishPedion(yp, n);
	
	index = rand() % (n-2);
	
	swapYp1Yp2 (yp, index, index + 1);
	
	printf("\nPinakas after Swap yp[%d] <--> yp[%d]\n", index, index+1);
	
	emfanishPedion(yp, n);
	
	i = returnThesiMaxTM(yp, n);
	
	printf("Ypallhlos me megisto mistho:\n");
	printf("Onoma: %s \n", yp[i].onoma);
	printf("AM: %d \n", yp[i].aM);
	printf("Eidos Ptyxiou: %d \n", yp[i].eidosP);
	printf("Ores Yperorias: %d \n", yp[i].oresY);
    printf("Basikos Misthos: %lf \n", yp[i].basikosM);
	printf("Telikos Misthos: %lf \n", yp[i].telikosM);
	
system("Pause");		
}
