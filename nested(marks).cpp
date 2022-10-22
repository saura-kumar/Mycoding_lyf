#include<iostream>
using namespace std;
int main(){
	int marks;
	cout<<"Enter your marks ";
	cin>>marks;
	
	if(marks>33){
		if(marks>80){
			cout<<"grasefully pass";
		}
		else{
			cout<<"pass";
		}
	}
	else{
		cout<<"fail";

	}
	return 0;
}
