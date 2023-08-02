#include<iostream>
using namespace std;

//Application for specific programming
int AdditionI(int i , int j)
{
    int result;
    result = i + j;
    return result;
}

int AdditionF(float i , float j)
{
    int result;
    result = i + j;
    return result;
}
int AdditionD(double i , double j)
{
    int result;
    result = i + j;
    return result;
}

int main()
{
    int i;
    float f;
    double d;

    i = AdditionI(10,11);
    cout<<i<<"\n";
    f = AdditionF(10.7f,89.5f);
    cout<<f<<"\n";
    d = AdditionD(10.8d,70.8d);
    cout<<d<<"\n";

    return 0;
}