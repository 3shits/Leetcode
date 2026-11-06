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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {

        if(list1 == nullptr) return list2;
        if(list2 == nullptr) return list1;

        ListNode *h1 = list1 , *h2 = list2;
        ListNode *head = nullptr , *temp = nullptr;
        
        while(h2 != nullptr && h1 != nullptr)
        {
            if(h1->val > h2->val)
            {
                if(head == nullptr)
                {
                    head = h2;
                    temp = head;
                }
                else
                {
                    temp->next = h2;
                    temp = temp->next;
                }
                h2 = h2->next;
            }
            else if(h1->val <= h2->val)
            {
                if(head == nullptr)
                {
                    head = h1;
                    temp = head;
                }
                else
                {
                    temp->next = h1;
                    temp = temp->next;
                }
                h1 = h1->next;
            }
        }
        while(h1 != nullptr)
        {
            temp->next = h1;
            h1 = h1->next;
            temp = temp->next;
        }

        while(h2 != nullptr)
        {
            temp->next = h2;
            h2 = h2->next;
            temp = temp->next;
        }

        return head;
    }
};