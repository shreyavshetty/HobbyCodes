#include<stdio.h>
#include<stdlib.h>
int insertionsort(int *a, int n)
{
	int i,j,v;
	for(i=1;i<n;i++)
	{
		v=a[i];
		j=i-1;
		while(j>=0 && v<a[j])
		{
			a[j+1]=a[j];
			j=j-1;
		}
		a[j+1]=v;
	}

}
int display(int * a,int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	}
}
int main()
{
	int a[10]={4,1,2,5,10,3,6,12,30,7};
	insertionsort(a,10);
	display(a,10);
}