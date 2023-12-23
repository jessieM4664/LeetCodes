
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

class MajorityElement {
    public int majorityElement(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i : set) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    counter++;
                }
            }
            map.put(i, counter);
        }
        int key = 0;
        int maximum = 0;
        System.out.println(map.toString());
        for (int i : set) {
            if (map.get(i) > maximum) {
                maximum = map.get(i);
                key = i;
            }
        }
        return key;
    }   
}
