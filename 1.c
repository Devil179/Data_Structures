#include <stdio.h>
#include <stdlib.h>

typedef struct ListNode
{
    int data;
    struct ListNode *next;
} ListNode;

ListNode *createNode(int value)
{
    ListNode *newNode = (ListNode *)malloc(sizeof(ListNode));
    newNode->data = value;
    newNode->next = NULL;
    return newNode;
}

void insertAtEnd(ListNode **head, int value)
{
    ListNode *newNode = createNode(value);
    if (*head == NULL)
    {
        *head = newNode;
        return;
    }
    ListNode *temp = *head;
    while (temp->next != NULL)
    {
        temp = temp->next;
    }
    temp->next = newNode;
}

void printList(ListNode *head)
{
    ListNode *temp = head;
    while (temp != NULL)
    {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int main()
{
    int N, value;
    ListNode *head = NULL;
    scanf("%d", &N);
    for (int i = 0; i < N; i++)
    {
        scanf("%d", &value);
        insertAtEnd(&head, value);
    }
    printList(head);
    return 0;
}
