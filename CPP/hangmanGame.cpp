#include <iostream>
#include <string>

using namespace std;

string secretWord = "WATERMELON";

bool wordIsPresent(char word) {
    for (int i = 0; i < secretWord.size(); i++) {
        if (secretWord[i] == word) {
            return true;
        }
    }
    return false;
}

int main() {
    cout << secretWord << endl;

    bool noHit = true;
    bool noLose = true;

    while (noHit && noLose) {
        char shot;
        cin >> shot;

        if (wordIsPresent(shot)) {
            cout << "You were it right!" << endl;
        } else {
            cout << "You were wrong" << endl;
        }
    }
}