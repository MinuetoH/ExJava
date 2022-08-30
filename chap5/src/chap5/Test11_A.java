package chap5;
/*
int[][] score = {
			{90,80,70},
			{95,85,75},
			{70,80,75},
			{75,70,85},
			{70,75,80}
	}; 
* score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
* score 배열의 내용을 result에 저장하고,
* 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
[결과]
1번:	90	80	70	240	
2번:	95	85	75	255	
3번:	70	80	75	225	
4번:	75	70	85	230	
5번:	70	75	80	225	
합계	400	390	385	1175	
*/
public class Test11_A {
	public static void main(String[] args) {
	    int[][] score = {
					{90,80,70},
					{95,85,75},
					{70,80,75},
					{75,70,85},
					{70,75,80}
		};
	    //score[5][3] 크기의 배열   : 0~4행인덱스, 0~2열인덱스
	    //result[6][4] 크기의 배열  ; 0~5행인덱스, 0~3열인덱스
	    //가로 세로가 1씩 더큰 배열 생성
	    int[][] result = new int[score.length+1][score[0].length+1];
	    //result 배열값 채우기
	    for(int i=0;i<score.length;i++) {
	    	for(int j=0;j<score[i].length;j++) {
	    		result[i][j]=score[i][j];  //주어진값 저장
	    		result[i][score[i].length] +=score[i][j];//행의합 :마지막열
	    		result[score.length][j] += score[i][j];  //열의합 :마지막행
	    		result[score.length][score[i].length] += score[i][j];//전체합
	    	}
	    }
	    for(int i=0;i<result.length;i++) {
	    	if (i == result.length-1)  //마지막행
	    	    System.out.print("합계\t");
	    	else
	    	    System.out.print((i+1)+"번:\t");
	    	for(int j=0;j<result[i].length;j++) {
	    		System.out.print(result[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
	}
}