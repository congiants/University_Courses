#include<stdlib.h>
#include<stdio.h>

main()
{
    int a, b, c, temp;
	char praksh;
	
	printf("Give me a, b integers : \n");
    scanf("%d %d",&a, &b);
	
	printf ("Give me praksh \n");
	scanf (" %c", &praksh);
				
    switch(praksh)
	{
		case '+':
			    temp = a + b;
			    printf("%d + %d = %d \n", a, b, temp);
		    break;
		
		    case '-':
		    	temp = a - b;
		    	printf("%d - %d = %d \n", a, b, temp);
		    break;
			
			case '*':
			    temp = a * b;
				printf("%d * %d = %d \n", a, b, temp);
			break;		
			
			case '/':
				if (b == 0)
				    printf("b = 0 \n");
				else    
			        temp = a / b * 1.0;
				    printf("%d / %d = %.2f \n", a, b, temp);
	}
		    	
system("Pause");	
}
