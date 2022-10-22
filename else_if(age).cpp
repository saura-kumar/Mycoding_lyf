#include<iostream>
using namespace std;
int main(){
	int age;
	cout<<"Enter your age ";
	cin>>age;
	if(age<12){
		cout<<"you are child";
	}
	else if(age>18){
		cout<<"you are Adult";
	}
	else{
		cout<<"Teenager";
	}
	return 0;
}
