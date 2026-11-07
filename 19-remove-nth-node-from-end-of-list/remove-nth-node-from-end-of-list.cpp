/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {

        if(head == nullptr || head->next == nullptr)
        return nullptr;

        ListNode *left = head , *right = head;
        while(n != 0)
        {
            right = right->next;
            n--;
        }

        ListNode * prev = head;
        while(right != nullptr)
        {
            prev = left;
            left = left->next;
            right = right->next;
        }

        if(left == head)
        head = left->next;
        else
        prev->next = left->next;

        return head;
    }
};