public class majority_element {
    public int majorityElement(int[] nums) {
        int max=-1;
        int[] contor = new int[nums.length];
        for (int i = 0; i < contor.length; i++) {
            contor[i] = 0;
        }
        for (int i=0;i<nums.length;i++)
        {
            contor[nums[i]]++;
            if(contor[nums[i]]>max)
                max = contor[nums[i]];
        }

        return max;
    }
}
