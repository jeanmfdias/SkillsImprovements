#include <iostream>
#include <string>
#include <map>

using namespace std;

string secretWord = "WATERMELON";

map<char, bool> shots;

bool wordIsPresent(char shot) {
    for (char letter : secretWord) {
        if (letter == shot) {
            return true;
        }
    }
    return false;
}

int main() {
    bool noHit = true;
    bool noLose = true;

    while (noHit && noLose) {
        for (char letter : secretWord) {
            if (shots[letter]) {
                cout << letter << " ";
            } else {
                cout << "_ ";
            }
        }
        cout << endl;

        char shot;
        cin >> shot;

        if (wordIsPresent(shot)) {
            cout << "You were it right!" << endl;
            shots[shot] = true;
        } else {
            cout << "You were wrong" << endl;
        }
    }
}