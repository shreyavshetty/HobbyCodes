#include<stdio.h>
#include<string.h>
int strmatch(char *text, char *pattern)
{
	int l1=strlen(text);
	int l2=strlen(pattern);
	int i,j;
	for(i=0;i<l1-l2;i++)
	{
		j=0;
		while(j<l2 && pattern[j]==text[i+j])
		{
			j++;
		}
		if(j==l2)
		{
			return i;
		}
		
	}
	return -1;
}

int main()
{
	char text[100]="hello hatty haer haop hope";
	char pattern[10]="haop";
	int pos;
	pos=strmatch(text,pattern);
	if(pos!=-1)
	{
		printf("String matched at position=%d",pos);
	}
	else
	{
		printf("Not found");
	}
}

