public class count1f {
    public static void main (String[] args){
        int nums[] = {1,4,4,1,3,5,5,3};
        int pattern[] = {1,0,-1};
        int n= nums.length;
        int p= pattern.length;
        int r=0;
        int number=0;
        int j=0;
        int pnumber=0;
        for (int index = 0; index < pattern.length; index++) {
           switch (pattern[index]) {
            case 0:
                r=1;
                break;
            case 1:
                r=2; 
                break;   
            case -1:
                r=3;
                break;
            default:
                break;
           }
           number=number*10+r;
        }
        for (int i = 0; i < nums.length; i++) {
            if(j>p){
               j=0;
               if (nums[i] == nums[i+1]) {
                  pnumber=pnumber*10+1;
            } else if (nums[i] <nums[i+1]) {
                  pnumber=pnumber*10+2;
            } else if (nums[i] >nums[i+1]) {
                  pnumber=pnumber*10+3;
            }
            
            }
            j++;

        }
        System.out.println(pnumber);
    
    }
    
}
