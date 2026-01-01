#include <iostream>
#include <string>
#include <map>
#include <vector>

using namespace std;

string secretWord = "WATERMELON";

map<char, bool> shots;

vector<char> wrongShots;

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

    cout << "********************" << endl;
    cout << "*** Hangman Game ***" << endl;
    cout << "********************" << endl << endl;

    while (noHit && noLose) {
        for (char letter : secretWord) {
            if (shots[letter]) {
                cout << letter << " ";
            } else {
                cout << "_ ";
            }
        }
        cout << endl;

        cout << "Wrong shots: ";
        for (char letter : wrongShots) {
            cout << letter << " ";
        }
        cout << endl;
        cout << "Enter with your shot: ";
        char shot;
        cin >> shot;

        if (wordIsPresent(shot)) {
            cout << "You were it right!" << endl;
            shots[shot] = true;
        } else {
            cout << "You were wrong" << endl;
            wrongShots.push_back(shot);
        }
        cout << endl;
    }
}