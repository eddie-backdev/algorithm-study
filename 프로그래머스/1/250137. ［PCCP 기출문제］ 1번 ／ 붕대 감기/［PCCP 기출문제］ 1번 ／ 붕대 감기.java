class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        final int duration = bandage[0];
        final int healPerSec = bandage[1];
        final int bonus = bandage[2];
        final int maxHealth = health;

        int lastTime = 0;
        for (int i = 0; i < attacks.length; i++) {
            int t = attacks[i][0];
            int dmg = attacks[i][1];

            int gap = t - lastTime - 1;
            if (gap > 0) {
                long healed = (long) gap * healPerSec;
                if (gap >= duration) {
                    healed += (long) (gap / duration) * bonus;
                }
                health = (int) Math.min((long) maxHealth, (long) health + healed);
            }

            health -= dmg;
            if (health <= 0) return -1;

            lastTime = t;
        }

        return health;
    }
}
