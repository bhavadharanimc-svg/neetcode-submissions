class Solution {

    public String encode(List<String> strs) {
                 StringBuilder ans = new StringBuilder();
                 for(int i=0;i<strs.size();i++){
                    String s = strs.get(i);
                    int len = s.length();
                    ans.append(len);
                    ans.append('#');
                    ans.append(s);
                 }
                return ans.toString();
    }

    public List<String> decode(String str) {
             List<String>result = new ArrayList<>();
             int i=0;
             while(i<str.length()){
                int j=i;
                while(str.charAt(j)!='#'){
                    j++;
                }
                int len=Integer.parseInt(str.substring(i,j));
                j++;
                String word=str.substring(j,j+len);
                result.add(word);
                i=j+len;
             }   
    return result;
    }
}
