#include <iostream>
using namespace std;

class Rectangle {
    private:
        int width, height;
    public:
        void set_values(int, int);
        int area();
};

void Rectangle::set_values(int x, int y) {
    width = x;
    height = y;
}

int Rectangle::area() {
    return width * height;
}

int main() {
    Rectangle rect1;
    rect1.set_values(3 4); // Missing comma

    cout << "Area: " << rect1.area() << endl;

    for (int i = 0; i < 5; i++) // Missing braces
        cout << "Iteration: " << i << endl;

    cout << "Done!" << endl;
    return 0;
}