#include<stdio.h>
#include<stdlib.h>
void main()
{
	int a[6]={13,11,12,13,12,12};
	int n=6;
	int i,j;
	int d[6];
	int r[6];
	int max,min;
	max=a[0];
	min=a[0];
	for(i=1;i<n;i++)
	{
		if(max<a[i])
			max=a[i];
		if(min>a[i])
			min=a[i];
	}
	printf("%d %d---min and max\n",min,max);
	for(i=0;i<=(max-min);i++)
	{
		d[i]=0;
	}
	for(i=0;i<n;i++)
	{
		d[a[i]-min]=d[a[i]-min]+1;
	}
	for(i=1;i<=(max-min);i++)
	{
		d[i]=d[i-1]+d[i];
	}
	for(i=n-1;i>=0;i--)
	{
		j=a[i]-min;
		r[d[j]-1]=a[i];
		d[j]=d[j]-1;
	}
	for(i=0;i<n;i++)
	{
		printf("%d\n",r[i] );
	}
}