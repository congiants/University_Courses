/*
MATHIMA : DOMHMENOS PROGRAMMATISMOS
TMHMA : T 10
ERGASTHRIAKH ASKHSH : 7-8
HMEROMHNIA : 22/1/2022
ONOMA : KONSTANTINOS GIANTSELIDIS
ARITHMOS MHTRWOY : 2021026
*/

#include <stdio.h>
#include <stdlib.h>

int fillPin(int P[], int n)
{
	int i;
	for(i=0; i < n; i++)
	{
		P[i] = rand() % 10;
	}
}

void showPin(int P[], int n)
{
 	int i;
 	for(i=0; i < n; i++)
	{
		printf("%d ", P[i]);
	}
}

int findThesiMax(int P[], int n)
{
	int max = P[0];
	int thesiMax = 0;
	int i;
	
	for(i = 1; i < n; i++)
	{
		if (P[i] >= max)
		{
			max = P[i];
			thesiMax = i;
		}
	}
	return thesiMax;
}

int findThesiMin(int P[], int n)
{
	int min = P[0];
	int thesiMin = 0;
	int i;
	
	for(i = 1; i < n; i++)
	{
		if (P[i] <= min)
		{
			min = P[i];
			thesiMin = i;
		}
	}
	return thesiMin;
}

int countAvg(int P[], int n)
{
	int i;
	int sum = 0;
	int count = 0;
	double avg;
	
	for (i = 0; i < n; i++)
	{
		sum = sum + P[i];
	}
	
	avg = (double)sum / n;
	
	for(i = 0; i < n; i++)
	{
		if (P[i] > avg)
		{
			count++;
		}
	}
	return count;
}

void searchPThesiNum(int P[], int num, int n)
{
	int i;
	int vrethike = 0;
	for (i = 0; i < n; i++)
	{
		if (P[i] == num)
		{
			printf("\nnum = %d vrethike stin thesi %d", num, i);
			vrethike = 1;
		}
	}
	
	if (vrethike == 0)
	{
		printf("\nNOT FOUND\n");
	}
}

void bubbleDesc(int P[], int n)
{
	int k;
	int i;
	int temp;
	
	for(k = 0; k < n; k++)
	{
		for(i = 0; i < n-1; i++)
		{
			if(P[i] < P[i + 1])
			{
				temp = P[i + 1];
				P[i + 1] = P[i];
				P[i] = temp;
			}
		}
	}
}

int binSearchPThesiNumFthinousa(int P[], int n, int num)
{
    int L = 0, R = n-1, m;
    int thesiNum = -1;
    while (L <= R)
    {
        m = (L + R) / 2;
        if ( num == P[m] )
        {
            thesiNum = m;
            return thesiNum;
        }
        else
            if (P[m] > num)
                L = m + 1;
            else
                R = m - 1;
    }
    return thesiNum;
}

void swapPin (int P[], int A, int B)
{
	int temp = P[B];
	P[B] = P[A];
	P[A] = temp;
}

main()
{
	int n;
	int i;
	int num;
	int index;
	
	do
	{
	printf("Give integer 1 <= n <= 10: ");
	scanf("%d", &n);
    }
	while(n < 0 || n > 10);
	
	int P[n];
	
	fillPin(P, n);
	
	showPin(P, n);
	
	i = findThesiMax(P, n);
	printf("\nMax number: %d \nThesi Max Number: %d", P[i], i);
	
	i = findThesiMin(P, n);
	printf("\nMin number: %d \nThesi Min Number: %d", P[i], i);
	
	i = countAvg(P, n);
	printf("\nNumber of integers > average: %d", i);
	
	printf("\nGive integer num: ");
	scanf("%d", &num);
	
	searchPThesiNum(P, num, n);
	printf("\n");
	
	bubbleDesc(P, n);
	
	showPin(P, n);
	
	printf("\nGive integer num: ");
    scanf("%d", &num);

    i = binSearchPThesiNumFthinousa(P, n, num);
    
    if (i == -1)
    {
        printf("\nNOT FOUND\n");
	}
	else
	{
	    printf("\nnum = %d einai stin thesi: %d\n", num, i);	
	}
	
	index = rand() % (n-2);
	
	swapPin (P, index, index + 1);
	
	showPin(P, n);

system("Pause");
}
