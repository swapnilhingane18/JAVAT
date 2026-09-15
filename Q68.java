class Q68{
    public static void main(String[] args) {
        System.out.println("starts");
        int sum =0;
        while(true){
            int num=(int)(Math.random()*100);
            sum+=num;
            System.out.println(sum);
            if(sum>=1000) break;
        }
        //System.out.println(num);
        //System.out.println(num2);
        System.out.println("ends");
    
    }
}