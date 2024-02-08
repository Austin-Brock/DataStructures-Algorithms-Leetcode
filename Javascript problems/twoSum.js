/**
 * @param {number[]} nums - An array of integers.
 * @param {number} target - The target integer sum.
 * @return {number[]} - An array containing the indices of the two numbers whose sum is equal to the target.
 */
var twoSum = function(nums, target) {
    // Iterate through the array using 'i' as the index of the first number.
    for (let i = 0; i < nums.length; i++) {
        // Iterate through the array again using 'j' as the index of the second number.
        for (let j = i + 1; j < nums.length; j++) {
            // Check if the sum of the current pair of numbers equals the target.
            if (nums[j] === target - nums[i]) {
                // If a pair is found, return the indices of the two numbers.
                return [i, j];
            }
        }
    }
    // If no pair is found, return an empty array.
    return [];
};