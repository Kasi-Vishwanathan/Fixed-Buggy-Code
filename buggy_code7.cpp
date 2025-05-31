
#include <iostream>
using namespace std;

void printSumPairs(int arr[], int n, int target) {
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] + arr[j] == target) {
                cout << "Pair: " << arr[i] << "," << arr[j] << endl;
            }
        }
    }
}

int main() {
    int arr[] = {2, 4, 3, 5, 7};
    printSumPairs(arr, 5); // compilation error: missing argument
    return 0;
}
