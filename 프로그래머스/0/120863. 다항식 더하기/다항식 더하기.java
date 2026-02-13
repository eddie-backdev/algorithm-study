class Solution {
    public String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
        int xCnt = 0;
        int nCnt = 0;
        
        String[] polyArr = polynomial.split(" \\+ ");
        
        for (String v : polyArr) {
            if (v.contains("x")) {
                if (v.equals("x")) {
                    xCnt++;
                } else {
                    xCnt += Integer.parseInt(v.substring(0, v.length() - 1));
                }
            } else {
                nCnt += Integer.parseInt(v);
            }
        }
        
        if (xCnt == 1) {
            sb.append('x');
        } else if (xCnt != 0) {
            sb.append(xCnt).append('x');
        }
        
        if (nCnt != 0) {
            if (sb.length() != 0) {
                sb.append(" + ").append(nCnt);
            } else {
                sb.append(nCnt);
            }
        }
        
        return sb.toString();
    }
}