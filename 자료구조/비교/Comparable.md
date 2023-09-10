### Comparable

Comparable 인터페이스는 객체를 정렬하는 데 사용되는 메소드인 compareTo() 메소드를 정의하고 있다.

자바에서 같은 타입의 인스턴스를 서로 비교해야만 하는 클래스들은 모두 Comparable 인터페이스를 구현하고 있다.

따라서 Boolean을 제외한 래퍼 클래스나 String, Time, Date와 같은 클래스의 인스턴스는 모두 정렬 가능하다.

이때 기본 정렬 순서는 작은 값에서 큰 값으로 정렬되는 오름차순이 된다.

Comparable 인터페이스는 다음과 같은 메소드를 사용하여 객체를 정렬한다.

+ 메소드
    + int compareTo(T o) 해당 객체와 전달된 객체의 순서를 비교함.
    + Comparator<T> 인터페이스
    + Comparator 인터페이스는 Comparable 인터페이스와 같이 객체를 정렬하는 데 사용되는 인터페이스.
    + Comparable 인터페이스를 구현한 클래스는 기본적으로 오름차순으로 정렬된다.
    
### Comparator
Comparator 인터페이스는 내림차순이나 아니면 다른 기준으로 정렬하고 싶을 때 사용할 수 있다

Comparator 인터페이스를 구현하면 오름차순 이외의 기준으로도 정렬할 수 있게 된다

이때 Comparator 인터페이스를 구현한 클래스에서는 compare() 메소드를 재정의하여 사용하게 된다

Comparator 인터페이스는 다음과 같은 메소드를 사용하여 객체를 정렬한다.

+ 메소드
  + int compare(T o1, T o2)	전달된 두 객체의 순서를 비교함.
  + boolean equals(Object obj) 해당 comparator와 전달된 객체가 같은지를 확인함.
  + default Comparator<T> reversed() 해당 comparator의 역순인 comparator를 반환함.