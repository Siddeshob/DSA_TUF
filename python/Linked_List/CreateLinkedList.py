class Node:
    def __init__(self,value):
        self.value=value
        self.next=None

class LinkedList:
    def __init__(self,value):
        node=Node(value)
        self.head=node
        self.tail=node
        self.length=1

    def printValues(self):
        temp=self.head

        while temp !=None:
            print(temp.value)
            temp=temp.next
    
    def append(self,value):
        new_Node=Node(value)
        if self.head is None:
            self.head=new_Node
            self.tail=new_Node
        else:
            self.tail.next=new_Node
            self.tail=new_Node
        self.length+=1

    def pop(self):
        if self.length==0:
            print(f'no values to pop')
        elif self.length==1:
            self.head=None
            self.tail=None
        else:
            temp=self.head
            prev=temp
            while temp.next:
                prev=temp
                temp=temp.next
            prev.next=None
            self.tail=prev 

l=LinkedList(12)
l.append(13)
l.append(14)
l.append(15)
l.printValues()
l.pop()
print(f'--------------------------')
l.printValues()

    