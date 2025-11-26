#include "SongNode.h"
#include <iostream>
using namespace std;

// This constructor initializes the node with a title, length, and artist.
SongNode::SongNode(string songTitleInit, string songLengthInit, string songArtistInit) {
    this->songTitle = songTitleInit;
    this->songLength = songLengthInit;
    this->songArtist = songArtistInit;
    this->nextNodeRef = nullptr;
}

// This constructor initializes the node with a title, length, artist, and next node reference.
SongNode::SongNode(string songTitleInit, string songLengthInit, string songArtistInit, SongNode* nextLoc) {
    this->songTitle = songTitleInit;
    this->songLength = songLengthInit;
    this->songArtist = songArtistInit;
    this->nextNodeRef = nextLoc;
}

// This function inserts a node immediately after the current node.
void SongNode::InsertAfter(SongNode* nodeLoc) {
    SongNode* tmpNext;
    tmpNext = this->nextNodeRef;
    this->nextNodeRef = nodeLoc;
    nodeLoc->nextNodeRef = tmpNext;
}

// This function returns a pointer to the next node in the list.
SongNode* SongNode::GetNext() {
    return this->nextNodeRef;
}

// This function prints the song's title, length, and artist.
void SongNode::PrintSongInfo() {
    cout << "Title: " << songTitle << endl;
    cout << "Length: " << songLength << endl;
    cout << "Artist: " << songArtist << endl;
    if (this->nextNodeRef != nullptr) {
        cout << endl; // Print a blank line only if another song follows.
    }
}
