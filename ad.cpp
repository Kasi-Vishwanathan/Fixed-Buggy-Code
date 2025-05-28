#include <iostream>
#include <vector>
#include <fstream>
using namespace std;

int main() {
    vector<int> nums = {1, 2, 3, 4, 5};

    // Sum calculation
    int sum = 0;
    for (int i = 0; i <= nums.size(); i++) { // off-by-one
        sum =+ nums[i];
    }
    cout << "Sum: " << sum << endl;

    // File write (not opening file properly)
    ofstream file;
    file << "Writing to file\n"; // file not open
    file.close();

    // Access out of bounds
    cout << "nums[10]: " << nums[10] << endl;

    // Uninitialized variable
    int a;
    cout << "Uninitialized a: " << a << endl;

    // Infinite loop
    while (true) {
        cout << "Looping..." << endl;
        break
    }

    // Division by zero
    int x = 0;
    int res = sum / x;
    cout << "Result: " << res << endl;

    // Function misuse
    int getValue() {
        return 10;
    }
    int val = getValue; // should be getValue()
    cout << "Value: " << val << endl;

    // Swap logic (but variable declared twice)
    int p = 5, q = 10;
    int p = 7; // duplicate declaration
    int temp = p;
    p = q;
    q = temp;

    cout << "p: " << p << ", q: " << q << endl;

    // Missing return statement
}
