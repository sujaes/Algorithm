import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Q12015 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int n = Integer.parseInt( br.readLine() ), i;
		StringTokenizer st = new StringTokenizer( br.readLine() );
		br.close();
		
		List<Integer> list = new ArrayList<>();	// �����ϴ� �κ� ������ ����Ʈ�� ����
        list.add( 0 );		// ������ �ּڰ��� 1�̹Ƿ� �񱳸� ���� 0�� �̸� �־���
       
        int value, left, right, mid;
    	for( i = 0; i < n; i++ ) {
        	value = Integer.parseInt( st.nextToken() );	
			// ������ ���� ����Ʈ�� �� �� ������ ũ�� ����Ʈ�� ����	
        	if( value > list.get( list.size()-1 ) ) 
        		list.add( value );	
			// �� ������ ����Ʈ �ȿ��� �̺�Ž���� �Ͽ� �˸��� �ڸ��� ���� ��ġ
        	else {				
            	left = 0; 
            	right = list.size()-1;
            	while( left < right ) {
                	mid = ( left + right ) / 2;  // ( >> 1 )
                	if( value <= list.get( mid )  )
                    	right = mid;
                	else
                    	left = mid + 1;
            	}
            	list.set( right, value );
        	}
    	}

    	System.out.println( list.size()-1 );
	}
}