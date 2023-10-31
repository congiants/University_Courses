#include <stdio.h>
#include <stdlib.h>

main()
{
	int i = 1, a = 0, counter = 0;

	for( ;counter<=10;counter++)
	{
		a = i * counter;
		printf("%d x %d = %d \n", i, counter, a);
		
		if (counter == 10)
		{
			counter = 0;
			i++;
		}
		if (i > 10)
		break;
	}
	
system("Pause");
}
