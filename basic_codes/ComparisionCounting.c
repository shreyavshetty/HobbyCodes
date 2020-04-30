#include<stdio.h>
#include<stdlib.h>
void main()
{
	int a[6]={62,31,84,19,47,31};
	int i,j;
	int d[6];
	int r[6];
	int n=6;
	for(i=0;i<n;i++)
	{
		d[i]=0;
	}
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
				d[i]=d[i]+1;
			else
				d[j]=d[j]+1;
		}
	}
	for(i=0;i<n;i++)
	{
		r[d[i]]=a[i];
		d[i]=d[i]-1;
	}
	for(i=0;i<n;i++)
	{
		printf("%d\n",r[i] );
	}

}
