class Solution {
    public int countSeniors(String[] details) {
        

        int count = 0;

        for(String data:details){
            String ageString = data.substring(11,13);
            int age = Integer.parseInt(ageString);
            System.out.println(age);
            if(age>60){
                count++;
            }
        }
        return count;

    }
}