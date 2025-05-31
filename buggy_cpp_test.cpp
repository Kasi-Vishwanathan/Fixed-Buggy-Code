#include <iostream>
using namespace std;

class Demo {
    public:
        int x;
        Demo() { x = 0; }

        void show() {
            cout << "Value: " << x << endl;
        }
};

int main() {
    Demo *d = NULL;
    d->show(); // Dereferencing NULL pointer

    int arr[3] = {10, 20, 30};
    for(int i=0; i<=3; i++) { // Out-of-bounds access
        cout << arr[i] << endl;
    }

    int *p = NULL;
    *p = 42; // Runtime error

    int a = 10, b = 0;
    cout << "Division: " << a/b << endl; // Division by zero

    for(int i=0; i<5; i++) // Missing braces
        cout << "i: " << i << endl;
        cout << "End of loop" << endl; // Incorrectly outside loop

    Demo d2;
    for(int i=0; i<3; i++) {
        cout << "Object value: " << d2.x << endl;
        d2.x++;
    }

    cout << "Program ends." << endl;
    return 0;
}
