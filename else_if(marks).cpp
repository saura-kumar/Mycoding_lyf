#include<iostream>
using namespace std;
int main(){
	cout<<"enter your marks ";
	int marks;
	cin>>marks;
	if(marks>80){
		cout<<"A";
	}
	else if(marks>60){
		cout<<"B";
	}
	else if(marks>40){
		cout<<"C";
	}
	else if(marks<40){
		cout<<"fail";
	}
	else{
		cout<<"invalid number";
	}
	return 0;
}
