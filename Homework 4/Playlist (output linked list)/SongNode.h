#ifndef SONGNODE_H
#define SONGNODE_H
#include <iostream>
#include <string>
using namespace std;

class SongNode {
private:
    // This variable stores the title of the song.
    string songTitle;

    // This variable stores the length of the song.
    string songLength;

    // This variable stores the artist of the song.
    string songArtist;

    // This pointer references the next node in the linked list.
    SongNode* nextNodeRef;                                   

public:
    // This default constructor initializes the node with default values.
    SongNode() {
        songTitle = "-1";
        songLength = "";
        songArtist = "";
        nextNodeRef = nullptr;
    }

    // This constructor initializes the node with a title, length, and artist.
    SongNode(string songTitleInit, string songLengthInit, string songArtistInit);

    // This constructor initializes the node with a title, length, artist, and next node reference.
    SongNode(string songTitleInit, string songLengthInit, string songArtistInit, SongNode* nextLoc);

    // This function inserts a node immediately after the current node.
    void InsertAfter(SongNode* nodeLoc);

    // This function returns a pointer to the next node in the list.
    SongNode* GetNext();

    // This function prints the song's title, length, and artist.
    void PrintSongInfo();
};

#endif
