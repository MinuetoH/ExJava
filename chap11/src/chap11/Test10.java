package chap11;
/*
 * I am honored to be with you today at your commencement 
 * from one of the finest universities in the world. 
 * I never graduated from college. Truth be told, 
 * this is the closest I've ever gotten to a college graduation. 
 * 문자 중에서 ‘a'부터 ’z'까지가 각각 몇 개 존재하는지 비율을 조사하시오.
 * 단 대문자는 소문자로 인식하여 처리한다.
 [결과]
a -> 8 ,  4.706%
b -> 2 ,  1.176%
c -> 5 ,  2.941%
d -> 7 ,  4.118%
e -> 25 , 14.706%
f -> 4 ,  2.353%
g -> 5 ,  2.941%
h -> 7 ,  4.118%
i -> 12 ,  7.059%
j -> 0 ,  0.000%
k -> 0 ,  0.000%
l -> 7 ,  4.118%
m -> 6 ,  3.529%
n -> 10 ,  5.882%
o -> 19 , 11.176%
p -> 0 ,  0.000%
q -> 0 ,  0.000%
r -> 11 ,  6.471%
s -> 7 ,  4.118%
t -> 20 , 11.765%
u -> 6 ,  3.529%
v -> 4 ,  2.353%
w -> 2 ,  1.176%
x -> 0 ,  0.000%
y -> 3 ,  1.765%
z -> 0 ,  0.000%
 */
public class Test10 {
	public static void main(String[] args) {
		String msg = "I am honored to be with you today at your commencement "
				+ "from one of the finest universities in the world. "
				+ "I never graduated from college. Truth be told, "
				+ "this is the closest I've ever gotten to a college graduation. ";
		
		msg = msg.toLowerCase();
		int chcnt=0;
		int cnt[]=new int[26];
		char ch;
		for(int i=0; i<msg.length( ); i++) {
		  if(msg.charAt(i)>='a'&& msg.charAt(i)<='z') {
		     cnt[msg.charAt(i)-'a']++;
		     chcnt++;
		  }   
		}   
		for(int i=0; i<26; i++){
		     ch=(char)('a'+i);
		     System.out.printf
		     ("%c -> %d , %6.3f%c\n",ch,cnt[i],(cnt[i]*100.0/chcnt),'%');
		     System.out.println
		     (ch+" => "+cnt[i] +" , " + String.format("%6.3f",cnt[i]*100.0/chcnt)+'%');
	      }
	}
}