#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int main()
{
    cout << "++++++++++++++++++++++++++++++++" << endl;
    cout << "+ Welcome to the Guessing Game +" << endl;
    cout << "++++++++++++++++++++++++++++++++" << endl;

    cout << "Choose a level" << endl;
    cout << "Easy (E) | Medium (M) | Hard (H)" << endl;

    char level;

    cin >> level;

    int quantityTries;

    switch (level)
    {
        case 'H':
            quantityTries = 5;
            break;
        case 'M':
            quantityTries = 10;
            break;
        default:
            quantityTries = 15;
    }

    srand(time(NULL));
    const int SECRET_NUMBER = rand() % 100;

    int shot;

    int tries = 0;

    double points = 1000.0;

    for (tries = 1; tries <= quantityTries; tries++)
    {
        cout << "Tries " << tries << endl;
        cout << "What's your shot? ";
        cin >> shot;

        cout << "Your shot is: " << shot << endl;

        double lostPoints = abs(shot - SECRET_NUMBER) / 2.0;
        points -= lostPoints;

        bool guessed = SECRET_NUMBER == shot;
        bool less = SECRET_NUMBER > shot;

        if (guessed)
        {
            cout << "Congratulations! You guessed the number!" << endl;
            break;
        }
        else if (less)
        {
            cout << "Your shot is less than secret number." << endl;
        }
        else
        {
            cout << "Your shot is greater than secret number." << endl;
        }

        if (!guessed) {
            cout << "--------------------------------" << endl;
        }
    }

    cout << "++++++++++++++++++++++++++++++++" << endl;
    cout << "End game" << endl;
    cout << "You guessed in " << tries << " tries." << endl;
    cout.precision(2);
    cout << fixed;
    cout << "You points is " << points << endl;
    cout << "++++++++++++++++++++++++++++++++" << endl;
}