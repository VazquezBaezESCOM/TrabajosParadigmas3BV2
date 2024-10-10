#include <iostream>
using namespace std;
#include <string>

int parentesis(string);

int main(){
  string a ;
  cout<<"Ingresa parentesis: ";
  cin >> a;
  cout<<endl<<a[0];
  int n; 
  n  = parentesis(a)*2;
  cout<<"\nLos caracteres () se repiten \t " << n<< " veces"<<endl ; 
  return 0;
}

int parentesis(string a){
  int n = sizeof(a);
  int j = 0; //contador para los parentesis
  for(int i = 0 ; i < n ; i++  ){
    if( (a[i] == '(' ) && (a[i+1] == ')')){
      j++;
      i++;
    }
  }
  return j;
} 



