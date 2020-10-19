import java.util.PriorityQueue;

public class LC215 {
    class Solution1 {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
            for(int val:nums){
                pq.add(val);
                if(pq.size()>k){
                    pq.poll();
                }
            }

            return pq.peek();
        }
    }


    //快速排序

    class Solution2 {
        public int findKthLargest(int[] nums, int k) {
                k=nums.length-k;
                int left=0,right=nums.length-1;
                while(left<right){
                    int j=partition(nums,left,right);
                    if(j==k){
                        break;;
                    }else if(j<k){
                        left=j+1;
                    }else{
                        right=j-1;
                    }
                }
                return nums[k];
    }
    private int partition(int[] a,int left, int right){



            return j;
    }


    private void swap(int[] a, int i, int j){
        int t = a[i];
        a[i]=a[j];
        a[j]=a[i];
        }
    }
}
