/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 9.1
HMEROMHNIA : 22/1/2022
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include <stdio.h>
#include <stdlib.h>
#define nmax 100 

void fillPin2D(int n, int P[][nmax])
{
	int i;
	int k;
    for(i=0; i < n; i++)
    {
    	for(k = 0; k < n; k++)
    	{
    		P[i][k] = (rand() % (10 - 1 + 1)) + 1;
		}
	}

}

void showPin2D(int n, int P[][nmax])
{
    int i, j;
    for ( i = 0; i < n; i++)
    {
        for ( j = 0; j < n; j++)
        printf("%3d ", P[i][j]);
        printf("\n");
    }
}

void findMeanLine (int P[][nmax], int avgLine[], int n)
{
	int i;
	int k;
	int sum = 0;
	int mean;
    for(i = 0; i < n; i++)
    {
    	for(k=0; k < n; k++)
    	{
    	    sum = sum + P[i][k];	
		}
		mean = sum / n;
		avgLine[i] = mean;
		sum = 0;
	}	
}

void showPinDouble1D(int avgLine[], int n)
{
	int i;
	int k = 1;
    for ( i = 0; i < n; i++)
    {
        printf("Average line %d = %d\n", k, avgLine[i]);
        k++;
    }
}

void findMeanCol (int P[][nmax], int avgCol[], int n)
{
	int i;
	int k;
	int sum = 0;
	int mean;
    for(i = 0; i < n; i++)
    {
    	for(k=0; k < n; k++)
    	{
    	    sum = sum + P[k][i];	
		}
		mean = sum / n;
		avgCol[i] = mean;
		sum = 0;
	}	
}

void showPinDouble1Dcol(int avgCol[], int n)
{
	int i;
	int k = 1;
    for ( i = 0; i < n; i++)
    {
        printf("Average colum %d = %d\n", k, avgCol[i]);
        k++;
    }
}
int findDSum (int P[][nmax], int n)
{
	int i;
	int sum = 0;
	int k = n - 1;
	for (i = 0; i < n; i++)
	{
		sum = sum + P[i][i];
	}
	for (i = 0; i < n; i++)
	{
		sum = sum + P[i][k];
		k--;
	}
	return sum;
}

main()
{
	int n;
	int i;
	
	do
	{
		printf("Give n > 5: ");
		scanf("%d", &n);
	}
	while (n <= 5);
	
	int P[n][nmax];
	int avgLine[n];
	int avgCol[n];
	
	fillPin2D(n, P);
	
	showPin2D(n, P);
	
	printf("==================================\n");
	
	findMeanLine(P, avgLine, n);
	
	showPinDouble1D(avgLine, n);
	
	printf("==================================\n");
	
	findMeanCol(P, avgCol, n);
	
	showPinDouble1Dcol(avgCol, n);
	
	printf("==================================\n");
	
	i = findDSum(P, n);
	printf("Athroisma diagonion = %d\n", i);
			
system("Pause");
}
