#include <iostream>
#include <cmath>
#include <string>
using namespace std;

//Compiler version g++ 6.3.0

int main()
{
  int x = 1; 
  bool p = true;
    for (int i = 0; i < 1000; i++) {
      for (int y = 0; y < x; y++) {
        cout << "*";
        if (x <= 5) {
          cout;
        }
        else if (x > 5) {
          x = 4;
          p = false;
        }
      }
      if (p == true) {
        x+=1;
      }
      
      else if (p == false) {
        if (x == 1) {
          p = true;
        }
        else {
          x-=1;
        }
      }
      cout << endl;
    }
    
    return 0;
}