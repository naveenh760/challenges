package previous;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CleverTap {

    static int computeDeviceCrossovers(int n, int[] websiteVisits, int m, int[] appVisits){
        Map<Integer, String> visitMap = new TreeMap<Integer,String>();
        for(int i = 0; i < websiteVisits.length; i++){
            visitMap.put(websiteVisits[i],"website");
        }
        for(int i = 0; i < appVisits.length; i++){
            visitMap.put(appVisits[i], "app");
        }
        int result = 0;
        Object[] keyArr = visitMap.keySet().toArray();
        for(int i = 0; i < keyArr.length - 1; i++){
            int currentTS = (int) keyArr[i];
            int nextTS = (int) keyArr[i + 1];
            String currentDevice = visitMap.get(currentTS);
            String nextDevice = visitMap.get(nextTS);
            if(!currentDevice.equals(nextDevice)){
                result++;
            }
        }

        return result;

    }

}
