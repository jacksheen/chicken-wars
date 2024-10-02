/*
    PLEASE READ

    Open the search bar, and type 'cmd'
    Open the first result

    Type in 'g++ --version' to check if you have gcc

    If it is not valid then follow this helpful tutorial
    https://dev.to/gamegods3/how-to-install-gcc-in-windows-10-the-easier-way-422j

    You should now have gcc.

    Now follow the first step again

    now type in 'g++ /[file+path]/chicken_wars/cpp/main.cpp
    a.exe'

    Congrats! you have ran this code
*/

#include <iostream>
using namespace std;

void bark() {
    cout << "\nBark! Woof!";
}

int main() {
    string name = "Jeremy";
    cout << "Hello, " << name;
    bark();
    return 0;
}