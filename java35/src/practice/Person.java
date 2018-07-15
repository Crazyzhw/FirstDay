package practice;
/**
 * 创建一个Person（包含姓名，年龄，和分数）类型的集合，
 * 实现对集合中元素按照分数降序的排序，如果分数相同，按照年龄的升序进行排序。（15分）
 
 *
 */
public class Person implements Comparable<Person> {
	String name ;
	int age;
	double  score;
	public Person(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public Person() {
		super();
	}
	@Override
	public int compareTo(Person o) {
		if(o.score>this.score) {
		 return 1;	
		}else if(o.score<this.score) {
			return -1;
		}else {
			return  this.name.compareTo(o.name);
		}
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
}
