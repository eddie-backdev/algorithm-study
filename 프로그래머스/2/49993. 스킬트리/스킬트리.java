class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String tree : skill_trees) {
            int skillIdx = 0;
            boolean isValid = true;

            for (int i = 0; i < tree.length(); i++) {
                char c = tree.charAt(i);
                int idx = skill.indexOf(c);

                if (idx == -1) continue;

                if (idx == skillIdx) {
                    skillIdx++;
                } else {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                answer++;
            }
        }
        return answer;
    }
}