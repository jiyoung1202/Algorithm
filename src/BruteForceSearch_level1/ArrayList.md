### ArrayList 장점

- **동적으로 크기가 변경된다. - ArrayList를 사용하는 가장 핵심적인 이유**

예)   
~~~java
  ArrayList<String> list = new ArrayList<String>();
  
  list.add("One");
  
  list.add("Two");
  
  System.out.println(list.size()); //2
  
  list.remove("Two");
  
  System.out.println(list.size()); //1
~~~

- 특정위치에 element를 추가/삭제 할 수 있다. Array 는 이경우 시프트를 해야한다. 
- 다양한 메소드를 지원한다.
- generic이 사용되지 않는다면, 다양한 타입의 객체를 저장할 수 있다.
- 여러개의 null element를 저장할 수 있다. 
- 무작위 접근이 가능하다.
- 삽입, 삭제가 빈번하게 발생하는 프로세스의 경우 좋지않다. 
- 자료들을 하나의 연속적인 묶음으로 묶어 자료를 저장한다.