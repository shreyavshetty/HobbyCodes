#include<stdio.h>
#include<stdlib.h>
int binsearch(int *a,int key,int low,int high)
{
	if(high<=low)
	{
		return (key>a[low])?(low+1):low;
	}
	int mid=(low+high)/2;
	if(key==a[mid])
		return mid+1;
	if(key>a[mid])
		return binsearch(a,key,mid+1,high);
	return binsearch(a,key,low,mid-1);
}
int insertionsort(int *a, int n)
{
	int i,j,v,loc;
	for(i=1;i<n;i++)
	{
		v=a[i];
		j=i-1;
		loc=binsearch(a,v,0,j);
		while(j>=loc)
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