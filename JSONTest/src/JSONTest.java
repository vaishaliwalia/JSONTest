import com.google.gson.Gson;

public class JSONTest {
	int var1;
	String var2;
	String var3;
	
	public static void main(String[] args) {
		JSONTest obj = new JSONTest();
		System.out.println(obj.parse("{\"var1\":1, \"var2\":\"value2\", \"var3\":\"value3\"}").toString());
	}
	
	public JSONTest parse(String json) {
		Gson gson = new Gson();
		return gson.fromJson(json, JSONTest.class);   	
	}
	
	public String toString() {
		return "var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3;
	}
}
