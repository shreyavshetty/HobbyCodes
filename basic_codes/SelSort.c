#include<stdio.h>
#include<stdlib.h>
int swap(int *a,int *b)
{
	int temp;
	temp=*a;
	*a=*b;
	*b=temp;
}
int selsort(int *a,int n)
{
	int i,j,min;
	for(i=0;i<n-1;i++)//how many passes
	{
		min=i;
		for(j=i+1;j<n;j++)//for each pass
		{
			if(a[min]>a[j])
			{
				min=j;
			}
		}
		swap(&a[i],&a[min]);//optimize further by giving flags
	}
}
int display(int *a,int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	}
}
int main()
{
	int n=20;
	int a[20]={90,45,33,22,11,3,5,190,988,34,21,36,245,24,76,32,76,89,67,89};
	selsort(a,n);
	display(a,n);
}
