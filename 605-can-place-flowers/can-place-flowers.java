class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        

        List<Integer> flowers = new ArrayList<>();
        flowers.add(0);
        for(int fl:flowerbed){
            flowers.add(fl);
        }
        flowers.add(0);
        System.out.println(flowers);
        int c=0;
        for(int i=1;i<flowers.size()-1;i++){
            if(flowers.get(i) == 1){
                continue;
            }
            else if(flowers.get(i-1) == 1 || flowers.get(i+1) == 1){
                continue;
            }
            else if(flowers.get(i-1) == 0 && flowers.get(i+1) == 0){
                flowers.set(i,1);
                c+=1;
            }
        }
        System.out.println(c);

        return n<=c;


    }
}