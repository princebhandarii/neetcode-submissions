class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int speed = 1;

        while (true) {
            long totalT = 0;

            for (int pile : piles) {
                totalT += (pile + speed - 1) / speed; // ✅ no Math.ceil
            }

            if (totalT <= h) return speed;

            speed++;
        }
    }
}