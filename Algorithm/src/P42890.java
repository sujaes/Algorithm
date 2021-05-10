//import java.util.*;
//
//public class Solution {
//	static int colSize;
//	static boolean[] select;
//	List<int[]> candidates = new ArrayList<>();
//	String[][] relation;
//	
//	public int solution(String[][] relation) {
//		this.relation = relation;
//		colSize = relation[0].length;			//속성갯수
//		select = new boolean[colSize];
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
//				if (select[i]) {
//					tempColumns.add(i);
//				}
//					
//			}
//			if (!isUnique(tempColumns)) {
//				return;
//			}
//			int[] candidate = new int[colSize + 1];
//			for (Integer col : tempColumns) {
//				candidate[col] = 1;		//해당속성
//				candidate[colSize]++;	//최소성확인
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
//			if (!tempTuples.add(sb.toString()))			//이미 있으면 false
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


//import java.util.ArrayList;
//import java.util.HashSet;
//
//class Solution {
//	public int solution(String[][] relation) {
//		int rowSize = relation.length;
//		int colSize = relation[0].length;
//		ArrayList<Integer> list = new ArrayList<>();
//		for (int i = 1; i < (1 << colSize); i++) {
//			if (!checkMinimality(i, list))
//				continue;
//			if (!checkUniqueness(i, relation, rowSize, colSize))
//				continue;
//			list.add(i);
//		}
//		return list.size();
//	}
//
//	private boolean checkMinimality(int set, ArrayList<Integer> list) {
//		for (int key : list) {
//			if ((set & key) == key)
//				return false;
//		}
//		return true;
//	}
//
//	private boolean checkUniqueness(int set, String[][] relation, int rowSize, int colSize) {
//		ArrayList<Integer> s = getSet(set, colSize);
//		HashSet<String> hashSet = new HashSet<>();
//		for (int i = 0; i < rowSize; i++) {
//			StringBuilder sb = new StringBuilder();
//			for (int j : s) {
//				sb.append(relation[i][j]).append(" ");
//			}
//			hashSet.add(sb.toString());
//		}
//		return hashSet.size() == rowSize;
//	}
//
//	private ArrayList<Integer> getSet(int set, int colSize) {
//		ArrayList<Integer> result = new ArrayList<>();
//		for (int i = 0; i < colSize; i++) {
//			if (((set >> i) & 1) == 1)
//				result.add(i);
//		}
//		return result;
//	}
//}
