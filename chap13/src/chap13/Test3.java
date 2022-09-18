package chap13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * EastCard, CardDeck, Player를 이용하여 다음 구동 클래스를 완성하시오
 [결과]
[1K, 2, 3K, 4, 5, 6, 7, 8K, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[6, 7, 5, 4, 5, 8, 9, 10, 2, 3, 10, 4, 1K, 6, 1, 7, 2, 3K, 9, 8K]
게임할 인원수를 입력하세요(최대:10)
5
1등:2번(5,4):9
1등:4번(9,10):9
3등:5번(2,3):5
4등:1번(6,7):3
4등:3번(5,8):3
 */
public class Test3 {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle();
		Scanner scan = new Scanner(System.in);
		int gameCnt = 0;
		while(gameCnt < 2 || gameCnt > 10) { 
			   System.out.println("게임할 인원수를 입력하세요(2~10)");
			   gameCnt = scan.nextInt();
		}   
		List<Player> list = new ArrayList<>();
		for(int i=0;i<gameCnt;i++) {
			list.add
			(new Player((i+1)+"번",deck.pick(),deck.pick()));
		}
// 		System.out.println("단순 등수 : ");
//		Collections.sort(list, (o1,o2)->o2.getScore() - o1.getScore());
//		System.out.println("등수:");
//		int i=0;
//		for(Player g : list) {
//		   System.out.println(++i + "등:" + g);
//		}
//		
 		System.out.println("동점자 등수 : ");
		Map<Integer,List<Player>> rank = 
				               new TreeMap<>(Comparator.reverseOrder());
		for(Player g : list) {
			List<Player> eqrank = rank.get(g.getScore());
			if(eqrank == null) //해당점수를 가진 Player가 없는 경우
				eqrank = new ArrayList<>();
			eqrank.add(g);
			rank.put(g.getScore(), eqrank);
		}	
		int r = 0;
		//rank.values() : value 값들만 조회
		for(List<Player> l : rank.values()) {
			for(Player g : l) 
				System.out.println((r+1) + "등:" + g);
			r += l.size();
		}		
	}
}