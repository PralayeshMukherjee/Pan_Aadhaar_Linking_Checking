package Project;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private static Map<String,Pan> panMap = new HashMap<>();
    static{
        panMap.put("ABCD1234",new Pan("ABCD1234","123456789","HDFC","FD,Stock"));
        panMap.put("EFGH5678",new Pan("EFGH5678","234567891","Axis","ELSS Fund,Mutual Fund"));
    }
    public Pan getPanbyAadhaar(String aadhaarNumber){
        for(Pan pan:panMap.values()){
            if(pan.getAadharNumber().equals(aadhaarNumber)){
                return pan;
            }
        }
        return null;
    }
}
