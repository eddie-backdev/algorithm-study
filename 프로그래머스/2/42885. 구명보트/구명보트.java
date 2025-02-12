import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people); // 가벼운 사람부터 무거운 사람 순서로 정렬이 된다. 오름차순
        int boatCnt = 0; // 총 사용된 구명 보트의 수
        int i = 0; // 왼쪽 끝에서 시작하는 인덱스 (가장 가벼운 사람이 있는 인덱스)
        int j = people.length - 1; // 오른쪽 끝에서 시작하는 인덱스 (가장 무거운 사람이 있는 인덱스)

        while (i <= j) {
            // 반복문이 실행될 때 가장 무거운 사람과 가장 가벼운 사람을 고려
            if (people[i] + people[j] <= limit) {
                i++; // 왼쪽 가벼운 사람도 함께 태우기 때문에 i를 1 더해준다.
            }
            
            // 무거운 사람은 무조건 한명 이상은 구명 보트를 타기 때문에 j를 하나 줄여줌으로써 다음 무거운 사람으로 인덱스를 옮긴다.
            j--;
            boatCnt++; // 구명보트를 사용했기 때문에 보트 카운트를 하나 올려준다.
        }
        return boatCnt;
    }
}