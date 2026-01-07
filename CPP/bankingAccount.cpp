#include <iostream>
#include <list>
#include <map>
#include <thread>
#include <chrono>

using namespace std;

list<string> names;
map<string, double> balances;

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
    cout << "+ 1 - Create a account" << endl;
    cout << "+ 2 - List all accounts" << endl;
    cout << "+ Choice a option: ";
}

void sleep(int seconds) {
    this_thread::sleep_for(chrono::seconds(seconds));
}

void createAccount() {
    system("clear");
    cout << "Name: ";
    string name;
    cin >> name;
    names.push_back(name);
    cout << "Initial balance: ";
    float amount;
    cin >> amount;
    balances.insert({name, amount});
    system("clear");
    formatMessage("New client created!", "+", 30);
    sleep(2);
}

void listAllAccounts() {
    system("clear");
    int id = 1;
    for (string name : names) {
        cout << "--- Account " << id++ << endl;
        cout << "Name: " << name << endl;
        cout << "Balance: " << balances[name] << endl;
    }
    cout << "Type 0 to continue..." << endl;
    string enter;
    cin >> enter;
}

int main() {
    int choice = 1;
    while (choice != 0) {
        system("clear");
        showMenu();
        cin >> choice;

        switch (choice) {
            case 1:
                createAccount();
                break;
            case 2:
                listAllAccounts();
                break;
            default:
                cout << "Invalid option!" << endl;
        }
    }
    system("clear");
    cout << "Bye!" << endl;
}