#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define MAXSIZE 200
void DFS(int *a[],int *b,int i);
double time_elapsed(struct timespec *start, struct timespec *end);
int n;    
 int count=0;
struct stack
{
    int stk[MAXSIZE];
    int top;
};
typedef struct stack STACK;
STACK s;
void push (int num)
{
    if (s.top == (MAXSIZE - 1))
    {
        printf ("Stack is Full\n");
        return;
    }
    else
    {
        
        s.top = s.top + 1;
        s.stk[s.top] = num;
    }
    
}
/*  Function to delete an element from the stack */
int pop ()
{
    int num;
    if (s.top == - 1)
    {
        printf ("Stack is Empty\n");
        return (s.top);
    }
    else
    {
        num = s.stk[s.top];
        //printf ("poped element is = %dn", s.stk[s.top]);
        s.top = s.top - 1;
    }
    return(num);
}
/*  Function to display the status of the stack */
void display ()
{
    int i;
    if (s.top == -1)
    {
        printf ("Stack is empty\n");
        return;
    }
    else
    {
        printf ("\n The status of the stack is \n");
        for (i = s.top; i >= 0; i--)
        {
            printf ("%d\n", s.stk[i]);
        }
    }
    printf ("\n");
} 
int main()
{
	struct timespec start;
   	struct timespec end;
    int i,j;
    //printf("Enter number of vertices:");
   
    scanf("%d",&n);
 	
     int *a[n],*b;	//b is the count visited array
     
     for(i=0;i<n;i++)
     {
     	a[i]=(int *)malloc(n*sizeof(int));
     }
     
     b=(int *)malloc(n*sizeof(int));
    //read the adjacency matrix
    //printf("\nEnter adjacency matrix of the graph:\n");
   
    for(i=0;i<n;i++)
       for(j=0;j<n;j++)
            scanf("%d",&a[i][j]);
 
    //b is initialized to zero
   for(i=0;i<n;i++)
        b[i]=0;
        
   
    //count =1;
   // count=0;
   	clock_gettime(CLOCK_REALTIME, &start);	
    for(i=0;i<n;i++)
    {
    	if(b[i]==0)
    	
    	{	//printf("Incrementing count in main()\n");	
    		count++;
		push(i);
		 display();
		printf("@");
    		DFS(a,b,i);
    	}
    }
    	clock_gettime(CLOCK_REALTIME, &end);	
    

    printf("Count is: %d\n",count);
    	printf("Duration: %lf ms\n",time_elapsed(&start,&end));
    return 0;
}
 
void DFS(int *a[],int *b,int i)
{

    int j;

 
    b[i]=1;
    
   
    for(j=0;j<n;j++)
       if(a[i][j]==1 && b[j]==0)
           { 
		push(j);
		display();
	    	DFS(a,b,j);
           	//printf("Incrementing count in function()\n");
           }
    pop();
    
}


double time_elapsed(struct timespec *start, struct timespec *end) {
	double t = 0.0;
	t = (end->tv_sec - start->tv_sec) * 1000;
	t += (end->tv_nsec - start->tv_nsec) * 0.000001;
	return t;
}
