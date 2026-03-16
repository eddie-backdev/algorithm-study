import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static class Player implements Comparable<Player> {
        int level;
        String name;

        public Player(int level, String name) {
            this.level = level;
            this.name = name;
        }

        @Override
        public int compareTo(Player o) {
            return this.name.compareTo(o.name);
        }
    }

    static class Room {
        int baseLevel;
        List<Player> players;

        public Room(int baseLevel) {
            this.baseLevel = baseLevel;
            this.players = new ArrayList<>();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Room> rooms = new ArrayList<>();

        for (int i = 0; i < p; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            String n = st.nextToken();
            Player player = new Player(l, n);

            boolean joined = false;
            for (Room room : rooms) {
                if (room.players.size() < m && Math.abs(room.baseLevel - l) <= 10) {
                    room.players.add(player);
                    joined = true;
                    break;
                }
            }

            if (!joined) {
                Room newRoom = new Room(l);
                newRoom.players.add(player);
                rooms.add(newRoom);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Room room : rooms) {
            if (room.players.size() == m) {
                sb.append("Started!\n");
            } else {
                sb.append("Waiting!\n");
            }

            Collections.sort(room.players);
            for (Player player : room.players) {
                sb.append(player.level).append(" ").append(player.name).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}

