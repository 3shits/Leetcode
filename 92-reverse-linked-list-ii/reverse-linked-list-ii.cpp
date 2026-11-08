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
    ListNode* reverseBetween(ListNode* head, int left, int right) {
        int diff = right - left , dupLeft = left;
        ListNode *l = head, *r = head , *prev = nullptr;

        while(dupLeft != 1)
        {
            prev = l;
            l = l->next;
            dupLeft--;
        }
        r = l;
        while(diff != 0)
        {
            r = r->next;
            diff--;
        }

        ListNode *next = r->next;

        if(prev)
        prev->next = r;

        ListNode *t = l->next;
        prev = l;
        while(left < right)
        {
            ListNode *temp = t->next;
            t->next = prev;
            if(prev == head)
            head = t;

            prev = t;
            t = temp;
            left++;
        }
        
        l->next = next;

        return head;

    }
};