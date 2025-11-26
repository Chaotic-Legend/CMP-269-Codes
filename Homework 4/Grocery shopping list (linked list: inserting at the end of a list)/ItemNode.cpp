#include "ItemNode.h"
#include <iostream>
using namespace std;

// This constructor initializes the node with an empty item.
ItemNode::ItemNode() {
    item = "";
    nextNodeRef = nullptr;
}

// This constructor initializes the node with the given item and no next node.
ItemNode::ItemNode(string itemInit) {
    item = itemInit;
    nextNodeRef = nullptr;
}

// This constructor initializes the node with the given item and a pointer to the next node.
ItemNode::ItemNode(string itemInit, ItemNode* nextLoc) {
    item = itemInit;
    nextNodeRef = nextLoc;
}

// This function inserts a node immediately after the current node.
void ItemNode::InsertAfter(ItemNode& nodeLoc) {
    ItemNode* tmpNext = nextNodeRef;
    nextNodeRef = &nodeLoc;
    nodeLoc.nextNodeRef = tmpNext;
}

// This function inserts a node at the end of the linked list starting from this node.
void ItemNode::InsertAtEnd(ItemNode* nodeLoc) {
    ItemNode* curr = this;
    while (curr->nextNodeRef != nullptr) {
        curr = curr->nextNodeRef; // Traverse to the last node.
    }
    
    curr->nextNodeRef = nodeLoc; // Add the new node at the end.
    nodeLoc->nextNodeRef = nullptr;
}

// This function returns a pointer to the next node in the list.
ItemNode* ItemNode::GetNext() {
    return nextNodeRef;
}

// This function prints the item stored in this node.
void ItemNode::PrintNodeData() {
    cout << item << endl;
}

// This function returns the item stored in this node.
string ItemNode::GetNodeItem() {
    return item;
}
