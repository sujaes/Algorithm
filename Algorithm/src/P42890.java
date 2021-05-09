//import java.util.*;
//
//public class ÈÄº¸Å° {
//	String[][] relation;
//	int colSize;
//	boolean[] select;
//	List<int[]> candidates = new ArrayList<>();
//
//	public int solution(String[][] relation) {
//		this.relation = relation;
//		this.colSize = relation[0].length;
//		this.select = new boolean[colSize];
//		for (int i = 0; i < colSize; i++) {
//			dfs(0, 0, i + 1);
//		}
//		return candidates.size();
//	}
//
//	private void dfs(int idx, int cnt, int selectSize) {
//		if (cnt == selectSize) {
//			List<Integer> tempColumns = new ArrayList<>();
//			for (int i = 0; i < colSize; i++) {
//				if (select[i])
//					tempColumns.add(i);
//			}
//			if (!isUnique(tempColumns))
//				return;
//			int[] candidate = new int[colSize + 1];
//			for (Integer col : tempColumns) {
//				candidate[col] = 1;
//				candidate[colSize]++;
//			}
//			add(candidate);
//		}
//		for (int i = idx; i < colSize; i++) {
//			if (select[i])
//				continue;
//			select[i] = true;
//			dfs(i, cnt + 1, selectSize);
//			select[i] = false;
//		}
//	}
//
//	private boolean isUnique(List<Integer> columns) {
//		Set<String> tempTuples = new HashSet<>();
//		for (String[] tuple : relation) {
//			StringBuilder sb = new StringBuilder();
//			for (Integer col : columns) {
//				sb.append(tuple[col]);
//			}
//			if (!tempTuples.add(sb.toString()))
//				return false;
//		}
//		return true;
//	}
//
//	private void add(int[] requestCandidate) {
//		for (int[] candidate : candidates) {
//			int cnt = 0;
//			for (int i = 0; i < requestCandidate.length - 1; i++) {
//				if ((candidate[i] & requestCandidate[i]) == 1)
//					cnt++;
//				if (candidate[colSize] == cnt)
//					return;
//			}
//		}
//		this.candidates.add(requestCandidate);
//	}
//}
