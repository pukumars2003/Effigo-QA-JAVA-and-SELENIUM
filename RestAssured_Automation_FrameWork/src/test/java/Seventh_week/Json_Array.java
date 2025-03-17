package Seventh_week;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

 
public class Json_Array {
 
    @Test
    public void passBodyAsJsonArray() {
 
        // JSON Object for first employee
        JSONObject data1 = new JSONObject();
 
        data1.put("firstname", "Tom");
        data1.put("lastname", "Mathew");
        data1.put("age", 59);
        data1.put("salary", 720000);
 
        // JSON Object for second employee
        JSONObject data2 = new JSONObject();
 
        data2.put("firstname", "Perry");
        data2.put("lastname", "David");
        data2.put("age", 32);
        data1.put("salary", 365000);
 
        // Creating first JSON array
        JSONArray array1 = new JSONArray();
        array1.put(data1);
 
        // Creating second JSON array
        JSONArray array2 = new JSONArray();
        array2.put(data2);
 
        // Create JSON Object to add both JSONArrays
        JSONObject data3 = new JSONObject();
        data3.put("employee1", array1);
        data3.put("employee2", array2);
 
        System.out.println(data3.toString(4));
 
    }}