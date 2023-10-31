#include<stdlib.h>
#include<stdio.h>

main()
{
	int month;
	printf("Give integer: ");
	scanf("%d", &month);
	
	if (month == 1 || month == 2 || month == 12)
	    printf("Xeimonas \n");
	
	else if (month == 3|| month == 4|| month == 5)
	    printf("Anoiksi \n");
		
	else if (month == 6 || month == 7 || month == 8)
	    printf("Kalokairi \n");
	    
	else if (month == 9 || month == 10 || month == 11)
	    printf("Fthinoporo \n");
		
	else
	    printf("Mi apodektos minas \n");		    
	    
system("Pause");	    
}
