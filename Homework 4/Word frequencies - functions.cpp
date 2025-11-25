#include <iostream>
#include <vector>
#include <string>
#include <cctype>
using namespace std;

/* This function counts how many times the word currWord appears in wordsList. */
int GetWordFrequency(vector<string> wordsList, string currWord) {
    // This loop converts every character of currWord to lowercase.
    for (char& c : currWord) {
        c = tolower(c);
    }

    int count = 0;

    // This loop checks every word in the list for a case-insensitive match.
    for (string word : wordsList) {
        // This loop converts every character of the current word to lowercase.
        for (char& c : word) {
            c = tolower(c);
        }

        // This condition increases the count when a match is found.
        if (word == currWord) {
            count++;
        }
    }

    // This statement returns the total number of matches.
    return count;
}

int main() {
    int n;

    // This statement reads the number of words that will be entered.
    cin >> n;
    vector<string> words(n);

    // This loop reads each word into the vector.
    for (int i = 0; i < n; i++) {
        cin >> words[i];
    }

    // This loop prints each word followed by its frequency in the list.
    for (int i = 0; i < n; i++) {
        cout << words[i] << " " << GetWordFrequency(words, words[i]) << endl;
    }
    return 0;
}
