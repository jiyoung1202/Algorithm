### HashMap이란?

Map인터페이스의 한 종류. Key와 Value를 묶어 하나의 entry로 저장한다는 특징을 갖고 있다. Hashing을 사용하기 때문에 많은 양의 데이터를 검색하는데 뛰어난 성능을 보임.

Key값은 중복이 되지 않고, value값은 중복이 허용된다.



~~~java
HashMap<String , Integer> map = new HashMap<String , Integer>();
      Map<String, Integer> map = new HashMap<String, integer>();
Map.put("key", value) //haspmap에 데이터 넣기
Map.containsKey("key") //key값 존재여부 확인
getKey(), getValue /key, value 값 호출
~~~

