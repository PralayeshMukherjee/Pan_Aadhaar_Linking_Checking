package Project;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    private static Map<String,Aadhaar> aadhaarMap = new HashMap<>();
    static {
        aadhaarMap.put("123456789",new Aadhaar("123456789","Raj Mukherjee","Biren Mukherjee","Kolkata"));
        aadhaarMap.put("234567891",new Aadhaar("234567891","Anjan Sarkar","Anil Kumar Sarkar","Belghoriya"));
    }
    public Aadhaar getAadhaarByNumber(String aadhaarNumber){
        return aadhaarMap.get(aadhaarNumber);
    }
}
