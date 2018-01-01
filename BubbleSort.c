#include<stdio.h>
#include<stdlib.h>
int swap(int *a,int *b)
{
	int temp;
	temp=*a;
	*a=*b;
	*b=temp;
}
int bubsort(int *a,int n)
{
	int i,j;
	for(i=0;i<n;i++)
	{
		int flag=0;
		for(j=0;j<n-i-1;j++)
		{	
			
			if(a[j]>a[j+1])
			{
				swap(&a[j],&a[j+1]);
				flag=1;
			}
		}
		if(flag==0)
			break;
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
	bubsort(a,n);
	display(a,n);
}
