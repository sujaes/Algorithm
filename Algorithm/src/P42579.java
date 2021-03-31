//import java.util.*;
//class Solution {
//    public int[] solution(String[] genres, int[] plays) {
//        Map<String,Integer> map = new HashMap<String,Integer>();
//        PriorityQueue<Song> pq = new PriorityQueue<Song>();
//        List<Integer> list = new ArrayList<Integer>();
//        for(int i = 0 ; i < genres.length;i++){
//            if(map.get(genres[i])==null){
//                map.put(genres[i],plays[i]);
//            }else{
//                int value = map.get(genres[i]);
//                map.put(genres[i], plays[i]+ value);
//            }            
//        }
//        for(int i = 0 ; i < genres.length ;i++){
//            pq.add(new Song(genres[i], plays[i], i, map.get(genres[i])));
//        }  
//        
//        // while(!pq.isEmpty()){
//        //     Song s = pq.poll();
//        //     System.out.println(s.index);
//        // }
//        int count = 0;
//        String g = "";
//        while(!pq.isEmpty()){
//            Song s = pq.poll();
//            if(count < 2){
//                g = s.gen;
//                list.add(s.index);
//                count++;
//            }else{
//                if(!pq.isEmpty()){
//                    if(s.gen.equals(g)){
//                        continue;
//                    }else{
//                        list.add(s.index);
//                        count =1;
//                    }
//                }
//            }
//
//        }
//        
//        int[] answer = new int[list.size()];
//        for(int i = 0 ; i < list.size();i++){
//            answer[i] = list.get(i);
//        }
//        return answer;
//        
//    }
//    public static class Song implements Comparable<Song>{
//        String gen; //장르
//        int gennum; //플레이 합 
//        int plays;  //플레이 수
//        int index;  //인덱스
//        public Song(String gen,int plays,int index,int gennum){
//            this.gen = gen;
//            this.gennum = gennum;
//            this.plays = plays;
//            this.index = index;
//        }
//        public int compareTo(Song o){
//            if(o.gennum - this.gennum == 0 ){
//                if(o.plays - this.plays == 0){
//                    return this.index - o.index;            
//                }else{
//                    return o.plays - this.plays;
//                }   
//            }else{
//                if( o.gennum > this.gennum){
//                    return o.gen.compareTo(this.gen);
//                }else{
//                    return o.gen.compareTo(this.gen);
//                }
//            }
//            
//        }
//    }
//}

//
//import java.util.*;
//
//class Solution {
//    
//    class Song implements Comparable<Song> {
//        int id, play;
//        String genre;
//        
//        Song(int id, int play, String genre){
//            this.id = id;
//            this.play = play;
//            this.genre = genre;
//        }
//        
//        @Override
//        public int compareTo(Song o){
//            if(this.play == o.play){
//                return this.id - o.id;
//            } else {
//                return -(this.play - o.play);
//            }
//        }
//    }
//    
//    ArrayList<Integer> bestAlbum;
//    ArrayList<Song> songList;
//    HashMap<String, Integer> genreMap;
//    HashMap<String, Integer> albumMap;
//    
//    public int[] solution(String[] genres, int[] plays) {
//        bestAlbum = new ArrayList<>();
//        songList = new ArrayList<>();
//        genreMap = new HashMap<>();
//        albumMap = new HashMap<>();
//        
//        for(int i = 0 ; i < genres.length ; ++i){
//            int id = i;
//            int play = plays[i];
//            String genre = genres[i];
//            
//            songList.add(new Song(id, play, genre));
//            
//            if(genreMap.containsKey(genre)){
//                genreMap.put(genre, genreMap.get(genre) + play);
//            } else {
//                genreMap.put(genre, play);
//            }
//        }
//        
//        Collections.sort(songList, new Comparator<Song>(){
//           @Override
//            public int compare(Song s1, Song s2){
//                if(s1.genre.equals(s2.genre)){
//                    return s1.compareTo(s2);
//                } else {
//                    return -(genreMap.get(s1.genre) - genreMap.get(s2.genre));
//                }
//            }
//        });
//        
//        for(Song song : songList){
//            if(!albumMap.containsKey(song.genre)){
//                albumMap.put(song.genre, 1);
//                bestAlbum.add(song.id);
//            } else {
//                int genreCnt = albumMap.get(song.genre);
//                
//                if(genreCnt >= 2) continue;
//                else {
//                    albumMap.put(song.genre, genreCnt + 1);
//                    bestAlbum.add(song.id);
//                }
//            }
//        }
//        
//        int[] answer = new int[bestAlbum.size()];
//        for(int i = 0 ; i < answer.length ; ++i){
//            answer[i] = bestAlbum.get(i);
//        }
//        
//        return answer;
//    }
//}