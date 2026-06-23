class Solution {
    public boolean isanagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i =0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
    return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>group = new ArrayList<>();
        boolean[]used= new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(used[i]){
                continue;
            }
            List<String>current=new ArrayList<>();
            current.add(strs[i]);
            used[i]=true;
            for(int j=i+1;j<strs.length;j++){
                 
                 if(isanagram(strs[i],strs[j])){
                    current.add(strs[j]);
                    used[j]=true;
                 }
            }
        group.add(current);   
        }
    return group;
    }
}
