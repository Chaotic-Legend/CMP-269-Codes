#include <iostream>
#include "SongNode.h"
using namespace std;

// This function prints all songs in the playlist, skipping the head node.
void PrintPlaylist(SongNode* headNode) {
    SongNode* currNode = headNode->GetNext(); // Skip the head node, which contains no user data.
    while (currNode != nullptr) {
        currNode->PrintSongInfo();           // Print the current node's song information.
        currNode = currNode->GetNext();      // Move to the next node in the list.
    }
}

int main() {
    SongNode* headNode;
    SongNode* currNode;
    SongNode* lastNode;

    string songTitle;
    string songLength;
    string songArtist;

    // This statement creates the head node of the linked list.
    headNode = new SongNode();
    lastNode = headNode; // Initialize lastNode to point to the head node.

    // This loop reads user input until "-1" is entered for the song title.
    getline(cin, songTitle);
    while (songTitle != "-1") {
        getline(cin, songLength);           // Read the length of the song.
        getline(cin, songArtist);           // Read the artist of the song.

        currNode = new SongNode(songTitle, songLength, songArtist); // Create a new node.
        lastNode->InsertAfter(currNode);    // Insert the new node after the last node.
        lastNode = currNode;                // Update lastNode to point to the new node.

        getline(cin, songTitle);            // Read the next song title.
    }

    // This statement prints the heading for the playlist.
    cout << "LIST OF SONGS" << endl;
    cout << "-------------" << endl;

    // This function call prints all songs in the playlist.
    PrintPlaylist(headNode);

    return 0;
}
