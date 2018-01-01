#include<stdio.h>
#include<stdlib.h>
int peasant(int m,int n)
{
	int sum;
	while(m!=1)
	{
		if(m%2!=0)
		{
			sum=sum+n;
		}
		m=m/2;
		n=n*2;
	}
	sum=n+sum;
	return sum;
}	
int main()
{
	int n,m,p;
	scanf("%d %d",&m,&n);
	/*if(m>n)
	{
		p=peasant(m,n);
	}
	else
	{
		p=peasant(n,m);
	}*/
	p=peasant(m,n);
	printf("p=%d",p);
}

