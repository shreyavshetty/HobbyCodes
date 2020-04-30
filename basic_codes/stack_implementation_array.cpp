#include<iostream>
#include<cstdlib>
using namespace std;
#define MAX 1000
class Stack
{
	
	public:
		int top;
		int arr[MAX];
		Stack(){top = -1;}
		bool push(int n);
		int pop();
		int peep();
		bool isEmpty();
		void display();
};
bool Stack::push(int n)
{
	if(top>MAX)
	{
		cout<<"Size exceeded";
		return false;
	}
	else
	{
		arr[++top] = n;
		return true;	
	}
}
int Stack::pop()
{
	if(top == -1)
	{
		cout<<"Empty stack";
		return -1;
	}
	else
	{
		
		int num = arr[top--];
		return num;
	}
}
int Stack::peep()
{
	if(top == -1)
	{
		cout<<"Empty stack";
		return -1;
	}
	else
	{
		int num = arr[top];
		return num;
	}
}
void Stack::display()
{
	if(top == -1)
	{
		cout<<"Empty stack";
	}
	else
	{
		int i;
		for(i=0;i<=top;i++)
		{
			cout<<arr[i]<<" ";
		}
	}
}
bool Stack::isEmpty()
{
	if(top == -1)
	{
		cout<<"Empty stack";
		return true;
	}
	return false;
}
int main()
{
   Stack s; 
	s.push(12);
	s.push(15);
	s.push(17);
	s.display();
	cout<<s.peep()<<endl;
	cout<<s.pop()<<endl;
	s.display();
	return 0;
}
