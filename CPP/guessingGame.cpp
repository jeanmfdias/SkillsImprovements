#include <iostream>

using namespace std;

int main()
{
    cout << "++++++++++++++++++++++++++++++++" << endl;
    cout << "+ Welcome to the Guessing Game +" << endl;
    cout << "++++++++++++++++++++++++++++++++" << endl;

    const int SECRET_NUMBER = 42;

    int shot;

    bool noGuessed = true;

    while (noGuessed)
    {

        cout << "What's your shot? ";
        cin >> shot;

        cout << "Your shot is: " << shot << endl;

        bool guessed = SECRET_NUMBER == shot;
        bool less = SECRET_NUMBER > shot;

        if (guessed)
        {
            cout << "Congratulations! You guessed the number!" << endl;
            noGuessed = false;
        }
        else if (less)
        {
            cout << "Your shot is less than secret number." << endl;
        }
        else
        {
            cout << "Your shot is greater than secret number." << endl;
        }
    }
}