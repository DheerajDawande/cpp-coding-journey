# Day 1 🚀

## Problem 1: Sum of Two Numbers

### Code:
```cpp
#include <iostream>
using namespace std;

int main()
{
int a,b;
cout<<"Enter First Number : ";
cin>>a;
cout<<"Enter Second Number : ";
cin>>b;

cout<<"Sum of Numbers is :"<<a+b<<endl;
return 0;
}


## Problem 2: Check Positive or Negative

### Code:
```cpp
#include <iostream>
using namespace std;

int main()
{
    int a;
    cout << "Enter Number : ";
    cin >> a;

    if (a > 0) {
        cout << "Number is: " << a << " is positive";
    }
    else if (a == 0) {
        cout << "Number is: " << a << " = Zero" << endl;
    }
    else {
        cout << "Number is: " << a << " is negative" << endl;
    }

    return 0;
}






























