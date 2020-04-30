#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define SIZE 500
char table[SIZE];
void shiftTable(char b[])
{
	int i,j,m;
	m=strlen(b);
	
	for(i=0;i<SIZE;i++)
	{
		table[i]=m;
	}
	for(j=0;j<m-1;j++)
	{
		table[b[j]]=m-1-j;
	}
	
}
int horsepool(char t[],char p[])
{
	int m,i,k,n;
	n=strlen(t);
	printf("%d",n);
	m=strlen(p);
	i=m-1;
	while(i<n)
	{
		k=0;
		while((k<=m-1) && (p[m-1-k]==t[i-k]))
		{
			k=k+1;
		}
		if(k==m)
			return i-m+1;
		else
			i=i+table[t[i]];
	}
	return -1;
}
int main()
{
	
	char a[1000000], b[50];
	//char *str = (char *) malloc(sizeof(char) * SIZE);
 	int position;
	scanf("%[^\n]s",a);
	scanf("%s",b);
	printf("%s",a);
	//printf("%s",b);
	//clock_gettime(CLOCK_REALTIME, &start);
	shiftTable(b);	
	position = horsepool(a, b);
	//clock_gettime(CLOCK_REALTIME, &end);	
	if(position != -1)
    	printf(" %d\n", position + 1);
  	else
  	  	printf("Not found.\n");
  
	//printf("%lf ms\n", time_elapsed(&start, &end));
  
	return 0;

}
