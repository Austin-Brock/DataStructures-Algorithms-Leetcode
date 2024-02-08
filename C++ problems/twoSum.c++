#include <vector>
#include <unordered_map>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> numToIndex;
        vector<int> result;
        
        // Iterate through the array
        for (int i = 0; i < nums.size(); ++i) {
            // Calculate the complement needed to reach the target
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (numToIndex.find(complement) != numToIndex.end()) {
                // If found, return the indices of the two numbers
                result.push_back(numToIndex[complement]);
                result.push_back(i);
                return result;
            }
            
            // If not found, add the current number and its index to the map
            numToIndex[nums[i]] = i;
        }
        
        // If no solution is found, return an empty vector
        return result;
    }
};