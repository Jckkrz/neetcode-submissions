class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> points = new Stack<>();
        int score = 0;

        for(int i = 0; i < operations.length; i++){
            if(operations[i].equals("D")){
                points.push(points.peek() * 2);
            }
            else if(operations[i].equals("C")){
                points.pop();
            }
            else if(operations[i].equals("+")){
                int temp = points.pop();
                int temp2 = points.peek();
                points.push(temp);
                points.push(temp + temp2);
            }
            else{
                points.push(Integer.parseInt(operations[i]));
                }
        }

        while(!points.isEmpty()){
            score += points.pop();
        }

        return score;
    }
}