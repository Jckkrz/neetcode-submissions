class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> points = new ArrayDeque<>();
        int score = 0;

        for(String operation : operations){
            switch(operation){
                case "D":{
                   points.push(points.peek() * 2);
                   break; 
                }
                case "C":{
                    points.pop();
                    break;
                }
                case "+":{
                    int temp = points.pop();
                int temp2 = points.peek();
                points.push(temp);
                points.push(temp + temp2);
                break;
                }
                default:
                points.push(Integer.parseInt(operation));
            }
        }

       /* for(int i = 0; i < operations.length; i++){
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
        } */

        while(!points.isEmpty()){
            score += points.pop();
        }

        return score;
    }
}