#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	int sum=0;
	do{
		int num;
		cin>>num;
		sum+=num;
		n--;
	}
	while(n>0);
	return 0;
}
