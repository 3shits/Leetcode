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
    ListNode* reverseList(ListNode* head) {

        if(head == nullptr)
        return head;

        ListNode* t1 = head , *t2 = head->next;
        t1->next = nullptr;
        while(t2 != nullptr)
        {
            ListNode* nextt2 = t2->next;
            t2->next = t1;
            t1 = t2;
            t2 = nextt2;
        }
        return t1;
    }
};