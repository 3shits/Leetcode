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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
        int sum = l1->val + l2->val;
        int carry = sum /10;
        sum = sum % 10;
        ListNode *head = new ListNode(sum);
        ListNode* t1 = l1->next , *t2 = l2->next , *t = head;
        while(t1 || t2 || carry > 0)
        {
            int f1 = t1 ? t1->val : 0 , f2 = t2 ? t2->val : 0;
            sum =f1 + f2 + carry;
            carry = sum /10;
            sum = sum % 10;
            t->next = new ListNode(sum);
            t = t->next;
            if(t1)
            t1 = t1->next;
            if(t2)
            t2 = t2->next;
        }

        return head;
    }
};