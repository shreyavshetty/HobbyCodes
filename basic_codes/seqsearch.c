#include<stdio.h>
int seqsearch(int *a, int n,int key)
{
	int i=0;
	a[n]=key;
	while(a[i]!=key)
	{
		i++;
	}
	if(i<n)
	{
		return i;
	}
	return -1;
}
int main()
{
	int n=20;
	int a[20]={90,45,33,22,11,3,5,190,988,34,21,36,245,24,76,32,76,89,67,89};
	int key=7;
	int pos=seqsearch(a,n,key);
	if(pos!=-1)
	{
		printf("pos=%d",pos);	
	}
	else
	{
		printf("Not found");
	}
}

