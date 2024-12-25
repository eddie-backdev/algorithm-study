class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        int iVideoLen = timeConverter(video_len);
        int iOp_Start = timeConverter(op_start);
        int iOp_End = timeConverter(op_end);
        int iPos = getPos(timeConverter(pos), iOp_Start, iOp_End);

        for (String c : commands) {
            if (c.equals("next")) {
                iPos = next(iVideoLen, iPos);
                iPos = getPos(iPos, iOp_Start, iOp_End);
            }
            if (c.equals("prev")) {
                iPos = prev(iVideoLen, iPos);
                iPos = getPos(iPos, iOp_Start, iOp_End);
            }
        }
        return printPos(iPos / 60, iPos % 60);
    }
    
    public int getPos(int iPos, int iOp_Start, int iOp_End) {
        if (iPos >= iOp_Start  &&  iPos <= iOp_End) {
            return iOp_End;
        }
        return iPos;
    }
    
    public int timeConverter(String input) {
        String[] time = input.split(":");
        return Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
    }
    
    public int prev(int iVideoLen, int iPos) {
        if (iPos - 10 >= 0) {
            return iPos - 10;
        } else {
            return 0;
        }
    }
    
    public int next(int iVideoLen, int iPos) {
        if (iPos + 10 <= iVideoLen) {
            return iPos + 10;
        } else {
            return iVideoLen;
        }
    }
    
    public String printPos(int minute, int second) {
        String min = String.valueOf(minute);
        String sec = String.valueOf(second);
        
        if (minute < 10) {
            min = "0" + String.valueOf(minute);
        }
        if (second < 10) {
            sec = "0" + String.valueOf(second);
        }
        return min + ":" + sec;
    }
}