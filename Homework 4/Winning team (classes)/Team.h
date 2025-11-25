#ifndef TEAMH
#define TEAMH

#include <string>
using namespace std;

class Team {
private:
    // This variable stores the name of the team.
    string name;

    // This variable stores the number of wins for the team.
    int wins;

    // This variable stores the number of losses for the team.
    int losses;

public:
    // This function sets the name of the team.
    void SetName(string teamName);

    // This function sets the number of wins for the team.
    void SetWins(int teamWins);

    // This function sets the number of losses for the team.
    void SetLosses(int teamLosses);

    // This function returns the name of the team.
    string GetName() const;

    // This function returns the number of wins of the team.
    int GetWins() const;

    // This function returns the number of losses of the team.
    int GetLosses() const;

    // This function computes and returns the win percentage of the team.
    double GetWinPercentage() const;

    // This function prints the team's win percentage and whether the team has a winning or losing average.
    void PrintStanding() const;
};

#endif
