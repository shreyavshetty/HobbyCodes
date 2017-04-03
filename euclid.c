#include<stdio.h>
#include<stdlib.h>
//euclid's algo
int gcdf(int a,int b)
{
	int temp;
	while(b!=0)
	{
		temp=a;
		a=b;
		b=temp%b;
		printf("a=%d,b=%d",a,b);
		gcdf(a,b);
	
	}
	return a;
}
int main()
{
	int a=366;
	int b=60;
	//int i=1;
	int gcd,lcm;
	gcd=gcdf(a,b);
	lcm=(a*b)/gcd;
	printf("gcd=%d,lcm=%d",gcd,lcm);
	/*while(i<=a && i<=b)
	{
		if(a%i==0 && b%i==0)
		{
			gcd=i;
			//printf("%d",i);
		}
		i++;
	}
	lcm=(a*b)/gcd;
	printf("gcd=%d,lcm=%d",gcd,lcm);
	
/* gcd for negative or posuitive numbers	
    int n1, n2;

    printf("Enter two integers: ");
    scanf("%d %d",&n1,&n2);

    // if user enters negative number, sign of the number is changed to positive
    n1 = ( n1 > 0) ? n1 : -n1;
    n2 = ( n2 > 0) ? n2 : -n2;

    while(n1!=n2)
    {
        if(n1 > n2)
            n1 -= n2;
        else
            n2 -= n1;
    }
    printf("GCD = %d",n1);

    return 0;*/

/* Recursive function to return gcd of a and b
int gcd(int a, int b)
{
    // Everything divides 0 
    if (a == 0 || b == 0)
       return 0;
 
    // base case
    if (a == b)
        return a;
 
    // a is greater
    if (a > b)
        return gcd(a-b, b);
    return gcd(a, b-a);
}*/


//For example, gcd(60, 24) can be computed as follows:gcd(m,n)=gcd(n,m%n) till m%n==0 return m
//gcd(60, 24) = gcd(24, 12) = gcd(12, 0) = 12.

}
	

