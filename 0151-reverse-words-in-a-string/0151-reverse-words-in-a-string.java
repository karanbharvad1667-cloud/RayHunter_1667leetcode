class Solution {
    public String reverseWords(String s) {
       int n=s.length();
       List<String> words=new ArrayList<>();
       StringBuilder word=new StringBuilder();

       for(int i=0;i<n;i++){
        if(s.charAt(i) !=' '){
            word.append(s.charAt(i));
        }else if(word.length()>0){
            words.add(word.toString());
            word.setLength(0);
        }

       }
       if(word.length()>0){
        words.add(word.toString());
       }
       
       Collections.reverse(words);

    return  String.join(" ", words);
    }
}


// class Solution {
//     public String reverseWords(String s) {
//         String[] str = s.trim().split("\\s+");// remove whitespace and leading space
//         String result = "";
//         int n = str.length;
//         for (int i = n - 1; i > 0; i--) {
//             result += str[i] + " ";
//         }
//         return result + str[0];
//     }
// }