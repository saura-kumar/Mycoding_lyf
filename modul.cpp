#include<iostream>
using namespace std;
int main(){
	int num;
	cout<<"Enter your number ";
	cin>>num;
	if((num%2==0)&&(num%3==0)){
		cout<<num<<endl;
	}
	return 0;
}
