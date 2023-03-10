#include <stdio.h>
#include <stdlib.h>
#define nmax 100 

void fillPin2D(int m, int n, int p[][nmax])

{
 int i,j;
 for ( i=0;i<=m-1;i++)
 for ( j=0;j<=n-1;j++)
 p[i][j] = (rand() % (10 - 1 + 1)) + 1;
}
void showPin2D(int m, int n, int p[][nmax])

{
 int i, j;
 for ( i=0;i<=m-1;i++)
 {
 for ( j=0;j<=n-1;j++)
 printf("%3d ", p[i][j]);
 printf("\n");
 }
}

void findMax(int m, int n, int p[][nmax])

{
 int i, j, max, lineMax, colMax, lineColMax;
 max = p[0][0];
 lineMax = 0;
 colMax = 0;
 for (i = 0;i <= m-1;i++)
 for ( j=0;j<=n-1;j++)
 if (p[i][j] >= max )
 {
 max = p[i][j];
 lineMax = i;
 colMax = j;
 }
 printf("max = %d in line %d and col %d\n", p[lineMax][colMax], lineMax,
colMax);
}
main()
{

 int i, j;
 int m, n;

 int p1[][nmax] = {{1,2},{3,4},{5,6}};
 
 do
 {
 printf("Give two integers m, n > 1 : ");
 scanf("%d %d", &m, &n);
 }
 while ( m <= 1 || n <= 1 );
 
 int p2[m][nmax];

 
 fillPin2D( m, n, p2);


 printf("p1 = \n");
 showPin2D( 3, 2, p1);


 printf("p2 = \n");
 showPin2D( m, n, p2);

 findMax( m, n, p2);
 system("Pause");
 }

