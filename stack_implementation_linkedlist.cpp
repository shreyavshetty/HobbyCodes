#include<iostream>
using namespace std;
struct Node
{
	int data;
	struct Node *next;
}*root = NULL;
void push(int n)
{
	Node *cur = new Node;
	cur->data = n;
	cur->next = NULL;
	if(root == NULL)
	{
		cout<<"right place1"<<endl;
		root = cur;
	}
	else
	{
		cout<<"right place2"<<endl;
		Node *temp;
		temp = root;
		root = cur;
		cur->next = temp;		
	}	
}
void display()
{
	Node *temp = root;
	while(temp != NULL)
	{
		cout<<temp->data<<" ";
		temp = temp->next;
	}
	cout<<endl;
}
void pop()
{
	if(root == NULL)
	{
		cout<<"Empty List"<<endl;
	}
	else
	{
		Node *temp = root;
		root = temp->next;
		delete(temp);
	}	
}
bool isEmpty()
{
	if(root == NULL)
	{
		return true;
	}
	else
	{
		return false;
	}
}

int main()
{
	push(10);
	display();
	push(89);
	display();
	push(78);
	display();	
	pop();
	display();
	cout<<isEmpty()<<endl;
	return 0;
}

