class Solution {
    public int leastInterval(char[] tasks, int n) {
          int len=tasks.length;
          HashMap<Character,Integer> map=new HashMap<>();
          for(int i=0;i<len;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);

          }
          int maxfreq=Collections.max(map.values());
          int maxcount=0;
          for(int freq:map.values()){
            
            if(freq==maxfreq){
                maxcount++;
            }
          }  
          return Math.max(len,(maxfreq-1)*(n+1)+maxcount);
          
        }
        
    }
