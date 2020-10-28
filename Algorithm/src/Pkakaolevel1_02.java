class Pkakaolevel1_02 {
    public String solution(int[] numbers, String hand) {
        int leftnow = 10;
        int rightnow = 12;
        String answer = "";
        if(hand.equals("right")){
            hand = "R";
        }else{
            hand = "L";
        }
        for(int i = 0 ; i <numbers.length;i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                leftnow = numbers[i];
                answer += "L";
            }else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9 ){
                rightnow = numbers[i];
                answer += "R";
            }else{
                String res = calcDist(numbers[i],leftnow,rightnow);
                if(res.equals("same")){
                    res = hand;
                    if(hand.equals("R")){
                        rightnow = numbers[i];
                    }else{
                        leftnow = numbers[i];
                    }
                }else if(res.equals("R")){
                    rightnow = numbers[i];
                }else{
                    leftnow = numbers[i];
                }
                answer+=res;
            }
        }
       
        return answer;
    }
    public String calcDist(int num, int left, int right){
        Node numN = convert(num);
        Node leftN = convert(left);
        Node rightN = convert(right);
        
        int cleft = Math.abs(leftN.x - numN.x) + Math.abs(leftN.y - numN.y);
        int cright = Math.abs(rightN.x - numN.x) + Math.abs(rightN.y - numN.y);
        String res ="";
        if(cleft > cright){
            res = "R";
        }else if(cleft < cright){
            res = "L";
        }else{
            res = "same";
        }
        return res;
    }
    public Node convert(int num){
        if(num == 0){
            num = 11;
        }
        int x = (num - 1) % 3;
        int y = (num - 1) / 3;
        return new Node(x,y);
    }
}
class Node{
    public int x;
    public int y;
    public Node(int x ,int y){
        this.x = x;
        this.y = y;
    }
}
//class Solution {
//    public String solution(int[] numbers, String hand) {
//        int leftnow = 10;
//        int rightnow = 12;
//        String answer = "";
//        if(hand.equals("right")){
//            hand = "R";
//        }else{
//            hand = "L";
//        }
//        for(int i = 0 ; i <numbers.length;i++){
//            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
//                leftnow = numbers[i];
//                answer += "L";
//            }else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9 ){
//                rightnow = numbers[i];
//                answer += "R";
//            }else{
//                String res = calcDist(numbers[i],leftnow,rightnow);
//                if(res.equals("same")){
//                    res = hand;
//                    if(hand.equals("R")){
//                        rightnow = numbers[i];
//                    }else{
//                        leftnow = numbers[i];
//                    }
//                }else if(res.equals("R")){
//                    rightnow = numbers[i];
//                }else{
//                    leftnow = numbers[i];
//                }
//                answer+=res;
//            }
//        }
//       
//        return answer;
//    }
//    public String calcDist(int num, int left, int right){
//        Node numN = convert(num);
//        Node leftN = convert(left);
//        Node rightN = convert(right);
//        
//        int cleft = Math.abs(leftN.x - numN.x) + Math.abs(leftN.y - numN.y);
//        int cright = Math.abs(rightN.x - numN.x) + Math.abs(rightN.y - numN.y);
//        String res ="";
//        if(cleft > cright){
//            res = "R";
//        }else if(cleft < cright){
//            res = "L";
//        }else{
//            res = "same";
//        }
//        return res;
//    }
//    public Node convert(int num){
//        if(num == 0){
//            num = 11;
//        }
//        int x = (num - 1) % 3;
//        int y = (num - 1) / 3;
//        return new Node(x,y);
//    }
//}
//class Node{
//    public int x;
//    public int y;
//    public Node(int x ,int y){
//        this.x = x;
//        this.y = y;
//    }
//}
