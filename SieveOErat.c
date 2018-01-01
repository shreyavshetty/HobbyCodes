/*Sieve of eratosthanes-algo to find all prime nos. till n*/
#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int *prime(int n)
{
	int *a=malloc(sizeof(int)*n);
	int i,j;
	for(i=0;i<n;i++)
	{
		a[i]=1;
	}
	a[0]=0;
	a[1]=0;
	for(i=2;i<sqrt(n);i++)
	{
		for(j=2;j*i<n;j++)
		{
			a[i*j]=0;
		}
	}
	return a;
}
void display(int *a,int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		if(a[i]==1)
		{
			printf("%d\t",i);
		}
	}
}

	
int main()
{
	int n;
	printf("Enter the number:\n");
	scanf("%d",&n);
	int *a=malloc(sizeof(int)*n);
	a=prime(n);
	display(a,n);
}
