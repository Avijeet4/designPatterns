package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class TopFeatures {

	public static ArrayList<String> popularNFeatures(int numFeatures, int topFeatures, List<String> possibleFeatures,
			int numFeatureRequests, List<String> featureRequests) {
		
		Set<String> posFeatures=new HashSet<>();
		posFeatures.addAll(possibleFeatures);
		//map to store frequency of the words
		Map<String, Integer> featureFrequency = new HashMap<>();
        for (String featureSentence: featureRequests) {
        	String potentialFeatures[]=featureSentence.split(" ");
        	Set<String> featuresInString=new HashSet<>();
        	for(String feature: potentialFeatures) {
        		
        		
        		if(posFeatures.contains(feature)) {
        			if(featuresInString.contains(feature)) {
        				continue;
        			}
        			featuresInString.add(feature);
        			featureFrequency.put(feature, featureFrequency.getOrDefault(feature, 0) + 1);
        		}
        	}
        }
        //sorting words by their frequency
        PriorityQueue<String> heap = new PriorityQueue<String>(
                (w1, w2) -> featureFrequency.get(w1).equals(featureFrequency.get(w2)) ?
                w2.compareTo(w1) : featureFrequency.get(w1) - featureFrequency.get(w2) );
        
        // removing irrelevant features
        for (String word: featureFrequency.keySet()) {
            heap.offer(word);
            if (heap.size() > topFeatures) heap.poll();
        }

        ArrayList<String> ans = new ArrayList<>();
        while (!heap.isEmpty()) ans.add(heap.poll());
        Collections.reverse(ans);
        
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> features= Arrays.asList("anacell", "betacellular", "cetracular", "deltacellular","eurocell");
		List<String> requests=Arrays.asList("I love anacell anacell","betacellular",
				"deltacellular better betacellular", 
				
				
				"cetracular worse eurocell", "betacellular better deltacellular");
		
		popularNFeatures(5, 2, features, 5, requests);
	}

}

class Solution {
// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
// WRITE YOUR CODE HERE

// METHOD SIGNATURE ENDS
}