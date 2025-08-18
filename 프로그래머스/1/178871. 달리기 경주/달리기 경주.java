import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }
        
        for (String callingPlayer : callings) {
            int currentRank = playerMap.get(callingPlayer);

            String frontPlayer = players[currentRank - 1];

            players[currentRank - 1] = callingPlayer;
            players[currentRank] = frontPlayer;

            playerMap.put(callingPlayer, currentRank - 1);
            playerMap.put(frontPlayer, currentRank);
        }
        
        return players;
    }
}