/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        // Check if the list is empty
        if (head == null) {
            return null;
        }

        // Check if the list has only one node
        if (head != null && head.next == null) {
            return head;
        }

        // Initialize two pointers for consecutive nodes
        ListNode num1 = head;
        ListNode num2 = head.next;

        // Traverse the list and insert greatest common divisors between nodes
        while (num2 != null) {
            // Find the greatest common divisor of the current pair
            int gcp = findGcp(num1.val, num2.val);
            
            // Create a new node with the greatest common divisor
            ListNode gcpNode = new ListNode(gcp);

            // Insert the new node between num1 and num2
            num1.next = gcpNode;
            gcpNode.next = num2;

            // Move to the next pair of nodes
            num1 = num2;
            num2 = num2.next;
        }
        
        // Return the modified head of the list
        return head;
        
    }

    // Method to find the greatest common divisor using Euclid's algorithm
    public int findGcp(int a, int b) {
        // Base case: if b is 0, then the greatest common divisor is a
        return (b == 0) ? a : findGcp(b, a % b); 
    }
}
