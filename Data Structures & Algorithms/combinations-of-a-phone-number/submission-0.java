class Solution {
    String[]map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String>res=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
      
      if(digits.length()==0){
           return res;
      }
      backtrack(digits,0,new StringBuilder());
      return res;

        }
        public void backtrack(String digits,int index,StringBuilder current){
            if(index==digits.length()){
                res.add(current.toString());
                return;
            }
            String letters=map[digits.charAt(index)-'0'];
            for(int i=0;i<letters.length();i++){
                current.append(letters.charAt(i));
                backtrack(digits,index+1,current);
                current.deleteCharAt(current.length()-1);
            }
        }
    }
