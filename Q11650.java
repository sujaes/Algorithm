package git;

//11650번 문제 시간초과
//import java.util.*;
//public class Main {
//  public static void main(String[] args){
//  	Scanner sc  =new Scanner(System.in);
//  	int n = sc.nextInt();
//  	int a[] = new int[n];
//  	int b[] = new int[n];
//  	int temp;
//  	for(int i = 0 ; i <n;i++){
//  		a[i]=sc.nextInt();
//  		b[i]=sc.nextInt();
//  	}
//  	for(int i = 0 ; i < n; i++){
//  		for(int j = 0;j<i;j++){
//  			if(a[i]<a[j]){
//  				temp = a[i];
//  				a[i]=a[j];
//  				a[j]=temp;
//  				temp = b[i];
//  				b[i]=b[j];
//  				b[j]=temp;
//  			}else if(a[i]==a[j]){
//  				if(b[i]<b[j]){
//  					temp=b[i];
//  					b[i]=b[j];
//  					b[j]=temp;
//  				}
//  			}
//  		}
//  	}
//  	for(int i = 0 ; i <n;i++){
//  		System.out.println(a[i]+" "+b[i]);
//  	}
//	}	
//}


//11650번 문제 Map사용
import java.util.*; 
public class Q11650{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int count = sc.nextInt();
      Map<Integer, List<Integer>> datas = new LinkedHashMap<>();
      for (int i = 0; i < count; i++) {
          int x = sc.nextInt();
          int y = sc.nextInt();

          // x 좌표를 키로 y 좌표들을 보관하고 있는 List를 value로 사용함.
          if (datas.containsKey(x)) {
              insertSort(datas.get(x), y);
          } else {
              List<Integer> dataList = new LinkedList<>();
              insertSort(dataList, y);
              datas.put(x, dataList);
          }
      }
      // 키 값들을 정렬한 후 stream에 foreach를 사용하여 정렬
      datas.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e -> {
          int key = e.getKey();
          for (Integer value : e.getValue()) {
              System.out.println(key + " " + value);
          }
      });
  }
  private static void insertSort(List<Integer> list, int insertData) {
      for (int index = 0; index < list.size(); index++) {
          if (list.get(index) > insertData) {
              list.add(index, insertData);
              return;
          }
      }
      list.add(insertData);
  }
}
