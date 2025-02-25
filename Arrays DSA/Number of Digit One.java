//Given an integer A, find and return the total number of digit 1 appearing in all non-negative integers less than or equal to A.

/*for one's place it's A/10 + (A%10 if >0)
for tens place A/100 + (for exmaple if number 819..now we need to check from 10 to 19 as ten's place start from there) max(A%100 - 9 ,0) ..usually from 1-100 or 100-200 in ten's place
we have 10 1's in 10's place so that's the max...so minimize it. min(max(A%100 - 9 ,0),10)
do finally it's A/100 + min(max(A%100 - 9 ,0),10)

for humdre's place it's the same.
It took some time and took some help to do this...observation and optimzing the problem is important here.


*/
public class Solution {
    public int solve(int A) {
        int ans = 0;
        for (int i = 1; i <= A; i *= 10) {
            int divider = i * 10;
            ans += (A / divider) * i + Math.min(Math.max(A % divider - i + 1, 0), i);
        }
        return ans;
    }
}
