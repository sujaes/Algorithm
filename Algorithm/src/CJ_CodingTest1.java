import java.util.ArrayList;
import java.util.List;

public class CJ_CodingTest1 {

	public static void main(String[] args) {
		String url = "https://www.naver.com?abc=123&bcd[]=234&bcd[]=345&cde=456";
		String keys[] = {"abc","bcd"};
		String urls[] = new String[2];
		String params[];
		String param[];
		String kv = "";
		List<Par> list = new ArrayList<Par>();
		urls = url.split("\\?");
		params = urls[1].split("&");
		for(int i  = 0;i<params.length;i++) {
			param= params[i].split("=");
			System.out.println(param[0] + " " + param[1]);
			
			for(int j = 0 ; j < keys.length; j++) {
				if(keys[j].equals(param[0]) || (keys[j]+"[]").equals(param[0])) {
					list.add(new Par(param[0],param[1]));
				}
			}
		}		
		for(int i = 0 ; i < list.size();i++) {
			kv += list.get(i).k + "="+list.get(i).v +"&";
		}
		String answer = urls[0]+"?"+kv;
		answer = answer.substring(0,answer.length()-1);
		System.out.println(answer);
	}
	
	public static class Par{
		String k;
		String v;
		public Par(String k,String v) {
			this.k = k;
			this.v = v;
		}
	}
}
