#include<stdio.h>
#include<time.h>
#define size  10

double time_elapsed(struct timespec *start, struct timespec *end) {
	double t = 0.0;
	t = (end->tv_sec - start->tv_sec) * 1000;
	t += (end->tv_nsec - start->tv_nsec) * 0.000001;
	return t;
}

int i,f,r,u;
int findcomp();
 int visit[10];
 int q[10];
 void creategraph(int n);
 int dfs(int);
 int a[10][10],n,k;
 int order[10];

int  main()
 {
   int v;
   k=0;
   struct timespec start;
	struct timespec end;
   printf("count:");
   scanf("%d",&n);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            

   creategraph(n);
   clock_gettime(CLOCK_REALTIME, &start);
  int c = findcomp();  
   clock_gettime(CLOCK_REALTIME, &end);
   printf("%d \n",c);
   printf("%lf ms\n", time_elapsed(&start, &end));
   return 0;
   }
   
    //inserting in the end of the queue 
    int qinsert(int x)
    {
       if(r==size-1)//check for queue full
       {
          printf("Queue full\n");
           return -1;
       }
       else
       {
          (r)++;
          q[r]=x;
           if(f==-1)
              f=0;
          return 1;  
       }
   } 
   
   //deleting from the front of the queue
     int qdelete()
     {  
        int x;
        if(f==-1)
         {  
           printf("Empty queue \n");
           return -1;
          }
        else
           {
             x=q[f];
             if(f==r)//only one element
               f=r=-1;
              else
               (f)++;
              return x;
             
           }
 
        } 

int qisempty()
{
  if(f==-1)
    return 1;
}





  void creategraph(int n)
  {
    int i,j;
    for (i=0;i<n;i++)
	{
		for (j = 0;j<n;j++)
    {
        scanf("%d",&a[i][j]);
     }
  }
  }

 

  int bfs(int v)
  {
     f = r = -1;
     int w;
     visit[v]=1;
     qinsert(v);
     while(!qisempty())
     {
     u = qdelete();
     for(w=1;w<=n;w++)
     {
      if((a[u][w]==1)&&(visit[w]==0))
        {
           visit[w] = 1;
           qinsert(w);
        }
      }
      order[k++]=v;
   }      
   }
   
  int findcomp()
  {
  	int label = 0;
  	for(i = 0;i<=n;i++)
  		visit[i]  = 0;
  	for(i = 0;i<=n;i++)
  		if(visit[i] == 0)
  		{
  			++label;
  			bfs(i);
  		}
  	return label-1;
  }
  
 
