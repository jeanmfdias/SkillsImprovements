#include <iostream>
#include <list>

using namespace std;

list<string> names;
list<double> balances;

void separator(string symbol, int quantity) {
    string print;
    for (int i = 0; i < quantity; i++) {
        print += symbol;
    }
    cout << print << endl;
}

void formatMessage(string message, string symbol, int quantity) {
    int quantityCharacters = message.length();

    if (quantityCharacters > quantity) {
        cout << symbol << " " << message << " " << symbol << endl;
    } else {
        int sizeFill = quantity - quantityCharacters - 2;
        if (sizeFill % 2 != 0) {
            sizeFill -= 1;
        }
        int slice = sizeFill / 2;
        string print;
        for (int i = 0; i < slice; i++) {
            print += symbol;
        }
        cout << print << " " << message << " " << print << endl;
    }
}

void showMenu() {
    separator("+", 49);
    formatMessage("Banking Account", "-", 50);
    separator("+", 49);

    formatMessage("Menu", "-", 48);
    cout << "+ 0 - Exit" << endl;
    cout << "+ Choice a option: ";
}

int main() {
    int choice = 1;
    while (choice != 0) {
        system("clear");
        showMenu();
        cin >> choice;
    }
    system("clear");
    cout << "Bye!" << endl;
}