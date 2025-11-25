#ifndef MILEAGETRACKERNODEH
#define MILEAGETRACKERNODEH

#include <iostream>
#include <string>
using namespace std;

class ItemNode {
private:
    // This variable stores the item of this node.
    string item;

    // This pointer references the next node in the linked list.
    ItemNode* nextNodeRef;

public:
    // This default constructor initializes the node with an empty item.
    ItemNode();

    // This constructor initializes the node with a given item.
    ItemNode(string itemInit);

    // This constructor initializes the node with a given item and a next node reference.
    ItemNode(string itemInit, ItemNode* nextLoc);

    // This function inserts a node immediately after the current node.
    void InsertAfter(ItemNode& nodeLoc);

    // This function inserts a node at the end of the linked list starting from this node.
    void InsertAtEnd(ItemNode* nodeLoc);

    // This function returns a pointer to the next node in the list.
    ItemNode* GetNext();

    // This function prints the item stored in this node.
    void PrintNodeData();

    // This function returns the item stored in this node.
    string GetNodeItem();
};

#endif
