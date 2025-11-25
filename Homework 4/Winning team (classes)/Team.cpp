#include <iostream>
#include <iomanip>
#include "Team.h"
using namespace std;

// This function sets the name of the team.
void Team::SetName(string teamName) {
    name = teamName;
}

// This function sets the number of wins for the team.
void Team::SetWins(int teamWins) {
    wins = teamWins;
}

// This function sets the number of losses for the team.
void Team::SetLosses(int teamLosses) {
    losses = teamLosses;
}

// This function returns the name of the team.
string Team::GetName() const {
    return name;
}

// This function returns the number of wins of the team.
int Team::GetWins() const {
    return wins;
}

// This function returns the number of losses of the team.
int Team::GetLosses() const {
    return losses;
}

// This function computes and returns the team's win percentage.
double Team::GetWinPercentage() const {
    return static_cast<double>(wins) / (wins + losses);
}

// This function prints the team's win percentage and whether the team has a winning or losing average.
void Team::PrintStanding() const {
    double pct = GetWinPercentage();

    cout << fixed << setprecision(2);
    cout << "Win percentage: " << pct << endl;

    if (pct >= 0.5) {
        cout << "Congratulations, Team " << name 
             << " has a winning average!" << endl;
    }
    else {
        cout << "Team " << name << " has a losing average." << endl;
    }
}
