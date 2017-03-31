/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *	   |_ Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * <pre>
 *
 * @author hojun
 * @version : 1.0
 */
public class Question {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] questions = {"1. 가장 좋아하는 가수는?", "2. 가장 좋아하는 배우는?", "가장 좋아하는 과목은?"};
		String[] answers = {"박효신", "한지민", "응용 프로그래밍"};
		String[] a = {"가수는? ", "배우는? ", "과목은? "};
		for(int i=0; i<3; i++){
			System.out.println(questions[i]);
			String answer = scanner.nextLine();
			if(answer.equals(answers[i])){
				System.out.println("정답입니다!");
			}
			else System.out.println("틀렸습니다!");
			
		}
		System.out.println("<<결과 출력>>");
		for(int j=0; j<3; j++){
			StringBuilder sb = new StringBuilder("가장 좋아하는 ");
			sb.append(a[j]).append(answers[j]).append("입니다.");
			System.out.println(sb);
		}

	}

}
