#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n; int result=0;
	for(int i=1; i<=n; i++){
		if(i%2==0){
			result -= 1;
			
		}
		else{
			result += 1;
		}
		
	
	}
	cout<<result<<endl;
}
