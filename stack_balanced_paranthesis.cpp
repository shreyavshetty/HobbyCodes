#include<iostream>
#include<stack>
#include<string>
using namespace std;
/*
void showstack(stack <char> gq)
{
    stack <char> g = gq;
    while (!g.empty())
    {
        cout << '\t' << g.top();
        g.pop();
    }
    cout << '\n';
}
*/
int main()
{
	string userstring;
	cin >> userstring;
	int i;
	int flag = 1;
	int n = userstring.length();
	stack <char> p_match;
	for(int i =0;i<n;i++)
	{
		
		
		if(userstring[i]=='(' || userstring[i]=='{' || userstring[i]=='[')
		{
			p_match.push(char(userstring[i]));
		}
		else if(userstring[i]==')')
		{
			if(p_match.top() != '(')
			{
				flag = 0;
				cout<<"unbalanced"<<endl;
				return -1;
			}
			else
			{
				p_match.pop();
			}
		}
		else if(userstring[i]=='}')
		{
			if(p_match.top() != '{')
			{
				flag = 0;
				cout<<"unbalanced"<<endl;
				return -1;
			}
			else
			{
				p_match.pop();
			}
		}
		else if(userstring[i]==']')
		{
			if(p_match.top() !='[')
			{
				flag = 0;
				cout<<"unbalanced"<<endl;
				return -1;
			}
			else
			{
				p_match.pop();
			}
		}
		else
		{
			//do nothing;
		}
				
	}
	if(flag == 1)
	{
		cout<<"balanced";
	}
	return 0;
}
