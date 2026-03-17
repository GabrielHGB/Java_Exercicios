import java.util.HashMap;

class Solution{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hashmap = new HashMap<>(); 
        
        for(int i = 0; i < nums.length; i++){
            int atual = target - nums[i];
            
            if(hashmap.containsKey(atual)){
               int Solution[] = new int[2];
               Solution[0] = hashmap.get(atual);
               Solution[1] = i;
               return Solution;
            }
            
            hashmap.put(nums[i], i);
        }
        
        return new int[2];
    }

    public static void main(String[] args) {
        Solution sum = new Solution();
        int[] nums = {1,2,5};
        int target = 7;
        
        int[] solucao = sum.twoSum(nums, target);
        for(int i = 0; i < 2; i++){
            System.out.println(solucao[i]);
        }
    }
}