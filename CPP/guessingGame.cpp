#include<iostream>

using namespace std;

int main() {
    cout << "++++++++++++++++++++++++++++++++" << endl;
    cout << "+ Welcome to the Guessing Game +" << endl;
    cout << "++++++++++++++++++++++++++++++++" << endl;

    int secretNumber = 0;

    int shot;

    cout << "What's your shot? ";
    cin >> shot;

    cout << "Your shot is: " << shot << endl;

    if (secretNumber == shot) {
        cout << "Congratulations! You guessed the number!" << endl;
    } else if (secretNumber > shot) {
        cout << "Your shot is less than secret number." << endl;
    } else {
        cout << "Your shot is greater than secret number." << endl;
    }
}