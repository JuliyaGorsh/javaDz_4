
//1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. Постараться не обращаться к листу по индексам.


import java.util.LinkedList;
public class DZ_4 {
	public static void main(String[] args) {
		turnLinkedList(newLinkedList());
	}
	public static LinkedList<Integer> newLinkedList(){
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 1; i < 6; i++) {
			list.add(i);
		}
		System.out.println(list);
		return list;
	}
	public static void turnLinkedList(LinkedList<Integer> list){
		LinkedList<Integer> list1 = new LinkedList<>();
		for (int i = 0; i < list.size()+4; i++) {
			list1.add(list.getLast());
			list.removeLast();
		}
		System.out.println(list1);
	}
}

//2.Реализуйте очередь с помощью LinkedList со следующими методами: enqueue() - помещает элемент в конец очереди,
//	dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.


//public class DZ_4 {
//	public static void main(String[] args) {
//		ListQueue queue = new ListQueue();
//		for (int i = 0; i < 10; i++) {
//			queue.enqueue(i);
//		}
//		System.out.println(queue.doString());
//		System.out.println(queue.dequeue());
//		System.out.println(queue.first());
//	}
//}



//3.Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор


//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.Random;
//
//public class DZ_4 {
//	public static void main(String[] args) {
//		LinkedList<Integer> list = new LinkedList<>();
//		Random random = new Random();
//				for (int i = 1; i < 6; i++) {
//			list.add(random.nextInt(1, 10));
//		}
//		System.out.println(list);
//		Iterator iterator = list.iterator();
//		int result = 0;
//		while (iterator.hasNext()) {
//			result = result + (int) iterator.next();
//		}
//		System.out.printf("Сумма всех элементов: %d", result);
//	}
//}


