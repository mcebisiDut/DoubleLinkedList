# DoubleLinkedList

* Each node has a reference to the next node given it has more than more node.
* With only one node, both previous and next are null
* First node always has previous as null as there is no node before the first one
* Last node always has next as null as there is no node after last
* Removing the first item when there's only one item should set head to null
* Removing the first item when there are other items should set head to the next node and previous of that to null
* Everytime you add new node should accumulate size by one
* Everytime you remove a node should decrease size by one