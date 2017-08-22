#include <ctype.h>
#include <string.h>


int strcmpic(char *str1, char *str2)
{
	int cont = 0;
	int x,y;
	for (int i = 0; i < strlen(str1); ++i)
	{
		x = tolower(str1[i]);
		y = tolower(str2[i]);
		if( x == y)
		{
			cont++;
			if(cont == strlen(str1))
			{
				return 0;
			}
		}
		else
		{
			return x;
		}
	}
}