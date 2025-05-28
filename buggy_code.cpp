#include <iostream>
#include <vector>
using namespace std;

int findMax(vector<int>& nums) {
    int max = 0;  // Bug: if all values are negative, result will be wrong
    for (int i = 0; i < nums.size(); i++) {
        if (nums[i] > max) {
            max = nums[i];
        }
    }
    return max;
}

int main() {
    vector<int> data = {-4, -2, -7, -1};
    cout << "Max: " << findMax(data) << endl;
    return 0;
}