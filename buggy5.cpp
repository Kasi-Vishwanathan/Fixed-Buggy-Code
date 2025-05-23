#include <iostream>
#include <fstream>
using namespace std;

void writeFile(char *filename) {
    ofstream fout(filename);
    for (int i = 1; i <= 5; i++)
        fout << "Line " << i << endl;
    fout.close();
}

void readFile(char *filename) {
    ifstream fin(filename);
    char line[100];

    while (!fin.eof()) { // Bug: unreliable EOF pattern
        fin.getline(line, 100);
        cout << line << endl;
    }

    // Bug: forgot to close file
}

int main() {
    char fname[] = "sample.txt";
    writeFile(fname);
    readFile(fname);
    return 0;
}