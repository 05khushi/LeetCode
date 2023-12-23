import java.util.HashSet;

public class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<Integer> seen = new HashSet<>();
        seen.add(0);

        int x = 0;
        int y = 0;

        for (char c : path.toCharArray()) {
            switch (c) {
                case 'N':
                    ++y;
                    break;
                case 'S':
                    --y;
                    break;
                case 'E':
                    ++x;
                    break;
                case 'W':
                    --x;
                    break;
            }
            int key = x * 20001 + y;
            if (seen.contains(key))
                return true;
            seen.add(key);
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String path = "NESW"; // Replace this with the desired path
        boolean result = solution.isPathCrossing(path);
        System.out.println("Does the path cross itself? " + result);
    }
}
