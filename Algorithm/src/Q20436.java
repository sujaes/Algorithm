//import java.util.*;
//public class Q20436 {
//	static char[][] arr = new char[3][10];
//	static ArrayList<Character> ja = new ArrayList<Character>(Arrays.asList(new Character[]{ 'q','w','e','r','t','a','s','d','f','g','z','x','c','v' }));
//	static ArrayList<Character> mo = new ArrayList<Character>(Arrays.asList(new Character[]{ 'y','u','i','o','p','h','j','k','l','b','n','m' }));
//	static char nja,nmo;
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		init();
//
//		String se = sc.nextLine();
//		nja = se.charAt(0);
//		nmo = se.charAt(2);
//		String str = sc.next();
//		int answer =str.length();		
//		for(int i = 0 ; i < str.length();i++) {
//			if(ja.contains(str.charAt(i))) {
//				answer += getLen(nja,str.charAt(i));
//				nja = str.charAt(i);
//			}else {
//				answer += getLen(nmo,str.charAt(i));
//				nmo = str.charAt(i);
//			}
//		}	
//		System.out.println(answer);
//	}
//	public static int getLen(char now,char next) {
//		int ans = 0;
//		int x1 = 0;
//		int x2 = 0;
//		int y1 = 0;
//		int y2 = 0;
//		if(now==next) {
//			return 0;
//		}
//		for(int i = 0 ; i < 3;i++) {
//			for(int j = 0 ; j < 10; j++) {
//				if(now == arr[i][j]) {
//					x1 = i;
//					y1 = j;
//				}else if(next == arr[i][j]){
//					x2 = i;
//					y2 = j;
//				}
//			}
//		}		
//		ans = Math.abs(x2-x1) + Math.abs(y2-y1);
//		return ans;
//	}
//	
//	public static void init() {
//		arr[0][0] = 'q';
//		arr[0][1] = 'w';
//		arr[0][2] = 'e';
//		arr[0][3] = 'r';
//		arr[0][4] = 't';
//		arr[1][0] = 'a';
//		arr[1][1] = 's';
//		arr[1][2] = 'd';
//		arr[1][3] = 'f';
//		arr[1][4] = 'g';
//		arr[2][0] = 'z';
//		arr[2][1] = 'x';
//		arr[2][2] = 'c';
//		arr[2][3] = 'v';		
//		arr[0][5] = 'y';
//		arr[0][6] = 'u';
//		arr[0][7] = 'i';
//		arr[0][8] = 'o';
//		arr[0][9] = 'p';
//		arr[1][5] = 'h';
//		arr[1][6] = 'j';
//		arr[1][7] = 'k';
//		arr[1][8] = 'l';
//		arr[2][5] = 'b';
//		arr[2][6] = 'n';
//		arr[2][7] = 'm';
//	}
//}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q20436 {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char[] zero = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] one = new char[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] two = new char[]{'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        Map<Character, int[]> keyboard = new HashMap<>();

        for (int i = 0; i < zero.length; i++) {
            keyboard.put(zero[i], new int[]{i, 0});
        }
        for (int i = 0; i < one.length; i++) {
            keyboard.put(one[i], new int[]{i, 1});
        }
        for (int i = 0; i < two.length; i++) {
            keyboard.put(two[i], new int[]{i, 2});
        }

        int[] left;
        left = keyboard.get(st.charAt(0));
        int[] right;
        right = keyboard.get(st.charAt(2));

        String target = sc.next();

        char[] targetChars = target.toCharArray();
        int time = 0;
        for (char targetChar : targetChars) {
            int[] target1 = keyboard.get(targetChar);
            if (!isMoum(targetChar,keyboard)) {
                int distanceRight = getDistance(target1, right);
                right = target1;
                time += distanceRight;
            }else {
                int distanceLeft = getDistance(target1, left);
                left = target1;
                time += distanceLeft;
            }
            time++;
        }
        System.out.println(time);
    }

    private static boolean isMoum(char targetChar, Map<Character, int[]> keyboard) {
        int[] target = keyboard.get(targetChar);
        if(target[0]<4) {		//4번째까진 다 모음.
        	return true;
        }
        if(target[0]==4){
            if(target[1]<2) {	//마지막줄은 b이므로 자음.
            	return true;
            }
        }
        return false;
    }

    private static int getDistance(int[] target, int[] hand) {
        return Math.abs(target[0] - hand[0]) + Math.abs(target[1] - hand[1]);
    }
}
