/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *	   |_ Operator
 * 
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 13.
 * <pre>
 *
 * @author hojung
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<디미베네 연간 인건비>>");
		long a=1700000l;	//월 평균 급여
		long b=3l;	//점포 내 직원 수
		long c=1500l;	//점포 수
		System.out.println("월 평균 급여 : " + String.format("%,d", a)+"원");
		System.out.println("점포 내 직원 수 : " + String.format("%,d", b) + "명");
		System.out.println("점포 수 : " + String.format("%,d", c) + "개");
		System.out.println("연간 인건비 : " + String.format("%,d", a*12*b*c) + "원");
	}

}
