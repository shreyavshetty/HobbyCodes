#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int display(int *a,int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	}
}
int mergesort(int *a,int l,int r)
{
	int mid;
	if(l<r)
	{
		mid=floor((l+r)/2);
		mergesort(a,l,mid);
		mergesort(a,mid+1,r);	
		merge(a,l,mid,r);
	}
	else
	{
		return;
	}
}
int merge(int *a,int l,int mid,int r)
{
	int b[20];
	int i,j,k;
	k=0;
	i=l;
	j=mid+1;
	while(i<=mid && j<=r)
	{
		if(a[i]>a[j])
		{
			b[k]=a[j];
			k++;
			j++;
		}
		else
		{
			b[k]=a[i];
			k++;
			i++;
		}
	}
	while(i<=mid)
	{
		b[k]=a[i];
		k++;
		i++;
	}
	while(j<=r)
	{
		b[k]=a[j];
		k++;
		j++;
	}
	for(i=r; i >= l; i--)
  	{
    		a[i] = b[--k];        // copying back the sorted list to a[]
  	} 

}
		
int main()
{
	int n=20,l,r;
	int a[20]={90,45,33,22,11,3,5,190,988,34,21,36,245,24,76,32,76,89,67,89};
	l=0;
	r=19;
	mergesort(a,l,r);
	display(a,n);
}

