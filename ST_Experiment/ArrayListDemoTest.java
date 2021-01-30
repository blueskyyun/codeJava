import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.function.Consumer;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.evosuite.instrumentation.error.LinkedListInstrumentation;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import com.sun.org.apache.bcel.internal.generic.NEW;






public class ArrayListDemoTest {

//	@Ignore
	@Test
	public void testConstruct() {
		ArrayListDemo<Integer> aLD1 = new ArrayListDemo<Integer>();
//		System.out.println(aLD1.size());
		
		/**
		 * test trimToSize() 省略else 分支
		 */
		aLD1.trimToSize();
		ArrayListDemo<Integer> aLD2 = new ArrayListDemo<Integer>(20);
		/**
		 * test trimToSize() if 1分支
		 */
		aLD2.trimToSize();
		
		ArrayListDemo<Integer> aLD2_3 = new ArrayListDemo<Integer>(20);
		/**
		 * ensureCapacityInternal(size=0 + 1)
		 * calculateCapacity(elementData, minCapacity) else分支 
		 * ensureExplicitCapacity() else分支
		 * test add(E)
		 */
		aLD2_3.add(8);
		/**
		 * test trimToSize() if 2分支
		 */
		aLD2_3.trimToSize();
		ArrayListDemo<Integer> aLD1_1 = new ArrayListDemo<Integer>();
		/**
		 * ensureCapacityInternal(size=0 + 1)
		 * calculateCapacity(elementData, minCapacity) if分支 
		 * ensureExplicitCapacity() else分支
		 * 
		 */
		aLD1_1.add(9);
		
		ArrayListDemo<Integer> aLD2_4 = new ArrayListDemo<Integer>(1);
		/**
		 * ensureCapacityInternal(size=0 + 1)
		 * calculateCapacity(elementData, minCapacity) if分支 
		 * ensureExplicitCapacity() if分支
		 * 
		 */
		aLD2_4.add(9);
		aLD2_4.add(19);
		
		ArrayListDemo<Integer> aLD2_1 = new ArrayListDemo<Integer>(0);
		
		
		try {
			ArrayListDemo<Integer> aLD2_2 = new ArrayListDemo<Integer>(-3);
			
		} catch (IllegalArgumentException e) {
			verifyException("ArrayListDemo", e);
		}
		TreeSet set = new TreeSet<>();
		ArrayListDemo<Integer> aLD3_1 = new ArrayListDemo<Integer>(set);
		set.add("aaa");
		set.add("bbb");
		ArrayListDemo<Integer> aLD3 = new ArrayListDemo<Integer>(set);
		/**
		 * test size()
		 */
		assertEquals(aLD3.size(), 2);
		List<String> stringList= Arrays.asList("test");
		ArrayListDemo aLD3_2 = new ArrayListDemo(stringList);
	}

	/**
	 * ensureCapacity()
	 * grow()
	 * isEmpty()
	 */
//	@Ignore
	@Test
	public void testEnsureCapacity() {
		/**
		 * test ensureCapacity(minCapacity) ? f else 分支
		 */
		ArrayListDemo<Integer> aLD1 = new ArrayListDemo<Integer>();
		aLD1.ensureCapacity(5);
		/**
		 * test ensureCapacity(minCapacity) ? t if 分支  
		 * grow(minCapacity) 1if分支 1else分支 2else分支
		 */
		ArrayListDemo<Integer> aLD2 = new ArrayListDemo<Integer>(2);
		aLD2.ensureCapacity(5);
		aLD2.ensureCapacity(6);
		
		///OutOfMemoryError: Java heap space
//		/**
//		 * grow(minCapacity) 2if分支
//		 * huge()
//		 */
//		ArrayListDemo<Character> aLD2_2 = new ArrayListDemo<Character>(1431655761);
//		aLD2_2.ensureCapacity(1431655762);
//	Object[] objects = new Object[1431655762];
		
		assertTrue(aLD2.isEmpty());
	}
	/**
	 * test contains(Object o)
	 * indexOf(Object o)
	 * lastIndexOf(Object o)
	 */
//	@Ignore
	@Test(expected=NoSuchElementException.class)
	public void testContains() {
		ArrayListDemo<Integer> aLD1 = new ArrayListDemo<Integer>();
		aLD1.add(124);
		aLD1.add(89);
		aLD1.add(54);
		aLD1.add(54);
		assertTrue(aLD1.contains(54));
		assertFalse(aLD1.contains(12));
		aLD1.lastIndexOf(null);
		aLD1.indexOf(null);
		aLD1.add(null);
		aLD1.indexOf(null);
		
		aLD1.lastIndexOf(null);
		aLD1.lastIndexOf(12);
		aLD1.lastIndexOf(54);
		/**
		 * test clone() try{}
		 */
		aLD1.clone();
		/**
		 * test toArray()
		 * toArray(T[] a)
		 */
		Object[] arr1 = aLD1.toArray();
		Integer[] iArr1 = new Integer[5];
		
		//a.length = size
		aLD1.toArray(iArr1);
		//a.length < size
		aLD1.add(1);
		aLD1.toArray(iArr1);
		
		
		//a.length > size
		Integer[] iArr2 = new Integer[7];
		aLD1.toArray(iArr2);
		//test elementData()
		Integer integer = aLD1.elementData(2);
		/**
		 * test get()
		 * rangeCheck()
		 */
		integer = aLD1.get(1);
		try {
			aLD1.get(7);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			verifyException("ArrayListDemo", e);
		}
		/**
		 * test set(int index, E element)
		 */
		aLD1.set(2, 7);
		
		aLD1.add(5, 100);
		
		try {
			aLD1.add(8, 1);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			verifyException("ArrayListDemo", e);
		}
		try {
			aLD1.add(-2, 1);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			verifyException("ArrayListDemo", e);
		}
		/**
		 * remove(int index)
		 * remove(Object o)
		 */
		aLD1.remove(5);
		assertTrue(aLD1.remove(null));
		Integer i3 = 124;
		assertTrue(aLD1.remove(i3));
		Integer i2 = 256;
		assertFalse(aLD1.remove(i2));
		assertFalse(aLD1.remove(null));
		aLD1.remove(3);
		//fastRemove(int index) else分支 numMoved = 0;
		Integer i4 = 54;
		aLD1.remove(i4);
		//test clear()
		aLD1.clear();
		//test addAll(Collection<? extends E> c)
		ArrayListDemo<Character> cArr = new ArrayListDemo<Character>();
		ArrayListDemo<Character> cArr2 = new ArrayListDemo<Character>();
		assertFalse(cArr2.addAll(cArr));
		cArr.add('r');
		cArr.add('e');
		cArr.add('d');
		cArr.add(' ');
		cArr.add('i');
		assertTrue(cArr2.addAll(cArr));
		//test addAll(int index, Collection<? extends E> c)
		assertTrue(cArr2.addAll(1,cArr));
		assertTrue(cArr2.addAll(10,cArr));
		assertFalse(cArr2.addAll(1,new ArrayListDemo<Character>()));
		//test removeRange(int fromIndex, int toIndex)
		cArr2.removeRange(1, 6);
		//test removeAll(Collection<?> c) 
		cArr2.removeAll(cArr);
		//test retain(Collection<?> c)
		cArr2.add('e');
		cArr2.add('j');
		cArr2.add('b');
		cArr2.add('r');
		cArr2.add('e');
		cArr2.add('d');
		cArr2.add(' ');
		cArr2.add('i');
		cArr2.retainAll(cArr);
		ArrayListDemo<String> arr = new ArrayListDemo<String>();
		arr.add("add");
		//test batchRemove(Collection<?> c, boolean complement)
		// if (r != size) 分支没有测
//		System.out.println(cArr2.size());
		//if (w != size)的else分支
		cArr2.removeAll(arr);
//		System.out.println(cArr2.size());
		//writeObject(java.io.ObjectOutputStream s)
		//readObject(java.io.ObjectInputStream s)方法私有且不被其他方法调用，无法被测试
		/**
		 * test listIterator(int index)
		 * listIterator()
		 * iterator()
		 */
		//test listIterator(int index) index < 0分支
		try {
			cArr2.listIterator(-4);
		
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			verifyException("ArrayListDemo", e);
		}
		//test listIterator(int index) index > size分支
		try {
	
			cArr2.listIterator(10);
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			verifyException("ArrayListDemo", e);
		}
		ListIterator<Character> lstItr1 = cArr2.listIterator(3);
		ListIterator<Character> lstItr2 = cArr2.listIterator();
		assertTrue(lstItr1.hasPrevious());
		assertFalse(lstItr2.hasPrevious());
		
		assertEquals(lstItr1.nextIndex(), 3);
		
		assertEquals(lstItr1.previousIndex(), 2);
		//test class ListItr previous()
		Character ch = lstItr1.previous();
		// test previous() if (i < 0)分支
		lstItr2.previous();
		//previous() if (i >= elementData.length) 分支无法测试
		
		cArr2.iterator();
	}
//	@Ignore
	@Test//(expected=ConcurrentModificationException.class )
	public void testListItr_previous() {
		ArrayListDemo<Character> arr1 = new ArrayListDemo<>();
		arr1.add('b');
		arr1.add('e');
		arr1.add('a');
		arr1.add('d');
		arr1.add('?');
		arr1.add('u');
		ListIterator<Character> lstItr1 = arr1.listIterator(2);
		try {
			lstItr1.set('z');
			 fail("Expected an IllegalStateException to be thrown");
		} catch (IllegalStateException e) {
			// TODO: handle exception
//			assertThat(e.getMessage(), is("Index: 0, Size: 0"));
		}
		lstItr1.previous();
		lstItr1.set('j');
		//未测试set() catch分支
		//test class ListItr add() 未测试catch分支
		lstItr1.add('m');
		//test class Itr hasNext()
		assertTrue(lstItr1.hasNext());
		ListIterator<Character> lstItr2 = arr1.listIterator(7);
		assertFalse(lstItr2.hasNext());
		//test next() if(i >= size)分支
		try {
			lstItr2.next();
			 fail("Expected an NoSuchElementException to be thrown");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			
		}
		
		Character ch = lstItr1.next();
		//未测  next() if (i >= elementData.length)分支
		//test class Itr remove() if (lastRet < 0)分支
		ListIterator<Character> lstItr3 = arr1.listIterator(5);
		try {
			lstItr3.remove();
			fail("Expected an IllegalStateException to be thrown");
		} catch (IllegalStateException e) {
			// TODO: handle exception
		}
		lstItr3.next();
		lstItr3.remove();
		//未测 remove() catch分支
		
		//test forEachRemaining(Consumer<? super E> consumer)
		// if (i >= size) 分支
		ListIterator<Character> lstItr4 = arr1.listIterator(6);
		lstItr4.forEachRemaining(String->System.out.println(String+" "));
		//未测if (i >= elementData.length) 分支
		ListIterator<Character> lstItr5 = arr1.listIterator(0);
		lstItr5.forEachRemaining(cha->System.out.print(cha+" "));
		//未测checkForComodification()分支
		/**
		 * test subList(int fromIndex, int toIndex)
		 * subListRangeCheck(int fromIndex, int toIndex, int size)
		 */
		List list = arr1.subList(1, 4);
		try {
			arr1.subListRangeCheck(-1, 5, arr1.size());
			fail("Expected an IndexOutOfBoundsException to be thrown");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			
		}
		try {
			arr1.subListRangeCheck(2, 7, arr1.size());
			fail("Expected an IndexOutOfBoundsException to be thrown");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			
		}
		try {
			arr1.subListRangeCheck(4, 3, arr1.size());
			fail("Expected an IllegalStateException to be thrown");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			
		}
		
		
		/**********************************************/
		///test class SubList, most alike class ArrayListDemo
		/**
		 * test class SubList set(int index, E element)
		 */
		list.set(2, 'e');
		//test class SubList rangeCheck(int index)
		//未测class SubList if (ArrayListDemo.this.modCount != this.modCount)分支
		try {
			list.set(-1, 'e');
			fail("Expected an IndexOutOfBoundsException to be thrown");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		try {
			list.set(3, 'e');
			fail("Expected an IndexOutOfBoundsException to be thrown");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		//test get(int index)
		list.get(1);
		//test size()
		list.size();
		//test add(int index, E e)
		list.add(1,'f');
		//test rangeCheckForAdd(int index)
		try {
			list.add(5, 'r');
			fail("Expected an IndexOutOfBoundsException to be thrown");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		try {
			list.add(-1, 'u');
			fail("Expected an IndexOutOfBoundsException to be thrown");
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		//test remove(int index)
		//test removeRange(int fromIndex, int toIndex)
		
		list.remove(1);
		//test addAll(Collection<? extends E> c)
		//test addAll(int index, Collection<? extends E> c)
		ArrayListDemo<Character> chArr = new ArrayListDemo<Character>();
		assertFalse(list.addAll(chArr));
		chArr.add('w');
		chArr.add('h');
		chArr.add('i');
		chArr.add('t');
		chArr.add('e');
		list.addAll(chArr);
		//test iterator()
		list.iterator();
		//test listIterator(final int index)
		ListIterator<Character> listIterator1 = list.listIterator(3);
		
		
		ListIterator<Character> listIterator2 = list.listIterator(0);
		assertTrue(listIterator1.hasPrevious());
		assertFalse(listIterator2.hasPrevious());
		
		assertEquals(listIterator1.nextIndex(), 3);
		
		assertEquals(listIterator1.previousIndex(), 2);
		//test previous()
		Character crct = listIterator1.previous();
		// test previous() if (i < 0)分支
		try {
			listIterator2.previous();
			fail("Expected an IndexOutOfBoundsException to be thrown");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}
		//previous() if (offset + i >= elementData.length) 分支无法测试
		
		//test hasNext()
		assertTrue(listIterator1.hasNext());
		ListIterator<Character> listIterator3 = list.listIterator(6);
		assertFalse(listIterator3.hasNext());
		//test next() if (i >= SubList.this.size)分支
		try {
			listIterator3.next();
			 fail("Expected an NoSuchElementException to be thrown");
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			
		}
		
		Character ch2 = listIterator1.next();
		//未测  next() (offset + i >= elementData.length)分支
		//test forEachRemaining(Consumer<? super E> consumer)
		// if (i >= size) 分支
		listIterator3.forEachRemaining(String->System.out.println(String+" "));
		//未测if if (offset + i >= elementData.length) 分支
		System.out.println();
		listIterator2.forEachRemaining(cha->System.out.print(cha+" "));
		//未测checkForComodification() if分支
		
		//test class remove() if (lastRet < 0)分支
//		System.out.println("\n"+list.size());
		ListIterator<Character> listIterator01 = list.listIterator(3);
		try {
			listIterator01.remove();
			fail("Expected an IllegalStateException to be thrown");
		} catch (IllegalStateException e) {
			// TODO: handle exception
		}
		listIterator01.next();
		listIterator01.remove();
//		System.out.println("\n"+list.size());
		//未测 remove() catch分支
		
		//test set(E e)
		
		ListIterator<Character> listIterator02 = list.listIterator(0);
		try {
			
			listIterator02.set('z');
			 fail("Expected an IllegalStateException to be thrown");
		} catch (IllegalStateException e) {
			// TODO: handle exception
//			assertThat(e.getMessage(), is("Index: 0, Size: 0"));
		}
		listIterator02.next();
		listIterator02.set('j');
		//未测试set() catch分支
		//test add() 未测试catch分支
		listIterator02.add('m');
		
	}
	
	@Test
	public void testSpliterator() {
		//test forEach(Consumer<? super E> action)
		ArrayListDemo<String> arr1 = new ArrayListDemo<String>();
		arr1.add("I'm");
		arr1.add("fine");
		arr1.add(" how");
		arr1.add("about");
		arr1.add("you");
		arr1.forEach(str->System.out.print(str+' '));
		//未测 forEach if (modCount != expectedModCount)分支
		for(int i = 0; i<15; i++) {
			arr1.add("I'm No"+i);
		}
		/**
		 * test spliterator()
		 * class class ArrayListSpliterator<E> getFence() if else分支
		 */
		Spliterator<String> spliterator01 = arr1.spliterator();
		Spliterator<String> spliterator02 = spliterator01.trySplit();
		/**
		 * test class SubList spliterator()
		 */
		List<String> list=arr1.subList(2, 6);
		list.spliterator();
		//未测 class ArrayListSpliterator<E> getFence() if if分支
		
		//test tryAdvance(Consumer<? super E> action)
		//if (action == null)分支
		try {
			spliterator01.tryAdvance(null);
			fail("Expected an NullPointerException to be thrown");
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		//test if (i < hi)分支
		spliterator01.tryAdvance(str->System.out.println(str+' '));
		//未测else分支
		
		//test forEachRemaining(Consumer<? super E> action)
		//if (action == null)分支
		try {
			spliterator01.forEachRemaining(null);
			fail("Expected an NullPointerException to be thrown");
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		spliterator01.forEachRemaining(str->System.out.println(str+' '));
		//第2个if else分支
		ArrayListDemo<Integer> array= new ArrayListDemo<Integer>();
		Spliterator<Integer> spliterator03 = array.spliterator();
		spliterator03.forEachRemaining(str->System.out.println(str+' '));
		//test estimateSize()
		spliterator01.estimateSize();
		//test characteristics()
		spliterator01.characteristics();
	}
	
	@Test
	public void testRemoveIf() {
		//test removeIf()
		ArrayListDemo<String> arr0 = new ArrayListDemo<String>();
		for(int i =0;i < 20;i++) {
			arr0.add("I'm No" + i);
		}
		arr0.removeIf(obj->obj.contains("5"));
		//未测if (modCount != expectedModCount)分支
		arr0.replaceAll(o->o.contains("1")?o.concat("Yeah"):o);
		//未测 if (modCount != expectedModCount)分支
		//test sort(Comparator<? super E> c)
		arr0.sort(new Comparator<String>() {
			@Override
			public int compare(String lhs, String rhs) {
				int i = lhs.compareTo(rhs);
				if(i>0) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		//未测 if (modCount != expectedModCount)分支
	}
}
