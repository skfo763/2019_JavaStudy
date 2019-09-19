package com.company;

import java.util.Scanner;

/* 위 키워드는 Java에서 예약어로 지정해놓은 단어들입니다.
abstract  continue  for         new        switch
assert    default   goto        package    synchronized
boolean   do        if          private    this
break     double    implements  protected  throw
byte      else      import      public     throws
case      enum      instanceof  return     transient
catch     extends   int         short      try
char      final     interface   static     void
class     finally   long        strictfp   volatile
const     float     native      super      while
해당 단어는 변수명으로 사용할 수 없습니다.
 */
// 변수를 선언할 때에는 특수문자, 키워드를 사용할 수 없고, 숫자를 맨 처음으로 사용할 수 없습니다.

// "//"를 사용하면 해당 슬래시 이후의 모든 문자를 주석처리할 수 있습니다.
/*  이 주석 문자를 사용하면 두 문자 사이의 모든 문자(줄 띄우기 포함)를 주석처리할 수 있습니다.  */

/* 자주 쓰는 변수 타입 목록
int
long
double
boolean
char
String
StringBuffer
List
Map
 */

public class Main {


    public static void main(String[] args) {        // main 메소드
        int a;          // int형 변수 a
        char b;         // char형 변수 b
        boolean c;      // boolean형 변수 c
        String d;       // String형 변수 d

        Scanner sc = new Scanner(System.in);        // 콘솔창 입력을 위한 Scanner 클래스 선언
        System.out.println("숫자 입력 : ");
        a = sc.nextInt();
        sc.nextLine();

        System.out.println("문자 입력 : ");
        b = sc.next().charAt(0);
        sc.nextLine();

        if(a >= 0) {
            c = true;
        } else {
            c = false;
        }

        System.out.println("문자열 입력 : ");
        d = sc.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

    /*
    Java는 모두 클래스로 구성되어 있습니다.
    클래스는 선언된 변수를 의미하는 '멤버 필드'와, 해당 변수를 활용해 조작/제어 등의 기능을 수행하는 '멤버 메소드'로 이루어져 있습니다.
    */
}
