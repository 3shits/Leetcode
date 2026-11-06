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
    void reorderList(ListNode* head) {
        ListNode *slow = head , *fast = head->next;

        while(fast != nullptr && fast->next != nullptr)
        {
            slow = slow->next;
            fast = fast->next->next;
        }

        //begsin 2nd list;
        ListNode *prev = nullptr , *curr = slow->next;
        slow->next = nullptr;
        
        while(curr != nullptr)
        {
            ListNode *temp = curr->next;
            curr->next = prev;
            prev = curr;
            curr = temp;
        }

        fast = head;
        slow = prev;

        while(slow != nullptr)
        {
            ListNode *t1 = fast->next , *t2 = slow->next;
            fast->next = slow;
            slow->next = t1;
            fast = t1;
            slow = t2;
        }
    }
};