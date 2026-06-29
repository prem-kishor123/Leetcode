class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

     HashSet<String> set = new HashSet<>(dictionary);
     String[] words = sentence.split(" ");
     
     StringBuilder ans = new StringBuilder();

     for(String word : words){
        String replacement= word;

        for(int i=1; i<= word.length(); i++){
            String prefix=word.substring(0,i);

            if (set.contains(prefix)){
                replacement=prefix;
                break;
            }
        }
        ans.append(replacement).append(" ");
     }  
     return ans.toString().trim();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna