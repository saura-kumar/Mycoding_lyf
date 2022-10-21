#include<iostream>
using namespace std;
int main(){
	int a,b,c;
	cout<<"Enter a number";
	cin>>a;
	cout<<"Enter b number";
	cin>>b;
	cout<<"Enter c number";
	cin>>c;
	if(a>b){
		if(a>c){
			cout<<"a is greatest";
		}
		else{
			cout<<"c is greatest";
		}
		
	}
	else{
		if(b>a){
			cout<<"b is greatest";
		}
		else{
			cout<<"a is greatest"
	    }
	}
	return 0;
	
}
