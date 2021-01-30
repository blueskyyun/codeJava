import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.*;

import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;

public class ArrayListDemoETTest {

	//Test case number: 0
	  /*
	   * 30 covered goals:
	   * Goal 1. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo$ArrayListSpliterator.estimateSize()J: root-Branch
	   * Goal 3. ArrayListDemo$ArrayListSpliterator.characteristics()I: root-Branch
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true
	   * Goal 5. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 6. Branch ArrayListDemo$ArrayListSpliterator.characteristics()I: root-Branch in context: 
	   * Goal 7. Branch ArrayListDemo$ArrayListSpliterator.estimateSize()J: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true in context: 
	   * Goal 9. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 10. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 11. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 12. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 13. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 14. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 15. ArrayListDemo$ArrayListSpliterator.characteristics()I: Line 1305
	   * Goal 16. ArrayListDemo$ArrayListSpliterator.estimateSize()J: Line 1301
	   * Goal 17. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1243
	   * Goal 18. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1251
	   * Goal 19. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 20. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 21. Weak Mutation 2337: ArrayListDemo$ArrayListSpliterator.getFence()I:1243 - ReplaceComparisonOperator >= -> >
	   * Goal 22. Weak Mutation 2684: ArrayListDemo$ArrayListSpliterator.estimateSize()J:1301 - ReplaceArithmeticOperator - -> +
	   * Goal 23. Weak Mutation 2685: ArrayListDemo$ArrayListSpliterator.estimateSize()J:1301 - ReplaceArithmeticOperator - -> %
	   * Goal 24. Weak Mutation 2686: ArrayListDemo$ArrayListSpliterator.estimateSize()J:1301 - ReplaceArithmeticOperator - -> *
	   * Goal 25. Weak Mutation 2687: ArrayListDemo$ArrayListSpliterator.estimateSize()J:1301 - ReplaceArithmeticOperator - -> /
	   * Goal 26. Weak Mutation 2688: ArrayListDemo$ArrayListSpliterator.characteristics()I:1305 - ReplaceConstant - 16464 -> 0
	   * Goal 27. Weak Mutation 2689: ArrayListDemo$ArrayListSpliterator.characteristics()I:1305 - ReplaceConstant - 16464 -> 1
	   * Goal 28. Weak Mutation 2690: ArrayListDemo$ArrayListSpliterator.characteristics()I:1305 - ReplaceConstant - 16464 -> -1
	   * Goal 29. Weak Mutation 2691: ArrayListDemo$ArrayListSpliterator.characteristics()I:1305 - ReplaceConstant - 16464 -> 16463
	   * Goal 30. Weak Mutation 2692: ArrayListDemo$ArrayListSpliterator.characteristics()I:1305 - ReplaceConstant - 16464 -> 16465
	   */

	  @Test(timeout = 4000)
	  public void test00()  throws Throwable  {
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Object>((ArrayListDemo<Object>) null, (-1), 0, 0);
	      long long0 = arrayListDemo_ArrayListSpliterator0.getExactSizeIfKnown();
	      assertEquals(16464, arrayListDemo_ArrayListSpliterator0.characteristics());
	      assertEquals(1L, long0);
	  }

	  //Test case number: 1
	  /*
	   * 54 covered goals:
	   * Goal 1. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 3. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - true
	   * Goal 5. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I17 Branch 105 IFNULL L1281 - false
	   * Goal 6. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I23 Branch 106 IFNULL L1281 - false
	   * Goal 7. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I31 Branch 107 IFGE L1282 - true
	   * Goal 8. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I57 Branch 108 IFLT L1288 - false
	   * Goal 9. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I64 Branch 109 IF_ICMPGT L1288 - false
	   * Goal 10. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I85 Branch 110 IF_ICMPLT L1289 - false
	   * Goal 11. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I91 Branch 111 IF_ICMPNE L1293 - true
	   * Goal 12. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 13. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 14. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 15. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - true in context: 
	   * Goal 16. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I23 Branch 106 IFNULL L1281 - false in context: 
	   * Goal 17. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I17 Branch 105 IFNULL L1281 - false in context: 
	   * Goal 18. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I31 Branch 107 IFGE L1282 - true in context: 
	   * Goal 19. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I64 Branch 109 IF_ICMPGT L1288 - false in context: 
	   * Goal 20. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I57 Branch 108 IFLT L1288 - false in context: 
	   * Goal 21. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I85 Branch 110 IF_ICMPLT L1289 - false in context: 
	   * Goal 22. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I91 Branch 111 IF_ICMPNE L1293 - true in context: 
	   * Goal 23. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 24. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 25. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 26. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 27. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 28. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 29. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 30. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 31. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 32. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 33. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 34. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1279
	   * Goal 35. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1281
	   * Goal 36. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1282
	   * Goal 37. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1287
	   * Goal 38. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1288
	   * Goal 39. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1289
	   * Goal 40. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1293
	   * Goal 41. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1297
	   * Goal 42. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 43. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 44. [METHOD] ArrayListDemo.ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V
	   * Goal 45. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 46. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 47. Weak Mutation 2549: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1279 - ReplaceComparisonOperator != null -> = null
	   * Goal 48. Weak Mutation 2550: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1281 - ReplaceComparisonOperator = null -> != null
	   * Goal 49. Weak Mutation 2551: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1281 - ReplaceComparisonOperator = null -> != null
	   * Goal 50. Weak Mutation 2565: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1282 - ReplaceComparisonOperator >= -> >
	   * Goal 51. Weak Mutation 2593: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1288 - ReplaceComparisonOperator < -> <=
	   * Goal 52. Weak Mutation 2609: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1288 - ReplaceComparisonOperator > -> >=
	   * Goal 53. Weak Mutation 2653: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1289 - ReplaceComparisonOperator < -> <=
	   * Goal 54. Weak Mutation 2672: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1293 - ReplaceComparisonOperator != -> >
	   */

	  @Test(timeout = 4000)
	  public void test01()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(0);
	      ArrayListDemo.ArrayListSpliterator<Integer> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Integer>(arrayListDemo0, 0, 0, 1);
	      Consumer<Integer> consumer0 = (Consumer<Integer>) mock(Consumer.class, new ViolatedAssumptionAnswer());
	      // Undeclared exception!
	      try { 
	        arrayListDemo_ArrayListSpliterator0.forEachRemaining(consumer0);
	        fail("Expecting exception: ConcurrentModificationException");
	      
	      } catch(ConcurrentModificationException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("ArrayListDemo$ArrayListSpliterator", e);
	      }
	  }

	  //Test case number: 2
	  /*
	   * 55 covered goals:
	   * Goal 1. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 3. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - true
	   * Goal 5. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I17 Branch 105 IFNULL L1281 - false
	   * Goal 6. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I23 Branch 106 IFNULL L1281 - false
	   * Goal 7. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I31 Branch 107 IFGE L1282 - true
	   * Goal 8. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I57 Branch 108 IFLT L1288 - false
	   * Goal 9. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I64 Branch 109 IF_ICMPGT L1288 - false
	   * Goal 10. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I85 Branch 110 IF_ICMPLT L1289 - false
	   * Goal 11. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I91 Branch 111 IF_ICMPNE L1293 - false
	   * Goal 12. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 13. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 14. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 15. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - true in context: 
	   * Goal 16. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I23 Branch 106 IFNULL L1281 - false in context: 
	   * Goal 17. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I17 Branch 105 IFNULL L1281 - false in context: 
	   * Goal 18. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I31 Branch 107 IFGE L1282 - true in context: 
	   * Goal 19. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I64 Branch 109 IF_ICMPGT L1288 - false in context: 
	   * Goal 20. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I57 Branch 108 IFLT L1288 - false in context: 
	   * Goal 21. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I85 Branch 110 IF_ICMPLT L1289 - false in context: 
	   * Goal 22. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I91 Branch 111 IF_ICMPNE L1293 - false in context: 
	   * Goal 23. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 24. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 25. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 26. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 27. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 28. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 29. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 30. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 31. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 32. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 33. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 34. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1279
	   * Goal 35. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1281
	   * Goal 36. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1282
	   * Goal 37. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1287
	   * Goal 38. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1288
	   * Goal 39. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1289
	   * Goal 40. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1293
	   * Goal 41. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1294
	   * Goal 42. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 43. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 44. [METHOD] ArrayListDemo.ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V
	   * Goal 45. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 46. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 47. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V
	   * Goal 48. Weak Mutation 2549: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1279 - ReplaceComparisonOperator != null -> = null
	   * Goal 49. Weak Mutation 2550: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1281 - ReplaceComparisonOperator = null -> != null
	   * Goal 50. Weak Mutation 2551: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1281 - ReplaceComparisonOperator = null -> != null
	   * Goal 51. Weak Mutation 2565: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1282 - ReplaceComparisonOperator >= -> >
	   * Goal 52. Weak Mutation 2592: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1288 - ReplaceComparisonOperator < -> !=
	   * Goal 53. Weak Mutation 2609: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1288 - ReplaceComparisonOperator > -> >=
	   * Goal 54. Weak Mutation 2651: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1289 - ReplaceComparisonOperator < -> !=
	   * Goal 55. Weak Mutation 2670: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1293 - ReplaceComparisonOperator != -> -1
	   */

	  @Test(timeout = 4000)
	  public void test02()  throws Throwable  {
	      ArrayListDemo<Object> arrayListDemo0 = new ArrayListDemo<Object>(0);
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Object>(arrayListDemo0, 1, 0, 0);
	      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
	      arrayListDemo_ArrayListSpliterator0.forEachRemaining(consumer0);
	      assertEquals(16464, arrayListDemo_ArrayListSpliterator0.characteristics());
	  }

	  //Test case number: 3
	  /*
	   * 35 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 3. ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I3 Branch 101 IFNONNULL L1262 - true
	   * Goal 5. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I23 Branch 102 IF_ICMPGE L1265 - true
	   * Goal 6. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 7. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true in context: 
	   * Goal 9. Branch ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I3 Branch 101 IFNONNULL L1262 - true in context: 
	   * Goal 10. Branch ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I23 Branch 102 IF_ICMPGE L1265 - true in context: 
	   * Goal 11. ArrayListDemo.<init>()V: Line 67
	   * Goal 12. ArrayListDemo.<init>()V: Line 68
	   * Goal 13. ArrayListDemo.<init>()V: Line 69
	   * Goal 14. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 15. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 16. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 17. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 18. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 19. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 20. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1243
	   * Goal 21. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1251
	   * Goal 22. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1262
	   * Goal 23. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1264
	   * Goal 24. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1265
	   * Goal 25. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1273
	   * Goal 26. [METHOD] ArrayListDemo.<init>()V
	   * Goal 27. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 28. [METHOD] ArrayListDemo.ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z
	   * Goal 29. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 30. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 31. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z
	   * Goal 32. Weak Mutation 2337: ArrayListDemo$ArrayListSpliterator.getFence()I:1243 - ReplaceComparisonOperator >= -> >
	   * Goal 33. Weak Mutation 2462: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1262 - ReplaceComparisonOperator != null -> = null
	   * Goal 34. Weak Mutation 2500: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1265 - ReplaceComparisonOperator >= -> ==
	   * Goal 35. Weak Mutation 2548: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1273 - ReplaceConstant - 0 -> 1
	   */

	  @Test(timeout = 4000)
	  public void test03()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      ArrayListDemo.ArrayListSpliterator<Integer> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Integer>(arrayListDemo0, 1, 0, 0);
	      Consumer<Integer> consumer0 = (Consumer<Integer>) mock(Consumer.class, new ViolatedAssumptionAnswer());
	      boolean boolean0 = arrayListDemo_ArrayListSpliterator0.tryAdvance(consumer0);
	      assertFalse(boolean0);
	  }

	  //Test case number: 4
	  /*
	   * 48 covered goals:
	   * Goal 1. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 2. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 3. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 4. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 5. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true
	   * Goal 6. ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true
	   * Goal 7. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: I20 Branch 100 IF_ICMPLT L1256 - false
	   * Goal 8. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 9. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 10. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 11. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 12. Branch ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true in context: 
	   * Goal 13. Branch ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: I20 Branch 100 IF_ICMPLT L1256 - false in context: 
	   * Goal 14. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 15. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 16. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 17. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 18. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 19. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 20. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 21. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 22. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 87
	   * Goal 23. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 24. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 25. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 26. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 27. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 28. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 29. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 30. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 31. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1243
	   * Goal 32. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1251
	   * Goal 33. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: Line 1255
	   * Goal 34. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: Line 1256
	   * Goal 35. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 36. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 37. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 38. [METHOD] ArrayListDemo.ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;
	   * Goal 39. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 40. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 41. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 42. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;
	   * Goal 43. Weak Mutation 2337: ArrayListDemo$ArrayListSpliterator.getFence()I:1243 - ReplaceComparisonOperator >= -> >
	   * Goal 44. Weak Mutation 2389: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceArithmeticOperator + -> %
	   * Goal 45. Weak Mutation 2392: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceArithmeticOperator + -> /
	   * Goal 46. Weak Mutation 2393: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceConstant - 1 -> 0
	   * Goal 47. Weak Mutation 2394: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceBitwiseOperator >>> I -> << I
	   * Goal 48. Weak Mutation 2422: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1256 - ReplaceComparisonOperator < -> !=
	   */

	  @Test(timeout = 4000)
	  public void test04()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(0);
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>(arrayListDemo0);
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Object>(arrayListDemo1, 1, 0, 0);
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator1 = arrayListDemo_ArrayListSpliterator0.trySplit();
	      assertNull(arrayListDemo_ArrayListSpliterator1);
	      assertEquals(0, arrayListDemo1.size());
	      assertTrue(arrayListDemo1.isEmpty());
	  }

	  //Test case number: 5
	  /*
	   * 35 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 3. ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: I20 Branch 100 IF_ICMPLT L1256 - false
	   * Goal 5. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 6. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 7. Branch ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true in context: 
	   * Goal 8. Branch ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: I20 Branch 100 IF_ICMPLT L1256 - false in context: 
	   * Goal 9. ArrayListDemo.<init>()V: Line 67
	   * Goal 10. ArrayListDemo.<init>()V: Line 68
	   * Goal 11. ArrayListDemo.<init>()V: Line 69
	   * Goal 12. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 13. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 14. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 15. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 16. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 17. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 18. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1243
	   * Goal 19. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1251
	   * Goal 20. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: Line 1255
	   * Goal 21. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: Line 1256
	   * Goal 22. [METHOD] ArrayListDemo.<init>()V
	   * Goal 23. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 24. [METHOD] ArrayListDemo.ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;
	   * Goal 25. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 26. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 27. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;
	   * Goal 28. Weak Mutation 2336: ArrayListDemo$ArrayListSpliterator.getFence()I:1243 - ReplaceComparisonOperator >= -> ==
	   * Goal 29. Weak Mutation 2389: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceArithmeticOperator + -> %
	   * Goal 30. Weak Mutation 2390: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceArithmeticOperator + -> -
	   * Goal 31. Weak Mutation 2391: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceArithmeticOperator + -> *
	   * Goal 32. Weak Mutation 2392: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceArithmeticOperator + -> /
	   * Goal 33. Weak Mutation 2393: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceConstant - 1 -> 0
	   * Goal 34. Weak Mutation 2394: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceBitwiseOperator >>> I -> << I
	   * Goal 35. Weak Mutation 2424: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1256 - ReplaceComparisonOperator < -> <=
	   */

	  @Test(timeout = 4000)
	  public void test05()  throws Throwable  {
	      ArrayListDemo<Object> arrayListDemo0 = new ArrayListDemo<Object>();
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Object>(arrayListDemo0, 0, 1, 0);
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator1 = arrayListDemo_ArrayListSpliterator0.trySplit();
	      assertNull(arrayListDemo_ArrayListSpliterator1);
	  }

	  //Test case number: 6
	  /*
	   * 15 covered goals:
	   * Goal 1. ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true
	   * Goal 2. ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - true
	   * Goal 3. ArrayListDemo.subListRangeCheck(III)V: I39 Branch 61 IF_ICMPLE L917 - true
	   * Goal 4. Branch ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true in context: 
	   * Goal 5. Branch ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - true in context: 
	   * Goal 6. Branch ArrayListDemo.subListRangeCheck(III)V: I39 Branch 61 IF_ICMPLE L917 - true in context: 
	   * Goal 7. ArrayListDemo.subListRangeCheck(III)V: Line 913
	   * Goal 8. ArrayListDemo.subListRangeCheck(III)V: Line 915
	   * Goal 9. ArrayListDemo.subListRangeCheck(III)V: Line 917
	   * Goal 10. ArrayListDemo.subListRangeCheck(III)V: Line 920
	   * Goal 11. [METHOD] ArrayListDemo.subListRangeCheck(III)V
	   * Goal 12. [METHODNOEX] ArrayListDemo.subListRangeCheck(III)V
	   * Goal 13. Weak Mutation 1233: ArrayListDemo.subListRangeCheck(III)V:913 - ReplaceComparisonOperator >= -> >
	   * Goal 14. Weak Mutation 1251: ArrayListDemo.subListRangeCheck(III)V:915 - ReplaceComparisonOperator <= -> <
	   * Goal 15. Weak Mutation 1271: ArrayListDemo.subListRangeCheck(III)V:917 - ReplaceComparisonOperator <= -> ==
	   */

	  @Test(timeout = 4000)
	  public void test06()  throws Throwable  {
	      ArrayListDemo.subListRangeCheck(0, 1, 1);
	  }

	  //Test case number: 7
	  /*
	   * 29 covered goals:
	   * Goal 1. ArrayListDemo.subList(II)Ljava/util/List;: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true
	   * Goal 4. ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - true
	   * Goal 5. ArrayListDemo.subListRangeCheck(III)V: I39 Branch 61 IF_ICMPLE L917 - false
	   * Goal 6. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 7. Branch ArrayListDemo.subList(II)Ljava/util/List;: root-Branch in context: ArrayListDemo:subList(II)Ljava/util/List;
	   * Goal 8. Branch ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true in context: 
	   * Goal 9. Branch ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - true in context: 
	   * Goal 10. Branch ArrayListDemo.subListRangeCheck(III)V: I39 Branch 61 IF_ICMPLE L917 - false in context: 
	   * Goal 11. subList(II)Ljava/util/List;_java.lang.IllegalArgumentException_EXPLICIT
	   * Goal 12. ArrayListDemo.<init>()V: Line 67
	   * Goal 13. ArrayListDemo.<init>()V: Line 68
	   * Goal 14. ArrayListDemo.<init>()V: Line 69
	   * Goal 15. ArrayListDemo.subList(II)Ljava/util/List;: Line 908
	   * Goal 16. ArrayListDemo.subListRangeCheck(III)V: Line 913
	   * Goal 17. ArrayListDemo.subListRangeCheck(III)V: Line 915
	   * Goal 18. ArrayListDemo.subListRangeCheck(III)V: Line 917
	   * Goal 19. ArrayListDemo.subListRangeCheck(III)V: Line 918
	   * Goal 20. ArrayListDemo.subListRangeCheck(III)V: Line 919
	   * Goal 21. [METHOD] ArrayListDemo.<init>()V
	   * Goal 22. [METHOD] ArrayListDemo.subList(II)Ljava/util/List;
	   * Goal 23. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 24. Weak Mutation 1232: ArrayListDemo.subListRangeCheck(III)V:913 - ReplaceComparisonOperator >= -> ==
	   * Goal 25. Weak Mutation 1251: ArrayListDemo.subListRangeCheck(III)V:915 - ReplaceComparisonOperator <= -> <
	   * Goal 26. Weak Mutation 1269: ArrayListDemo.subListRangeCheck(III)V:917 - ReplaceComparisonOperator <= -> -1
	   * Goal 27. Weak Mutation 1272: ArrayListDemo.subListRangeCheck(III)V:918 - ReplaceConstant - fromIndex( -> 
	   * Goal 28. Weak Mutation 1278: ArrayListDemo.subListRangeCheck(III)V:919 - ReplaceConstant - ) > toIndex( -> 
	   * Goal 29. Weak Mutation 1284: ArrayListDemo.subListRangeCheck(III)V:919 - ReplaceConstant - ) -> 
	   */

	  @Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.subList(1, 0);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // fromIndex(1) > toIndex(0)
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 8
	  /*
	   * 106 covered goals:
	   * Goal 1. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: root-Branch
	   * Goal 2. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 3. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 4. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: root-Branch
	   * Goal 5. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 6. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 7. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true
	   * Goal 8. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 9. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 10. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 11. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I3 Branch 57 IFLT L719 - false
	   * Goal 12. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I7 Branch 58 IF_ICMPLE L719 - true
	   * Goal 13. Branch ArrayListDemo$Itr.<init>(LArrayListDemo;)V: root-Branch in context: 
	   * Goal 14. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 15. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 16. Branch ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: root-Branch in context: 
	   * Goal 17. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 18. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 19. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true in context: 
	   * Goal 20. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 21. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 22. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 23. Branch ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I3 Branch 57 IFLT L719 - false in context: ArrayListDemo:listIterator(I)Ljava/util/ListIterator;
	   * Goal 24. Branch ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I7 Branch 58 IF_ICMPLE L719 - true in context: ArrayListDemo:listIterator(I)Ljava/util/ListIterator;
	   * Goal 25. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 26. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 27. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 28. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 29. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 30. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 31. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 32. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 33. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 34. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 35. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 131
	   * Goal 36. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 37. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 38. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 39. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 40. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 41. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 42. ArrayListDemo.grow(I)V: Line 162
	   * Goal 43. ArrayListDemo.grow(I)V: Line 163
	   * Goal 44. ArrayListDemo.grow(I)V: Line 164
	   * Goal 45. ArrayListDemo.grow(I)V: Line 165
	   * Goal 46. ArrayListDemo.grow(I)V: Line 166
	   * Goal 47. ArrayListDemo.grow(I)V: Line 169
	   * Goal 48. ArrayListDemo.grow(I)V: Line 170
	   * Goal 49. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: Line 719
	   * Goal 50. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: Line 721
	   * Goal 51. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 752
	   * Goal 52. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 753
	   * Goal 53. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 755
	   * Goal 54. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: Line 821
	   * Goal 55. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: Line 822
	   * Goal 56. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: Line 823
	   * Goal 57. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: Line 824
	   * Goal 58. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 59. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 60. [METHOD] ArrayListDemo.listIterator(I)Ljava/util/ListIterator;
	   * Goal 61. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 62. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 63. [METHODNOEX] ArrayListDemo.listIterator(I)Ljava/util/ListIterator;
	   * Goal 64. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 65. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 66. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 67. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 68. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 69. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 70. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 71. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 72. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 73. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 74. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 75. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 76. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 77. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 78. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 79. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 80. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 81. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 82. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 83. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 84. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 85. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 86. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 87. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 88. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 89. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 90. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 91. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 92. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 93. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 94. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 95. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 96. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 97. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 98. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 99. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 100. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 101. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   * Goal 102. Weak Mutation 1181: ArrayListDemo.listIterator(I)Ljava/util/ListIterator;:719 - ReplaceComparisonOperator < -> <=
	   * Goal 103. Weak Mutation 1192: ArrayListDemo.listIterator(I)Ljava/util/ListIterator;:719 - ReplaceComparisonOperator <= -> ==
	   * Goal 104. Weak Mutation 1675: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> 0
	   * Goal 105. Weak Mutation 1676: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> 1
	   * Goal 106. Weak Mutation 1677: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> -2
	   */

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(0);
	      arrayListDemo0.add("");
	      arrayListDemo0.listIterator(0);
	      assertFalse(arrayListDemo0.isEmpty());
	  }

	  //Test case number: 9
	  /*
	   * 22 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: root-Branch
	   * Goal 3. ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;: root-Branch
	   * Goal 4. ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - false
	   * Goal 5. Branch ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;: root-Branch in context: ArrayListDemo:set(ILjava/lang/Object;)Ljava/lang/Object;
	   * Goal 6. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 7. Branch ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - false in context: 
	   * Goal 9. set(ILjava/lang/Object;)Ljava/lang/Object;_java.lang.IndexOutOfBoundsException_EXPLICIT
	   * Goal 10. ArrayListDemo.<init>()V: Line 67
	   * Goal 11. ArrayListDemo.<init>()V: Line 68
	   * Goal 12. ArrayListDemo.<init>()V: Line 69
	   * Goal 13. ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: Line 578
	   * Goal 14. ArrayListDemo.rangeCheck(I)V: Line 560
	   * Goal 15. ArrayListDemo.rangeCheck(I)V: Line 561
	   * Goal 16. ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;: Line 352
	   * Goal 17. [METHOD] ArrayListDemo.<init>()V
	   * Goal 18. [METHOD] ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;
	   * Goal 19. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 20. Weak Mutation 917: ArrayListDemo.rangeCheck(I)V:560 - ReplaceComparisonOperator < -> !=
	   * Goal 21. Weak Mutation 946: ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;:578 - ReplaceConstant - Index:  -> 
	   * Goal 22. Weak Mutation 951: ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;:578 - ReplaceConstant - , Size:  -> 
	   */

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      ArrayListDemo<ArrayListDemo<Object>> arrayListDemo0 = new ArrayListDemo<ArrayListDemo<Object>>();
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>();
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.set(1, arrayListDemo1);
	        fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // Index: 1, Size: 0
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 10
	  /*
	   * 37 covered goals:
	   * Goal 1. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - false
	   * Goal 2. ArrayListDemo.removeRange(II)V: I58 Branch 40 IF_ICMPLT L547 - false
	   * Goal 3. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 4. Branch ArrayListDemo.removeRange(II)V: I58 Branch 40 IF_ICMPLT L547 - false in context: 
	   * Goal 5. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 6. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 7. ArrayListDemo.<init>(I)V: Line 55
	   * Goal 8. ArrayListDemo.<init>(I)V: Line 56
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 10. ArrayListDemo.removeRange(II)V: Line 540
	   * Goal 11. ArrayListDemo.removeRange(II)V: Line 541
	   * Goal 12. ArrayListDemo.removeRange(II)V: Line 542
	   * Goal 13. ArrayListDemo.removeRange(II)V: Line 543
	   * Goal 14. ArrayListDemo.removeRange(II)V: Line 546
	   * Goal 15. ArrayListDemo.removeRange(II)V: Line 547
	   * Goal 16. ArrayListDemo.removeRange(II)V: Line 550
	   * Goal 17. ArrayListDemo.removeRange(II)V: Line 551
	   * Goal 18. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 19. [METHOD] ArrayListDemo.removeRange(II)V
	   * Goal 20. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 21. [METHODNOEX] ArrayListDemo.removeRange(II)V
	   * Goal 22. Weak Mutation 808: ArrayListDemo.removeRange(II)V:540 - ReplaceConstant - 1 -> 0
	   * Goal 23. Weak Mutation 809: ArrayListDemo.removeRange(II)V:540 - ReplaceArithmeticOperator + -> %
	   * Goal 24. Weak Mutation 810: ArrayListDemo.removeRange(II)V:540 - ReplaceArithmeticOperator + -> -
	   * Goal 25. Weak Mutation 811: ArrayListDemo.removeRange(II)V:540 - ReplaceArithmeticOperator + -> *
	   * Goal 26. Weak Mutation 812: ArrayListDemo.removeRange(II)V:540 - ReplaceArithmeticOperator + -> /
	   * Goal 27. Weak Mutation 823: ArrayListDemo.removeRange(II)V:541 - ReplaceArithmeticOperator - -> %
	   * Goal 28. Weak Mutation 825: ArrayListDemo.removeRange(II)V:541 - ReplaceArithmeticOperator - -> /
	   * Goal 29. Weak Mutation 860: ArrayListDemo.removeRange(II)V:546 - ReplaceArithmeticOperator - -> +
	   * Goal 30. Weak Mutation 861: ArrayListDemo.removeRange(II)V:546 - ReplaceArithmeticOperator - -> %
	   * Goal 31. Weak Mutation 862: ArrayListDemo.removeRange(II)V:546 - ReplaceArithmeticOperator - -> *
	   * Goal 32. Weak Mutation 863: ArrayListDemo.removeRange(II)V:546 - ReplaceArithmeticOperator - -> /
	   * Goal 33. Weak Mutation 864: ArrayListDemo.removeRange(II)V:546 - ReplaceArithmeticOperator - -> +
	   * Goal 34. Weak Mutation 865: ArrayListDemo.removeRange(II)V:546 - ReplaceArithmeticOperator - -> %
	   * Goal 35. Weak Mutation 866: ArrayListDemo.removeRange(II)V:546 - ReplaceArithmeticOperator - -> *
	   * Goal 36. Weak Mutation 867: ArrayListDemo.removeRange(II)V:546 - ReplaceArithmeticOperator - -> /
	   * Goal 37. Weak Mutation 899: ArrayListDemo.removeRange(II)V:547 - ReplaceComparisonOperator < -> !=
	   */

	  @Test(timeout = 4000)
	  public void test10()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(639);
	      arrayListDemo0.removeRange(1, 0);
	      assertFalse(arrayListDemo0.isEmpty());
	  }

	  //Test case number: 11
	  /*
	   * 130 covered goals:
	   * Goal 1. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 4. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 5. ArrayListDemo.trimToSize()V: I15 Branch 5 IF_ICMPGE L98 - false
	   * Goal 6. ArrayListDemo.trimToSize()V: I21 Branch 6 IFNE L99 - true
	   * Goal 7. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true
	   * Goal 8. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false
	   * Goal 9. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 10. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 11. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 12. ArrayListDemo.addAll(Ljava/util/Collection;)Z: I39 Branch 37 IFEQ L490 - false
	   * Goal 13. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 14. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 15. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 16. Branch ArrayListDemo.trimToSize()V: I15 Branch 5 IF_ICMPGE L98 - false in context: ArrayListDemo:trimToSize()V
	   * Goal 17. Branch ArrayListDemo.trimToSize()V: I21 Branch 6 IFNE L99 - true in context: ArrayListDemo:trimToSize()V
	   * Goal 18. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true in context: 
	   * Goal 19. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 20. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 21. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 22. Branch ArrayListDemo.addAll(Ljava/util/Collection;)Z: I39 Branch 37 IFEQ L490 - false in context: ArrayListDemo:addAll(Ljava/util/Collection;)Z
	   * Goal 23. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 24. [Output]: ArrayListDemo.addAll(Ljava/util/Collection;)Z:True
	   * Goal 25. ArrayListDemo.<init>()V: Line 67
	   * Goal 26. ArrayListDemo.<init>()V: Line 68
	   * Goal 27. ArrayListDemo.<init>()V: Line 69
	   * Goal 28. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 29. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 30. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 31. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 485
	   * Goal 32. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 486
	   * Goal 33. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 487
	   * Goal 34. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 488
	   * Goal 35. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 489
	   * Goal 36. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 490
	   * Goal 37. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 38. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 129
	   * Goal 39. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 131
	   * Goal 40. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 41. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 42. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 43. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 44. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 45. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 46. ArrayListDemo.grow(I)V: Line 162
	   * Goal 47. ArrayListDemo.grow(I)V: Line 163
	   * Goal 48. ArrayListDemo.grow(I)V: Line 164
	   * Goal 49. ArrayListDemo.grow(I)V: Line 165
	   * Goal 50. ArrayListDemo.grow(I)V: Line 166
	   * Goal 51. ArrayListDemo.grow(I)V: Line 169
	   * Goal 52. ArrayListDemo.grow(I)V: Line 170
	   * Goal 53. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 54. ArrayListDemo.trimToSize()V: Line 97
	   * Goal 55. ArrayListDemo.trimToSize()V: Line 98
	   * Goal 56. ArrayListDemo.trimToSize()V: Line 99
	   * Goal 57. ArrayListDemo.trimToSize()V: Line 101
	   * Goal 58. ArrayListDemo.trimToSize()V: Line 105
	   * Goal 59. [METHOD] ArrayListDemo.<init>()V
	   * Goal 60. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 61. [METHOD] ArrayListDemo.addAll(Ljava/util/Collection;)Z
	   * Goal 62. [METHOD] ArrayListDemo.trimToSize()V
	   * Goal 63. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 64. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 65. [METHODNOEX] ArrayListDemo.addAll(Ljava/util/Collection;)Z
	   * Goal 66. [METHODNOEX] ArrayListDemo.trimToSize()V
	   * Goal 67. Weak Mutation 3: ArrayListDemo.trimToSize()V:97 - ReplaceConstant - 1 -> 0
	   * Goal 68. Weak Mutation 4: ArrayListDemo.trimToSize()V:97 - ReplaceArithmeticOperator + -> %
	   * Goal 69. Weak Mutation 5: ArrayListDemo.trimToSize()V:97 - ReplaceArithmeticOperator + -> -
	   * Goal 70. Weak Mutation 6: ArrayListDemo.trimToSize()V:97 - ReplaceArithmeticOperator + -> *
	   * Goal 71. Weak Mutation 7: ArrayListDemo.trimToSize()V:97 - ReplaceArithmeticOperator + -> /
	   * Goal 72. Weak Mutation 12: ArrayListDemo.trimToSize()V:98 - ReplaceComparisonOperator >= -> -1
	   * Goal 73. Weak Mutation 20: ArrayListDemo.trimToSize()V:99 - ReplaceComparisonOperator != -> <
	   * Goal 74. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 75. Weak Mutation 54: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 0
	   * Goal 76. Weak Mutation 55: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 1
	   * Goal 77. Weak Mutation 56: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> -1
	   * Goal 78. Weak Mutation 57: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 9
	   * Goal 79. Weak Mutation 58: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 11
	   * Goal 80. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 81. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 82. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 83. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 84. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 85. Weak Mutation 81: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> +
	   * Goal 86. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 87. Weak Mutation 83: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> *
	   * Goal 88. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 89. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 90. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 91. Weak Mutation 103: ArrayListDemo.grow(I)V:163 - ReplaceBitwiseOperator >> I -> << I
	   * Goal 92. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 93. Weak Mutation 106: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> -
	   * Goal 94. Weak Mutation 107: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> *
	   * Goal 95. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 96. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 97. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 98. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 99. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 100. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 101. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 102. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 103. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 104. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 105. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 106. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 107. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 108. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 109. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 110. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 111. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 112. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 113. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 114. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 115. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 116. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 117. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 118. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 119. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 120. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 121. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   * Goal 122. Weak Mutation 663: ArrayListDemo.addAll(Ljava/util/Collection;)Z:487 - ReplaceArithmeticOperator + -> %
	   * Goal 123. Weak Mutation 664: ArrayListDemo.addAll(Ljava/util/Collection;)Z:487 - ReplaceArithmeticOperator + -> -
	   * Goal 124. Weak Mutation 666: ArrayListDemo.addAll(Ljava/util/Collection;)Z:487 - ReplaceArithmeticOperator + -> /
	   * Goal 125. Weak Mutation 668: ArrayListDemo.addAll(Ljava/util/Collection;)Z:488 - ReplaceConstant - 0 -> 1
	   * Goal 126. Weak Mutation 685: ArrayListDemo.addAll(Ljava/util/Collection;)Z:489 - ReplaceArithmeticOperator + -> %
	   * Goal 127. Weak Mutation 686: ArrayListDemo.addAll(Ljava/util/Collection;)Z:489 - ReplaceArithmeticOperator + -> -
	   * Goal 128. Weak Mutation 688: ArrayListDemo.addAll(Ljava/util/Collection;)Z:489 - ReplaceArithmeticOperator + -> /
	   * Goal 129. Weak Mutation 694: ArrayListDemo.addAll(Ljava/util/Collection;)Z:490 - ReplaceComparisonOperator == -> >=
	   * Goal 130. Weak Mutation 696: ArrayListDemo.addAll(Ljava/util/Collection;)Z:490 - ReplaceConstant - 1 -> 0
	   */

	  @Test(timeout = 4000)
	  public void test11()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      Integer integer0 = new Integer(0);
	      arrayListDemo0.add(integer0);
	      arrayListDemo0.trimToSize();
	      arrayListDemo0.add(integer0);
	      boolean boolean0 = arrayListDemo0.addAll((Collection<? extends Integer>) arrayListDemo0);
	      assertEquals(4, arrayListDemo0.size());
	      assertTrue(boolean0);
	  }

	  //Test case number: 12
	  /*
	   * 15 covered goals:
	   * Goal 1. ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true
	   * Goal 2. ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - true
	   * Goal 3. ArrayListDemo.subListRangeCheck(III)V: I39 Branch 61 IF_ICMPLE L917 - true
	   * Goal 4. Branch ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true in context: 
	   * Goal 5. Branch ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - true in context: 
	   * Goal 6. Branch ArrayListDemo.subListRangeCheck(III)V: I39 Branch 61 IF_ICMPLE L917 - true in context: 
	   * Goal 7. ArrayListDemo.subListRangeCheck(III)V: Line 913
	   * Goal 8. ArrayListDemo.subListRangeCheck(III)V: Line 915
	   * Goal 9. ArrayListDemo.subListRangeCheck(III)V: Line 917
	   * Goal 10. ArrayListDemo.subListRangeCheck(III)V: Line 920
	   * Goal 11. [METHOD] ArrayListDemo.subListRangeCheck(III)V
	   * Goal 12. [METHODNOEX] ArrayListDemo.subListRangeCheck(III)V
	   * Goal 13. Weak Mutation 1233: ArrayListDemo.subListRangeCheck(III)V:913 - ReplaceComparisonOperator >= -> >
	   * Goal 14. Weak Mutation 1251: ArrayListDemo.subListRangeCheck(III)V:915 - ReplaceComparisonOperator <= -> <
	   * Goal 15. Weak Mutation 1270: ArrayListDemo.subListRangeCheck(III)V:917 - ReplaceComparisonOperator <= -> <
	   */

	  @Test(timeout = 4000)
	  public void test12()  throws Throwable  {
	      ArrayListDemo.subListRangeCheck(0, 0, 0);
	  }

	  //Test case number: 13
	  /*
	   * 29 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 3. ArrayListDemo$ArrayListSpliterator.estimateSize()J: root-Branch
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true
	   * Goal 5. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 6. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 7. Branch ArrayListDemo$ArrayListSpliterator.estimateSize()J: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true in context: 
	   * Goal 9. ArrayListDemo.<init>()V: Line 67
	   * Goal 10. ArrayListDemo.<init>()V: Line 68
	   * Goal 11. ArrayListDemo.<init>()V: Line 69
	   * Goal 12. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 13. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 14. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 15. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 16. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 17. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 18. ArrayListDemo$ArrayListSpliterator.estimateSize()J: Line 1301
	   * Goal 19. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1243
	   * Goal 20. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1251
	   * Goal 21. [METHOD] ArrayListDemo.<init>()V
	   * Goal 22. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 23. [METHOD] ArrayListDemo.ArrayListSpliterator.estimateSize()J
	   * Goal 24. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 25. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 26. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.estimateSize()J
	   * Goal 27. Weak Mutation 2337: ArrayListDemo$ArrayListSpliterator.getFence()I:1243 - ReplaceComparisonOperator >= -> >
	   * Goal 28. Weak Mutation 2685: ArrayListDemo$ArrayListSpliterator.estimateSize()J:1301 - ReplaceArithmeticOperator - -> %
	   * Goal 29. Weak Mutation 2687: ArrayListDemo$ArrayListSpliterator.estimateSize()J:1301 - ReplaceArithmeticOperator - -> /
	   */

	  @Test(timeout = 4000)
	  public void test13()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>();
	      ArrayListDemo.ArrayListSpliterator<String> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<String>(arrayListDemo0, 0, 0, 0);
	      long long0 = arrayListDemo_ArrayListSpliterator0.estimateSize();
	      assertEquals(0L, long0);
	  }

	  //Test case number: 14
	  /*
	   * 20 covered goals:
	   * Goal 1. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo$ArrayListSpliterator.characteristics()I: root-Branch
	   * Goal 3. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 4. Branch ArrayListDemo$ArrayListSpliterator.characteristics()I: root-Branch in context: 
	   * Goal 5. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 6. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 7. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 8. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 9. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 10. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 11. ArrayListDemo$ArrayListSpliterator.characteristics()I: Line 1305
	   * Goal 12. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 13. [METHOD] ArrayListDemo.ArrayListSpliterator.characteristics()I
	   * Goal 14. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 15. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.characteristics()I
	   * Goal 16. Weak Mutation 2688: ArrayListDemo$ArrayListSpliterator.characteristics()I:1305 - ReplaceConstant - 16464 -> 0
	   * Goal 17. Weak Mutation 2689: ArrayListDemo$ArrayListSpliterator.characteristics()I:1305 - ReplaceConstant - 16464 -> 1
	   * Goal 18. Weak Mutation 2690: ArrayListDemo$ArrayListSpliterator.characteristics()I:1305 - ReplaceConstant - 16464 -> -1
	   * Goal 19. Weak Mutation 2691: ArrayListDemo$ArrayListSpliterator.characteristics()I:1305 - ReplaceConstant - 16464 -> 16463
	   * Goal 20. Weak Mutation 2692: ArrayListDemo$ArrayListSpliterator.characteristics()I:1305 - ReplaceConstant - 16464 -> 16465
	   */

	  @Test(timeout = 4000)
	  public void test14()  throws Throwable  {
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Object>((ArrayListDemo<Object>) null, 0, 0, 0);
	      int int0 = arrayListDemo_ArrayListSpliterator0.characteristics();
	      assertEquals(16464, int0);
	  }

	  //Test case number: 15
	  /*
	   * 89 covered goals:
	   * Goal 1. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 4. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 5. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false
	   * Goal 6. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 7. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 8. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 9. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 10. Branch ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch in context: ArrayListDemo:toArray()[Ljava/lang/Object;
	   * Goal 11. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 12. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 13. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false in context: 
	   * Goal 14. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 15. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 16. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 17. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 18. [Output]: ArrayListDemo.toArray()[Ljava/lang/Object;:NonEmptyArray
	   * Goal 19. ArrayListDemo.<init>()V: Line 67
	   * Goal 20. ArrayListDemo.<init>()V: Line 68
	   * Goal 21. ArrayListDemo.<init>()V: Line 69
	   * Goal 22. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 23. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 24. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 25. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 26. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 129
	   * Goal 27. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 28. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 29. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 30. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 31. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 32. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 33. ArrayListDemo.grow(I)V: Line 162
	   * Goal 34. ArrayListDemo.grow(I)V: Line 163
	   * Goal 35. ArrayListDemo.grow(I)V: Line 164
	   * Goal 36. ArrayListDemo.grow(I)V: Line 165
	   * Goal 37. ArrayListDemo.grow(I)V: Line 166
	   * Goal 38. ArrayListDemo.grow(I)V: Line 169
	   * Goal 39. ArrayListDemo.grow(I)V: Line 170
	   * Goal 40. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 41. [METHOD] ArrayListDemo.<init>()V
	   * Goal 42. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 43. [METHOD] ArrayListDemo.toArray()[Ljava/lang/Object;
	   * Goal 44. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 45. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 46. [METHODNOEX] ArrayListDemo.toArray()[Ljava/lang/Object;
	   * Goal 47. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 48. Weak Mutation 54: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 0
	   * Goal 49. Weak Mutation 55: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 1
	   * Goal 50. Weak Mutation 56: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> -1
	   * Goal 51. Weak Mutation 57: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 9
	   * Goal 52. Weak Mutation 58: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 11
	   * Goal 53. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 54. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 55. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 56. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 57. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 58. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 59. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 60. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 61. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 62. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 63. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 64. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 65. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 66. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 67. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 68. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 69. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 70. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 71. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 72. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 73. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 74. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 75. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 76. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 77. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 78. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 79. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 80. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 81. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 82. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 83. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 84. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 85. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 86. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 87. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 88. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 89. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   */

	  @Test(timeout = 4000)
	  public void test15()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      Integer integer0 = new Integer(0);
	      arrayListDemo0.add(integer0);
	      arrayListDemo0.toArray();
	      assertEquals(1, arrayListDemo0.size());
	  }

	  //Test case number: 16
	  /*
	   * 17 covered goals:
	   * Goal 1. ArrayListDemo.size()I: root-Branch
	   * Goal 2. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - false
	   * Goal 3. ArrayListDemo.<init>(Ljava/util/Collection;)V: I25 Branch 4 IF_ACMPEQ L83 - true
	   * Goal 4. Branch ArrayListDemo.size()I: root-Branch in context: ArrayListDemo:size()I
	   * Goal 5. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - false in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 6. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I25 Branch 4 IF_ACMPEQ L83 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 7. [Output]: ArrayListDemo.size()I:Positive
	   * Goal 8. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 9. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 10. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 11. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 83
	   * Goal 12. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 13. ArrayListDemo.size()I: Line 186
	   * Goal 14. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 15. [METHOD] ArrayListDemo.size()I
	   * Goal 16. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 17. [METHODNOEX] ArrayListDemo.size()I
	   */

	  @Test(timeout = 4000)
	  public void test16()  throws Throwable  {
	      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      linkedList0.offerLast((Integer) null);
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(linkedList0);
	      int int0 = arrayListDemo0.size();
	      assertEquals(1, int0);
	  }

	  //Test case number: 17
	  /*
	   * 21 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.iterator()Ljava/util/Iterator;: root-Branch
	   * Goal 3. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: root-Branch
	   * Goal 4. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 5. Branch ArrayListDemo$Itr.<init>(LArrayListDemo;)V: root-Branch in context: 
	   * Goal 6. Branch ArrayListDemo.iterator()Ljava/util/Iterator;: root-Branch in context: ArrayListDemo:iterator()Ljava/util/Iterator;
	   * Goal 7. [Output]: ArrayListDemo.iterator()Ljava/util/Iterator;:NonNull
	   * Goal 8. ArrayListDemo.<init>()V: Line 67
	   * Goal 9. ArrayListDemo.<init>()V: Line 68
	   * Goal 10. ArrayListDemo.<init>()V: Line 69
	   * Goal 11. ArrayListDemo.iterator()Ljava/util/Iterator;: Line 744
	   * Goal 12. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 752
	   * Goal 13. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 753
	   * Goal 14. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 755
	   * Goal 15. [METHOD] ArrayListDemo.<init>()V
	   * Goal 16. [METHOD] ArrayListDemo.iterator()Ljava/util/Iterator;
	   * Goal 17. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 18. [METHODNOEX] ArrayListDemo.iterator()Ljava/util/Iterator;
	   * Goal 19. Weak Mutation 1675: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> 0
	   * Goal 20. Weak Mutation 1676: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> 1
	   * Goal 21. Weak Mutation 1677: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> -2
	   */

	  @Test(timeout = 4000)
	  public void test17()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>();
	      Iterator<String> iterator0 = arrayListDemo0.iterator();
	      assertNotNull(iterator0);
	  }

	  //Test case number: 18
	  /*
	   * 28 covered goals:
	   * Goal 1. ArrayListDemo.get(I)Ljava/lang/Object;: root-Branch
	   * Goal 2. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 3. ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch
	   * Goal 4. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - false
	   * Goal 5. ArrayListDemo.<init>(Ljava/util/Collection;)V: I25 Branch 4 IF_ACMPEQ L83 - true
	   * Goal 6. ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - true
	   * Goal 7. Branch ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo.get(I)Ljava/lang/Object;: root-Branch in context: ArrayListDemo:get(I)Ljava/lang/Object;
	   * Goal 9. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - false in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 10. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I25 Branch 4 IF_ACMPEQ L83 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 11. Branch ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - true in context: 
	   * Goal 12. [Output]: ArrayListDemo.get(I)Ljava/lang/Object;:Null
	   * Goal 13. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 14. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 15. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 16. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 83
	   * Goal 17. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 18. ArrayListDemo.elementData(I)Ljava/lang/Object;: Line 326
	   * Goal 19. ArrayListDemo.get(I)Ljava/lang/Object;: Line 337
	   * Goal 20. ArrayListDemo.get(I)Ljava/lang/Object;: Line 339
	   * Goal 21. ArrayListDemo.rangeCheck(I)V: Line 560
	   * Goal 22. ArrayListDemo.rangeCheck(I)V: Line 562
	   * Goal 23. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 24. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 25. [METHOD] ArrayListDemo.get(I)Ljava/lang/Object;
	   * Goal 26. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 27. [METHODNOEX] ArrayListDemo.get(I)Ljava/lang/Object;
	   * Goal 28. Weak Mutation 918: ArrayListDemo.rangeCheck(I)V:560 - ReplaceComparisonOperator < -> -2
	   */

	  @Test(timeout = 4000)
	  public void test18()  throws Throwable  {
	      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      linkedList0.add((Integer) null);
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(linkedList0);
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>(arrayListDemo0);
	      arrayListDemo1.get(0);
	      assertEquals(1, arrayListDemo1.size());
	  }

	  //Test case number: 19
	  /*
	   * 15 covered goals:
	   * Goal 1. ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - false
	   * Goal 3. Branch ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch in context: 
	   * Goal 4. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 5. [Output]: ArrayListDemo.elementData(I)Ljava/lang/Object;:Null
	   * Goal 6. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 7. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 8. ArrayListDemo.<init>(I)V: Line 55
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 56
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 11. ArrayListDemo.elementData(I)Ljava/lang/Object;: Line 326
	   * Goal 12. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 13. [METHOD] ArrayListDemo.elementData(I)Ljava/lang/Object;
	   * Goal 14. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 15. [METHODNOEX] ArrayListDemo.elementData(I)Ljava/lang/Object;
	   */

	  @Test(timeout = 4000)
	  public void test19()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(1);
	      Integer integer0 = arrayListDemo0.elementData(0);
	      assertNull(integer0);
	  }

	  //Test case number: 20
	  /*
	   * 88 covered goals:
	   * Goal 1. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 2. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 3. ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch
	   * Goal 4. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 5. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 6. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true
	   * Goal 7. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 8. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 9. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 10. Branch ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch in context: 
	   * Goal 11. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 12. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 13. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 14. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 15. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true in context: 
	   * Goal 16. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 17. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 18. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 19. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 20. [Output]: ArrayListDemo.elementData(I)Ljava/lang/Object;:NonNull
	   * Goal 21. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 22. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 23. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 24. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 25. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 26. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 27. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 28. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 29. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 30. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 131
	   * Goal 31. ArrayListDemo.elementData(I)Ljava/lang/Object;: Line 326
	   * Goal 32. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 33. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 34. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 35. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 36. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 37. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 38. ArrayListDemo.grow(I)V: Line 162
	   * Goal 39. ArrayListDemo.grow(I)V: Line 163
	   * Goal 40. ArrayListDemo.grow(I)V: Line 164
	   * Goal 41. ArrayListDemo.grow(I)V: Line 165
	   * Goal 42. ArrayListDemo.grow(I)V: Line 166
	   * Goal 43. ArrayListDemo.grow(I)V: Line 169
	   * Goal 44. ArrayListDemo.grow(I)V: Line 170
	   * Goal 45. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 46. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 47. [METHOD] ArrayListDemo.elementData(I)Ljava/lang/Object;
	   * Goal 48. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 49. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 50. [METHODNOEX] ArrayListDemo.elementData(I)Ljava/lang/Object;
	   * Goal 51. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 52. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 53. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 54. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 55. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 56. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 57. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 58. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 59. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 60. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 61. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 62. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 63. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 64. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 65. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 66. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 67. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 68. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 69. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 70. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 71. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 72. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 73. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 74. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 75. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 76. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 77. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 78. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 79. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 80. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 81. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 82. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 83. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 84. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 85. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 86. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 87. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 88. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   */

	  @Test(timeout = 4000)
	  public void test20()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(0);
	      Integer integer0 = new Integer(0);
	      arrayListDemo0.add(integer0);
	      arrayListDemo0.elementData(0);
	      assertTrue(arrayListDemo0.contains(0));
	  }

	  //Test case number: 21
	  /*
	   * 26 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.contains(Ljava/lang/Object;)Z: I5 Branch 16 IFLT L208 - true
	   * Goal 3. ArrayListDemo.indexOf(Ljava/lang/Object;)I: I3 Branch 17 IFNONNULL L219 - true
	   * Goal 4. ArrayListDemo.indexOf(Ljava/lang/Object;)I: I58 Branch 21 IF_ICMPLT L224 - false
	   * Goal 5. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 6. Branch ArrayListDemo.contains(Ljava/lang/Object;)Z: I5 Branch 16 IFLT L208 - true in context: ArrayListDemo:contains(Ljava/lang/Object;)Z
	   * Goal 7. [Output]: ArrayListDemo.contains(Ljava/lang/Object;)Z:False
	   * Goal 8. ArrayListDemo.<init>()V: Line 67
	   * Goal 9. ArrayListDemo.<init>()V: Line 68
	   * Goal 10. ArrayListDemo.<init>()V: Line 69
	   * Goal 11. ArrayListDemo.contains(Ljava/lang/Object;)Z: Line 208
	   * Goal 12. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 219
	   * Goal 13. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 224
	   * Goal 14. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 228
	   * Goal 15. [METHOD] ArrayListDemo.<init>()V
	   * Goal 16. [METHOD] ArrayListDemo.contains(Ljava/lang/Object;)Z
	   * Goal 17. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 18. [METHODNOEX] ArrayListDemo.contains(Ljava/lang/Object;)Z
	   * Goal 19. Weak Mutation 204: ArrayListDemo.contains(Ljava/lang/Object;)Z:208 - ReplaceComparisonOperator < -> -2
	   * Goal 20. Weak Mutation 208: ArrayListDemo.contains(Ljava/lang/Object;)Z:208 - ReplaceConstant - 0 -> 1
	   * Goal 21. Weak Mutation 209: ArrayListDemo.indexOf(Ljava/lang/Object;)I:219 - ReplaceComparisonOperator != null -> = null
	   * Goal 22. Weak Mutation 231: ArrayListDemo.indexOf(Ljava/lang/Object;)I:224 - ReplaceConstant - 0 -> 1
	   * Goal 23. Weak Mutation 251: ArrayListDemo.indexOf(Ljava/lang/Object;)I:224 - ReplaceComparisonOperator < -> <=
	   * Goal 24. Weak Mutation 252: ArrayListDemo.indexOf(Ljava/lang/Object;)I:228 - ReplaceConstant - -1 -> 0
	   * Goal 25. Weak Mutation 253: ArrayListDemo.indexOf(Ljava/lang/Object;)I:228 - ReplaceConstant - -1 -> 1
	   * Goal 26. Weak Mutation 254: ArrayListDemo.indexOf(Ljava/lang/Object;)I:228 - ReplaceConstant - -1 -> -2
	   */

	  @Test(timeout = 4000)
	  public void test21()  throws Throwable  {
	      ArrayListDemo<ArrayListDemo<String>> arrayListDemo0 = new ArrayListDemo<ArrayListDemo<String>>();
	      ArrayListDemo<String> arrayListDemo1 = new ArrayListDemo<String>();
	      boolean boolean0 = arrayListDemo0.contains(arrayListDemo1);
	      assertFalse(boolean0);
	  }

	  //Test case number: 22
	  /*
	   * 10 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 3. toArray([Ljava/lang/Object;)[Ljava/lang/Object;_java.lang.NullPointerException_IMPLICIT
	   * Goal 4. ArrayListDemo.<init>()V: Line 67
	   * Goal 5. ArrayListDemo.<init>()V: Line 68
	   * Goal 6. ArrayListDemo.<init>()V: Line 69
	   * Goal 7. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: Line 313
	   * Goal 8. [METHOD] ArrayListDemo.<init>()V
	   * Goal 9. [METHOD] ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;
	   * Goal 10. [METHODNOEX] ArrayListDemo.<init>()V
	   */

	  @Test(timeout = 4000)
	  public void test22()  throws Throwable  {
	      ArrayListDemo<ArrayListDemo<Object>> arrayListDemo0 = new ArrayListDemo<ArrayListDemo<Object>>();
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.toArray((String[]) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 23
	  /*
	   * 8 covered goals:
	   * Goal 1. ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - false
	   * Goal 2. Branch ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - false in context: 
	   * Goal 3. subListRangeCheck(III)V_java.lang.IndexOutOfBoundsException_EXPLICIT
	   * Goal 4. ArrayListDemo.subListRangeCheck(III)V: Line 913
	   * Goal 5. ArrayListDemo.subListRangeCheck(III)V: Line 914
	   * Goal 6. [METHOD] ArrayListDemo.subListRangeCheck(III)V
	   * Goal 7. Weak Mutation 1231: ArrayListDemo.subListRangeCheck(III)V:913 - ReplaceComparisonOperator >= -> -1
	   * Goal 8. Weak Mutation 1234: ArrayListDemo.subListRangeCheck(III)V:914 - ReplaceConstant - fromIndex =  -> 
	   */

	  @Test(timeout = 4000)
	  public void test23()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        ArrayListDemo.subListRangeCheck((-1), 0, 0);
	        fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // fromIndex = -1
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 24
	  /*
	   * 29 covered goals:
	   * Goal 1. ArrayListDemo.subList(II)Ljava/util/List;: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true
	   * Goal 4. ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - true
	   * Goal 5. ArrayListDemo.subListRangeCheck(III)V: I39 Branch 61 IF_ICMPLE L917 - false
	   * Goal 6. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 7. Branch ArrayListDemo.subList(II)Ljava/util/List;: root-Branch in context: ArrayListDemo:subList(II)Ljava/util/List;
	   * Goal 8. Branch ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true in context: 
	   * Goal 9. Branch ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - true in context: 
	   * Goal 10. Branch ArrayListDemo.subListRangeCheck(III)V: I39 Branch 61 IF_ICMPLE L917 - false in context: 
	   * Goal 11. subList(II)Ljava/util/List;_java.lang.IllegalArgumentException_EXPLICIT
	   * Goal 12. ArrayListDemo.<init>()V: Line 67
	   * Goal 13. ArrayListDemo.<init>()V: Line 68
	   * Goal 14. ArrayListDemo.<init>()V: Line 69
	   * Goal 15. ArrayListDemo.subList(II)Ljava/util/List;: Line 908
	   * Goal 16. ArrayListDemo.subListRangeCheck(III)V: Line 913
	   * Goal 17. ArrayListDemo.subListRangeCheck(III)V: Line 915
	   * Goal 18. ArrayListDemo.subListRangeCheck(III)V: Line 917
	   * Goal 19. ArrayListDemo.subListRangeCheck(III)V: Line 918
	   * Goal 20. ArrayListDemo.subListRangeCheck(III)V: Line 919
	   * Goal 21. [METHOD] ArrayListDemo.<init>()V
	   * Goal 22. [METHOD] ArrayListDemo.subList(II)Ljava/util/List;
	   * Goal 23. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 24. Weak Mutation 1233: ArrayListDemo.subListRangeCheck(III)V:913 - ReplaceComparisonOperator >= -> >
	   * Goal 25. Weak Mutation 1252: ArrayListDemo.subListRangeCheck(III)V:915 - ReplaceComparisonOperator <= -> ==
	   * Goal 26. Weak Mutation 1269: ArrayListDemo.subListRangeCheck(III)V:917 - ReplaceComparisonOperator <= -> -1
	   * Goal 27. Weak Mutation 1272: ArrayListDemo.subListRangeCheck(III)V:918 - ReplaceConstant - fromIndex( -> 
	   * Goal 28. Weak Mutation 1278: ArrayListDemo.subListRangeCheck(III)V:919 - ReplaceConstant - ) > toIndex( -> 
	   * Goal 29. Weak Mutation 1284: ArrayListDemo.subListRangeCheck(III)V:919 - ReplaceConstant - ) -> 
	   */

	  @Test(timeout = 4000)
	  public void test24()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>();
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.subList(0, (-1));
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // fromIndex(0) > toIndex(-1)
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 25
	  /*
	   * 21 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch
	   * Goal 3. ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;: root-Branch
	   * Goal 4. ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - true
	   * Goal 5. Branch ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;: root-Branch in context: ArrayListDemo:set(ILjava/lang/Object;)Ljava/lang/Object;
	   * Goal 6. Branch ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch in context: 
	   * Goal 7. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 8. Branch ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - true in context: 
	   * Goal 9. set(ILjava/lang/Object;)Ljava/lang/Object;_java.lang.ArrayIndexOutOfBoundsException_IMPLICIT
	   * Goal 10. ArrayListDemo.<init>()V: Line 67
	   * Goal 11. ArrayListDemo.<init>()V: Line 68
	   * Goal 12. ArrayListDemo.<init>()V: Line 69
	   * Goal 13. ArrayListDemo.elementData(I)Ljava/lang/Object;: Line 326
	   * Goal 14. ArrayListDemo.rangeCheck(I)V: Line 560
	   * Goal 15. ArrayListDemo.rangeCheck(I)V: Line 562
	   * Goal 16. ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;: Line 352
	   * Goal 17. ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;: Line 354
	   * Goal 18. [METHOD] ArrayListDemo.<init>()V
	   * Goal 19. [METHOD] ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;
	   * Goal 20. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 21. Weak Mutation 918: ArrayListDemo.rangeCheck(I)V:560 - ReplaceComparisonOperator < -> -2
	   */

	  @Test(timeout = 4000)
	  public void test25()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      Integer integer0 = new Integer(0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.set((-1), integer0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // -1
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 26
	  /*
	   * 16 covered goals:
	   * Goal 1. ArrayListDemo.retainAll(Ljava/util/Collection;)Z: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 3. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 4. Branch ArrayListDemo.retainAll(Ljava/util/Collection;)Z: root-Branch in context: ArrayListDemo:retainAll(Ljava/util/Collection;)Z
	   * Goal 5. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 6. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 7. retainAll(Ljava/util/Collection;)Z_java.lang.NullPointerException_IMPLICIT
	   * Goal 8. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 11. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 12. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 13. ArrayListDemo.retainAll(Ljava/util/Collection;)Z: Line 618
	   * Goal 14. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 15. [METHOD] ArrayListDemo.retainAll(Ljava/util/Collection;)Z
	   * Goal 16. [METHODNOEX] ArrayListDemo.<init>(I)V
	   */

	  @Test(timeout = 4000)
	  public void test26()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.retainAll((Collection<?>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("java.util.Objects", e);
	      }
	  }

	  //Test case number: 27
	  /*
	   * 15 covered goals:
	   * Goal 1. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 2. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 3. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 4. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 5. replaceAll(Ljava/util/function/UnaryOperator;)V_java.lang.NullPointerException_IMPLICIT
	   * Goal 6. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 7. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 8. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 11. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: Line 1355
	   * Goal 12. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: root-Branch
	   * Goal 13. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 14. [METHOD] ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V
	   * Goal 15. [METHODNOEX] ArrayListDemo.<init>(I)V
	   */

	  @Test(timeout = 4000)
	  public void test27()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.replaceAll((UnaryOperator<String>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("java.util.Objects", e);
	      }
	  }

	  //Test case number: 28
	  /*
	   * 27 covered goals:
	   * Goal 1. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 2. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 3. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 4. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 5. removeRange(II)V_java.lang.ArrayIndexOutOfBoundsException_IMPLICIT
	   * Goal 6. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 7. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 8. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 11. ArrayListDemo.removeRange(II)V: Line 540
	   * Goal 12. ArrayListDemo.removeRange(II)V: Line 541
	   * Goal 13. ArrayListDemo.removeRange(II)V: Line 542
	   * Goal 14. ArrayListDemo.removeRange(II)V: Line 543
	   * Goal 15. ArrayListDemo.removeRange(II)V: root-Branch
	   * Goal 16. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 17. [METHOD] ArrayListDemo.removeRange(II)V
	   * Goal 18. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 19. Weak Mutation 808: ArrayListDemo.removeRange(II)V:540 - ReplaceConstant - 1 -> 0
	   * Goal 20. Weak Mutation 809: ArrayListDemo.removeRange(II)V:540 - ReplaceArithmeticOperator + -> %
	   * Goal 21. Weak Mutation 810: ArrayListDemo.removeRange(II)V:540 - ReplaceArithmeticOperator + -> -
	   * Goal 22. Weak Mutation 811: ArrayListDemo.removeRange(II)V:540 - ReplaceArithmeticOperator + -> *
	   * Goal 23. Weak Mutation 812: ArrayListDemo.removeRange(II)V:540 - ReplaceArithmeticOperator + -> /
	   * Goal 24. Weak Mutation 822: ArrayListDemo.removeRange(II)V:541 - ReplaceArithmeticOperator - -> +
	   * Goal 25. Weak Mutation 823: ArrayListDemo.removeRange(II)V:541 - ReplaceArithmeticOperator - -> %
	   * Goal 26. Weak Mutation 824: ArrayListDemo.removeRange(II)V:541 - ReplaceArithmeticOperator - -> *
	   * Goal 27. Weak Mutation 825: ArrayListDemo.removeRange(II)V:541 - ReplaceArithmeticOperator - -> /
	   */

	  @Test(timeout = 4000)
	  public void test28()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.removeRange(0, 1);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	      }
	  }

	  //Test case number: 29
	  /*
	   * 11 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 3. removeIf(Ljava/util/function/Predicate;)Z_java.lang.NullPointerException_IMPLICIT
	   * Goal 4. ArrayListDemo.<init>()V: Line 67
	   * Goal 5. ArrayListDemo.<init>()V: Line 68
	   * Goal 6. ArrayListDemo.<init>()V: Line 69
	   * Goal 7. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: Line 1311
	   * Goal 8. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: root-Branch
	   * Goal 9. [METHOD] ArrayListDemo.<init>()V
	   * Goal 10. [METHOD] ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z
	   * Goal 11. [METHODNOEX] ArrayListDemo.<init>()V
	   */

	  @Test(timeout = 4000)
	  public void test29()  throws Throwable  {
	      ArrayListDemo<Object> arrayListDemo0 = new ArrayListDemo<Object>();
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.removeIf((Predicate<? super Object>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("java.util.Objects", e);
	      }
	  }

	  //Test case number: 30
	  /*
	   * 16 covered goals:
	   * Goal 1. ArrayListDemo.removeAll(Ljava/util/Collection;)Z: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 3. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 4. Branch ArrayListDemo.removeAll(Ljava/util/Collection;)Z: root-Branch in context: ArrayListDemo:removeAll(Ljava/util/Collection;)Z
	   * Goal 5. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 6. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 7. removeAll(Ljava/util/Collection;)Z_java.lang.NullPointerException_IMPLICIT
	   * Goal 8. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 11. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 12. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 13. ArrayListDemo.removeAll(Ljava/util/Collection;)Z: Line 597
	   * Goal 14. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 15. [METHOD] ArrayListDemo.removeAll(Ljava/util/Collection;)Z
	   * Goal 16. [METHODNOEX] ArrayListDemo.<init>(I)V
	   */

	  @Test(timeout = 4000)
	  public void test30()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.removeAll((Collection<?>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("java.util.Objects", e);
	      }
	  }

	  //Test case number: 31
	  /*
	   * 26 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch
	   * Goal 3. ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - true
	   * Goal 4. Branch ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch in context: 
	   * Goal 5. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 6. Branch ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - true in context: 
	   * Goal 7. remove(I)Ljava/lang/Object;_java.lang.ArrayIndexOutOfBoundsException_IMPLICIT
	   * Goal 8. ArrayListDemo.<init>()V: Line 67
	   * Goal 9. ArrayListDemo.<init>()V: Line 68
	   * Goal 10. ArrayListDemo.<init>()V: Line 69
	   * Goal 11. ArrayListDemo.elementData(I)Ljava/lang/Object;: Line 326
	   * Goal 12. ArrayListDemo.rangeCheck(I)V: Line 560
	   * Goal 13. ArrayListDemo.rangeCheck(I)V: Line 562
	   * Goal 14. ArrayListDemo.remove(I)Ljava/lang/Object;: Line 400
	   * Goal 15. ArrayListDemo.remove(I)Ljava/lang/Object;: Line 402
	   * Goal 16. ArrayListDemo.remove(I)Ljava/lang/Object;: Line 403
	   * Goal 17. ArrayListDemo.remove(I)Ljava/lang/Object;: root-Branch
	   * Goal 18. [METHOD] ArrayListDemo.<init>()V
	   * Goal 19. [METHOD] ArrayListDemo.remove(I)Ljava/lang/Object;
	   * Goal 20. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 21. Weak Mutation 458: ArrayListDemo.remove(I)Ljava/lang/Object;:402 - ReplaceConstant - 1 -> 0
	   * Goal 22. Weak Mutation 459: ArrayListDemo.remove(I)Ljava/lang/Object;:402 - ReplaceArithmeticOperator + -> %
	   * Goal 23. Weak Mutation 460: ArrayListDemo.remove(I)Ljava/lang/Object;:402 - ReplaceArithmeticOperator + -> -
	   * Goal 24. Weak Mutation 461: ArrayListDemo.remove(I)Ljava/lang/Object;:402 - ReplaceArithmeticOperator + -> *
	   * Goal 25. Weak Mutation 462: ArrayListDemo.remove(I)Ljava/lang/Object;:402 - ReplaceArithmeticOperator + -> /
	   * Goal 26. Weak Mutation 918: ArrayListDemo.rangeCheck(I)V:560 - ReplaceComparisonOperator < -> -2
	   */

	  @Test(timeout = 4000)
	  public void test31()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.remove((-1));
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // -1
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 32
	  /*
	   * 23 covered goals:
	   * Goal 1. ArrayListDemo.get(I)Ljava/lang/Object;: root-Branch
	   * Goal 2. ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch
	   * Goal 3. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true
	   * Goal 4. ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - true
	   * Goal 5. Branch ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch in context: 
	   * Goal 6. Branch ArrayListDemo.get(I)Ljava/lang/Object;: root-Branch in context: ArrayListDemo:get(I)Ljava/lang/Object;
	   * Goal 7. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 8. Branch ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - true in context: 
	   * Goal 9. get(I)Ljava/lang/Object;_java.lang.ArrayIndexOutOfBoundsException_IMPLICIT
	   * Goal 10. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 11. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 12. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 13. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 87
	   * Goal 14. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 15. ArrayListDemo.elementData(I)Ljava/lang/Object;: Line 326
	   * Goal 16. ArrayListDemo.get(I)Ljava/lang/Object;: Line 337
	   * Goal 17. ArrayListDemo.get(I)Ljava/lang/Object;: Line 339
	   * Goal 18. ArrayListDemo.rangeCheck(I)V: Line 560
	   * Goal 19. ArrayListDemo.rangeCheck(I)V: Line 562
	   * Goal 20. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 21. [METHOD] ArrayListDemo.get(I)Ljava/lang/Object;
	   * Goal 22. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 23. Weak Mutation 918: ArrayListDemo.rangeCheck(I)V:560 - ReplaceComparisonOperator < -> -2
	   */

	  @Test(timeout = 4000)
	  public void test32()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(linkedList0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.get((-1));
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // -1
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 33
	  /*
	   * 15 covered goals:
	   * Goal 1. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 2. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 3. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 4. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 5. forEach(Ljava/util/function/Consumer;)V_java.lang.NullPointerException_IMPLICIT
	   * Goal 6. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 7. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 8. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 11. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: Line 1160
	   * Goal 12. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: root-Branch
	   * Goal 13. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 14. [METHOD] ArrayListDemo.forEach(Ljava/util/function/Consumer;)V
	   * Goal 15. [METHODNOEX] ArrayListDemo.<init>(I)V
	   */

	  @Test(timeout = 4000)
	  public void test33()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.forEach((Consumer<? super String>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("java.util.Objects", e);
	      }
	  }

	  //Test case number: 34
	  /*
	   * 23 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 3. ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch
	   * Goal 4. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true
	   * Goal 5. Branch ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch in context: 
	   * Goal 6. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 7. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 8. elementData(I)Ljava/lang/Object;_java.lang.ArrayIndexOutOfBoundsException_IMPLICIT
	   * Goal 9. ArrayListDemo.<init>()V: Line 67
	   * Goal 10. ArrayListDemo.<init>()V: Line 68
	   * Goal 11. ArrayListDemo.<init>()V: Line 69
	   * Goal 12. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 13. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 14. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 15. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 87
	   * Goal 16. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 17. ArrayListDemo.elementData(I)Ljava/lang/Object;: Line 326
	   * Goal 18. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 19. [METHOD] ArrayListDemo.<init>()V
	   * Goal 20. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 21. [METHOD] ArrayListDemo.elementData(I)Ljava/lang/Object;
	   * Goal 22. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 23. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   */

	  @Test(timeout = 4000)
	  public void test34()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>(arrayListDemo0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo1.elementData(0);
	        fail("Expecting exception: ArrayIndexOutOfBoundsException");
	      
	      } catch(ArrayIndexOutOfBoundsException e) {
	         //
	         // 0
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 35
	  /*
	   * 11 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 3. addAll(Ljava/util/Collection;)Z_java.lang.NullPointerException_IMPLICIT
	   * Goal 4. ArrayListDemo.<init>()V: Line 67
	   * Goal 5. ArrayListDemo.<init>()V: Line 68
	   * Goal 6. ArrayListDemo.<init>()V: Line 69
	   * Goal 7. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 485
	   * Goal 8. ArrayListDemo.addAll(Ljava/util/Collection;)Z: root-Branch
	   * Goal 9. [METHOD] ArrayListDemo.<init>()V
	   * Goal 10. [METHOD] ArrayListDemo.addAll(Ljava/util/Collection;)Z
	   * Goal 11. [METHODNOEX] ArrayListDemo.<init>()V
	   */

	  @Test(timeout = 4000)
	  public void test35()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>();
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.addAll((Collection<? extends String>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 36
	  /*
	   * 20 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - false
	   * Goal 3. ArrayListDemo.rangeCheckForAdd(I)V: I7 Branch 43 IFGE L568 - true
	   * Goal 4. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 5. Branch ArrayListDemo.rangeCheckForAdd(I)V: I7 Branch 43 IFGE L568 - true in context: 
	   * Goal 6. Branch ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - false in context: 
	   * Goal 7. addAll(ILjava/util/Collection;)Z_java.lang.NullPointerException_IMPLICIT
	   * Goal 8. ArrayListDemo.<init>()V: Line 67
	   * Goal 9. ArrayListDemo.<init>()V: Line 68
	   * Goal 10. ArrayListDemo.<init>()V: Line 69
	   * Goal 11. ArrayListDemo.addAll(ILjava/util/Collection;)Z: Line 509
	   * Goal 12. ArrayListDemo.addAll(ILjava/util/Collection;)Z: Line 511
	   * Goal 13. ArrayListDemo.addAll(ILjava/util/Collection;)Z: root-Branch
	   * Goal 14. ArrayListDemo.rangeCheckForAdd(I)V: Line 568
	   * Goal 15. ArrayListDemo.rangeCheckForAdd(I)V: Line 570
	   * Goal 16. [METHOD] ArrayListDemo.<init>()V
	   * Goal 17. [METHOD] ArrayListDemo.addAll(ILjava/util/Collection;)Z
	   * Goal 18. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 19. Weak Mutation 934: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator > -> >=
	   * Goal 20. Weak Mutation 941: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator >= -> >
	   */

	  @Test(timeout = 4000)
	  public void test36()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>();
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.addAll(0, (Collection<? extends String>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 37
	  /*
	   * 5 covered goals:
	   * Goal 1. <init>(Ljava/util/Collection;)V_java.lang.NullPointerException_IMPLICIT
	   * Goal 2. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 3. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 4. ArrayListDemo.<init>(Ljava/util/Collection;)V: root-Branch
	   * Goal 5. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   */

	  @Test(timeout = 4000)
	  public void test37()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = null;
	      try {
	        arrayListDemo0 = new ArrayListDemo<String>((Collection<? extends String>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 38
	  /*
	   * 106 covered goals:
	   * Goal 1. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 4. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false
	   * Goal 5. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 6. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 7. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 8. ArrayListDemo.indexOf(Ljava/lang/Object;)I: I3 Branch 17 IFNONNULL L219 - true
	   * Goal 9. ArrayListDemo.indexOf(Ljava/lang/Object;)I: I58 Branch 21 IF_ICMPLT L224 - true
	   * Goal 10. ArrayListDemo.indexOf(Ljava/lang/Object;)I: I58 Branch 21 IF_ICMPLT L224 - false
	   * Goal 11. ArrayListDemo.indexOf(Ljava/lang/Object;)I: I46 Branch 20 IFEQ L225 - true
	   * Goal 12. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 13. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 14. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 15. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false in context: 
	   * Goal 16. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 17. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 18. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 19. Branch ArrayListDemo.indexOf(Ljava/lang/Object;)I: I3 Branch 17 IFNONNULL L219 - true in context: ArrayListDemo:indexOf(Ljava/lang/Object;)I
	   * Goal 20. Branch ArrayListDemo.indexOf(Ljava/lang/Object;)I: I58 Branch 21 IF_ICMPLT L224 - true in context: ArrayListDemo:indexOf(Ljava/lang/Object;)I
	   * Goal 21. Branch ArrayListDemo.indexOf(Ljava/lang/Object;)I: I58 Branch 21 IF_ICMPLT L224 - false in context: ArrayListDemo:indexOf(Ljava/lang/Object;)I
	   * Goal 22. Branch ArrayListDemo.indexOf(Ljava/lang/Object;)I: I46 Branch 20 IFEQ L225 - true in context: ArrayListDemo:indexOf(Ljava/lang/Object;)I
	   * Goal 23. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 24. [Output]: ArrayListDemo.indexOf(Ljava/lang/Object;)I:Negative
	   * Goal 25. ArrayListDemo.<init>()V: Line 67
	   * Goal 26. ArrayListDemo.<init>()V: Line 68
	   * Goal 27. ArrayListDemo.<init>()V: Line 69
	   * Goal 28. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 29. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 30. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 31. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 32. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 129
	   * Goal 33. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 34. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 35. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 36. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 37. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 38. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 39. ArrayListDemo.grow(I)V: Line 162
	   * Goal 40. ArrayListDemo.grow(I)V: Line 163
	   * Goal 41. ArrayListDemo.grow(I)V: Line 164
	   * Goal 42. ArrayListDemo.grow(I)V: Line 165
	   * Goal 43. ArrayListDemo.grow(I)V: Line 166
	   * Goal 44. ArrayListDemo.grow(I)V: Line 169
	   * Goal 45. ArrayListDemo.grow(I)V: Line 170
	   * Goal 46. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 219
	   * Goal 47. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 224
	   * Goal 48. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 225
	   * Goal 49. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 228
	   * Goal 50. [METHOD] ArrayListDemo.<init>()V
	   * Goal 51. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 52. [METHOD] ArrayListDemo.indexOf(Ljava/lang/Object;)I
	   * Goal 53. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 54. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 55. [METHODNOEX] ArrayListDemo.indexOf(Ljava/lang/Object;)I
	   * Goal 56. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 57. Weak Mutation 54: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 0
	   * Goal 58. Weak Mutation 55: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 1
	   * Goal 59. Weak Mutation 56: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> -1
	   * Goal 60. Weak Mutation 57: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 9
	   * Goal 61. Weak Mutation 58: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 11
	   * Goal 62. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 63. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 64. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 65. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 66. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 67. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 68. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 69. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 70. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 71. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 72. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 73. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 74. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 75. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 76. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 77. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 78. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 79. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 80. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 81. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 82. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 83. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 84. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 85. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 86. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 87. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 88. Weak Mutation 209: ArrayListDemo.indexOf(Ljava/lang/Object;)I:219 - ReplaceComparisonOperator != null -> = null
	   * Goal 89. Weak Mutation 231: ArrayListDemo.indexOf(Ljava/lang/Object;)I:224 - ReplaceConstant - 0 -> 1
	   * Goal 90. Weak Mutation 250: ArrayListDemo.indexOf(Ljava/lang/Object;)I:224 - ReplaceComparisonOperator < -> -2
	   * Goal 91. Weak Mutation 251: ArrayListDemo.indexOf(Ljava/lang/Object;)I:224 - ReplaceComparisonOperator < -> <=
	   * Goal 92. Weak Mutation 236: ArrayListDemo.indexOf(Ljava/lang/Object;)I:225 - ReplaceComparisonOperator == -> !=
	   * Goal 93. Weak Mutation 252: ArrayListDemo.indexOf(Ljava/lang/Object;)I:228 - ReplaceConstant - -1 -> 0
	   * Goal 94. Weak Mutation 253: ArrayListDemo.indexOf(Ljava/lang/Object;)I:228 - ReplaceConstant - -1 -> 1
	   * Goal 95. Weak Mutation 254: ArrayListDemo.indexOf(Ljava/lang/Object;)I:228 - ReplaceConstant - -1 -> -2
	   * Goal 96. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 97. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 98. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 99. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 100. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 101. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 102. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 103. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 104. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 105. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 106. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   */

	  @Test(timeout = 4000)
	  public void test38()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      arrayListDemo0.add((Integer) null);
	      int int0 = arrayListDemo0.indexOf("");
	      assertEquals(1, arrayListDemo0.size());
	      assertEquals((-1), int0);
	  }

	  //Test case number: 39
	  /*
	   * 23 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.sort(Ljava/util/Comparator;)V: I19 Branch 78 IF_ICMPEQ L1372 - true
	   * Goal 3. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 4. Branch ArrayListDemo.sort(Ljava/util/Comparator;)V: I19 Branch 78 IF_ICMPEQ L1372 - true in context: ArrayListDemo:sort(Ljava/util/Comparator;)V
	   * Goal 5. ArrayListDemo.<init>()V: Line 67
	   * Goal 6. ArrayListDemo.<init>()V: Line 68
	   * Goal 7. ArrayListDemo.<init>()V: Line 69
	   * Goal 8. ArrayListDemo.sort(Ljava/util/Comparator;)V: Line 1370
	   * Goal 9. ArrayListDemo.sort(Ljava/util/Comparator;)V: Line 1371
	   * Goal 10. ArrayListDemo.sort(Ljava/util/Comparator;)V: Line 1372
	   * Goal 11. ArrayListDemo.sort(Ljava/util/Comparator;)V: Line 1375
	   * Goal 12. ArrayListDemo.sort(Ljava/util/Comparator;)V: Line 1376
	   * Goal 13. [METHOD] ArrayListDemo.<init>()V
	   * Goal 14. [METHOD] ArrayListDemo.sort(Ljava/util/Comparator;)V
	   * Goal 15. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 16. [METHODNOEX] ArrayListDemo.sort(Ljava/util/Comparator;)V
	   * Goal 17. Weak Mutation 1540: ArrayListDemo.sort(Ljava/util/Comparator;)V:1371 - ReplaceConstant - 0 -> 1
	   * Goal 18. Weak Mutation 1552: ArrayListDemo.sort(Ljava/util/Comparator;)V:1372 - ReplaceComparisonOperator == -> -2
	   * Goal 19. Weak Mutation 1558: ArrayListDemo.sort(Ljava/util/Comparator;)V:1375 - ReplaceConstant - 1 -> 0
	   * Goal 20. Weak Mutation 1559: ArrayListDemo.sort(Ljava/util/Comparator;)V:1375 - ReplaceArithmeticOperator + -> %
	   * Goal 21. Weak Mutation 1560: ArrayListDemo.sort(Ljava/util/Comparator;)V:1375 - ReplaceArithmeticOperator + -> -
	   * Goal 22. Weak Mutation 1561: ArrayListDemo.sort(Ljava/util/Comparator;)V:1375 - ReplaceArithmeticOperator + -> *
	   * Goal 23. Weak Mutation 1562: ArrayListDemo.sort(Ljava/util/Comparator;)V:1375 - ReplaceArithmeticOperator + -> /
	   */

	  @Test(timeout = 4000)
	  public void test39()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
	      arrayListDemo0.sort(comparator0);
	      assertEquals(0, arrayListDemo0.size());
	  }

	  //Test case number: 40
	  /*
	   * 111 covered goals:
	   * Goal 1. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 4. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false
	   * Goal 5. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 6. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 7. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 8. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: I40 Branch 75 IF_ICMPNE L1358 - false
	   * Goal 9. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: I43 Branch 76 IF_ICMPLT L1358 - true
	   * Goal 10. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: I43 Branch 76 IF_ICMPLT L1358 - false
	   * Goal 11. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: I49 Branch 77 IF_ICMPEQ L1361 - true
	   * Goal 12. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 13. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 14. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 15. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false in context: 
	   * Goal 16. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 17. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 18. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 19. Branch ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: I43 Branch 76 IF_ICMPLT L1358 - false in context: ArrayListDemo:replaceAll(Ljava/util/function/UnaryOperator;)V
	   * Goal 20. Branch ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: I43 Branch 76 IF_ICMPLT L1358 - true in context: ArrayListDemo:replaceAll(Ljava/util/function/UnaryOperator;)V
	   * Goal 21. Branch ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: I40 Branch 75 IF_ICMPNE L1358 - false in context: ArrayListDemo:replaceAll(Ljava/util/function/UnaryOperator;)V
	   * Goal 22. Branch ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: I49 Branch 77 IF_ICMPEQ L1361 - true in context: ArrayListDemo:replaceAll(Ljava/util/function/UnaryOperator;)V
	   * Goal 23. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 24. ArrayListDemo.<init>()V: Line 67
	   * Goal 25. ArrayListDemo.<init>()V: Line 68
	   * Goal 26. ArrayListDemo.<init>()V: Line 69
	   * Goal 27. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 28. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 29. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 30. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 31. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 129
	   * Goal 32. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 33. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 34. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 35. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 36. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 37. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 38. ArrayListDemo.grow(I)V: Line 162
	   * Goal 39. ArrayListDemo.grow(I)V: Line 163
	   * Goal 40. ArrayListDemo.grow(I)V: Line 164
	   * Goal 41. ArrayListDemo.grow(I)V: Line 165
	   * Goal 42. ArrayListDemo.grow(I)V: Line 166
	   * Goal 43. ArrayListDemo.grow(I)V: Line 169
	   * Goal 44. ArrayListDemo.grow(I)V: Line 170
	   * Goal 45. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: Line 1355
	   * Goal 46. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: Line 1356
	   * Goal 47. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: Line 1357
	   * Goal 48. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: Line 1358
	   * Goal 49. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: Line 1359
	   * Goal 50. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: Line 1361
	   * Goal 51. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: Line 1364
	   * Goal 52. ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V: Line 1365
	   * Goal 53. [METHOD] ArrayListDemo.<init>()V
	   * Goal 54. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 55. [METHOD] ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V
	   * Goal 56. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 57. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 58. [METHODNOEX] ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V
	   * Goal 59. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 60. Weak Mutation 54: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 0
	   * Goal 61. Weak Mutation 55: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 1
	   * Goal 62. Weak Mutation 56: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> -1
	   * Goal 63. Weak Mutation 57: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 9
	   * Goal 64. Weak Mutation 58: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 11
	   * Goal 65. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 66. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 67. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 68. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 69. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 70. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 71. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 72. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 73. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 74. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 75. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 76. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 77. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 78. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 79. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 80. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 81. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 82. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 83. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 84. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 85. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 86. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 87. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 88. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 89. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 90. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 91. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 92. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 93. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 94. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 95. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 96. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 97. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 98. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 99. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 100. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 101. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   * Goal 102. Weak Mutation 1476: ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V:1358 - ReplaceConstant - 0 -> 1
	   * Goal 103. Weak Mutation 1500: ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V:1358 - ReplaceComparisonOperator != -> -1
	   * Goal 104. Weak Mutation 1516: ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V:1358 - ReplaceComparisonOperator < -> -2
	   * Goal 105. Weak Mutation 1517: ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V:1358 - ReplaceComparisonOperator < -> <=
	   * Goal 106. Weak Mutation 1526: ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V:1361 - ReplaceComparisonOperator == -> -2
	   * Goal 107. Weak Mutation 1532: ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V:1364 - ReplaceConstant - 1 -> 0
	   * Goal 108. Weak Mutation 1533: ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V:1364 - ReplaceArithmeticOperator + -> %
	   * Goal 109. Weak Mutation 1534: ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V:1364 - ReplaceArithmeticOperator + -> -
	   * Goal 110. Weak Mutation 1535: ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V:1364 - ReplaceArithmeticOperator + -> *
	   * Goal 111. Weak Mutation 1536: ArrayListDemo.replaceAll(Ljava/util/function/UnaryOperator;)V:1364 - ReplaceArithmeticOperator + -> /
	   */

	  @Test(timeout = 4000)
	  public void test40()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      UnaryOperator<Integer> unaryOperator0 = UnaryOperator.identity();
	      Integer integer0 = new Integer(0);
	      arrayListDemo0.add(integer0);
	      arrayListDemo0.replaceAll(unaryOperator0);
	      assertEquals(1, arrayListDemo0.size());
	  }

	  //Test case number: 41
	  /*
	   * 68 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.spliterator()Ljava/util/Spliterator;: root-Branch
	   * Goal 3. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 4. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 5. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 6. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: I61 Branch 66 IF_ICMPNE L1319 - false
	   * Goal 7. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: I64 Branch 67 IF_ICMPLT L1319 - false
	   * Goal 8. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: I70 Branch 68 IF_ICMPEQ L1327 - true
	   * Goal 9. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: I80 Branch 69 IFLE L1332 - true
	   * Goal 10. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: I90 Branch 70 IFEQ L1333 - true
	   * Goal 11. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 12. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 13. Branch ArrayListDemo.spliterator()Ljava/util/Spliterator;: root-Branch in context: ArrayListDemo:spliterator()Ljava/util/Spliterator;
	   * Goal 14. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 15. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 16. Branch ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: I61 Branch 66 IF_ICMPNE L1319 - false in context: ArrayListDemo:removeIf(Ljava/util/function/Predicate;)Z
	   * Goal 17. Branch ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: I64 Branch 67 IF_ICMPLT L1319 - false in context: ArrayListDemo:removeIf(Ljava/util/function/Predicate;)Z
	   * Goal 18. Branch ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: I70 Branch 68 IF_ICMPEQ L1327 - true in context: ArrayListDemo:removeIf(Ljava/util/function/Predicate;)Z
	   * Goal 19. Branch ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: I80 Branch 69 IFLE L1332 - true in context: ArrayListDemo:removeIf(Ljava/util/function/Predicate;)Z
	   * Goal 20. Branch ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: I90 Branch 70 IFEQ L1333 - true in context: ArrayListDemo:removeIf(Ljava/util/function/Predicate;)Z
	   * Goal 21. [Output]: ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z:False
	   * Goal 22. [Output]: ArrayListDemo.spliterator()Ljava/util/Spliterator;:NonNull
	   * Goal 23. ArrayListDemo.<init>()V: Line 67
	   * Goal 24. ArrayListDemo.<init>()V: Line 68
	   * Goal 25. ArrayListDemo.<init>()V: Line 69
	   * Goal 26. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 27. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 28. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 29. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 30. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 31. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: Line 1311
	   * Goal 32. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: Line 1315
	   * Goal 33. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: Line 1316
	   * Goal 34. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: Line 1317
	   * Goal 35. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: Line 1318
	   * Goal 36. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: Line 1319
	   * Goal 37. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: Line 1327
	   * Goal 38. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: Line 1332
	   * Goal 39. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: Line 1333
	   * Goal 40. ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z: Line 1349
	   * Goal 41. ArrayListDemo.spliterator()Ljava/util/Spliterator;: Line 1188
	   * Goal 42. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 43. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 44. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 45. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 46. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 47. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 48. [METHOD] ArrayListDemo.<init>()V
	   * Goal 49. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 50. [METHOD] ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z
	   * Goal 51. [METHOD] ArrayListDemo.spliterator()Ljava/util/Spliterator;
	   * Goal 52. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 53. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 54. [METHODNOEX] ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z
	   * Goal 55. [METHODNOEX] ArrayListDemo.spliterator()Ljava/util/Spliterator;
	   * Goal 56. Weak Mutation 1340: ArrayListDemo.spliterator()Ljava/util/Spliterator;:1188 - ReplaceConstant - 0 -> 1
	   * Goal 57. Weak Mutation 1341: ArrayListDemo.spliterator()Ljava/util/Spliterator;:1188 - ReplaceConstant - -1 -> 0
	   * Goal 58. Weak Mutation 1342: ArrayListDemo.spliterator()Ljava/util/Spliterator;:1188 - ReplaceConstant - -1 -> 1
	   * Goal 59. Weak Mutation 1343: ArrayListDemo.spliterator()Ljava/util/Spliterator;:1188 - ReplaceConstant - -1 -> -2
	   * Goal 60. Weak Mutation 1344: ArrayListDemo.spliterator()Ljava/util/Spliterator;:1188 - ReplaceConstant - 0 -> 1
	   * Goal 61. Weak Mutation 1345: ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z:1315 - ReplaceConstant - 0 -> 1
	   * Goal 62. Weak Mutation 1357: ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z:1319 - ReplaceConstant - 0 -> 1
	   * Goal 63. Weak Mutation 1389: ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z:1319 - ReplaceComparisonOperator != -> -1
	   * Goal 64. Weak Mutation 1408: ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z:1319 - ReplaceComparisonOperator < -> <=
	   * Goal 65. Weak Mutation 1418: ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z:1327 - ReplaceComparisonOperator == -> -2
	   * Goal 66. Weak Mutation 1429: ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z:1332 - ReplaceComparisonOperator <= -> <
	   * Goal 67. Weak Mutation 1431: ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z:1332 - ReplaceConstant - 0 -> 1
	   * Goal 68. Weak Mutation 1435: ArrayListDemo.removeIf(Ljava/util/function/Predicate;)Z:1333 - ReplaceComparisonOperator == -> !=
	   */

	  @Test(timeout = 4000)
	  public void test41()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      Spliterator<Integer> spliterator0 = arrayListDemo0.spliterator();
	      ArrayListDemo<ArrayListDemo<Object>> arrayListDemo1 = new ArrayListDemo<ArrayListDemo<Object>>(0);
	      Predicate<Object> predicate0 = Predicate.isEqual((Object) spliterator0);
	      boolean boolean0 = arrayListDemo1.removeIf(predicate0);
	      assertFalse(boolean0);
	  }

	  //Test case number: 42
	  /*
	   * 54 covered goals:
	   * Goal 1. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 3. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - true
	   * Goal 5. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I17 Branch 105 IFNULL L1281 - false
	   * Goal 6. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I23 Branch 106 IFNULL L1281 - false
	   * Goal 7. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I31 Branch 107 IFGE L1282 - true
	   * Goal 8. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I57 Branch 108 IFLT L1288 - false
	   * Goal 9. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I64 Branch 109 IF_ICMPGT L1288 - false
	   * Goal 10. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I85 Branch 110 IF_ICMPLT L1289 - false
	   * Goal 11. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I91 Branch 111 IF_ICMPNE L1293 - true
	   * Goal 12. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 13. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 14. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 15. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - true in context: 
	   * Goal 16. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I23 Branch 106 IFNULL L1281 - false in context: 
	   * Goal 17. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I17 Branch 105 IFNULL L1281 - false in context: 
	   * Goal 18. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I31 Branch 107 IFGE L1282 - true in context: 
	   * Goal 19. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I64 Branch 109 IF_ICMPGT L1288 - false in context: 
	   * Goal 20. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I57 Branch 108 IFLT L1288 - false in context: 
	   * Goal 21. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I85 Branch 110 IF_ICMPLT L1289 - false in context: 
	   * Goal 22. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I91 Branch 111 IF_ICMPNE L1293 - true in context: 
	   * Goal 23. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 24. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 25. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 26. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 27. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 28. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 29. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 30. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 31. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 32. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 33. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 34. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1279
	   * Goal 35. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1281
	   * Goal 36. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1282
	   * Goal 37. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1287
	   * Goal 38. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1288
	   * Goal 39. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1289
	   * Goal 40. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1293
	   * Goal 41. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1297
	   * Goal 42. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 43. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 44. [METHOD] ArrayListDemo.ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V
	   * Goal 45. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 46. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 47. Weak Mutation 2549: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1279 - ReplaceComparisonOperator != null -> = null
	   * Goal 48. Weak Mutation 2550: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1281 - ReplaceComparisonOperator = null -> != null
	   * Goal 49. Weak Mutation 2551: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1281 - ReplaceComparisonOperator = null -> != null
	   * Goal 50. Weak Mutation 2565: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1282 - ReplaceComparisonOperator >= -> >
	   * Goal 51. Weak Mutation 2593: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1288 - ReplaceComparisonOperator < -> <=
	   * Goal 52. Weak Mutation 2609: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1288 - ReplaceComparisonOperator > -> >=
	   * Goal 53. Weak Mutation 2653: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1289 - ReplaceComparisonOperator < -> <=
	   * Goal 54. Weak Mutation 2671: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1293 - ReplaceComparisonOperator != -> <
	   */

	  @Test(timeout = 4000)
	  public void test42()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(0);
	      ArrayListDemo.ArrayListSpliterator<Integer> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Integer>(arrayListDemo0, 0, 0, (-1));
	      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
	      // Undeclared exception!
	      try { 
	        arrayListDemo_ArrayListSpliterator0.forEachRemaining(consumer0);
	        fail("Expecting exception: ConcurrentModificationException");
	      
	      } catch(ConcurrentModificationException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("ArrayListDemo$ArrayListSpliterator", e);
	      }
	  }

	  //Test case number: 43
	  /*
	   * 42 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 3. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - true
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I17 Branch 105 IFNULL L1281 - false
	   * Goal 5. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I23 Branch 106 IFNULL L1281 - false
	   * Goal 6. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I31 Branch 107 IFGE L1282 - true
	   * Goal 7. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I57 Branch 108 IFLT L1288 - false
	   * Goal 8. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I64 Branch 109 IF_ICMPGT L1288 - true
	   * Goal 9. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 10. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 11. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - true in context: 
	   * Goal 12. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I23 Branch 106 IFNULL L1281 - false in context: 
	   * Goal 13. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I17 Branch 105 IFNULL L1281 - false in context: 
	   * Goal 14. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I31 Branch 107 IFGE L1282 - true in context: 
	   * Goal 15. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I64 Branch 109 IF_ICMPGT L1288 - true in context: 
	   * Goal 16. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I57 Branch 108 IFLT L1288 - false in context: 
	   * Goal 17. ArrayListDemo.<init>()V: Line 67
	   * Goal 18. ArrayListDemo.<init>()V: Line 68
	   * Goal 19. ArrayListDemo.<init>()V: Line 69
	   * Goal 20. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 21. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 22. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 23. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 24. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 25. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 26. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1279
	   * Goal 27. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1281
	   * Goal 28. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1282
	   * Goal 29. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1287
	   * Goal 30. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1288
	   * Goal 31. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1297
	   * Goal 32. [METHOD] ArrayListDemo.<init>()V
	   * Goal 33. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 34. [METHOD] ArrayListDemo.ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V
	   * Goal 35. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 36. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 37. Weak Mutation 2549: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1279 - ReplaceComparisonOperator != null -> = null
	   * Goal 38. Weak Mutation 2550: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1281 - ReplaceComparisonOperator = null -> != null
	   * Goal 39. Weak Mutation 2551: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1281 - ReplaceComparisonOperator = null -> != null
	   * Goal 40. Weak Mutation 2564: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1282 - ReplaceComparisonOperator >= -> ==
	   * Goal 41. Weak Mutation 2593: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1288 - ReplaceComparisonOperator < -> <=
	   * Goal 42. Weak Mutation 2608: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1288 - ReplaceComparisonOperator > -> -2
	   */

	  @Test(timeout = 4000)
	  public void test43()  throws Throwable  {
	      ArrayListDemo<Object> arrayListDemo0 = new ArrayListDemo<Object>();
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Object>(arrayListDemo0, 0, 1, 0);
	      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
	      // Undeclared exception!
	      try { 
	        arrayListDemo_ArrayListSpliterator0.forEachRemaining(consumer0);
	        fail("Expecting exception: ConcurrentModificationException");
	      
	      } catch(ConcurrentModificationException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("ArrayListDemo$ArrayListSpliterator", e);
	      }
	  }

	  //Test case number: 44
	  /*
	   * 39 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 3. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - true
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I17 Branch 105 IFNULL L1281 - false
	   * Goal 5. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I23 Branch 106 IFNULL L1281 - false
	   * Goal 6. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I31 Branch 107 IFGE L1282 - true
	   * Goal 7. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I57 Branch 108 IFLT L1288 - true
	   * Goal 8. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 9. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 10. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - true in context: 
	   * Goal 11. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I23 Branch 106 IFNULL L1281 - false in context: 
	   * Goal 12. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I17 Branch 105 IFNULL L1281 - false in context: 
	   * Goal 13. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I31 Branch 107 IFGE L1282 - true in context: 
	   * Goal 14. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I57 Branch 108 IFLT L1288 - true in context: 
	   * Goal 15. ArrayListDemo.<init>()V: Line 67
	   * Goal 16. ArrayListDemo.<init>()V: Line 68
	   * Goal 17. ArrayListDemo.<init>()V: Line 69
	   * Goal 18. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 19. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 20. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 21. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 22. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 23. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 24. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1279
	   * Goal 25. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1281
	   * Goal 26. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1282
	   * Goal 27. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1287
	   * Goal 28. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1288
	   * Goal 29. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1297
	   * Goal 30. [METHOD] ArrayListDemo.<init>()V
	   * Goal 31. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 32. [METHOD] ArrayListDemo.ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V
	   * Goal 33. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 34. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 35. Weak Mutation 2549: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1279 - ReplaceComparisonOperator != null -> = null
	   * Goal 36. Weak Mutation 2550: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1281 - ReplaceComparisonOperator = null -> != null
	   * Goal 37. Weak Mutation 2551: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1281 - ReplaceComparisonOperator = null -> != null
	   * Goal 38. Weak Mutation 2565: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1282 - ReplaceComparisonOperator >= -> >
	   * Goal 39. Weak Mutation 2591: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1288 - ReplaceComparisonOperator < -> -2
	   */

	  @Test(timeout = 4000)
	  public void test44()  throws Throwable  {
	      ArrayListDemo<Object> arrayListDemo0 = new ArrayListDemo<Object>();
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Object>(arrayListDemo0, (-1), 0, 0);
	      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
	      // Undeclared exception!
	      try { 
	        arrayListDemo_ArrayListSpliterator0.forEachRemaining(consumer0);
	        fail("Expecting exception: ConcurrentModificationException");
	      
	      } catch(ConcurrentModificationException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("ArrayListDemo$ArrayListSpliterator", e);
	      }
	  }

	  //Test case number: 45
	  /*
	   * 57 covered goals:
	   * Goal 1. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 3. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - true
	   * Goal 5. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I17 Branch 105 IFNULL L1281 - false
	   * Goal 6. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I23 Branch 106 IFNULL L1281 - false
	   * Goal 7. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I31 Branch 107 IFGE L1282 - false
	   * Goal 8. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I57 Branch 108 IFLT L1288 - false
	   * Goal 9. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I64 Branch 109 IF_ICMPGT L1288 - false
	   * Goal 10. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I85 Branch 110 IF_ICMPLT L1289 - false
	   * Goal 11. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I91 Branch 111 IF_ICMPNE L1293 - false
	   * Goal 12. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 13. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 14. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 15. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - true in context: 
	   * Goal 16. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I23 Branch 106 IFNULL L1281 - false in context: 
	   * Goal 17. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I17 Branch 105 IFNULL L1281 - false in context: 
	   * Goal 18. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I31 Branch 107 IFGE L1282 - false in context: 
	   * Goal 19. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I64 Branch 109 IF_ICMPGT L1288 - false in context: 
	   * Goal 20. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I57 Branch 108 IFLT L1288 - false in context: 
	   * Goal 21. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I85 Branch 110 IF_ICMPLT L1289 - false in context: 
	   * Goal 22. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I91 Branch 111 IF_ICMPNE L1293 - false in context: 
	   * Goal 23. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 24. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 25. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 26. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 27. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 28. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 29. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 30. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 31. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 32. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 33. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 34. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1279
	   * Goal 35. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1281
	   * Goal 36. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1282
	   * Goal 37. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1283
	   * Goal 38. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1284
	   * Goal 39. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1285
	   * Goal 40. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1288
	   * Goal 41. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1289
	   * Goal 42. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1293
	   * Goal 43. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1294
	   * Goal 44. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 45. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 46. [METHOD] ArrayListDemo.ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V
	   * Goal 47. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 48. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 49. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V
	   * Goal 50. Weak Mutation 2549: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1279 - ReplaceComparisonOperator != null -> = null
	   * Goal 51. Weak Mutation 2550: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1281 - ReplaceComparisonOperator = null -> != null
	   * Goal 52. Weak Mutation 2551: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1281 - ReplaceComparisonOperator = null -> != null
	   * Goal 53. Weak Mutation 2563: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1282 - ReplaceComparisonOperator >= -> -1
	   * Goal 54. Weak Mutation 2593: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1288 - ReplaceComparisonOperator < -> <=
	   * Goal 55. Weak Mutation 2609: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1288 - ReplaceComparisonOperator > -> >=
	   * Goal 56. Weak Mutation 2653: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1289 - ReplaceComparisonOperator < -> <=
	   * Goal 57. Weak Mutation 2670: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1293 - ReplaceComparisonOperator != -> -1
	   */

	  @Test(timeout = 4000)
	  public void test45()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(0);
	      ArrayListDemo.ArrayListSpliterator<Integer> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Integer>(arrayListDemo0, 0, (-1), 0);
	      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
	      arrayListDemo_ArrayListSpliterator0.forEachRemaining(consumer0);
	      assertEquals(16464, arrayListDemo_ArrayListSpliterator0.characteristics());
	  }

	  //Test case number: 46
	  /*
	   * 27 covered goals:
	   * Goal 1. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 3. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - false
	   * Goal 5. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 6. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 7. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 8. Branch ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: I3 Branch 104 IFNONNULL L1279 - false in context: 
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 11. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 12. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 13. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 14. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 15. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 16. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 17. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 18. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 19. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 20. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1279
	   * Goal 21. ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V: Line 1280
	   * Goal 22. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 23. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 24. [METHOD] ArrayListDemo.ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V
	   * Goal 25. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 26. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 27. Weak Mutation 2549: ArrayListDemo$ArrayListSpliterator.forEachRemaining(Ljava/util/function/Consumer;)V:1279 - ReplaceComparisonOperator != null -> = null
	   */

	  @Test(timeout = 4000)
	  public void test46()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(0);
	      ArrayListDemo.ArrayListSpliterator<Integer> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Integer>(arrayListDemo0, 0, 0, 0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo_ArrayListSpliterator0.forEachRemaining((Consumer<? super Integer>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("ArrayListDemo$ArrayListSpliterator", e);
	      }
	  }

	  //Test case number: 47
	  /*
	   * 47 covered goals:
	   * Goal 1. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - false
	   * Goal 3. ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I3 Branch 101 IFNONNULL L1262 - true
	   * Goal 5. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I23 Branch 102 IF_ICMPGE L1265 - false
	   * Goal 6. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I51 Branch 103 IF_ICMPEQ L1269 - false
	   * Goal 7. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 9. Branch ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true in context: 
	   * Goal 10. Branch ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I3 Branch 101 IFNONNULL L1262 - true in context: 
	   * Goal 11. Branch ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I23 Branch 102 IF_ICMPGE L1265 - false in context: 
	   * Goal 12. Branch ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I51 Branch 103 IF_ICMPEQ L1269 - false in context: 
	   * Goal 13. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 14. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 15. ArrayListDemo.<init>(I)V: Line 55
	   * Goal 16. ArrayListDemo.<init>(I)V: Line 56
	   * Goal 17. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 18. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 19. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 20. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 21. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 22. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 23. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 24. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1243
	   * Goal 25. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1251
	   * Goal 26. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1262
	   * Goal 27. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1264
	   * Goal 28. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1265
	   * Goal 29. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1266
	   * Goal 30. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1267
	   * Goal 31. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1268
	   * Goal 32. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1269
	   * Goal 33. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1270
	   * Goal 34. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 35. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 36. [METHOD] ArrayListDemo.ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z
	   * Goal 37. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 38. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 39. Weak Mutation 2336: ArrayListDemo$ArrayListSpliterator.getFence()I:1243 - ReplaceComparisonOperator >= -> ==
	   * Goal 40. Weak Mutation 2462: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1262 - ReplaceComparisonOperator != null -> = null
	   * Goal 41. Weak Mutation 2498: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1265 - ReplaceComparisonOperator >= -> -1
	   * Goal 42. Weak Mutation 2513: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1266 - ReplaceConstant - 1 -> 0
	   * Goal 43. Weak Mutation 2514: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1266 - ReplaceArithmeticOperator + -> %
	   * Goal 44. Weak Mutation 2515: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1266 - ReplaceArithmeticOperator + -> -
	   * Goal 45. Weak Mutation 2516: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1266 - ReplaceArithmeticOperator + -> *
	   * Goal 46. Weak Mutation 2517: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1266 - ReplaceArithmeticOperator + -> /
	   * Goal 47. Weak Mutation 2546: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1269 - ReplaceComparisonOperator == -> <=
	   */

	  @Test(timeout = 4000)
	  public void test47()  throws Throwable  {
	      ArrayListDemo<Object> arrayListDemo0 = new ArrayListDemo<Object>(32);
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Object>(arrayListDemo0, 0, 1, 1);
	      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
	      // Undeclared exception!
	      try { 
	        arrayListDemo_ArrayListSpliterator0.tryAdvance(consumer0);
	        fail("Expecting exception: ConcurrentModificationException");
	      
	      } catch(ConcurrentModificationException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("ArrayListDemo$ArrayListSpliterator", e);
	      }
	  }

	  //Test case number: 48
	  /*
	   * 27 covered goals:
	   * Goal 1. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 3. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I3 Branch 101 IFNONNULL L1262 - false
	   * Goal 5. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 6. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 7. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 8. Branch ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I3 Branch 101 IFNONNULL L1262 - false in context: 
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 11. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 12. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 13. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 14. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 15. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 16. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 17. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 18. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 19. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 20. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1262
	   * Goal 21. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1263
	   * Goal 22. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 23. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 24. [METHOD] ArrayListDemo.ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z
	   * Goal 25. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 26. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 27. Weak Mutation 2462: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1262 - ReplaceComparisonOperator != null -> = null
	   */

	  @Test(timeout = 4000)
	  public void test48()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(0);
	      ArrayListDemo.ArrayListSpliterator<Integer> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Integer>(arrayListDemo0, 0, 0, 0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo_ArrayListSpliterator0.tryAdvance((Consumer<? super Integer>) null);
	        fail("Expecting exception: NullPointerException");
	      
	      } catch(NullPointerException e) {
	         //
	         // no message in exception (getMessage() returned null)
	         //
	         verifyException("ArrayListDemo$ArrayListSpliterator", e);
	      }
	  }

	  //Test case number: 49
	  /*
	   * 35 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 3. ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I3 Branch 101 IFNONNULL L1262 - true
	   * Goal 5. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I23 Branch 102 IF_ICMPGE L1265 - true
	   * Goal 6. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 7. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true in context: 
	   * Goal 9. Branch ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I3 Branch 101 IFNONNULL L1262 - true in context: 
	   * Goal 10. Branch ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: I23 Branch 102 IF_ICMPGE L1265 - true in context: 
	   * Goal 11. ArrayListDemo.<init>()V: Line 67
	   * Goal 12. ArrayListDemo.<init>()V: Line 68
	   * Goal 13. ArrayListDemo.<init>()V: Line 69
	   * Goal 14. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 15. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 16. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 17. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 18. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 19. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 20. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1243
	   * Goal 21. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1251
	   * Goal 22. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1262
	   * Goal 23. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1264
	   * Goal 24. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1265
	   * Goal 25. ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z: Line 1273
	   * Goal 26. [METHOD] ArrayListDemo.<init>()V
	   * Goal 27. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 28. [METHOD] ArrayListDemo.ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z
	   * Goal 29. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 30. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 31. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z
	   * Goal 32. Weak Mutation 2337: ArrayListDemo$ArrayListSpliterator.getFence()I:1243 - ReplaceComparisonOperator >= -> >
	   * Goal 33. Weak Mutation 2462: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1262 - ReplaceComparisonOperator != null -> = null
	   * Goal 34. Weak Mutation 2499: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1265 - ReplaceComparisonOperator >= -> >
	   * Goal 35. Weak Mutation 2548: ArrayListDemo$ArrayListSpliterator.tryAdvance(Ljava/util/function/Consumer;)Z:1273 - ReplaceConstant - 0 -> 1
	   */

	  @Test(timeout = 4000)
	  public void test49()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      ArrayListDemo.ArrayListSpliterator<Integer> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Integer>(arrayListDemo0, 0, 0, 0);
	      Consumer<Integer> consumer0 = (Consumer<Integer>) mock(Consumer.class, new ViolatedAssumptionAnswer());
	      boolean boolean0 = arrayListDemo_ArrayListSpliterator0.tryAdvance(consumer0);
	      assertFalse(boolean0);
	  }

	  //Test case number: 50
	  /*
	   * 40 covered goals:
	   * Goal 1. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 3. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true
	   * Goal 5. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: I20 Branch 100 IF_ICMPLT L1256 - true
	   * Goal 6. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 7. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 8. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 9. Branch ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - true in context: 
	   * Goal 10. Branch ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: I20 Branch 100 IF_ICMPLT L1256 - true in context: 
	   * Goal 11. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 12. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 13. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 14. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 15. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 16. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 17. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 18. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 19. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 20. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 21. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 22. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1243
	   * Goal 23. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1251
	   * Goal 24. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: Line 1255
	   * Goal 25. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: Line 1256
	   * Goal 26. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: Line 1257
	   * Goal 27. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: Line 1258
	   * Goal 28. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 29. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 30. [METHOD] ArrayListDemo.ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;
	   * Goal 31. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 32. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 33. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;
	   * Goal 34. Weak Mutation 2337: ArrayListDemo$ArrayListSpliterator.getFence()I:1243 - ReplaceComparisonOperator >= -> >
	   * Goal 35. Weak Mutation 2389: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceArithmeticOperator + -> %
	   * Goal 36. Weak Mutation 2392: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceArithmeticOperator + -> /
	   * Goal 37. Weak Mutation 2393: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceConstant - 1 -> 0
	   * Goal 38. Weak Mutation 2394: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceBitwiseOperator >>> I -> << I
	   * Goal 39. Weak Mutation 2395: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceBitwiseOperator >>> I -> >> I
	   * Goal 40. Weak Mutation 2423: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1256 - ReplaceComparisonOperator < -> -2
	   */

	  @Test(timeout = 4000)
	  public void test50()  throws Throwable  {
	      ArrayListDemo<Object> arrayListDemo0 = new ArrayListDemo<Object>(0);
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Object>(arrayListDemo0, (-1), 0, 0);
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator1 = arrayListDemo_ArrayListSpliterator0.trySplit();
	      assertEquals(16464, arrayListDemo_ArrayListSpliterator1.characteristics());
	  }

	  //Test case number: 51
	  /*
	   * 31 covered goals:
	   * Goal 1. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - false
	   * Goal 3. ArrayListDemo$ArrayListSpliterator.getFence()I: I15 Branch 99 IFNONNULL L1244 - false
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: I20 Branch 100 IF_ICMPLT L1256 - false
	   * Goal 5. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 6. Branch ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - false in context: 
	   * Goal 7. Branch ArrayListDemo$ArrayListSpliterator.getFence()I: I15 Branch 99 IFNONNULL L1244 - false in context: 
	   * Goal 8. Branch ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: I20 Branch 100 IF_ICMPLT L1256 - false in context: 
	   * Goal 9. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 10. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 11. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 12. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 13. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 14. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 15. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1243
	   * Goal 16. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1244
	   * Goal 17. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1245
	   * Goal 18. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1251
	   * Goal 19. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: Line 1255
	   * Goal 20. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: Line 1256
	   * Goal 21. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 22. [METHOD] ArrayListDemo.ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;
	   * Goal 23. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 24. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;
	   * Goal 25. Weak Mutation 2335: ArrayListDemo$ArrayListSpliterator.getFence()I:1243 - ReplaceComparisonOperator >= -> -1
	   * Goal 26. Weak Mutation 2338: ArrayListDemo$ArrayListSpliterator.getFence()I:1244 - ReplaceComparisonOperator != null -> = null
	   * Goal 27. Weak Mutation 2339: ArrayListDemo$ArrayListSpliterator.getFence()I:1245 - ReplaceConstant - 0 -> 1
	   * Goal 28. Weak Mutation 2389: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceArithmeticOperator + -> %
	   * Goal 29. Weak Mutation 2392: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceArithmeticOperator + -> /
	   * Goal 30. Weak Mutation 2393: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceConstant - 1 -> 0
	   * Goal 31. Weak Mutation 2424: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1256 - ReplaceComparisonOperator < -> <=
	   */

	  @Test(timeout = 4000)
	  public void test51()  throws Throwable  {
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Object>((ArrayListDemo<Object>) null, 0, (-1), 0);
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator1 = arrayListDemo_ArrayListSpliterator0.trySplit();
	      assertNull(arrayListDemo_ArrayListSpliterator1);
	  }

	  //Test case number: 52
	  /*
	   * 42 covered goals:
	   * Goal 1. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 3. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 4. ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - false
	   * Goal 5. ArrayListDemo$ArrayListSpliterator.getFence()I: I15 Branch 99 IFNONNULL L1244 - true
	   * Goal 6. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: I20 Branch 100 IF_ICMPLT L1256 - false
	   * Goal 7. Branch ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 9. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 10. Branch ArrayListDemo$ArrayListSpliterator.getFence()I: I7 Branch 98 IFGE L1243 - false in context: 
	   * Goal 11. Branch ArrayListDemo$ArrayListSpliterator.getFence()I: I15 Branch 99 IFNONNULL L1244 - true in context: 
	   * Goal 12. Branch ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: I20 Branch 100 IF_ICMPLT L1256 - false in context: 
	   * Goal 13. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 14. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 15. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 16. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 17. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 18. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1232
	   * Goal 19. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1234
	   * Goal 20. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1235
	   * Goal 21. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1236
	   * Goal 22. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1237
	   * Goal 23. ArrayListDemo$ArrayListSpliterator.<init>(LArrayListDemo;III)V: Line 1238
	   * Goal 24. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1243
	   * Goal 25. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1244
	   * Goal 26. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1247
	   * Goal 27. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1248
	   * Goal 28. ArrayListDemo$ArrayListSpliterator.getFence()I: Line 1251
	   * Goal 29. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: Line 1255
	   * Goal 30. ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;: Line 1256
	   * Goal 31. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 32. [METHOD] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 33. [METHOD] ArrayListDemo.ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;
	   * Goal 34. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 35. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.<init>(LArrayListDemo;III)V
	   * Goal 36. [METHODNOEX] ArrayListDemo.ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;
	   * Goal 37. Weak Mutation 2335: ArrayListDemo$ArrayListSpliterator.getFence()I:1243 - ReplaceComparisonOperator >= -> -1
	   * Goal 38. Weak Mutation 2338: ArrayListDemo$ArrayListSpliterator.getFence()I:1244 - ReplaceComparisonOperator != null -> = null
	   * Goal 39. Weak Mutation 2389: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceArithmeticOperator + -> %
	   * Goal 40. Weak Mutation 2392: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceArithmeticOperator + -> /
	   * Goal 41. Weak Mutation 2393: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1255 - ReplaceConstant - 1 -> 0
	   * Goal 42. Weak Mutation 2424: ArrayListDemo$ArrayListSpliterator.trySplit()LArrayListDemo$ArrayListSpliterator;:1256 - ReplaceComparisonOperator < -> <=
	   */

	  @Test(timeout = 4000)
	  public void test52()  throws Throwable  {
	      ArrayListDemo<Object> arrayListDemo0 = new ArrayListDemo<Object>(0);
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator0 = new ArrayListDemo.ArrayListSpliterator<Object>(arrayListDemo0, 0, (-1), 0);
	      ArrayListDemo.ArrayListSpliterator<Object> arrayListDemo_ArrayListSpliterator1 = arrayListDemo_ArrayListSpliterator0.trySplit();
	      assertNull(arrayListDemo_ArrayListSpliterator1);
	  }

	  //Test case number: 53
	  /*
	   * 106 covered goals:
	   * Goal 1. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 4. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false
	   * Goal 5. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 6. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 7. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 8. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: I40 Branch 62 IF_ICMPNE L1165 - false
	   * Goal 9. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: I43 Branch 63 IF_ICMPLT L1165 - true
	   * Goal 10. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: I43 Branch 63 IF_ICMPLT L1165 - false
	   * Goal 11. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: I49 Branch 64 IF_ICMPEQ L1168 - true
	   * Goal 12. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 13. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 14. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 15. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false in context: 
	   * Goal 16. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 17. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 18. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 19. Branch ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: I43 Branch 63 IF_ICMPLT L1165 - true in context: ArrayListDemo:forEach(Ljava/util/function/Consumer;)V
	   * Goal 20. Branch ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: I40 Branch 62 IF_ICMPNE L1165 - false in context: ArrayListDemo:forEach(Ljava/util/function/Consumer;)V
	   * Goal 21. Branch ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: I43 Branch 63 IF_ICMPLT L1165 - false in context: ArrayListDemo:forEach(Ljava/util/function/Consumer;)V
	   * Goal 22. Branch ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: I49 Branch 64 IF_ICMPEQ L1168 - true in context: ArrayListDemo:forEach(Ljava/util/function/Consumer;)V
	   * Goal 23. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 24. ArrayListDemo.<init>()V: Line 67
	   * Goal 25. ArrayListDemo.<init>()V: Line 68
	   * Goal 26. ArrayListDemo.<init>()V: Line 69
	   * Goal 27. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 28. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 29. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 30. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 31. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 129
	   * Goal 32. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 33. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 34. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 35. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 36. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 37. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 38. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: Line 1160
	   * Goal 39. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: Line 1161
	   * Goal 40. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: Line 1163
	   * Goal 41. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: Line 1164
	   * Goal 42. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: Line 1165
	   * Goal 43. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: Line 1166
	   * Goal 44. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: Line 1168
	   * Goal 45. ArrayListDemo.forEach(Ljava/util/function/Consumer;)V: Line 1171
	   * Goal 46. ArrayListDemo.grow(I)V: Line 162
	   * Goal 47. ArrayListDemo.grow(I)V: Line 163
	   * Goal 48. ArrayListDemo.grow(I)V: Line 164
	   * Goal 49. ArrayListDemo.grow(I)V: Line 165
	   * Goal 50. ArrayListDemo.grow(I)V: Line 166
	   * Goal 51. ArrayListDemo.grow(I)V: Line 169
	   * Goal 52. ArrayListDemo.grow(I)V: Line 170
	   * Goal 53. [METHOD] ArrayListDemo.<init>()V
	   * Goal 54. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 55. [METHOD] ArrayListDemo.forEach(Ljava/util/function/Consumer;)V
	   * Goal 56. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 57. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 58. [METHODNOEX] ArrayListDemo.forEach(Ljava/util/function/Consumer;)V
	   * Goal 59. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 60. Weak Mutation 54: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 0
	   * Goal 61. Weak Mutation 55: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 1
	   * Goal 62. Weak Mutation 56: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> -1
	   * Goal 63. Weak Mutation 57: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 9
	   * Goal 64. Weak Mutation 58: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 11
	   * Goal 65. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 66. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 67. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 68. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 69. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 70. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 71. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 72. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 73. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 74. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 75. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 76. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 77. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 78. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 79. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 80. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 81. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 82. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 83. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 84. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 85. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 86. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 87. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 88. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 89. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 90. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 91. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 92. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 93. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 94. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 95. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 96. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 97. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 98. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 99. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 100. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 101. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   * Goal 102. Weak Mutation 1292: ArrayListDemo.forEach(Ljava/util/function/Consumer;)V:1165 - ReplaceConstant - 0 -> 1
	   * Goal 103. Weak Mutation 1311: ArrayListDemo.forEach(Ljava/util/function/Consumer;)V:1165 - ReplaceComparisonOperator != -> -1
	   * Goal 104. Weak Mutation 1327: ArrayListDemo.forEach(Ljava/util/function/Consumer;)V:1165 - ReplaceComparisonOperator < -> -2
	   * Goal 105. Weak Mutation 1328: ArrayListDemo.forEach(Ljava/util/function/Consumer;)V:1165 - ReplaceComparisonOperator < -> <=
	   * Goal 106. Weak Mutation 1337: ArrayListDemo.forEach(Ljava/util/function/Consumer;)V:1168 - ReplaceComparisonOperator == -> -2
	   */

	  @Test(timeout = 4000)
	  public void test53()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      Integer integer0 = new Integer(0);
	      arrayListDemo0.add(integer0);
	      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
	      arrayListDemo0.forEach(consumer0);
	      assertEquals(1, arrayListDemo0.size());
	  }

	  //Test case number: 54
	  /*
	   * 19 covered goals:
	   * Goal 1. ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true
	   * Goal 2. ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - true
	   * Goal 3. ArrayListDemo.subListRangeCheck(III)V: I39 Branch 61 IF_ICMPLE L917 - false
	   * Goal 4. Branch ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true in context: 
	   * Goal 5. Branch ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - true in context: 
	   * Goal 6. Branch ArrayListDemo.subListRangeCheck(III)V: I39 Branch 61 IF_ICMPLE L917 - false in context: 
	   * Goal 7. subListRangeCheck(III)V_java.lang.IllegalArgumentException_EXPLICIT
	   * Goal 8. ArrayListDemo.subListRangeCheck(III)V: Line 913
	   * Goal 9. ArrayListDemo.subListRangeCheck(III)V: Line 915
	   * Goal 10. ArrayListDemo.subListRangeCheck(III)V: Line 917
	   * Goal 11. ArrayListDemo.subListRangeCheck(III)V: Line 918
	   * Goal 12. ArrayListDemo.subListRangeCheck(III)V: Line 919
	   * Goal 13. [METHOD] ArrayListDemo.subListRangeCheck(III)V
	   * Goal 14. Weak Mutation 1233: ArrayListDemo.subListRangeCheck(III)V:913 - ReplaceComparisonOperator >= -> >
	   * Goal 15. Weak Mutation 1252: ArrayListDemo.subListRangeCheck(III)V:915 - ReplaceComparisonOperator <= -> ==
	   * Goal 16. Weak Mutation 1269: ArrayListDemo.subListRangeCheck(III)V:917 - ReplaceComparisonOperator <= -> -1
	   * Goal 17. Weak Mutation 1272: ArrayListDemo.subListRangeCheck(III)V:918 - ReplaceConstant - fromIndex( -> 
	   * Goal 18. Weak Mutation 1278: ArrayListDemo.subListRangeCheck(III)V:919 - ReplaceConstant - ) > toIndex( -> 
	   * Goal 19. Weak Mutation 1284: ArrayListDemo.subListRangeCheck(III)V:919 - ReplaceConstant - ) -> 
	   */

	  @Test(timeout = 4000)
	  public void test54()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        ArrayListDemo.subListRangeCheck(0, (-1), 0);
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // fromIndex(0) > toIndex(-1)
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 55
	  /*
	   * 22 covered goals:
	   * Goal 1. ArrayListDemo.subList(II)Ljava/util/List;: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true
	   * Goal 4. ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - false
	   * Goal 5. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 6. Branch ArrayListDemo.subList(II)Ljava/util/List;: root-Branch in context: ArrayListDemo:subList(II)Ljava/util/List;
	   * Goal 7. Branch ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true in context: 
	   * Goal 8. Branch ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - false in context: 
	   * Goal 9. subList(II)Ljava/util/List;_java.lang.IndexOutOfBoundsException_EXPLICIT
	   * Goal 10. ArrayListDemo.<init>()V: Line 67
	   * Goal 11. ArrayListDemo.<init>()V: Line 68
	   * Goal 12. ArrayListDemo.<init>()V: Line 69
	   * Goal 13. ArrayListDemo.subList(II)Ljava/util/List;: Line 908
	   * Goal 14. ArrayListDemo.subListRangeCheck(III)V: Line 913
	   * Goal 15. ArrayListDemo.subListRangeCheck(III)V: Line 915
	   * Goal 16. ArrayListDemo.subListRangeCheck(III)V: Line 916
	   * Goal 17. [METHOD] ArrayListDemo.<init>()V
	   * Goal 18. [METHOD] ArrayListDemo.subList(II)Ljava/util/List;
	   * Goal 19. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 20. Weak Mutation 1233: ArrayListDemo.subListRangeCheck(III)V:913 - ReplaceComparisonOperator >= -> >
	   * Goal 21. Weak Mutation 1250: ArrayListDemo.subListRangeCheck(III)V:915 - ReplaceComparisonOperator <= -> -1
	   * Goal 22. Weak Mutation 1253: ArrayListDemo.subListRangeCheck(III)V:916 - ReplaceConstant - toIndex =  -> 
	   */

	  @Test(timeout = 4000)
	  public void test55()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.subList(0, 1);
	        fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // toIndex = 1
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 56
	  /*
	   * 18 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I3 Branch 57 IFLT L719 - false
	   * Goal 3. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I7 Branch 58 IF_ICMPLE L719 - false
	   * Goal 4. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 5. Branch ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I3 Branch 57 IFLT L719 - false in context: ArrayListDemo:listIterator(I)Ljava/util/ListIterator;
	   * Goal 6. Branch ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I7 Branch 58 IF_ICMPLE L719 - false in context: ArrayListDemo:listIterator(I)Ljava/util/ListIterator;
	   * Goal 7. listIterator(I)Ljava/util/ListIterator;_java.lang.IndexOutOfBoundsException_EXPLICIT
	   * Goal 8. ArrayListDemo.<init>()V: Line 67
	   * Goal 9. ArrayListDemo.<init>()V: Line 68
	   * Goal 10. ArrayListDemo.<init>()V: Line 69
	   * Goal 11. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: Line 719
	   * Goal 12. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: Line 720
	   * Goal 13. [METHOD] ArrayListDemo.<init>()V
	   * Goal 14. [METHOD] ArrayListDemo.listIterator(I)Ljava/util/ListIterator;
	   * Goal 15. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 16. Weak Mutation 1180: ArrayListDemo.listIterator(I)Ljava/util/ListIterator;:719 - ReplaceComparisonOperator < -> !=
	   * Goal 17. Weak Mutation 1190: ArrayListDemo.listIterator(I)Ljava/util/ListIterator;:719 - ReplaceComparisonOperator <= -> -1
	   * Goal 18. Weak Mutation 1193: ArrayListDemo.listIterator(I)Ljava/util/ListIterator;:720 - ReplaceConstant - Index:  -> 
	   */

	  @Test(timeout = 4000)
	  public void test56()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>();
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.listIterator(1);
	        fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // Index: 1
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 57
	  /*
	   * 35 covered goals:
	   * Goal 1. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: root-Branch
	   * Goal 2. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: root-Branch
	   * Goal 3. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 4. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 5. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I3 Branch 57 IFLT L719 - false
	   * Goal 6. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I7 Branch 58 IF_ICMPLE L719 - true
	   * Goal 7. Branch ArrayListDemo$Itr.<init>(LArrayListDemo;)V: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: root-Branch in context: 
	   * Goal 9. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 10. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 11. Branch ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I3 Branch 57 IFLT L719 - false in context: ArrayListDemo:listIterator(I)Ljava/util/ListIterator;
	   * Goal 12. Branch ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I7 Branch 58 IF_ICMPLE L719 - true in context: ArrayListDemo:listIterator(I)Ljava/util/ListIterator;
	   * Goal 13. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 14. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 15. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 16. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 17. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 18. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: Line 719
	   * Goal 19. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: Line 721
	   * Goal 20. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 752
	   * Goal 21. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 753
	   * Goal 22. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 755
	   * Goal 23. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: Line 821
	   * Goal 24. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: Line 822
	   * Goal 25. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: Line 823
	   * Goal 26. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: Line 824
	   * Goal 27. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 28. [METHOD] ArrayListDemo.listIterator(I)Ljava/util/ListIterator;
	   * Goal 29. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 30. [METHODNOEX] ArrayListDemo.listIterator(I)Ljava/util/ListIterator;
	   * Goal 31. Weak Mutation 1181: ArrayListDemo.listIterator(I)Ljava/util/ListIterator;:719 - ReplaceComparisonOperator < -> <=
	   * Goal 32. Weak Mutation 1191: ArrayListDemo.listIterator(I)Ljava/util/ListIterator;:719 - ReplaceComparisonOperator <= -> <
	   * Goal 33. Weak Mutation 1675: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> 0
	   * Goal 34. Weak Mutation 1676: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> 1
	   * Goal 35. Weak Mutation 1677: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> -2
	   */

	  @Test(timeout = 4000)
	  public void test57()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(0);
	      ListIterator<String> listIterator0 = arrayListDemo0.listIterator(0);
	      assertFalse(listIterator0.hasNext());
	  }

	  //Test case number: 58
	  /*
	   * 15 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I3 Branch 57 IFLT L719 - true
	   * Goal 3. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 4. Branch ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: I3 Branch 57 IFLT L719 - true in context: ArrayListDemo:listIterator(I)Ljava/util/ListIterator;
	   * Goal 5. listIterator(I)Ljava/util/ListIterator;_java.lang.IndexOutOfBoundsException_EXPLICIT
	   * Goal 6. ArrayListDemo.<init>()V: Line 67
	   * Goal 7. ArrayListDemo.<init>()V: Line 68
	   * Goal 8. ArrayListDemo.<init>()V: Line 69
	   * Goal 9. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: Line 719
	   * Goal 10. ArrayListDemo.listIterator(I)Ljava/util/ListIterator;: Line 720
	   * Goal 11. [METHOD] ArrayListDemo.<init>()V
	   * Goal 12. [METHOD] ArrayListDemo.listIterator(I)Ljava/util/ListIterator;
	   * Goal 13. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 14. Weak Mutation 1179: ArrayListDemo.listIterator(I)Ljava/util/ListIterator;:719 - ReplaceComparisonOperator < -> -2
	   * Goal 15. Weak Mutation 1193: ArrayListDemo.listIterator(I)Ljava/util/ListIterator;:720 - ReplaceConstant - Index:  -> 
	   */

	  @Test(timeout = 4000)
	  public void test58()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.listIterator((-1));
	        fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // Index: -1
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 59
	  /*
	   * 146 covered goals:
	   * Goal 1. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 2. ArrayListDemo.size()I: root-Branch
	   * Goal 3. ArrayListDemo.retainAll(Ljava/util/Collection;)Z: root-Branch
	   * Goal 4. ArrayListDemo.<init>()V: root-Branch
	   * Goal 5. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 6. ArrayListDemo.iterator()Ljava/util/Iterator;: root-Branch
	   * Goal 7. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: root-Branch
	   * Goal 8. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false
	   * Goal 9. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 10. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 11. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 12. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I50 Branch 46 IF_ICMPLT L627 - true
	   * Goal 13. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I50 Branch 46 IF_ICMPLT L627 - false
	   * Goal 14. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I26 Branch 44 IFLE L628 - true
	   * Goal 15. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I33 Branch 45 IF_ICMPNE L628 - true
	   * Goal 16. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I143 Branch 50 IF_ICMPEQ L633 - true
	   * Goal 17. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I175 Branch 51 IF_ICMPEQ L639 - false
	   * Goal 18. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I195 Branch 52 IF_ICMPLT L641 - true
	   * Goal 19. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I195 Branch 52 IF_ICMPLT L641 - false
	   * Goal 20. ArrayListDemo$Itr.hasNext()Z: I7 Branch 83 IF_ICMPEQ L758 - true
	   * Goal 21. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 22. Branch ArrayListDemo$Itr.<init>(LArrayListDemo;)V: root-Branch in context: 
	   * Goal 23. Branch ArrayListDemo.retainAll(Ljava/util/Collection;)Z: root-Branch in context: ArrayListDemo:retainAll(Ljava/util/Collection;)Z
	   * Goal 24. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 25. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 26. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false in context: 
	   * Goal 27. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 28. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 29. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 30. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I50 Branch 46 IF_ICMPLT L627 - true in context: 
	   * Goal 31. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I50 Branch 46 IF_ICMPLT L627 - false in context: 
	   * Goal 32. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I26 Branch 44 IFLE L628 - true in context: 
	   * Goal 33. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I33 Branch 45 IF_ICMPNE L628 - true in context: 
	   * Goal 34. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I143 Branch 50 IF_ICMPEQ L633 - true in context: 
	   * Goal 35. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I175 Branch 51 IF_ICMPEQ L639 - false in context: 
	   * Goal 36. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I195 Branch 52 IF_ICMPLT L641 - true in context: 
	   * Goal 37. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I195 Branch 52 IF_ICMPLT L641 - false in context: 
	   * Goal 38. Branch ArrayListDemo$Itr.hasNext()Z: I7 Branch 83 IF_ICMPEQ L758 - true in context: 
	   * Goal 39. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 40. [Output]: ArrayListDemo.retainAll(Ljava/util/Collection;)Z:True
	   * Goal 41. ArrayListDemo.<init>()V: Line 67
	   * Goal 42. ArrayListDemo.<init>()V: Line 68
	   * Goal 43. ArrayListDemo.<init>()V: Line 69
	   * Goal 44. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 45. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 46. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 47. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 623
	   * Goal 48. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 624
	   * Goal 49. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 625
	   * Goal 50. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 627
	   * Goal 51. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 628
	   * Goal 52. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 630
	   * Goal 53. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 633
	   * Goal 54. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 639
	   * Goal 55. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 641
	   * Goal 56. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 642
	   * Goal 57. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 643
	   * Goal 58. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 644
	   * Goal 59. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 645
	   * Goal 60. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 648
	   * Goal 61. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 62. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 129
	   * Goal 63. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 64. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 65. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 66. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 67. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 68. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 69. ArrayListDemo.grow(I)V: Line 162
	   * Goal 70. ArrayListDemo.grow(I)V: Line 163
	   * Goal 71. ArrayListDemo.grow(I)V: Line 164
	   * Goal 72. ArrayListDemo.grow(I)V: Line 165
	   * Goal 73. ArrayListDemo.grow(I)V: Line 166
	   * Goal 74. ArrayListDemo.grow(I)V: Line 169
	   * Goal 75. ArrayListDemo.grow(I)V: Line 170
	   * Goal 76. ArrayListDemo.iterator()Ljava/util/Iterator;: Line 744
	   * Goal 77. ArrayListDemo.retainAll(Ljava/util/Collection;)Z: Line 618
	   * Goal 78. ArrayListDemo.retainAll(Ljava/util/Collection;)Z: Line 619
	   * Goal 79. ArrayListDemo.size()I: Line 186
	   * Goal 80. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 752
	   * Goal 81. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 753
	   * Goal 82. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 755
	   * Goal 83. ArrayListDemo$Itr.hasNext()Z: Line 758
	   * Goal 84. [METHOD] ArrayListDemo.<init>()V
	   * Goal 85. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 86. [METHOD] ArrayListDemo.retainAll(Ljava/util/Collection;)Z
	   * Goal 87. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 88. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 89. [METHODNOEX] ArrayListDemo.retainAll(Ljava/util/Collection;)Z
	   * Goal 90. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 91. Weak Mutation 54: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 0
	   * Goal 92. Weak Mutation 55: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 1
	   * Goal 93. Weak Mutation 56: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> -1
	   * Goal 94. Weak Mutation 57: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 9
	   * Goal 95. Weak Mutation 58: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 11
	   * Goal 96. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 97. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 98. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 99. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 100. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 101. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 102. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 103. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 104. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 105. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 106. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 107. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 108. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 109. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 110. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 111. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 112. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 113. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 114. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 115. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 116. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 117. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 118. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 119. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 120. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 121. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 122. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 123. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 124. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 125. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 126. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 127. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 128. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 129. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 130. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 131. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 132. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   * Goal 133. Weak Mutation 957: ArrayListDemo.retainAll(Ljava/util/Collection;)Z:619 - ReplaceConstant - 1 -> 0
	   * Goal 134. Weak Mutation 958: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:624 - ReplaceConstant - 0 -> 1
	   * Goal 135. Weak Mutation 959: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:624 - ReplaceConstant - 0 -> 1
	   * Goal 136. Weak Mutation 960: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:625 - ReplaceConstant - 0 -> 1
	   * Goal 137. Weak Mutation 999: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:627 - ReplaceComparisonOperator < -> -2
	   * Goal 138. Weak Mutation 1000: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:627 - ReplaceComparisonOperator < -> <=
	   * Goal 139. Weak Mutation 968: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:628 - ReplaceComparisonOperator <= -> ==
	   * Goal 140. Weak Mutation 971: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:628 - ReplaceConstant - 0 -> 1
	   * Goal 141. Weak Mutation 974: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:628 - ReplaceComparisonOperator != -> ==
	   * Goal 142. Weak Mutation 1675: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> 0
	   * Goal 143. Weak Mutation 1676: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> 1
	   * Goal 144. Weak Mutation 1677: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> -2
	   * Goal 145. Weak Mutation 1686: ArrayListDemo$Itr.hasNext()Z:758 - ReplaceComparisonOperator == -> -2
	   * Goal 146. Weak Mutation 1690: ArrayListDemo$Itr.hasNext()Z:758 - ReplaceConstant - 0 -> 1
	   */

	  @Test(timeout = 4000)
	  public void test59()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>();
	      ArrayListDemo<Integer> arrayListDemo1 = new ArrayListDemo<Integer>();
	      Integer integer0 = new Integer(0);
	      arrayListDemo1.add(integer0);
	      assertFalse(arrayListDemo1.isEmpty());
	      
	      boolean boolean0 = arrayListDemo1.retainAll(arrayListDemo0);
	      assertTrue(boolean0);
	  }

	  //Test case number: 60
	  /*
	   * 27 covered goals:
	   * Goal 1. ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: root-Branch
	   * Goal 2. ArrayListDemo.add(ILjava/lang/Object;)V: root-Branch
	   * Goal 3. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true
	   * Goal 4. ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - false
	   * Goal 5. ArrayListDemo.rangeCheckForAdd(I)V: I7 Branch 43 IFGE L568 - false
	   * Goal 6. Branch ArrayListDemo.add(ILjava/lang/Object;)V: root-Branch in context: ArrayListDemo:add(ILjava/lang/Object;)V
	   * Goal 7. Branch ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 9. Branch ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - false in context: 
	   * Goal 10. Branch ArrayListDemo.rangeCheckForAdd(I)V: I7 Branch 43 IFGE L568 - false in context: 
	   * Goal 11. add(ILjava/lang/Object;)V_java.lang.IndexOutOfBoundsException_EXPLICIT
	   * Goal 12. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 13. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 14. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 15. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 87
	   * Goal 16. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 17. ArrayListDemo.add(ILjava/lang/Object;)V: Line 381
	   * Goal 18. ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: Line 578
	   * Goal 19. ArrayListDemo.rangeCheckForAdd(I)V: Line 568
	   * Goal 20. ArrayListDemo.rangeCheckForAdd(I)V: Line 569
	   * Goal 21. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 22. [METHOD] ArrayListDemo.add(ILjava/lang/Object;)V
	   * Goal 23. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 24. Weak Mutation 932: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator > -> !=
	   * Goal 25. Weak Mutation 939: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator >= -> -1
	   * Goal 26. Weak Mutation 946: ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;:578 - ReplaceConstant - Index:  -> 
	   * Goal 27. Weak Mutation 951: ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;:578 - ReplaceConstant - , Size:  -> 
	   */

	  @Test(timeout = 4000)
	  public void test60()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(linkedList0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.add((-1), "");
	        fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // Index: -1, Size: 0
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 61
	  /*
	   * 32 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: root-Branch
	   * Goal 3. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 4. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 5. ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - true
	   * Goal 6. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 7. Branch ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 9. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 10. Branch ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - true in context: 
	   * Goal 11. addAll(ILjava/util/Collection;)Z_java.lang.IndexOutOfBoundsException_EXPLICIT
	   * Goal 12. ArrayListDemo.<init>()V: Line 67
	   * Goal 13. ArrayListDemo.<init>()V: Line 68
	   * Goal 14. ArrayListDemo.<init>()V: Line 69
	   * Goal 15. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 16. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 17. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 18. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 19. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 20. ArrayListDemo.addAll(ILjava/util/Collection;)Z: Line 509
	   * Goal 21. ArrayListDemo.addAll(ILjava/util/Collection;)Z: root-Branch
	   * Goal 22. ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: Line 578
	   * Goal 23. ArrayListDemo.rangeCheckForAdd(I)V: Line 568
	   * Goal 24. ArrayListDemo.rangeCheckForAdd(I)V: Line 569
	   * Goal 25. [METHOD] ArrayListDemo.<init>()V
	   * Goal 26. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 27. [METHOD] ArrayListDemo.addAll(ILjava/util/Collection;)Z
	   * Goal 28. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 29. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 30. Weak Mutation 933: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator > -> -2
	   * Goal 31. Weak Mutation 946: ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;:578 - ReplaceConstant - Index:  -> 
	   * Goal 32. Weak Mutation 951: ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;:578 - ReplaceConstant - , Size:  -> 
	   */

	  @Test(timeout = 4000)
	  public void test61()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>(0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo1.addAll(1, (Collection<?>) arrayListDemo0);
	        fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // Index: 1, Size: 0
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 62
	  /*
	   * 35 covered goals:
	   * Goal 1. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 2. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 3. ArrayListDemo.removeRange(II)V: I58 Branch 40 IF_ICMPLT L547 - false
	   * Goal 4. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 5. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 6. Branch ArrayListDemo.removeRange(II)V: I58 Branch 40 IF_ICMPLT L547 - false in context: 
	   * Goal 7. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 8. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 11. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 12. ArrayListDemo.removeRange(II)V: Line 540
	   * Goal 13. ArrayListDemo.removeRange(II)V: Line 541
	   * Goal 14. ArrayListDemo.removeRange(II)V: Line 542
	   * Goal 15. ArrayListDemo.removeRange(II)V: Line 543
	   * Goal 16. ArrayListDemo.removeRange(II)V: Line 546
	   * Goal 17. ArrayListDemo.removeRange(II)V: Line 547
	   * Goal 18. ArrayListDemo.removeRange(II)V: Line 550
	   * Goal 19. ArrayListDemo.removeRange(II)V: Line 551
	   * Goal 20. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 21. [METHOD] ArrayListDemo.removeRange(II)V
	   * Goal 22. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 23. [METHODNOEX] ArrayListDemo.removeRange(II)V
	   * Goal 24. Weak Mutation 808: ArrayListDemo.removeRange(II)V:540 - ReplaceConstant - 1 -> 0
	   * Goal 25. Weak Mutation 809: ArrayListDemo.removeRange(II)V:540 - ReplaceArithmeticOperator + -> %
	   * Goal 26. Weak Mutation 810: ArrayListDemo.removeRange(II)V:540 - ReplaceArithmeticOperator + -> -
	   * Goal 27. Weak Mutation 811: ArrayListDemo.removeRange(II)V:540 - ReplaceArithmeticOperator + -> *
	   * Goal 28. Weak Mutation 812: ArrayListDemo.removeRange(II)V:540 - ReplaceArithmeticOperator + -> /
	   * Goal 29. Weak Mutation 823: ArrayListDemo.removeRange(II)V:541 - ReplaceArithmeticOperator - -> %
	   * Goal 30. Weak Mutation 825: ArrayListDemo.removeRange(II)V:541 - ReplaceArithmeticOperator - -> /
	   * Goal 31. Weak Mutation 861: ArrayListDemo.removeRange(II)V:546 - ReplaceArithmeticOperator - -> %
	   * Goal 32. Weak Mutation 863: ArrayListDemo.removeRange(II)V:546 - ReplaceArithmeticOperator - -> /
	   * Goal 33. Weak Mutation 865: ArrayListDemo.removeRange(II)V:546 - ReplaceArithmeticOperator - -> %
	   * Goal 34. Weak Mutation 867: ArrayListDemo.removeRange(II)V:546 - ReplaceArithmeticOperator - -> /
	   * Goal 35. Weak Mutation 901: ArrayListDemo.removeRange(II)V:547 - ReplaceComparisonOperator < -> <=
	   */

	  @Test(timeout = 4000)
	  public void test62()  throws Throwable  {
	      ArrayListDemo<ArrayListDemo<String>> arrayListDemo0 = new ArrayListDemo<ArrayListDemo<String>>(0);
	      arrayListDemo0.removeRange(0, 0);
	      assertTrue(arrayListDemo0.isEmpty());
	  }

	  //Test case number: 63
	  /*
	   * 100 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 3. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 4. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false
	   * Goal 5. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 6. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 7. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 8. ArrayListDemo.addAll(ILjava/util/Collection;)Z: I33 Branch 38 IFLE L516 - true
	   * Goal 9. ArrayListDemo.addAll(ILjava/util/Collection;)Z: I70 Branch 39 IFEQ L522 - true
	   * Goal 10. ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - false
	   * Goal 11. ArrayListDemo.rangeCheckForAdd(I)V: I7 Branch 43 IFGE L568 - true
	   * Goal 12. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 13. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 14. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false in context: 
	   * Goal 15. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 16. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 17. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 18. Branch ArrayListDemo.addAll(ILjava/util/Collection;)Z: I33 Branch 38 IFLE L516 - true in context: ArrayListDemo:addAll(ILjava/util/Collection;)Z
	   * Goal 19. Branch ArrayListDemo.addAll(ILjava/util/Collection;)Z: I70 Branch 39 IFEQ L522 - true in context: ArrayListDemo:addAll(ILjava/util/Collection;)Z
	   * Goal 20. Branch ArrayListDemo.rangeCheckForAdd(I)V: I7 Branch 43 IFGE L568 - true in context: 
	   * Goal 21. Branch ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - false in context: 
	   * Goal 22. [Output]: ArrayListDemo.addAll(ILjava/util/Collection;)Z:False
	   * Goal 23. ArrayListDemo.<init>()V: Line 67
	   * Goal 24. ArrayListDemo.<init>()V: Line 68
	   * Goal 25. ArrayListDemo.<init>()V: Line 69
	   * Goal 26. ArrayListDemo.addAll(ILjava/util/Collection;)Z: Line 509
	   * Goal 27. ArrayListDemo.addAll(ILjava/util/Collection;)Z: Line 511
	   * Goal 28. ArrayListDemo.addAll(ILjava/util/Collection;)Z: Line 512
	   * Goal 29. ArrayListDemo.addAll(ILjava/util/Collection;)Z: Line 513
	   * Goal 30. ArrayListDemo.addAll(ILjava/util/Collection;)Z: Line 515
	   * Goal 31. ArrayListDemo.addAll(ILjava/util/Collection;)Z: Line 516
	   * Goal 32. ArrayListDemo.addAll(ILjava/util/Collection;)Z: Line 520
	   * Goal 33. ArrayListDemo.addAll(ILjava/util/Collection;)Z: Line 521
	   * Goal 34. ArrayListDemo.addAll(ILjava/util/Collection;)Z: Line 522
	   * Goal 35. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 36. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 129
	   * Goal 37. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 38. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 39. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 40. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 41. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 42. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 43. ArrayListDemo.grow(I)V: Line 162
	   * Goal 44. ArrayListDemo.grow(I)V: Line 163
	   * Goal 45. ArrayListDemo.grow(I)V: Line 164
	   * Goal 46. ArrayListDemo.grow(I)V: Line 165
	   * Goal 47. ArrayListDemo.grow(I)V: Line 166
	   * Goal 48. ArrayListDemo.grow(I)V: Line 169
	   * Goal 49. ArrayListDemo.grow(I)V: Line 170
	   * Goal 50. ArrayListDemo.rangeCheckForAdd(I)V: Line 568
	   * Goal 51. ArrayListDemo.rangeCheckForAdd(I)V: Line 570
	   * Goal 52. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 53. [METHOD] ArrayListDemo.<init>()V
	   * Goal 54. [METHOD] ArrayListDemo.addAll(ILjava/util/Collection;)Z
	   * Goal 55. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 56. [METHODNOEX] ArrayListDemo.addAll(ILjava/util/Collection;)Z
	   * Goal 57. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 58. Weak Mutation 54: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 0
	   * Goal 59. Weak Mutation 55: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 1
	   * Goal 60. Weak Mutation 56: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> -1
	   * Goal 61. Weak Mutation 57: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 9
	   * Goal 62. Weak Mutation 58: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 11
	   * Goal 63. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 64. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 65. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 66. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 67. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 68. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 69. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 70. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 71. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 72. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 73. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 74. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 75. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 76. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 77. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 78. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 79. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 80. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 81. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 82. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 83. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 84. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 85. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 86. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 87. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 88. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 89. Weak Mutation 712: ArrayListDemo.addAll(ILjava/util/Collection;)Z:513 - ReplaceArithmeticOperator + -> %
	   * Goal 90. Weak Mutation 715: ArrayListDemo.addAll(ILjava/util/Collection;)Z:513 - ReplaceArithmeticOperator + -> /
	   * Goal 91. Weak Mutation 726: ArrayListDemo.addAll(ILjava/util/Collection;)Z:515 - ReplaceArithmeticOperator - -> %
	   * Goal 92. Weak Mutation 728: ArrayListDemo.addAll(ILjava/util/Collection;)Z:515 - ReplaceArithmeticOperator - -> /
	   * Goal 93. Weak Mutation 737: ArrayListDemo.addAll(ILjava/util/Collection;)Z:516 - ReplaceComparisonOperator <= -> <
	   * Goal 94. Weak Mutation 767: ArrayListDemo.addAll(ILjava/util/Collection;)Z:520 - ReplaceConstant - 0 -> 1
	   * Goal 95. Weak Mutation 790: ArrayListDemo.addAll(ILjava/util/Collection;)Z:521 - ReplaceArithmeticOperator + -> %
	   * Goal 96. Weak Mutation 793: ArrayListDemo.addAll(ILjava/util/Collection;)Z:521 - ReplaceArithmeticOperator + -> /
	   * Goal 97. Weak Mutation 800: ArrayListDemo.addAll(ILjava/util/Collection;)Z:522 - ReplaceComparisonOperator == -> -2
	   * Goal 98. Weak Mutation 804: ArrayListDemo.addAll(ILjava/util/Collection;)Z:522 - ReplaceConstant - 0 -> 1
	   * Goal 99. Weak Mutation 934: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator > -> >=
	   * Goal 100. Weak Mutation 941: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator >= -> >
	   */

	  @Test(timeout = 4000)
	  public void test63()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>();
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>();
	      boolean boolean0 = arrayListDemo1.addAll(0, (Collection<?>) arrayListDemo0);
	      assertFalse(boolean0);
	      assertEquals(0, arrayListDemo1.size());
	  }

	  //Test case number: 64
	  /*
	   * 113 covered goals:
	   * Goal 1. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 4. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 5. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true
	   * Goal 6. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false
	   * Goal 7. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - true
	   * Goal 8. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 9. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 10. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 11. ArrayListDemo.addAll(Ljava/util/Collection;)Z: I39 Branch 37 IFEQ L490 - false
	   * Goal 12. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 13. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 14. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 15. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true in context: 
	   * Goal 16. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 17. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 18. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 19. Branch ArrayListDemo.addAll(Ljava/util/Collection;)Z: I39 Branch 37 IFEQ L490 - false in context: ArrayListDemo:addAll(Ljava/util/Collection;)Z
	   * Goal 20. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 21. [Output]: ArrayListDemo.addAll(Ljava/util/Collection;)Z:True
	   * Goal 22. ArrayListDemo.<init>()V: Line 67
	   * Goal 23. ArrayListDemo.<init>()V: Line 68
	   * Goal 24. ArrayListDemo.<init>()V: Line 69
	   * Goal 25. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 26. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 27. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 28. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 485
	   * Goal 29. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 486
	   * Goal 30. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 487
	   * Goal 31. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 488
	   * Goal 32. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 489
	   * Goal 33. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 490
	   * Goal 34. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 35. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 129
	   * Goal 36. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 131
	   * Goal 37. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 38. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 39. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 40. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 41. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 42. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 43. ArrayListDemo.grow(I)V: Line 162
	   * Goal 44. ArrayListDemo.grow(I)V: Line 163
	   * Goal 45. ArrayListDemo.grow(I)V: Line 164
	   * Goal 46. ArrayListDemo.grow(I)V: Line 165
	   * Goal 47. ArrayListDemo.grow(I)V: Line 166
	   * Goal 48. ArrayListDemo.grow(I)V: Line 169
	   * Goal 49. ArrayListDemo.grow(I)V: Line 170
	   * Goal 50. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 51. [METHOD] ArrayListDemo.<init>()V
	   * Goal 52. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 53. [METHOD] ArrayListDemo.addAll(Ljava/util/Collection;)Z
	   * Goal 54. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 55. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 56. [METHODNOEX] ArrayListDemo.addAll(Ljava/util/Collection;)Z
	   * Goal 57. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 58. Weak Mutation 54: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 0
	   * Goal 59. Weak Mutation 55: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 1
	   * Goal 60. Weak Mutation 56: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> -1
	   * Goal 61. Weak Mutation 57: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 9
	   * Goal 62. Weak Mutation 58: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 11
	   * Goal 63. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 64. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 65. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 66. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 67. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 68. Weak Mutation 81: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> +
	   * Goal 69. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 70. Weak Mutation 83: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> *
	   * Goal 71. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 72. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 73. Weak Mutation 86: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> ==
	   * Goal 74. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 75. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 76. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 77. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 78. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 79. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 80. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 81. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 82. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 83. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 84. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 85. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 86. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 87. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 88. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 89. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 90. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 91. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 92. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 93. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 94. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 95. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 96. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 97. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 98. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 99. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 100. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 101. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 102. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   * Goal 103. Weak Mutation 663: ArrayListDemo.addAll(Ljava/util/Collection;)Z:487 - ReplaceArithmeticOperator + -> %
	   * Goal 104. Weak Mutation 664: ArrayListDemo.addAll(Ljava/util/Collection;)Z:487 - ReplaceArithmeticOperator + -> -
	   * Goal 105. Weak Mutation 665: ArrayListDemo.addAll(Ljava/util/Collection;)Z:487 - ReplaceArithmeticOperator + -> *
	   * Goal 106. Weak Mutation 666: ArrayListDemo.addAll(Ljava/util/Collection;)Z:487 - ReplaceArithmeticOperator + -> /
	   * Goal 107. Weak Mutation 668: ArrayListDemo.addAll(Ljava/util/Collection;)Z:488 - ReplaceConstant - 0 -> 1
	   * Goal 108. Weak Mutation 685: ArrayListDemo.addAll(Ljava/util/Collection;)Z:489 - ReplaceArithmeticOperator + -> %
	   * Goal 109. Weak Mutation 686: ArrayListDemo.addAll(Ljava/util/Collection;)Z:489 - ReplaceArithmeticOperator + -> -
	   * Goal 110. Weak Mutation 687: ArrayListDemo.addAll(Ljava/util/Collection;)Z:489 - ReplaceArithmeticOperator + -> *
	   * Goal 111. Weak Mutation 688: ArrayListDemo.addAll(Ljava/util/Collection;)Z:489 - ReplaceArithmeticOperator + -> /
	   * Goal 112. Weak Mutation 694: ArrayListDemo.addAll(Ljava/util/Collection;)Z:490 - ReplaceComparisonOperator == -> >=
	   * Goal 113. Weak Mutation 696: ArrayListDemo.addAll(Ljava/util/Collection;)Z:490 - ReplaceConstant - 1 -> 0
	   */

	  @Test(timeout = 4000)
	  public void test64()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      Integer integer0 = new Integer(0);
	      arrayListDemo0.add(integer0);
	      boolean boolean0 = arrayListDemo0.addAll((Collection<? extends Integer>) arrayListDemo0);
	      assertFalse(arrayListDemo0.isEmpty());
	      assertTrue(boolean0);
	  }

	  //Test case number: 65
	  /*
	   * 113 covered goals:
	   * Goal 1. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 2. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 3. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 4. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 5. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 6. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true
	   * Goal 7. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true
	   * Goal 8. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 9. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 10. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 11. ArrayListDemo.clear()V: I28 Branch 36 IF_ICMPLT L465 - true
	   * Goal 12. ArrayListDemo.clear()V: I28 Branch 36 IF_ICMPLT L465 - false
	   * Goal 13. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 14. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 15. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 16. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 17. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 18. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true in context: 
	   * Goal 19. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 20. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 21. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 22. Branch ArrayListDemo.clear()V: I28 Branch 36 IF_ICMPLT L465 - true in context: ArrayListDemo:clear()V
	   * Goal 23. Branch ArrayListDemo.clear()V: I28 Branch 36 IF_ICMPLT L465 - false in context: ArrayListDemo:clear()V
	   * Goal 24. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 25. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 26. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 27. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 28. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 29. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 30. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 31. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 32. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 33. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 87
	   * Goal 34. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 35. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 36. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 37. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 38. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 39. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 131
	   * Goal 40. ArrayListDemo.clear()V: Line 462
	   * Goal 41. ArrayListDemo.clear()V: Line 465
	   * Goal 42. ArrayListDemo.clear()V: Line 466
	   * Goal 43. ArrayListDemo.clear()V: Line 468
	   * Goal 44. ArrayListDemo.clear()V: Line 469
	   * Goal 45. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 46. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 47. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 48. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 49. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 50. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 51. ArrayListDemo.grow(I)V: Line 162
	   * Goal 52. ArrayListDemo.grow(I)V: Line 163
	   * Goal 53. ArrayListDemo.grow(I)V: Line 164
	   * Goal 54. ArrayListDemo.grow(I)V: Line 165
	   * Goal 55. ArrayListDemo.grow(I)V: Line 166
	   * Goal 56. ArrayListDemo.grow(I)V: Line 169
	   * Goal 57. ArrayListDemo.grow(I)V: Line 170
	   * Goal 58. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 59. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 60. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 61. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 62. [METHOD] ArrayListDemo.clear()V
	   * Goal 63. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 64. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 65. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 66. [METHODNOEX] ArrayListDemo.clear()V
	   * Goal 67. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 68. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 69. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 70. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 71. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 72. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 73. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 74. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 75. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 76. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 77. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 78. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 79. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 80. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 81. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 82. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 83. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 84. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 85. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 86. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 87. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 88. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 89. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 90. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 91. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 92. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 93. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 94. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 95. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 96. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 97. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 98. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 99. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 100. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 101. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 102. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 103. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 104. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   * Goal 105. Weak Mutation 632: ArrayListDemo.clear()V:462 - ReplaceConstant - 1 -> 0
	   * Goal 106. Weak Mutation 633: ArrayListDemo.clear()V:462 - ReplaceArithmeticOperator + -> %
	   * Goal 107. Weak Mutation 634: ArrayListDemo.clear()V:462 - ReplaceArithmeticOperator + -> -
	   * Goal 108. Weak Mutation 635: ArrayListDemo.clear()V:462 - ReplaceArithmeticOperator + -> *
	   * Goal 109. Weak Mutation 636: ArrayListDemo.clear()V:462 - ReplaceArithmeticOperator + -> /
	   * Goal 110. Weak Mutation 637: ArrayListDemo.clear()V:465 - ReplaceConstant - 0 -> 1
	   * Goal 111. Weak Mutation 651: ArrayListDemo.clear()V:465 - ReplaceComparisonOperator < -> -2
	   * Goal 112. Weak Mutation 652: ArrayListDemo.clear()V:465 - ReplaceComparisonOperator < -> <=
	   * Goal 113. Weak Mutation 653: ArrayListDemo.clear()V:468 - ReplaceConstant - 0 -> 1
	   */

	  @Test(timeout = 4000)
	  public void test65()  throws Throwable  {
	      ArrayListDemo<ArrayListDemo<Object>> arrayListDemo0 = new ArrayListDemo<ArrayListDemo<Object>>(0);
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>(arrayListDemo0);
	      arrayListDemo0.add(arrayListDemo1);
	      arrayListDemo0.clear();
	      assertTrue(arrayListDemo0.isEmpty());
	  }

	  //Test case number: 66
	  /*
	   * 156 covered goals:
	   * Goal 1. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 2. ArrayListDemo.add(ILjava/lang/Object;)V: root-Branch
	   * Goal 3. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 4. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 5. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true
	   * Goal 6. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - true
	   * Goal 7. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 8. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 9. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 10. ArrayListDemo.remove(Ljava/lang/Object;)Z: I3 Branch 30 IFNONNULL L428 - true
	   * Goal 11. ArrayListDemo.remove(Ljava/lang/Object;)Z: I68 Branch 34 IF_ICMPLT L435 - true
	   * Goal 12. ArrayListDemo.remove(Ljava/lang/Object;)Z: I51 Branch 33 IFEQ L436 - false
	   * Goal 13. ArrayListDemo.fastRemove(I)V: I20 Branch 35 IFLE L451 - false
	   * Goal 14. ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - false
	   * Goal 15. ArrayListDemo.rangeCheckForAdd(I)V: I7 Branch 43 IFGE L568 - true
	   * Goal 16. Branch ArrayListDemo.add(ILjava/lang/Object;)V: root-Branch in context: ArrayListDemo:add(ILjava/lang/Object;)V
	   * Goal 17. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 18. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 19. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 20. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true in context: 
	   * Goal 21. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 22. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - true in context: 
	   * Goal 23. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 24. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 25. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I3 Branch 30 IFNONNULL L428 - true in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 26. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I68 Branch 34 IF_ICMPLT L435 - true in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 27. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I51 Branch 33 IFEQ L436 - false in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 28. Branch ArrayListDemo.fastRemove(I)V: I20 Branch 35 IFLE L451 - false in context: 
	   * Goal 29. Branch ArrayListDemo.rangeCheckForAdd(I)V: I7 Branch 43 IFGE L568 - true in context: 
	   * Goal 30. Branch ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - false in context: 
	   * Goal 31. [Output]: ArrayListDemo.remove(Ljava/lang/Object;)Z:True
	   * Goal 32. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 33. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 34. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 35. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 36. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 37. ArrayListDemo.add(ILjava/lang/Object;)V: Line 381
	   * Goal 38. ArrayListDemo.add(ILjava/lang/Object;)V: Line 383
	   * Goal 39. ArrayListDemo.add(ILjava/lang/Object;)V: Line 384
	   * Goal 40. ArrayListDemo.add(ILjava/lang/Object;)V: Line 385
	   * Goal 41. ArrayListDemo.add(ILjava/lang/Object;)V: Line 386
	   * Goal 42. ArrayListDemo.add(ILjava/lang/Object;)V: Line 387
	   * Goal 43. ArrayListDemo.add(ILjava/lang/Object;)V: Line 388
	   * Goal 44. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 45. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 131
	   * Goal 46. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 47. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 48. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 49. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 50. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 51. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 52. ArrayListDemo.fastRemove(I)V: Line 449
	   * Goal 53. ArrayListDemo.fastRemove(I)V: Line 450
	   * Goal 54. ArrayListDemo.fastRemove(I)V: Line 451
	   * Goal 55. ArrayListDemo.fastRemove(I)V: Line 452
	   * Goal 56. ArrayListDemo.fastRemove(I)V: Line 453
	   * Goal 57. ArrayListDemo.fastRemove(I)V: Line 454
	   * Goal 58. ArrayListDemo.fastRemove(I)V: Line 455
	   * Goal 59. ArrayListDemo.grow(I)V: Line 162
	   * Goal 60. ArrayListDemo.grow(I)V: Line 163
	   * Goal 61. ArrayListDemo.grow(I)V: Line 164
	   * Goal 62. ArrayListDemo.grow(I)V: Line 165
	   * Goal 63. ArrayListDemo.grow(I)V: Line 166
	   * Goal 64. ArrayListDemo.grow(I)V: Line 169
	   * Goal 65. ArrayListDemo.grow(I)V: Line 170
	   * Goal 66. ArrayListDemo.rangeCheckForAdd(I)V: Line 568
	   * Goal 67. ArrayListDemo.rangeCheckForAdd(I)V: Line 570
	   * Goal 68. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 428
	   * Goal 69. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 435
	   * Goal 70. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 436
	   * Goal 71. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 437
	   * Goal 72. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 438
	   * Goal 73. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 74. [METHOD] ArrayListDemo.add(ILjava/lang/Object;)V
	   * Goal 75. [METHOD] ArrayListDemo.remove(Ljava/lang/Object;)Z
	   * Goal 76. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 77. [METHODNOEX] ArrayListDemo.add(ILjava/lang/Object;)V
	   * Goal 78. [METHODNOEX] ArrayListDemo.remove(Ljava/lang/Object;)Z
	   * Goal 79. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 80. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 81. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 82. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 83. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 84. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 85. Weak Mutation 81: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> +
	   * Goal 86. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 87. Weak Mutation 83: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> *
	   * Goal 88. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 89. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 90. Weak Mutation 86: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> ==
	   * Goal 91. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 92. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 93. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 94. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 95. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 96. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 97. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 98. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 99. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 100. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 101. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 102. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 103. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 104. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 105. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 106. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 107. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 108. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 109. Weak Mutation 408: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceConstant - 1 -> 0
	   * Goal 110. Weak Mutation 409: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceArithmeticOperator + -> %
	   * Goal 111. Weak Mutation 410: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceArithmeticOperator + -> -
	   * Goal 112. Weak Mutation 411: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceArithmeticOperator + -> *
	   * Goal 113. Weak Mutation 412: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceArithmeticOperator + -> /
	   * Goal 114. Weak Mutation 421: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceConstant - 1 -> 0
	   * Goal 115. Weak Mutation 422: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceArithmeticOperator + -> %
	   * Goal 116. Weak Mutation 423: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceArithmeticOperator + -> -
	   * Goal 117. Weak Mutation 424: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceArithmeticOperator + -> *
	   * Goal 118. Weak Mutation 425: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceArithmeticOperator + -> /
	   * Goal 119. Weak Mutation 435: ArrayListDemo.add(ILjava/lang/Object;)V:385 - ReplaceArithmeticOperator - -> %
	   * Goal 120. Weak Mutation 437: ArrayListDemo.add(ILjava/lang/Object;)V:385 - ReplaceArithmeticOperator - -> /
	   * Goal 121. Weak Mutation 446: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceConstant - 1 -> 0
	   * Goal 122. Weak Mutation 447: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceArithmeticOperator + -> %
	   * Goal 123. Weak Mutation 448: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceArithmeticOperator + -> -
	   * Goal 124. Weak Mutation 449: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceArithmeticOperator + -> *
	   * Goal 125. Weak Mutation 450: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceArithmeticOperator + -> /
	   * Goal 126. Weak Mutation 521: ArrayListDemo.remove(Ljava/lang/Object;)Z:428 - ReplaceComparisonOperator != null -> = null
	   * Goal 127. Weak Mutation 544: ArrayListDemo.remove(Ljava/lang/Object;)Z:435 - ReplaceConstant - 0 -> 1
	   * Goal 128. Weak Mutation 564: ArrayListDemo.remove(Ljava/lang/Object;)Z:435 - ReplaceComparisonOperator < -> -2
	   * Goal 129. Weak Mutation 549: ArrayListDemo.remove(Ljava/lang/Object;)Z:436 - ReplaceComparisonOperator == -> !=
	   * Goal 130. Weak Mutation 554: ArrayListDemo.remove(Ljava/lang/Object;)Z:438 - ReplaceConstant - 1 -> 0
	   * Goal 131. Weak Mutation 570: ArrayListDemo.fastRemove(I)V:449 - ReplaceConstant - 1 -> 0
	   * Goal 132. Weak Mutation 571: ArrayListDemo.fastRemove(I)V:449 - ReplaceArithmeticOperator + -> %
	   * Goal 133. Weak Mutation 572: ArrayListDemo.fastRemove(I)V:449 - ReplaceArithmeticOperator + -> -
	   * Goal 134. Weak Mutation 573: ArrayListDemo.fastRemove(I)V:449 - ReplaceArithmeticOperator + -> *
	   * Goal 135. Weak Mutation 574: ArrayListDemo.fastRemove(I)V:449 - ReplaceArithmeticOperator + -> /
	   * Goal 136. Weak Mutation 584: ArrayListDemo.fastRemove(I)V:450 - ReplaceArithmeticOperator - -> %
	   * Goal 137. Weak Mutation 586: ArrayListDemo.fastRemove(I)V:450 - ReplaceArithmeticOperator - -> /
	   * Goal 138. Weak Mutation 587: ArrayListDemo.fastRemove(I)V:450 - ReplaceConstant - 1 -> 0
	   * Goal 139. Weak Mutation 588: ArrayListDemo.fastRemove(I)V:450 - ReplaceArithmeticOperator - -> +
	   * Goal 140. Weak Mutation 589: ArrayListDemo.fastRemove(I)V:450 - ReplaceArithmeticOperator - -> %
	   * Goal 141. Weak Mutation 590: ArrayListDemo.fastRemove(I)V:450 - ReplaceArithmeticOperator - -> *
	   * Goal 142. Weak Mutation 591: ArrayListDemo.fastRemove(I)V:450 - ReplaceArithmeticOperator - -> /
	   * Goal 143. Weak Mutation 597: ArrayListDemo.fastRemove(I)V:451 - ReplaceComparisonOperator <= -> -1
	   * Goal 144. Weak Mutation 605: ArrayListDemo.fastRemove(I)V:452 - ReplaceConstant - 1 -> 0
	   * Goal 145. Weak Mutation 606: ArrayListDemo.fastRemove(I)V:452 - ReplaceArithmeticOperator + -> %
	   * Goal 146. Weak Mutation 607: ArrayListDemo.fastRemove(I)V:452 - ReplaceArithmeticOperator + -> -
	   * Goal 147. Weak Mutation 608: ArrayListDemo.fastRemove(I)V:452 - ReplaceArithmeticOperator + -> *
	   * Goal 148. Weak Mutation 609: ArrayListDemo.fastRemove(I)V:452 - ReplaceArithmeticOperator + -> /
	   * Goal 149. Weak Mutation 624: ArrayListDemo.fastRemove(I)V:454 - ReplaceConstant - 1 -> 0
	   * Goal 150. Weak Mutation 625: ArrayListDemo.fastRemove(I)V:454 - ReplaceArithmeticOperator - -> +
	   * Goal 151. Weak Mutation 626: ArrayListDemo.fastRemove(I)V:454 - ReplaceArithmeticOperator - -> %
	   * Goal 152. Weak Mutation 627: ArrayListDemo.fastRemove(I)V:454 - ReplaceArithmeticOperator - -> *
	   * Goal 153. Weak Mutation 628: ArrayListDemo.fastRemove(I)V:454 - ReplaceArithmeticOperator - -> /
	   * Goal 154. Weak Mutation 932: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator > -> !=
	   * Goal 155. Weak Mutation 934: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator > -> >=
	   * Goal 156. Weak Mutation 941: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator >= -> >
	   */

	  @Test(timeout = 4000)
	  public void test66()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(0);
	      Object[] objectArray0 = new Object[5];
	      arrayListDemo0.add(0, "");
	      arrayListDemo0.elementData = objectArray0;
	      arrayListDemo0.add(0, "");
	      boolean boolean0 = arrayListDemo0.remove(objectArray0[0]);
	      assertEquals(1, arrayListDemo0.size());
	      assertTrue(boolean0);
	  }

	  //Test case number: 67
	  /*
	   * 141 covered goals:
	   * Goal 1. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 2. ArrayListDemo.add(ILjava/lang/Object;)V: root-Branch
	   * Goal 3. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 4. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 5. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true
	   * Goal 6. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 7. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 8. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 9. ArrayListDemo.remove(Ljava/lang/Object;)Z: I3 Branch 30 IFNONNULL L428 - true
	   * Goal 10. ArrayListDemo.remove(Ljava/lang/Object;)Z: I68 Branch 34 IF_ICMPLT L435 - true
	   * Goal 11. ArrayListDemo.remove(Ljava/lang/Object;)Z: I51 Branch 33 IFEQ L436 - false
	   * Goal 12. ArrayListDemo.fastRemove(I)V: I20 Branch 35 IFLE L451 - true
	   * Goal 13. ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - false
	   * Goal 14. ArrayListDemo.rangeCheckForAdd(I)V: I7 Branch 43 IFGE L568 - true
	   * Goal 15. Branch ArrayListDemo.add(ILjava/lang/Object;)V: root-Branch in context: ArrayListDemo:add(ILjava/lang/Object;)V
	   * Goal 16. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 17. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 18. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 19. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true in context: 
	   * Goal 20. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 21. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 22. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 23. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I3 Branch 30 IFNONNULL L428 - true in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 24. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I68 Branch 34 IF_ICMPLT L435 - true in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 25. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I51 Branch 33 IFEQ L436 - false in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 26. Branch ArrayListDemo.fastRemove(I)V: I20 Branch 35 IFLE L451 - true in context: 
	   * Goal 27. Branch ArrayListDemo.rangeCheckForAdd(I)V: I7 Branch 43 IFGE L568 - true in context: 
	   * Goal 28. Branch ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - false in context: 
	   * Goal 29. [Output]: ArrayListDemo.remove(Ljava/lang/Object;)Z:True
	   * Goal 30. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 31. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 32. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 33. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 34. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 35. ArrayListDemo.add(ILjava/lang/Object;)V: Line 381
	   * Goal 36. ArrayListDemo.add(ILjava/lang/Object;)V: Line 383
	   * Goal 37. ArrayListDemo.add(ILjava/lang/Object;)V: Line 384
	   * Goal 38. ArrayListDemo.add(ILjava/lang/Object;)V: Line 385
	   * Goal 39. ArrayListDemo.add(ILjava/lang/Object;)V: Line 386
	   * Goal 40. ArrayListDemo.add(ILjava/lang/Object;)V: Line 387
	   * Goal 41. ArrayListDemo.add(ILjava/lang/Object;)V: Line 388
	   * Goal 42. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 43. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 131
	   * Goal 44. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 45. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 46. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 47. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 48. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 49. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 50. ArrayListDemo.fastRemove(I)V: Line 449
	   * Goal 51. ArrayListDemo.fastRemove(I)V: Line 450
	   * Goal 52. ArrayListDemo.fastRemove(I)V: Line 451
	   * Goal 53. ArrayListDemo.fastRemove(I)V: Line 454
	   * Goal 54. ArrayListDemo.fastRemove(I)V: Line 455
	   * Goal 55. ArrayListDemo.grow(I)V: Line 162
	   * Goal 56. ArrayListDemo.grow(I)V: Line 163
	   * Goal 57. ArrayListDemo.grow(I)V: Line 164
	   * Goal 58. ArrayListDemo.grow(I)V: Line 165
	   * Goal 59. ArrayListDemo.grow(I)V: Line 166
	   * Goal 60. ArrayListDemo.grow(I)V: Line 169
	   * Goal 61. ArrayListDemo.grow(I)V: Line 170
	   * Goal 62. ArrayListDemo.rangeCheckForAdd(I)V: Line 568
	   * Goal 63. ArrayListDemo.rangeCheckForAdd(I)V: Line 570
	   * Goal 64. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 428
	   * Goal 65. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 435
	   * Goal 66. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 436
	   * Goal 67. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 437
	   * Goal 68. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 438
	   * Goal 69. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 70. [METHOD] ArrayListDemo.add(ILjava/lang/Object;)V
	   * Goal 71. [METHOD] ArrayListDemo.remove(Ljava/lang/Object;)Z
	   * Goal 72. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 73. [METHODNOEX] ArrayListDemo.add(ILjava/lang/Object;)V
	   * Goal 74. [METHODNOEX] ArrayListDemo.remove(Ljava/lang/Object;)Z
	   * Goal 75. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 76. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 77. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 78. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 79. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 80. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 81. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 82. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 83. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 84. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 85. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 86. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 87. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 88. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 89. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 90. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 91. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 92. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 93. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 94. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 95. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 96. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 97. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 98. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 99. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 100. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 101. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 102. Weak Mutation 408: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceConstant - 1 -> 0
	   * Goal 103. Weak Mutation 409: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceArithmeticOperator + -> %
	   * Goal 104. Weak Mutation 410: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceArithmeticOperator + -> -
	   * Goal 105. Weak Mutation 411: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceArithmeticOperator + -> *
	   * Goal 106. Weak Mutation 412: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceArithmeticOperator + -> /
	   * Goal 107. Weak Mutation 421: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceConstant - 1 -> 0
	   * Goal 108. Weak Mutation 422: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceArithmeticOperator + -> %
	   * Goal 109. Weak Mutation 423: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceArithmeticOperator + -> -
	   * Goal 110. Weak Mutation 424: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceArithmeticOperator + -> *
	   * Goal 111. Weak Mutation 425: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceArithmeticOperator + -> /
	   * Goal 112. Weak Mutation 435: ArrayListDemo.add(ILjava/lang/Object;)V:385 - ReplaceArithmeticOperator - -> %
	   * Goal 113. Weak Mutation 437: ArrayListDemo.add(ILjava/lang/Object;)V:385 - ReplaceArithmeticOperator - -> /
	   * Goal 114. Weak Mutation 446: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceConstant - 1 -> 0
	   * Goal 115. Weak Mutation 447: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceArithmeticOperator + -> %
	   * Goal 116. Weak Mutation 448: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceArithmeticOperator + -> -
	   * Goal 117. Weak Mutation 449: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceArithmeticOperator + -> *
	   * Goal 118. Weak Mutation 450: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceArithmeticOperator + -> /
	   * Goal 119. Weak Mutation 521: ArrayListDemo.remove(Ljava/lang/Object;)Z:428 - ReplaceComparisonOperator != null -> = null
	   * Goal 120. Weak Mutation 544: ArrayListDemo.remove(Ljava/lang/Object;)Z:435 - ReplaceConstant - 0 -> 1
	   * Goal 121. Weak Mutation 564: ArrayListDemo.remove(Ljava/lang/Object;)Z:435 - ReplaceComparisonOperator < -> -2
	   * Goal 122. Weak Mutation 549: ArrayListDemo.remove(Ljava/lang/Object;)Z:436 - ReplaceComparisonOperator == -> !=
	   * Goal 123. Weak Mutation 554: ArrayListDemo.remove(Ljava/lang/Object;)Z:438 - ReplaceConstant - 1 -> 0
	   * Goal 124. Weak Mutation 570: ArrayListDemo.fastRemove(I)V:449 - ReplaceConstant - 1 -> 0
	   * Goal 125. Weak Mutation 571: ArrayListDemo.fastRemove(I)V:449 - ReplaceArithmeticOperator + -> %
	   * Goal 126. Weak Mutation 572: ArrayListDemo.fastRemove(I)V:449 - ReplaceArithmeticOperator + -> -
	   * Goal 127. Weak Mutation 573: ArrayListDemo.fastRemove(I)V:449 - ReplaceArithmeticOperator + -> *
	   * Goal 128. Weak Mutation 574: ArrayListDemo.fastRemove(I)V:449 - ReplaceArithmeticOperator + -> /
	   * Goal 129. Weak Mutation 584: ArrayListDemo.fastRemove(I)V:450 - ReplaceArithmeticOperator - -> %
	   * Goal 130. Weak Mutation 586: ArrayListDemo.fastRemove(I)V:450 - ReplaceArithmeticOperator - -> /
	   * Goal 131. Weak Mutation 587: ArrayListDemo.fastRemove(I)V:450 - ReplaceConstant - 1 -> 0
	   * Goal 132. Weak Mutation 588: ArrayListDemo.fastRemove(I)V:450 - ReplaceArithmeticOperator - -> +
	   * Goal 133. Weak Mutation 590: ArrayListDemo.fastRemove(I)V:450 - ReplaceArithmeticOperator - -> *
	   * Goal 134. Weak Mutation 591: ArrayListDemo.fastRemove(I)V:450 - ReplaceArithmeticOperator - -> /
	   * Goal 135. Weak Mutation 599: ArrayListDemo.fastRemove(I)V:451 - ReplaceComparisonOperator <= -> <
	   * Goal 136. Weak Mutation 624: ArrayListDemo.fastRemove(I)V:454 - ReplaceConstant - 1 -> 0
	   * Goal 137. Weak Mutation 625: ArrayListDemo.fastRemove(I)V:454 - ReplaceArithmeticOperator - -> +
	   * Goal 138. Weak Mutation 627: ArrayListDemo.fastRemove(I)V:454 - ReplaceArithmeticOperator - -> *
	   * Goal 139. Weak Mutation 628: ArrayListDemo.fastRemove(I)V:454 - ReplaceArithmeticOperator - -> /
	   * Goal 140. Weak Mutation 934: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator > -> >=
	   * Goal 141. Weak Mutation 941: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator >= -> >
	   */

	  @Test(timeout = 4000)
	  public void test67()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(0);
	      Object[] objectArray0 = new Object[5];
	      objectArray0[0] = (Object) arrayListDemo0;
	      arrayListDemo0.add(0, "");
	      arrayListDemo0.elementData = objectArray0;
	      assertFalse(arrayListDemo0.isEmpty());
	      
	      boolean boolean0 = arrayListDemo0.remove(objectArray0[0]);
	      assertTrue(boolean0);
	  }

	  //Test case number: 68
	  /*
	   * 120 covered goals:
	   * Goal 1. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 2. ArrayListDemo.add(ILjava/lang/Object;)V: root-Branch
	   * Goal 3. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 4. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 5. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true
	   * Goal 6. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 7. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 8. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 9. ArrayListDemo.remove(Ljava/lang/Object;)Z: I3 Branch 30 IFNONNULL L428 - true
	   * Goal 10. ArrayListDemo.remove(Ljava/lang/Object;)Z: I68 Branch 34 IF_ICMPLT L435 - true
	   * Goal 11. ArrayListDemo.remove(Ljava/lang/Object;)Z: I68 Branch 34 IF_ICMPLT L435 - false
	   * Goal 12. ArrayListDemo.remove(Ljava/lang/Object;)Z: I51 Branch 33 IFEQ L436 - true
	   * Goal 13. ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - false
	   * Goal 14. ArrayListDemo.rangeCheckForAdd(I)V: I7 Branch 43 IFGE L568 - true
	   * Goal 15. Branch ArrayListDemo.add(ILjava/lang/Object;)V: root-Branch in context: ArrayListDemo:add(ILjava/lang/Object;)V
	   * Goal 16. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 17. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 18. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 19. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true in context: 
	   * Goal 20. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 21. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 22. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 23. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I3 Branch 30 IFNONNULL L428 - true in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 24. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I68 Branch 34 IF_ICMPLT L435 - false in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 25. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I68 Branch 34 IF_ICMPLT L435 - true in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 26. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I51 Branch 33 IFEQ L436 - true in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 27. Branch ArrayListDemo.rangeCheckForAdd(I)V: I7 Branch 43 IFGE L568 - true in context: 
	   * Goal 28. Branch ArrayListDemo.rangeCheckForAdd(I)V: I5 Branch 42 IF_ICMPGT L568 - false in context: 
	   * Goal 29. [Output]: ArrayListDemo.remove(Ljava/lang/Object;)Z:False
	   * Goal 30. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 31. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 32. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 33. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 34. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 35. ArrayListDemo.add(ILjava/lang/Object;)V: Line 381
	   * Goal 36. ArrayListDemo.add(ILjava/lang/Object;)V: Line 383
	   * Goal 37. ArrayListDemo.add(ILjava/lang/Object;)V: Line 384
	   * Goal 38. ArrayListDemo.add(ILjava/lang/Object;)V: Line 385
	   * Goal 39. ArrayListDemo.add(ILjava/lang/Object;)V: Line 386
	   * Goal 40. ArrayListDemo.add(ILjava/lang/Object;)V: Line 387
	   * Goal 41. ArrayListDemo.add(ILjava/lang/Object;)V: Line 388
	   * Goal 42. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 43. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 131
	   * Goal 44. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 45. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 46. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 47. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 48. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 49. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 50. ArrayListDemo.grow(I)V: Line 162
	   * Goal 51. ArrayListDemo.grow(I)V: Line 163
	   * Goal 52. ArrayListDemo.grow(I)V: Line 164
	   * Goal 53. ArrayListDemo.grow(I)V: Line 165
	   * Goal 54. ArrayListDemo.grow(I)V: Line 166
	   * Goal 55. ArrayListDemo.grow(I)V: Line 169
	   * Goal 56. ArrayListDemo.grow(I)V: Line 170
	   * Goal 57. ArrayListDemo.rangeCheckForAdd(I)V: Line 568
	   * Goal 58. ArrayListDemo.rangeCheckForAdd(I)V: Line 570
	   * Goal 59. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 428
	   * Goal 60. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 435
	   * Goal 61. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 436
	   * Goal 62. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 441
	   * Goal 63. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 64. [METHOD] ArrayListDemo.add(ILjava/lang/Object;)V
	   * Goal 65. [METHOD] ArrayListDemo.remove(Ljava/lang/Object;)Z
	   * Goal 66. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 67. [METHODNOEX] ArrayListDemo.add(ILjava/lang/Object;)V
	   * Goal 68. [METHODNOEX] ArrayListDemo.remove(Ljava/lang/Object;)Z
	   * Goal 69. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 70. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 71. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 72. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 73. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 74. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 75. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 76. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 77. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 78. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 79. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 80. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 81. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 82. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 83. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 84. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 85. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 86. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 87. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 88. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 89. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 90. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 91. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 92. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 93. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 94. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 95. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 96. Weak Mutation 408: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceConstant - 1 -> 0
	   * Goal 97. Weak Mutation 409: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceArithmeticOperator + -> %
	   * Goal 98. Weak Mutation 410: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceArithmeticOperator + -> -
	   * Goal 99. Weak Mutation 411: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceArithmeticOperator + -> *
	   * Goal 100. Weak Mutation 412: ArrayListDemo.add(ILjava/lang/Object;)V:383 - ReplaceArithmeticOperator + -> /
	   * Goal 101. Weak Mutation 421: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceConstant - 1 -> 0
	   * Goal 102. Weak Mutation 422: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceArithmeticOperator + -> %
	   * Goal 103. Weak Mutation 423: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceArithmeticOperator + -> -
	   * Goal 104. Weak Mutation 424: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceArithmeticOperator + -> *
	   * Goal 105. Weak Mutation 425: ArrayListDemo.add(ILjava/lang/Object;)V:384 - ReplaceArithmeticOperator + -> /
	   * Goal 106. Weak Mutation 435: ArrayListDemo.add(ILjava/lang/Object;)V:385 - ReplaceArithmeticOperator - -> %
	   * Goal 107. Weak Mutation 437: ArrayListDemo.add(ILjava/lang/Object;)V:385 - ReplaceArithmeticOperator - -> /
	   * Goal 108. Weak Mutation 446: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceConstant - 1 -> 0
	   * Goal 109. Weak Mutation 447: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceArithmeticOperator + -> %
	   * Goal 110. Weak Mutation 448: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceArithmeticOperator + -> -
	   * Goal 111. Weak Mutation 449: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceArithmeticOperator + -> *
	   * Goal 112. Weak Mutation 450: ArrayListDemo.add(ILjava/lang/Object;)V:387 - ReplaceArithmeticOperator + -> /
	   * Goal 113. Weak Mutation 521: ArrayListDemo.remove(Ljava/lang/Object;)Z:428 - ReplaceComparisonOperator != null -> = null
	   * Goal 114. Weak Mutation 544: ArrayListDemo.remove(Ljava/lang/Object;)Z:435 - ReplaceConstant - 0 -> 1
	   * Goal 115. Weak Mutation 564: ArrayListDemo.remove(Ljava/lang/Object;)Z:435 - ReplaceComparisonOperator < -> -2
	   * Goal 116. Weak Mutation 565: ArrayListDemo.remove(Ljava/lang/Object;)Z:435 - ReplaceComparisonOperator < -> <=
	   * Goal 117. Weak Mutation 549: ArrayListDemo.remove(Ljava/lang/Object;)Z:436 - ReplaceComparisonOperator == -> !=
	   * Goal 118. Weak Mutation 566: ArrayListDemo.remove(Ljava/lang/Object;)Z:441 - ReplaceConstant - 0 -> 1
	   * Goal 119. Weak Mutation 934: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator > -> >=
	   * Goal 120. Weak Mutation 941: ArrayListDemo.rangeCheckForAdd(I)V:568 - ReplaceComparisonOperator >= -> >
	   */

	  @Test(timeout = 4000)
	  public void test68()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(0);
	      arrayListDemo0.add(0, "");
	      boolean boolean0 = arrayListDemo0.remove((Object) arrayListDemo0);
	      assertEquals(1, arrayListDemo0.size());
	      assertFalse(boolean0);
	  }

	  //Test case number: 69
	  /*
	   * 104 covered goals:
	   * Goal 1. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 2. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 3. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 4. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 5. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true
	   * Goal 6. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 7. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 8. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 9. ArrayListDemo.remove(Ljava/lang/Object;)Z: I3 Branch 30 IFNONNULL L428 - false
	   * Goal 10. ArrayListDemo.remove(Ljava/lang/Object;)Z: I33 Branch 32 IF_ICMPLT L429 - true
	   * Goal 11. ArrayListDemo.remove(Ljava/lang/Object;)Z: I33 Branch 32 IF_ICMPLT L429 - false
	   * Goal 12. ArrayListDemo.remove(Ljava/lang/Object;)Z: I16 Branch 31 IFNONNULL L430 - true
	   * Goal 13. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 14. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 15. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 16. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 17. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true in context: 
	   * Goal 18. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 19. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 20. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 21. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I3 Branch 30 IFNONNULL L428 - false in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 22. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I33 Branch 32 IF_ICMPLT L429 - true in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 23. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I33 Branch 32 IF_ICMPLT L429 - false in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 24. Branch ArrayListDemo.remove(Ljava/lang/Object;)Z: I16 Branch 31 IFNONNULL L430 - true in context: ArrayListDemo:remove(Ljava/lang/Object;)Z
	   * Goal 25. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 26. [Output]: ArrayListDemo.remove(Ljava/lang/Object;)Z:False
	   * Goal 27. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 28. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 29. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 30. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 31. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 32. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 33. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 34. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 35. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 36. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 131
	   * Goal 37. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 38. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 39. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 40. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 41. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 42. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 43. ArrayListDemo.grow(I)V: Line 162
	   * Goal 44. ArrayListDemo.grow(I)V: Line 163
	   * Goal 45. ArrayListDemo.grow(I)V: Line 164
	   * Goal 46. ArrayListDemo.grow(I)V: Line 165
	   * Goal 47. ArrayListDemo.grow(I)V: Line 166
	   * Goal 48. ArrayListDemo.grow(I)V: Line 169
	   * Goal 49. ArrayListDemo.grow(I)V: Line 170
	   * Goal 50. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 428
	   * Goal 51. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 429
	   * Goal 52. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 430
	   * Goal 53. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 434
	   * Goal 54. ArrayListDemo.remove(Ljava/lang/Object;)Z: Line 441
	   * Goal 55. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 56. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 57. [METHOD] ArrayListDemo.remove(Ljava/lang/Object;)Z
	   * Goal 58. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 59. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 60. [METHODNOEX] ArrayListDemo.remove(Ljava/lang/Object;)Z
	   * Goal 61. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 62. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 63. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 64. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 65. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 66. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 67. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 68. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 69. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 70. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 71. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 72. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 73. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 74. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 75. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 76. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 77. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 78. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 79. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 80. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 81. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 82. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 83. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 84. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 85. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 86. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 87. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 88. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 89. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 90. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 91. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 92. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 93. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 94. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 95. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 96. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 97. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 98. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   * Goal 99. Weak Mutation 521: ArrayListDemo.remove(Ljava/lang/Object;)Z:428 - ReplaceComparisonOperator != null -> = null
	   * Goal 100. Weak Mutation 522: ArrayListDemo.remove(Ljava/lang/Object;)Z:429 - ReplaceConstant - 0 -> 1
	   * Goal 101. Weak Mutation 542: ArrayListDemo.remove(Ljava/lang/Object;)Z:429 - ReplaceComparisonOperator < -> -2
	   * Goal 102. Weak Mutation 543: ArrayListDemo.remove(Ljava/lang/Object;)Z:429 - ReplaceComparisonOperator < -> <=
	   * Goal 103. Weak Mutation 527: ArrayListDemo.remove(Ljava/lang/Object;)Z:430 - ReplaceComparisonOperator != null -> = null
	   * Goal 104. Weak Mutation 566: ArrayListDemo.remove(Ljava/lang/Object;)Z:441 - ReplaceConstant - 0 -> 1
	   */

	  @Test(timeout = 4000)
	  public void test69()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(0);
	      arrayListDemo0.add("");
	      assertEquals(1, arrayListDemo0.size());
	  }

	  //Test case number: 70
	  /*
	   * 49 covered goals:
	   * Goal 1. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 2. ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch
	   * Goal 3. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - false
	   * Goal 4. ArrayListDemo.<init>(Ljava/util/Collection;)V: I25 Branch 4 IF_ACMPEQ L83 - true
	   * Goal 5. ArrayListDemo.remove(I)Ljava/lang/Object;: I31 Branch 29 IFLE L406 - true
	   * Goal 6. ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - true
	   * Goal 7. Branch ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - false in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 9. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I25 Branch 4 IF_ACMPEQ L83 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 10. Branch ArrayListDemo.remove(I)Ljava/lang/Object;: I31 Branch 29 IFLE L406 - true in context: ArrayListDemo:remove(I)Ljava/lang/Object;
	   * Goal 11. Branch ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - true in context: 
	   * Goal 12. [Output]: ArrayListDemo.remove(I)Ljava/lang/Object;:NonNull
	   * Goal 13. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 14. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 15. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 16. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 83
	   * Goal 17. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 18. ArrayListDemo.elementData(I)Ljava/lang/Object;: Line 326
	   * Goal 19. ArrayListDemo.rangeCheck(I)V: Line 560
	   * Goal 20. ArrayListDemo.rangeCheck(I)V: Line 562
	   * Goal 21. ArrayListDemo.remove(I)Ljava/lang/Object;: Line 400
	   * Goal 22. ArrayListDemo.remove(I)Ljava/lang/Object;: Line 402
	   * Goal 23. ArrayListDemo.remove(I)Ljava/lang/Object;: Line 403
	   * Goal 24. ArrayListDemo.remove(I)Ljava/lang/Object;: Line 405
	   * Goal 25. ArrayListDemo.remove(I)Ljava/lang/Object;: Line 406
	   * Goal 26. ArrayListDemo.remove(I)Ljava/lang/Object;: Line 409
	   * Goal 27. ArrayListDemo.remove(I)Ljava/lang/Object;: Line 411
	   * Goal 28. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 29. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 30. [METHOD] ArrayListDemo.remove(I)Ljava/lang/Object;
	   * Goal 31. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 32. [METHODNOEX] ArrayListDemo.remove(I)Ljava/lang/Object;
	   * Goal 33. Weak Mutation 458: ArrayListDemo.remove(I)Ljava/lang/Object;:402 - ReplaceConstant - 1 -> 0
	   * Goal 34. Weak Mutation 459: ArrayListDemo.remove(I)Ljava/lang/Object;:402 - ReplaceArithmeticOperator + -> %
	   * Goal 35. Weak Mutation 460: ArrayListDemo.remove(I)Ljava/lang/Object;:402 - ReplaceArithmeticOperator + -> -
	   * Goal 36. Weak Mutation 461: ArrayListDemo.remove(I)Ljava/lang/Object;:402 - ReplaceArithmeticOperator + -> *
	   * Goal 37. Weak Mutation 462: ArrayListDemo.remove(I)Ljava/lang/Object;:402 - ReplaceArithmeticOperator + -> /
	   * Goal 38. Weak Mutation 476: ArrayListDemo.remove(I)Ljava/lang/Object;:405 - ReplaceArithmeticOperator - -> %
	   * Goal 39. Weak Mutation 478: ArrayListDemo.remove(I)Ljava/lang/Object;:405 - ReplaceArithmeticOperator - -> /
	   * Goal 40. Weak Mutation 479: ArrayListDemo.remove(I)Ljava/lang/Object;:405 - ReplaceConstant - 1 -> 0
	   * Goal 41. Weak Mutation 480: ArrayListDemo.remove(I)Ljava/lang/Object;:405 - ReplaceArithmeticOperator - -> +
	   * Goal 42. Weak Mutation 482: ArrayListDemo.remove(I)Ljava/lang/Object;:405 - ReplaceArithmeticOperator - -> *
	   * Goal 43. Weak Mutation 483: ArrayListDemo.remove(I)Ljava/lang/Object;:405 - ReplaceArithmeticOperator - -> /
	   * Goal 44. Weak Mutation 491: ArrayListDemo.remove(I)Ljava/lang/Object;:406 - ReplaceComparisonOperator <= -> <
	   * Goal 45. Weak Mutation 516: ArrayListDemo.remove(I)Ljava/lang/Object;:409 - ReplaceConstant - 1 -> 0
	   * Goal 46. Weak Mutation 517: ArrayListDemo.remove(I)Ljava/lang/Object;:409 - ReplaceArithmeticOperator - -> +
	   * Goal 47. Weak Mutation 519: ArrayListDemo.remove(I)Ljava/lang/Object;:409 - ReplaceArithmeticOperator - -> *
	   * Goal 48. Weak Mutation 520: ArrayListDemo.remove(I)Ljava/lang/Object;:409 - ReplaceArithmeticOperator - -> /
	   * Goal 49. Weak Mutation 918: ArrayListDemo.rangeCheck(I)V:560 - ReplaceComparisonOperator < -> -2
	   */

	  @Test(timeout = 4000)
	  public void test70()  throws Throwable  {
	      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      Integer integer0 = new Integer(0);
	      linkedList0.add(integer0);
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(linkedList0);
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>(arrayListDemo0);
	      arrayListDemo1.remove(0);
	      assertTrue(arrayListDemo1.isEmpty());
	  }

	  //Test case number: 71
	  /*
	   * 28 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 3. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: I6 Branch 27 IF_ICMPGE L313 - true
	   * Goal 4. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: I33 Branch 28 IF_ICMPLE L317 - true
	   * Goal 5. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 6. Branch ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch in context: ArrayListDemo:toArray()[Ljava/lang/Object;
	   * Goal 7. Branch ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: I6 Branch 27 IF_ICMPGE L313 - true in context: ArrayListDemo:toArray([Ljava/lang/Object;)[Ljava/lang/Object;
	   * Goal 8. Branch ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: I33 Branch 28 IF_ICMPLE L317 - true in context: ArrayListDemo:toArray([Ljava/lang/Object;)[Ljava/lang/Object;
	   * Goal 9. [Output]: ArrayListDemo.toArray()[Ljava/lang/Object;:EmptyArray
	   * Goal 10. [Output]: ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;:EmptyArray
	   * Goal 11. ArrayListDemo.<init>()V: Line 67
	   * Goal 12. ArrayListDemo.<init>()V: Line 68
	   * Goal 13. ArrayListDemo.<init>()V: Line 69
	   * Goal 14. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 15. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: Line 313
	   * Goal 16. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: Line 316
	   * Goal 17. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: Line 317
	   * Goal 18. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: Line 319
	   * Goal 19. [METHOD] ArrayListDemo.<init>()V
	   * Goal 20. [METHOD] ArrayListDemo.toArray()[Ljava/lang/Object;
	   * Goal 21. [METHOD] ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;
	   * Goal 22. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 23. [METHODNOEX] ArrayListDemo.toArray()[Ljava/lang/Object;
	   * Goal 24. [METHODNOEX] ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;
	   * Goal 25. Weak Mutation 327: ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;:313 - ReplaceComparisonOperator >= -> >
	   * Goal 26. Weak Mutation 334: ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;:316 - ReplaceConstant - 0 -> 1
	   * Goal 27. Weak Mutation 336: ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;:316 - ReplaceConstant - 0 -> 1
	   * Goal 28. Weak Mutation 347: ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;:317 - ReplaceComparisonOperator <= -> <
	   */

	  @Test(timeout = 4000)
	  public void test71()  throws Throwable  {
	      ArrayListDemo<ArrayListDemo<Object>> arrayListDemo0 = new ArrayListDemo<ArrayListDemo<Object>>();
	      Object[] objectArray0 = arrayListDemo0.toArray();
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>();
	      Object[] objectArray1 = arrayListDemo1.toArray(objectArray0);
	      assertEquals(0, objectArray1.length);
	      assertSame(objectArray1, objectArray0);
	  }

	  //Test case number: 72
	  /*
	   * 90 covered goals:
	   * Goal 1. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 2. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 3. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 4. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 5. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true
	   * Goal 6. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 7. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 8. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 9. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: I6 Branch 27 IF_ICMPGE L313 - false
	   * Goal 10. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 11. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 12. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 13. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 14. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true in context: 
	   * Goal 15. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 16. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 17. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 18. Branch ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: I6 Branch 27 IF_ICMPGE L313 - false in context: ArrayListDemo:toArray([Ljava/lang/Object;)[Ljava/lang/Object;
	   * Goal 19. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 20. [Output]: ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;:NonEmptyArray
	   * Goal 21. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 22. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 23. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 24. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 25. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 26. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 27. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 28. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 29. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 30. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 131
	   * Goal 31. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 32. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 33. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 34. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 35. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 36. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 37. ArrayListDemo.grow(I)V: Line 162
	   * Goal 38. ArrayListDemo.grow(I)V: Line 163
	   * Goal 39. ArrayListDemo.grow(I)V: Line 164
	   * Goal 40. ArrayListDemo.grow(I)V: Line 165
	   * Goal 41. ArrayListDemo.grow(I)V: Line 166
	   * Goal 42. ArrayListDemo.grow(I)V: Line 169
	   * Goal 43. ArrayListDemo.grow(I)V: Line 170
	   * Goal 44. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: Line 313
	   * Goal 45. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: Line 315
	   * Goal 46. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 47. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 48. [METHOD] ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;
	   * Goal 49. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 50. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 51. [METHODNOEX] ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;
	   * Goal 52. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 53. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 54. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 55. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 56. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 57. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 58. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 59. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 60. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 61. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 62. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 63. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 64. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 65. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 66. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 67. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 68. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 69. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 70. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 71. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 72. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 73. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 74. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 75. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 76. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 77. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 78. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 79. Weak Mutation 326: ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;:313 - ReplaceComparisonOperator >= -> -1
	   * Goal 80. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 81. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 82. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 83. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 84. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 85. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 86. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 87. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 88. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 89. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 90. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   */

	  @Test(timeout = 4000)
	  public void test72()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(0);
	      arrayListDemo0.add("");
	      Object[] objectArray0 = new Object[0];
	      arrayListDemo0.toArray(objectArray0);
	      assertFalse(arrayListDemo0.isEmpty());
	  }

	  //Test case number: 73
	  /*
	   * 23 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: I6 Branch 27 IF_ICMPGE L313 - true
	   * Goal 3. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: I33 Branch 28 IF_ICMPLE L317 - false
	   * Goal 4. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 5. Branch ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: I6 Branch 27 IF_ICMPGE L313 - true in context: ArrayListDemo:toArray([Ljava/lang/Object;)[Ljava/lang/Object;
	   * Goal 6. Branch ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: I33 Branch 28 IF_ICMPLE L317 - false in context: ArrayListDemo:toArray([Ljava/lang/Object;)[Ljava/lang/Object;
	   * Goal 7. [Output]: ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;:NonEmptyArray
	   * Goal 8. ArrayListDemo.<init>()V: Line 67
	   * Goal 9. ArrayListDemo.<init>()V: Line 68
	   * Goal 10. ArrayListDemo.<init>()V: Line 69
	   * Goal 11. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: Line 313
	   * Goal 12. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: Line 316
	   * Goal 13. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: Line 317
	   * Goal 14. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: Line 318
	   * Goal 15. ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;: Line 319
	   * Goal 16. [METHOD] ArrayListDemo.<init>()V
	   * Goal 17. [METHOD] ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;
	   * Goal 18. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 19. [METHODNOEX] ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;
	   * Goal 20. Weak Mutation 328: ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;:313 - ReplaceComparisonOperator >= -> ==
	   * Goal 21. Weak Mutation 334: ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;:316 - ReplaceConstant - 0 -> 1
	   * Goal 22. Weak Mutation 336: ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;:316 - ReplaceConstant - 0 -> 1
	   * Goal 23. Weak Mutation 346: ArrayListDemo.toArray([Ljava/lang/Object;)[Ljava/lang/Object;:317 - ReplaceComparisonOperator <= -> -1
	   */

	  @Test(timeout = 4000)
	  public void test73()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      Object[] objectArray0 = new Object[3];
	      Object[] objectArray1 = arrayListDemo0.toArray(objectArray0);
	      assertEquals(3, objectArray1.length);
	  }

	  //Test case number: 74
	  /*
	   * 39 covered goals:
	   * Goal 1. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 2. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - false
	   * Goal 3. ArrayListDemo.<init>(Ljava/util/Collection;)V: I25 Branch 4 IF_ACMPEQ L83 - true
	   * Goal 4. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I3 Branch 22 IFNONNULL L239 - true
	   * Goal 5. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I60 Branch 26 IFGE L244 - true
	   * Goal 6. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I60 Branch 26 IFGE L244 - false
	   * Goal 7. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I50 Branch 25 IFEQ L245 - true
	   * Goal 8. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - false in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 9. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I25 Branch 4 IF_ACMPEQ L83 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 10. Branch ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I3 Branch 22 IFNONNULL L239 - true in context: ArrayListDemo:lastIndexOf(Ljava/lang/Object;)I
	   * Goal 11. Branch ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I60 Branch 26 IFGE L244 - false in context: ArrayListDemo:lastIndexOf(Ljava/lang/Object;)I
	   * Goal 12. Branch ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I60 Branch 26 IFGE L244 - true in context: ArrayListDemo:lastIndexOf(Ljava/lang/Object;)I
	   * Goal 13. Branch ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I50 Branch 25 IFEQ L245 - true in context: ArrayListDemo:lastIndexOf(Ljava/lang/Object;)I
	   * Goal 14. [Output]: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:Negative
	   * Goal 15. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 16. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 17. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 18. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 83
	   * Goal 19. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 20. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: Line 239
	   * Goal 21. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: Line 244
	   * Goal 22. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: Line 245
	   * Goal 23. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: Line 248
	   * Goal 24. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 25. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 26. [METHOD] ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I
	   * Goal 27. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 28. [METHODNOEX] ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I
	   * Goal 29. Weak Mutation 255: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:239 - ReplaceComparisonOperator != null -> = null
	   * Goal 30. Weak Mutation 285: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:244 - ReplaceConstant - 1 -> 0
	   * Goal 31. Weak Mutation 286: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:244 - ReplaceArithmeticOperator - -> +
	   * Goal 32. Weak Mutation 288: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:244 - ReplaceArithmeticOperator - -> *
	   * Goal 33. Weak Mutation 289: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:244 - ReplaceArithmeticOperator - -> /
	   * Goal 34. Weak Mutation 303: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:244 - ReplaceComparisonOperator >= -> -1
	   * Goal 35. Weak Mutation 305: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:244 - ReplaceComparisonOperator >= -> >
	   * Goal 36. Weak Mutation 294: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:245 - ReplaceComparisonOperator == -> !=
	   * Goal 37. Weak Mutation 306: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:248 - ReplaceConstant - -1 -> 0
	   * Goal 38. Weak Mutation 307: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:248 - ReplaceConstant - -1 -> 1
	   * Goal 39. Weak Mutation 308: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:248 - ReplaceConstant - -1 -> -2
	   */

	  @Test(timeout = 4000)
	  public void test74()  throws Throwable  {
	      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      Integer integer0 = new Integer(0);
	      linkedList0.add(integer0);
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(linkedList0);
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>(arrayListDemo0);
	      int int0 = arrayListDemo1.lastIndexOf("");
	      assertEquals((-1), int0);
	      assertEquals(1, arrayListDemo1.size());
	  }

	  //Test case number: 75
	  /*
	   * 28 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I3 Branch 22 IFNONNULL L239 - false
	   * Goal 3. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I29 Branch 24 IFGE L240 - false
	   * Goal 4. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 5. Branch ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I3 Branch 22 IFNONNULL L239 - false in context: ArrayListDemo:lastIndexOf(Ljava/lang/Object;)I
	   * Goal 6. Branch ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I29 Branch 24 IFGE L240 - false in context: ArrayListDemo:lastIndexOf(Ljava/lang/Object;)I
	   * Goal 7. [Output]: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:Negative
	   * Goal 8. ArrayListDemo.<init>()V: Line 67
	   * Goal 9. ArrayListDemo.<init>()V: Line 68
	   * Goal 10. ArrayListDemo.<init>()V: Line 69
	   * Goal 11. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: Line 239
	   * Goal 12. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: Line 240
	   * Goal 13. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: Line 243
	   * Goal 14. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: Line 248
	   * Goal 15. [METHOD] ArrayListDemo.<init>()V
	   * Goal 16. [METHOD] ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I
	   * Goal 17. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 18. [METHODNOEX] ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I
	   * Goal 19. Weak Mutation 255: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:239 - ReplaceComparisonOperator != null -> = null
	   * Goal 20. Weak Mutation 260: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:240 - ReplaceConstant - 1 -> 0
	   * Goal 21. Weak Mutation 261: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:240 - ReplaceArithmeticOperator - -> +
	   * Goal 22. Weak Mutation 262: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:240 - ReplaceArithmeticOperator - -> %
	   * Goal 23. Weak Mutation 263: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:240 - ReplaceArithmeticOperator - -> *
	   * Goal 24. Weak Mutation 264: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:240 - ReplaceArithmeticOperator - -> /
	   * Goal 25. Weak Mutation 278: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:240 - ReplaceComparisonOperator >= -> -1
	   * Goal 26. Weak Mutation 306: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:248 - ReplaceConstant - -1 -> 0
	   * Goal 27. Weak Mutation 307: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:248 - ReplaceConstant - -1 -> 1
	   * Goal 28. Weak Mutation 308: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:248 - ReplaceConstant - -1 -> -2
	   */

	  @Test(timeout = 4000)
	  public void test75()  throws Throwable  {
	      ArrayListDemo<Object> arrayListDemo0 = new ArrayListDemo<Object>();
	      int int0 = arrayListDemo0.lastIndexOf((Object) null);
	      assertEquals((-1), int0);
	  }

	  //Test case number: 76
	  /*
	   * 31 covered goals:
	   * Goal 1. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 2. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 3. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I3 Branch 22 IFNONNULL L239 - true
	   * Goal 4. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I60 Branch 26 IFGE L244 - false
	   * Goal 5. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 6. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 7. Branch ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I3 Branch 22 IFNONNULL L239 - true in context: ArrayListDemo:lastIndexOf(Ljava/lang/Object;)I
	   * Goal 8. Branch ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: I60 Branch 26 IFGE L244 - false in context: ArrayListDemo:lastIndexOf(Ljava/lang/Object;)I
	   * Goal 9. [Output]: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:Negative
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 11. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 12. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 13. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 14. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 15. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: Line 239
	   * Goal 16. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: Line 244
	   * Goal 17. ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I: Line 248
	   * Goal 18. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 19. [METHOD] ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I
	   * Goal 20. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 21. [METHODNOEX] ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I
	   * Goal 22. Weak Mutation 255: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:239 - ReplaceComparisonOperator != null -> = null
	   * Goal 23. Weak Mutation 285: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:244 - ReplaceConstant - 1 -> 0
	   * Goal 24. Weak Mutation 286: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:244 - ReplaceArithmeticOperator - -> +
	   * Goal 25. Weak Mutation 287: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:244 - ReplaceArithmeticOperator - -> %
	   * Goal 26. Weak Mutation 288: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:244 - ReplaceArithmeticOperator - -> *
	   * Goal 27. Weak Mutation 289: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:244 - ReplaceArithmeticOperator - -> /
	   * Goal 28. Weak Mutation 303: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:244 - ReplaceComparisonOperator >= -> -1
	   * Goal 29. Weak Mutation 306: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:248 - ReplaceConstant - -1 -> 0
	   * Goal 30. Weak Mutation 307: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:248 - ReplaceConstant - -1 -> 1
	   * Goal 31. Weak Mutation 308: ArrayListDemo.lastIndexOf(Ljava/lang/Object;)I:248 - ReplaceConstant - -1 -> -2
	   */

	  @Test(timeout = 4000)
	  public void test76()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(0);
	      int int0 = arrayListDemo0.lastIndexOf(arrayListDemo0);
	      assertEquals((-1), int0);
	  }

	  //Test case number: 77
	  /*
	   * 157 covered goals:
	   * Goal 1. ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 4. ArrayListDemo.iterator()Ljava/util/Iterator;: root-Branch
	   * Goal 5. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: root-Branch
	   * Goal 6. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 7. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 8. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true
	   * Goal 9. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false
	   * Goal 10. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 11. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 12. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 13. ArrayListDemo.contains(Ljava/lang/Object;)Z: I5 Branch 16 IFLT L208 - true
	   * Goal 14. ArrayListDemo.indexOf(Ljava/lang/Object;)I: I3 Branch 17 IFNONNULL L219 - true
	   * Goal 15. ArrayListDemo.indexOf(Ljava/lang/Object;)I: I58 Branch 21 IF_ICMPLT L224 - true
	   * Goal 16. ArrayListDemo.indexOf(Ljava/lang/Object;)I: I58 Branch 21 IF_ICMPLT L224 - false
	   * Goal 17. ArrayListDemo.indexOf(Ljava/lang/Object;)I: I46 Branch 20 IFEQ L225 - true
	   * Goal 18. ArrayListDemo$Itr.hasNext()Z: I7 Branch 83 IF_ICMPEQ L758 - false
	   * Goal 19. ArrayListDemo$Itr.next()Ljava/lang/Object;: I15 Branch 84 IF_ICMPLT L765 - true
	   * Goal 20. ArrayListDemo$Itr.next()Ljava/lang/Object;: I33 Branch 85 IF_ICMPLT L768 - true
	   * Goal 21. ArrayListDemo$Itr.checkForComodification()V: I7 Branch 91 IF_ICMPEQ L812 - true
	   * Goal 22. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 23. Branch ArrayListDemo$Itr.<init>(LArrayListDemo;)V: root-Branch in context: 
	   * Goal 24. Branch ArrayListDemo.iterator()Ljava/util/Iterator;: root-Branch in context: ArrayListDemo:iterator()Ljava/util/Iterator;
	   * Goal 25. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 26. Branch ArrayListDemo.add(Ljava/lang/Object;)Z: root-Branch in context: ArrayListDemo:add(Ljava/lang/Object;)Z
	   * Goal 27. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 28. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 29. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true in context: 
	   * Goal 30. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - false in context: 
	   * Goal 31. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 32. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 33. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 34. Branch ArrayListDemo.contains(Ljava/lang/Object;)Z: I5 Branch 16 IFLT L208 - true in context: ArrayListDemo:contains(Ljava/lang/Object;)Z
	   * Goal 35. Branch ArrayListDemo$Itr.hasNext()Z: I7 Branch 83 IF_ICMPEQ L758 - false in context: 
	   * Goal 36. Branch ArrayListDemo$Itr.next()Ljava/lang/Object;: I15 Branch 84 IF_ICMPLT L765 - true in context: 
	   * Goal 37. Branch ArrayListDemo$Itr.next()Ljava/lang/Object;: I33 Branch 85 IF_ICMPLT L768 - true in context: 
	   * Goal 38. Branch ArrayListDemo$Itr.checkForComodification()V: I7 Branch 91 IF_ICMPEQ L812 - true in context: 
	   * Goal 39. [Output]: ArrayListDemo.add(Ljava/lang/Object;)Z:True
	   * Goal 40. ArrayListDemo.<init>()V: Line 67
	   * Goal 41. ArrayListDemo.<init>()V: Line 68
	   * Goal 42. ArrayListDemo.<init>()V: Line 69
	   * Goal 43. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 44. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 45. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 46. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 47. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 48. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 366
	   * Goal 49. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 367
	   * Goal 50. ArrayListDemo.add(Ljava/lang/Object;)Z: Line 368
	   * Goal 51. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 52. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 129
	   * Goal 53. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 131
	   * Goal 54. ArrayListDemo.contains(Ljava/lang/Object;)Z: Line 208
	   * Goal 55. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 56. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 57. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 58. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 59. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 60. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 61. ArrayListDemo.grow(I)V: Line 162
	   * Goal 62. ArrayListDemo.grow(I)V: Line 163
	   * Goal 63. ArrayListDemo.grow(I)V: Line 164
	   * Goal 64. ArrayListDemo.grow(I)V: Line 165
	   * Goal 65. ArrayListDemo.grow(I)V: Line 166
	   * Goal 66. ArrayListDemo.grow(I)V: Line 169
	   * Goal 67. ArrayListDemo.grow(I)V: Line 170
	   * Goal 68. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 219
	   * Goal 69. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 224
	   * Goal 70. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 225
	   * Goal 71. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 228
	   * Goal 72. ArrayListDemo.iterator()Ljava/util/Iterator;: Line 744
	   * Goal 73. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 752
	   * Goal 74. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 753
	   * Goal 75. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 755
	   * Goal 76. ArrayListDemo$Itr.checkForComodification()V: Line 812
	   * Goal 77. ArrayListDemo$Itr.checkForComodification()V: Line 814
	   * Goal 78. ArrayListDemo$Itr.hasNext()Z: Line 758
	   * Goal 79. ArrayListDemo$Itr.next()Ljava/lang/Object;: Line 763
	   * Goal 80. ArrayListDemo$Itr.next()Ljava/lang/Object;: Line 764
	   * Goal 81. ArrayListDemo$Itr.next()Ljava/lang/Object;: Line 765
	   * Goal 82. ArrayListDemo$Itr.next()Ljava/lang/Object;: Line 767
	   * Goal 83. ArrayListDemo$Itr.next()Ljava/lang/Object;: Line 768
	   * Goal 84. ArrayListDemo$Itr.next()Ljava/lang/Object;: Line 770
	   * Goal 85. ArrayListDemo$Itr.next()Ljava/lang/Object;: Line 771
	   * Goal 86. [METHOD] ArrayListDemo.<init>()V
	   * Goal 87. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 88. [METHOD] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 89. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 90. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 91. [METHODNOEX] ArrayListDemo.add(Ljava/lang/Object;)Z
	   * Goal 92. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 93. Weak Mutation 54: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 0
	   * Goal 94. Weak Mutation 55: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 1
	   * Goal 95. Weak Mutation 56: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> -1
	   * Goal 96. Weak Mutation 57: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 9
	   * Goal 97. Weak Mutation 58: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:129 - ReplaceConstant - 10 -> 11
	   * Goal 98. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 99. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 100. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 101. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 102. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 103. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 104. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 105. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 106. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 107. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 108. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 109. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 110. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 111. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 112. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 113. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 114. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 115. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 116. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 117. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 118. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 119. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 120. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 121. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 122. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 123. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   * Goal 124. Weak Mutation 204: ArrayListDemo.contains(Ljava/lang/Object;)Z:208 - ReplaceComparisonOperator < -> -2
	   * Goal 125. Weak Mutation 208: ArrayListDemo.contains(Ljava/lang/Object;)Z:208 - ReplaceConstant - 0 -> 1
	   * Goal 126. Weak Mutation 209: ArrayListDemo.indexOf(Ljava/lang/Object;)I:219 - ReplaceComparisonOperator != null -> = null
	   * Goal 127. Weak Mutation 231: ArrayListDemo.indexOf(Ljava/lang/Object;)I:224 - ReplaceConstant - 0 -> 1
	   * Goal 128. Weak Mutation 250: ArrayListDemo.indexOf(Ljava/lang/Object;)I:224 - ReplaceComparisonOperator < -> -2
	   * Goal 129. Weak Mutation 251: ArrayListDemo.indexOf(Ljava/lang/Object;)I:224 - ReplaceComparisonOperator < -> <=
	   * Goal 130. Weak Mutation 236: ArrayListDemo.indexOf(Ljava/lang/Object;)I:225 - ReplaceComparisonOperator == -> !=
	   * Goal 131. Weak Mutation 252: ArrayListDemo.indexOf(Ljava/lang/Object;)I:228 - ReplaceConstant - -1 -> 0
	   * Goal 132. Weak Mutation 253: ArrayListDemo.indexOf(Ljava/lang/Object;)I:228 - ReplaceConstant - -1 -> 1
	   * Goal 133. Weak Mutation 254: ArrayListDemo.indexOf(Ljava/lang/Object;)I:228 - ReplaceConstant - -1 -> -2
	   * Goal 134. Weak Mutation 385: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceConstant - 1 -> 0
	   * Goal 135. Weak Mutation 386: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> %
	   * Goal 136. Weak Mutation 387: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> -
	   * Goal 137. Weak Mutation 388: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> *
	   * Goal 138. Weak Mutation 389: ArrayListDemo.add(Ljava/lang/Object;)Z:366 - ReplaceArithmeticOperator + -> /
	   * Goal 139. Weak Mutation 394: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceConstant - 1 -> 0
	   * Goal 140. Weak Mutation 395: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> %
	   * Goal 141. Weak Mutation 396: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> -
	   * Goal 142. Weak Mutation 397: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> *
	   * Goal 143. Weak Mutation 398: ArrayListDemo.add(Ljava/lang/Object;)Z:367 - ReplaceArithmeticOperator + -> /
	   * Goal 144. Weak Mutation 399: ArrayListDemo.add(Ljava/lang/Object;)Z:368 - ReplaceConstant - 1 -> 0
	   * Goal 145. Weak Mutation 1675: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> 0
	   * Goal 146. Weak Mutation 1676: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> 1
	   * Goal 147. Weak Mutation 1677: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> -2
	   * Goal 148. Weak Mutation 1688: ArrayListDemo$Itr.hasNext()Z:758 - ReplaceComparisonOperator == -> <=
	   * Goal 149. Weak Mutation 1689: ArrayListDemo$Itr.hasNext()Z:758 - ReplaceConstant - 1 -> 0
	   * Goal 150. Weak Mutation 1703: ArrayListDemo$Itr.next()Ljava/lang/Object;:765 - ReplaceComparisonOperator < -> -2
	   * Goal 151. Weak Mutation 1712: ArrayListDemo$Itr.next()Ljava/lang/Object;:768 - ReplaceComparisonOperator < -> -2
	   * Goal 152. Weak Mutation 1720: ArrayListDemo$Itr.next()Ljava/lang/Object;:770 - ReplaceConstant - 1 -> 0
	   * Goal 153. Weak Mutation 1721: ArrayListDemo$Itr.next()Ljava/lang/Object;:770 - ReplaceArithmeticOperator + -> %
	   * Goal 154. Weak Mutation 1722: ArrayListDemo$Itr.next()Ljava/lang/Object;:770 - ReplaceArithmeticOperator + -> -
	   * Goal 155. Weak Mutation 1723: ArrayListDemo$Itr.next()Ljava/lang/Object;:770 - ReplaceArithmeticOperator + -> *
	   * Goal 156. Weak Mutation 1724: ArrayListDemo$Itr.next()Ljava/lang/Object;:770 - ReplaceArithmeticOperator + -> /
	   * Goal 157. Weak Mutation 1850: ArrayListDemo$Itr.checkForComodification()V:812 - ReplaceComparisonOperator == -> -2
	   */

	  @Test(timeout = 4000)
	  public void test77()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>(0);
	      Integer integer0 = new Integer(0);
	      arrayListDemo0.add(integer0);
	      arrayListDemo1.add((Object) arrayListDemo0);
	      boolean boolean0 = arrayListDemo1.containsAll(arrayListDemo0);
	      assertEquals(1, arrayListDemo1.size());
	      assertFalse(boolean0);
	  }

	  //Test case number: 78
	  /*
	   * 24 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.indexOf(Ljava/lang/Object;)I: I3 Branch 17 IFNONNULL L219 - false
	   * Goal 3. ArrayListDemo.indexOf(Ljava/lang/Object;)I: I28 Branch 19 IF_ICMPLT L220 - false
	   * Goal 4. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 5. Branch ArrayListDemo.indexOf(Ljava/lang/Object;)I: I3 Branch 17 IFNONNULL L219 - false in context: ArrayListDemo:indexOf(Ljava/lang/Object;)I
	   * Goal 6. Branch ArrayListDemo.indexOf(Ljava/lang/Object;)I: I28 Branch 19 IF_ICMPLT L220 - false in context: ArrayListDemo:indexOf(Ljava/lang/Object;)I
	   * Goal 7. [Output]: ArrayListDemo.indexOf(Ljava/lang/Object;)I:Negative
	   * Goal 8. ArrayListDemo.<init>()V: Line 67
	   * Goal 9. ArrayListDemo.<init>()V: Line 68
	   * Goal 10. ArrayListDemo.<init>()V: Line 69
	   * Goal 11. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 219
	   * Goal 12. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 220
	   * Goal 13. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 223
	   * Goal 14. ArrayListDemo.indexOf(Ljava/lang/Object;)I: Line 228
	   * Goal 15. [METHOD] ArrayListDemo.<init>()V
	   * Goal 16. [METHOD] ArrayListDemo.indexOf(Ljava/lang/Object;)I
	   * Goal 17. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 18. [METHODNOEX] ArrayListDemo.indexOf(Ljava/lang/Object;)I
	   * Goal 19. Weak Mutation 209: ArrayListDemo.indexOf(Ljava/lang/Object;)I:219 - ReplaceComparisonOperator != null -> = null
	   * Goal 20. Weak Mutation 210: ArrayListDemo.indexOf(Ljava/lang/Object;)I:220 - ReplaceConstant - 0 -> 1
	   * Goal 21. Weak Mutation 230: ArrayListDemo.indexOf(Ljava/lang/Object;)I:220 - ReplaceComparisonOperator < -> <=
	   * Goal 22. Weak Mutation 252: ArrayListDemo.indexOf(Ljava/lang/Object;)I:228 - ReplaceConstant - -1 -> 0
	   * Goal 23. Weak Mutation 253: ArrayListDemo.indexOf(Ljava/lang/Object;)I:228 - ReplaceConstant - -1 -> 1
	   * Goal 24. Weak Mutation 254: ArrayListDemo.indexOf(Ljava/lang/Object;)I:228 - ReplaceConstant - -1 -> -2
	   */

	  @Test(timeout = 4000)
	  public void test78()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      int int0 = arrayListDemo0.indexOf((Object) null);
	      assertEquals((-1), int0);
	  }

	  //Test case number: 79
	  /*
	   * 15 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.isEmpty()Z: I4 Branch 15 IFNE L195 - false
	   * Goal 3. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 4. Branch ArrayListDemo.isEmpty()Z: I4 Branch 15 IFNE L195 - false in context: ArrayListDemo:isEmpty()Z
	   * Goal 5. [Output]: ArrayListDemo.isEmpty()Z:True
	   * Goal 6. ArrayListDemo.<init>()V: Line 67
	   * Goal 7. ArrayListDemo.<init>()V: Line 68
	   * Goal 8. ArrayListDemo.<init>()V: Line 69
	   * Goal 9. ArrayListDemo.isEmpty()Z: Line 195
	   * Goal 10. [METHOD] ArrayListDemo.<init>()V
	   * Goal 11. [METHOD] ArrayListDemo.isEmpty()Z
	   * Goal 12. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 13. [METHODNOEX] ArrayListDemo.isEmpty()Z
	   * Goal 14. Weak Mutation 199: ArrayListDemo.isEmpty()Z:195 - ReplaceComparisonOperator != -> -1
	   * Goal 15. Weak Mutation 202: ArrayListDemo.isEmpty()Z:195 - ReplaceConstant - 1 -> 0
	   */

	  @Test(timeout = 4000)
	  public void test79()  throws Throwable  {
	      ArrayListDemo<ArrayListDemo<Object>> arrayListDemo0 = new ArrayListDemo<ArrayListDemo<Object>>();
	      boolean boolean0 = arrayListDemo0.isEmpty();
	      assertTrue(boolean0);
	  }

	  //Test case number: 80
	  /*
	   * 21 covered goals:
	   * Goal 1. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 2. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - false
	   * Goal 3. ArrayListDemo.<init>(Ljava/util/Collection;)V: I25 Branch 4 IF_ACMPEQ L83 - true
	   * Goal 4. ArrayListDemo.isEmpty()Z: I4 Branch 15 IFNE L195 - true
	   * Goal 5. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - false in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 6. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I25 Branch 4 IF_ACMPEQ L83 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 7. Branch ArrayListDemo.isEmpty()Z: I4 Branch 15 IFNE L195 - true in context: ArrayListDemo:isEmpty()Z
	   * Goal 8. [Output]: ArrayListDemo.isEmpty()Z:False
	   * Goal 9. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 10. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 11. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 12. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 83
	   * Goal 13. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 14. ArrayListDemo.isEmpty()Z: Line 195
	   * Goal 15. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 16. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 17. [METHOD] ArrayListDemo.isEmpty()Z
	   * Goal 18. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 19. [METHODNOEX] ArrayListDemo.isEmpty()Z
	   * Goal 20. Weak Mutation 200: ArrayListDemo.isEmpty()Z:195 - ReplaceComparisonOperator != -> <
	   * Goal 21. Weak Mutation 203: ArrayListDemo.isEmpty()Z:195 - ReplaceConstant - 0 -> 1
	   */

	  @Test(timeout = 4000)
	  public void test80()  throws Throwable  {
	      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      Integer integer0 = new Integer(0);
	      linkedList0.add(integer0);
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(linkedList0);
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>(arrayListDemo0);
	      boolean boolean0 = arrayListDemo1.isEmpty();
	      assertEquals(1, arrayListDemo1.size());
	      assertFalse(boolean0);
	  }

	  //Test case number: 81
	  /*
	   * 58 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.ensureCapacityInternal(I)V: root-Branch
	   * Goal 3. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 4. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true
	   * Goal 5. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true
	   * Goal 6. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - true
	   * Goal 7. ArrayListDemo.addAll(Ljava/util/Collection;)Z: I39 Branch 37 IFEQ L490 - true
	   * Goal 8. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 9. Branch ArrayListDemo.ensureCapacityInternal(I)V: root-Branch in context: 
	   * Goal 10. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 11. Branch ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: I4 Branch 9 IF_ACMPNE L128 - true in context: 
	   * Goal 12. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - true in context: 
	   * Goal 13. Branch ArrayListDemo.addAll(Ljava/util/Collection;)Z: I39 Branch 37 IFEQ L490 - true in context: ArrayListDemo:addAll(Ljava/util/Collection;)Z
	   * Goal 14. [Output]: ArrayListDemo.addAll(Ljava/util/Collection;)Z:False
	   * Goal 15. ArrayListDemo.<init>()V: Line 67
	   * Goal 16. ArrayListDemo.<init>()V: Line 68
	   * Goal 17. ArrayListDemo.<init>()V: Line 69
	   * Goal 18. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 19. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 20. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 21. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 87
	   * Goal 22. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 23. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 485
	   * Goal 24. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 486
	   * Goal 25. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 487
	   * Goal 26. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 488
	   * Goal 27. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 489
	   * Goal 28. ArrayListDemo.addAll(Ljava/util/Collection;)Z: Line 490
	   * Goal 29. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 128
	   * Goal 30. ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I: Line 131
	   * Goal 31. ArrayListDemo.ensureCapacityInternal(I)V: Line 135
	   * Goal 32. ArrayListDemo.ensureCapacityInternal(I)V: Line 136
	   * Goal 33. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 34. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 35. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 36. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 37. [METHOD] ArrayListDemo.<init>()V
	   * Goal 38. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 39. [METHOD] ArrayListDemo.addAll(Ljava/util/Collection;)Z
	   * Goal 40. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 41. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 42. [METHODNOEX] ArrayListDemo.addAll(Ljava/util/Collection;)Z
	   * Goal 43. Weak Mutation 53: ArrayListDemo.calculateCapacity([Ljava/lang/Object;I)I:128 - ReplaceComparisonOperator != -> ==
	   * Goal 44. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 45. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 46. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 47. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 48. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 49. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 50. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 51. Weak Mutation 87: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> <
	   * Goal 52. Weak Mutation 663: ArrayListDemo.addAll(Ljava/util/Collection;)Z:487 - ReplaceArithmeticOperator + -> %
	   * Goal 53. Weak Mutation 666: ArrayListDemo.addAll(Ljava/util/Collection;)Z:487 - ReplaceArithmeticOperator + -> /
	   * Goal 54. Weak Mutation 668: ArrayListDemo.addAll(Ljava/util/Collection;)Z:488 - ReplaceConstant - 0 -> 1
	   * Goal 55. Weak Mutation 685: ArrayListDemo.addAll(Ljava/util/Collection;)Z:489 - ReplaceArithmeticOperator + -> %
	   * Goal 56. Weak Mutation 688: ArrayListDemo.addAll(Ljava/util/Collection;)Z:489 - ReplaceArithmeticOperator + -> /
	   * Goal 57. Weak Mutation 693: ArrayListDemo.addAll(Ljava/util/Collection;)Z:490 - ReplaceComparisonOperator == -> -2
	   * Goal 58. Weak Mutation 697: ArrayListDemo.addAll(Ljava/util/Collection;)Z:490 - ReplaceConstant - 0 -> 1
	   */

	  @Test(timeout = 4000)
	  public void test81()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      ArrayListDemo<Integer> arrayListDemo1 = new ArrayListDemo<Integer>(arrayListDemo0);
	      boolean boolean0 = arrayListDemo1.addAll((Collection<? extends Integer>) arrayListDemo0);
	      assertFalse(boolean0);
	      assertTrue(arrayListDemo1.isEmpty());
	  }

	  //Test case number: 82
	  /*
	   * 68 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.ensureCapacity(I)V: I5 Branch 7 IF_ACMPEQ L115 - true
	   * Goal 3. ArrayListDemo.ensureCapacity(I)V: I20 Branch 8 IF_ICMPLE L122 - false
	   * Goal 4. ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false
	   * Goal 5. ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false
	   * Goal 6. ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true
	   * Goal 7. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 8. Branch ArrayListDemo.ensureCapacity(I)V: I5 Branch 7 IF_ACMPEQ L115 - true in context: ArrayListDemo:ensureCapacity(I)V
	   * Goal 9. Branch ArrayListDemo.ensureCapacity(I)V: I20 Branch 8 IF_ICMPLE L122 - false in context: ArrayListDemo:ensureCapacity(I)V
	   * Goal 10. Branch ArrayListDemo.ensureExplicitCapacity(I)V: I15 Branch 10 IFLE L142 - false in context: 
	   * Goal 11. Branch ArrayListDemo.grow(I)V: I19 Branch 11 IFGE L164 - false in context: 
	   * Goal 12. Branch ArrayListDemo.grow(I)V: I29 Branch 12 IFLE L166 - true in context: 
	   * Goal 13. ArrayListDemo.<init>()V: Line 67
	   * Goal 14. ArrayListDemo.<init>()V: Line 68
	   * Goal 15. ArrayListDemo.<init>()V: Line 69
	   * Goal 16. ArrayListDemo.ensureCapacity(I)V: Line 115
	   * Goal 17. ArrayListDemo.ensureCapacity(I)V: Line 120
	   * Goal 18. ArrayListDemo.ensureCapacity(I)V: Line 122
	   * Goal 19. ArrayListDemo.ensureCapacity(I)V: Line 123
	   * Goal 20. ArrayListDemo.ensureCapacity(I)V: Line 125
	   * Goal 21. ArrayListDemo.ensureExplicitCapacity(I)V: Line 139
	   * Goal 22. ArrayListDemo.ensureExplicitCapacity(I)V: Line 142
	   * Goal 23. ArrayListDemo.ensureExplicitCapacity(I)V: Line 143
	   * Goal 24. ArrayListDemo.ensureExplicitCapacity(I)V: Line 144
	   * Goal 25. ArrayListDemo.grow(I)V: Line 162
	   * Goal 26. ArrayListDemo.grow(I)V: Line 163
	   * Goal 27. ArrayListDemo.grow(I)V: Line 164
	   * Goal 28. ArrayListDemo.grow(I)V: Line 165
	   * Goal 29. ArrayListDemo.grow(I)V: Line 166
	   * Goal 30. ArrayListDemo.grow(I)V: Line 169
	   * Goal 31. ArrayListDemo.grow(I)V: Line 170
	   * Goal 32. [METHOD] ArrayListDemo.<init>()V
	   * Goal 33. [METHOD] ArrayListDemo.ensureCapacity(I)V
	   * Goal 34. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 35. [METHODNOEX] ArrayListDemo.ensureCapacity(I)V
	   * Goal 36. Weak Mutation 28: ArrayListDemo.ensureCapacity(I)V:115 - ReplaceComparisonOperator == -> !=
	   * Goal 37. Weak Mutation 30: ArrayListDemo.ensureCapacity(I)V:120 - ReplaceConstant - 10 -> 0
	   * Goal 38. Weak Mutation 31: ArrayListDemo.ensureCapacity(I)V:120 - ReplaceConstant - 10 -> 1
	   * Goal 39. Weak Mutation 32: ArrayListDemo.ensureCapacity(I)V:120 - ReplaceConstant - 10 -> -1
	   * Goal 40. Weak Mutation 33: ArrayListDemo.ensureCapacity(I)V:120 - ReplaceConstant - 10 -> 9
	   * Goal 41. Weak Mutation 34: ArrayListDemo.ensureCapacity(I)V:120 - ReplaceConstant - 10 -> 11
	   * Goal 42. Weak Mutation 45: ArrayListDemo.ensureCapacity(I)V:122 - ReplaceComparisonOperator <= -> -1
	   * Goal 43. Weak Mutation 72: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceConstant - 1 -> 0
	   * Goal 44. Weak Mutation 73: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> %
	   * Goal 45. Weak Mutation 74: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> -
	   * Goal 46. Weak Mutation 75: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> *
	   * Goal 47. Weak Mutation 76: ArrayListDemo.ensureExplicitCapacity(I)V:139 - ReplaceArithmeticOperator + -> /
	   * Goal 48. Weak Mutation 82: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> %
	   * Goal 49. Weak Mutation 84: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceArithmeticOperator - -> /
	   * Goal 50. Weak Mutation 85: ArrayListDemo.ensureExplicitCapacity(I)V:142 - ReplaceComparisonOperator <= -> -1
	   * Goal 51. Weak Mutation 102: ArrayListDemo.grow(I)V:163 - ReplaceConstant - 1 -> 0
	   * Goal 52. Weak Mutation 105: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> %
	   * Goal 53. Weak Mutation 108: ArrayListDemo.grow(I)V:163 - ReplaceArithmeticOperator + -> /
	   * Goal 54. Weak Mutation 121: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> +
	   * Goal 55. Weak Mutation 122: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> %
	   * Goal 56. Weak Mutation 123: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> *
	   * Goal 57. Weak Mutation 124: ArrayListDemo.grow(I)V:164 - ReplaceArithmeticOperator - -> /
	   * Goal 58. Weak Mutation 125: ArrayListDemo.grow(I)V:164 - ReplaceComparisonOperator >= -> -1
	   * Goal 59. Weak Mutation 140: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 0
	   * Goal 60. Weak Mutation 141: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 1
	   * Goal 61. Weak Mutation 142: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> -1
	   * Goal 62. Weak Mutation 143: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483638
	   * Goal 63. Weak Mutation 144: ArrayListDemo.grow(I)V:166 - ReplaceConstant - 2147483639 -> 2147483640
	   * Goal 64. Weak Mutation 145: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> +
	   * Goal 65. Weak Mutation 146: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> %
	   * Goal 66. Weak Mutation 147: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> *
	   * Goal 67. Weak Mutation 148: ArrayListDemo.grow(I)V:166 - ReplaceArithmeticOperator - -> /
	   * Goal 68. Weak Mutation 150: ArrayListDemo.grow(I)V:166 - ReplaceComparisonOperator <= -> ==
	   */

	  @Test(timeout = 4000)
	  public void test82()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>();
	      arrayListDemo0.ensureCapacity(11);
	      assertEquals(0, arrayListDemo0.size());
	  }

	  //Test case number: 83
	  /*
	   * 24 covered goals:
	   * Goal 1. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 2. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 3. ArrayListDemo.ensureCapacity(I)V: I5 Branch 7 IF_ACMPEQ L115 - false
	   * Goal 4. ArrayListDemo.ensureCapacity(I)V: I20 Branch 8 IF_ICMPLE L122 - true
	   * Goal 5. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 6. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 7. Branch ArrayListDemo.ensureCapacity(I)V: I5 Branch 7 IF_ACMPEQ L115 - false in context: ArrayListDemo:ensureCapacity(I)V
	   * Goal 8. Branch ArrayListDemo.ensureCapacity(I)V: I20 Branch 8 IF_ICMPLE L122 - true in context: ArrayListDemo:ensureCapacity(I)V
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 11. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 12. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 13. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 14. ArrayListDemo.ensureCapacity(I)V: Line 115
	   * Goal 15. ArrayListDemo.ensureCapacity(I)V: Line 117
	   * Goal 16. ArrayListDemo.ensureCapacity(I)V: Line 122
	   * Goal 17. ArrayListDemo.ensureCapacity(I)V: Line 125
	   * Goal 18. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 19. [METHOD] ArrayListDemo.ensureCapacity(I)V
	   * Goal 20. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 21. [METHODNOEX] ArrayListDemo.ensureCapacity(I)V
	   * Goal 22. Weak Mutation 28: ArrayListDemo.ensureCapacity(I)V:115 - ReplaceComparisonOperator == -> !=
	   * Goal 23. Weak Mutation 29: ArrayListDemo.ensureCapacity(I)V:117 - ReplaceConstant - 0 -> 1
	   * Goal 24. Weak Mutation 46: ArrayListDemo.ensureCapacity(I)V:122 - ReplaceComparisonOperator <= -> <
	   */

	  @Test(timeout = 4000)
	  public void test83()  throws Throwable  {
	      ArrayListDemo<ArrayListDemo<String>> arrayListDemo0 = new ArrayListDemo<ArrayListDemo<String>>(0);
	      arrayListDemo0.ensureCapacity(0);
	      assertTrue(arrayListDemo0.isEmpty());
	  }

	  //Test case number: 84
	  /*
	   * 24 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.ensureCapacity(I)V: I5 Branch 7 IF_ACMPEQ L115 - true
	   * Goal 3. ArrayListDemo.ensureCapacity(I)V: I20 Branch 8 IF_ICMPLE L122 - true
	   * Goal 4. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 5. Branch ArrayListDemo.ensureCapacity(I)V: I5 Branch 7 IF_ACMPEQ L115 - true in context: ArrayListDemo:ensureCapacity(I)V
	   * Goal 6. Branch ArrayListDemo.ensureCapacity(I)V: I20 Branch 8 IF_ICMPLE L122 - true in context: ArrayListDemo:ensureCapacity(I)V
	   * Goal 7. ArrayListDemo.<init>()V: Line 67
	   * Goal 8. ArrayListDemo.<init>()V: Line 68
	   * Goal 9. ArrayListDemo.<init>()V: Line 69
	   * Goal 10. ArrayListDemo.ensureCapacity(I)V: Line 115
	   * Goal 11. ArrayListDemo.ensureCapacity(I)V: Line 120
	   * Goal 12. ArrayListDemo.ensureCapacity(I)V: Line 122
	   * Goal 13. ArrayListDemo.ensureCapacity(I)V: Line 125
	   * Goal 14. [METHOD] ArrayListDemo.<init>()V
	   * Goal 15. [METHOD] ArrayListDemo.ensureCapacity(I)V
	   * Goal 16. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 17. [METHODNOEX] ArrayListDemo.ensureCapacity(I)V
	   * Goal 18. Weak Mutation 28: ArrayListDemo.ensureCapacity(I)V:115 - ReplaceComparisonOperator == -> !=
	   * Goal 19. Weak Mutation 30: ArrayListDemo.ensureCapacity(I)V:120 - ReplaceConstant - 10 -> 0
	   * Goal 20. Weak Mutation 31: ArrayListDemo.ensureCapacity(I)V:120 - ReplaceConstant - 10 -> 1
	   * Goal 21. Weak Mutation 32: ArrayListDemo.ensureCapacity(I)V:120 - ReplaceConstant - 10 -> -1
	   * Goal 22. Weak Mutation 33: ArrayListDemo.ensureCapacity(I)V:120 - ReplaceConstant - 10 -> 9
	   * Goal 23. Weak Mutation 34: ArrayListDemo.ensureCapacity(I)V:120 - ReplaceConstant - 10 -> 11
	   * Goal 24. Weak Mutation 47: ArrayListDemo.ensureCapacity(I)V:122 - ReplaceComparisonOperator <= -> ==
	   */

	  @Test(timeout = 4000)
	  public void test84()  throws Throwable  {
	      ArrayListDemo<ArrayListDemo<Object>> arrayListDemo0 = new ArrayListDemo<ArrayListDemo<Object>>();
	      arrayListDemo0.ensureCapacity(0);
	      assertTrue(arrayListDemo0.isEmpty());
	  }

	  //Test case number: 85
	  /*
	   * 27 covered goals:
	   * Goal 1. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - false
	   * Goal 2. ArrayListDemo.trimToSize()V: I15 Branch 5 IF_ICMPGE L98 - false
	   * Goal 3. ArrayListDemo.trimToSize()V: I21 Branch 6 IFNE L99 - false
	   * Goal 4. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 5. Branch ArrayListDemo.trimToSize()V: I15 Branch 5 IF_ICMPGE L98 - false in context: ArrayListDemo:trimToSize()V
	   * Goal 6. Branch ArrayListDemo.trimToSize()V: I21 Branch 6 IFNE L99 - false in context: ArrayListDemo:trimToSize()V
	   * Goal 7. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 8. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 55
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 56
	   * Goal 11. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 12. ArrayListDemo.trimToSize()V: Line 97
	   * Goal 13. ArrayListDemo.trimToSize()V: Line 98
	   * Goal 14. ArrayListDemo.trimToSize()V: Line 99
	   * Goal 15. ArrayListDemo.trimToSize()V: Line 100
	   * Goal 16. ArrayListDemo.trimToSize()V: Line 105
	   * Goal 17. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 18. [METHOD] ArrayListDemo.trimToSize()V
	   * Goal 19. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 20. [METHODNOEX] ArrayListDemo.trimToSize()V
	   * Goal 21. Weak Mutation 3: ArrayListDemo.trimToSize()V:97 - ReplaceConstant - 1 -> 0
	   * Goal 22. Weak Mutation 4: ArrayListDemo.trimToSize()V:97 - ReplaceArithmeticOperator + -> %
	   * Goal 23. Weak Mutation 5: ArrayListDemo.trimToSize()V:97 - ReplaceArithmeticOperator + -> -
	   * Goal 24. Weak Mutation 6: ArrayListDemo.trimToSize()V:97 - ReplaceArithmeticOperator + -> *
	   * Goal 25. Weak Mutation 7: ArrayListDemo.trimToSize()V:97 - ReplaceArithmeticOperator + -> /
	   * Goal 26. Weak Mutation 12: ArrayListDemo.trimToSize()V:98 - ReplaceComparisonOperator >= -> -1
	   * Goal 27. Weak Mutation 19: ArrayListDemo.trimToSize()V:99 - ReplaceComparisonOperator != -> -1
	   */

	  @Test(timeout = 4000)
	  public void test85()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(1);
	      arrayListDemo0.trimToSize();
	      assertEquals(0, arrayListDemo0.size());
	  }

	  //Test case number: 86
	  /*
	   * 20 covered goals:
	   * Goal 1. ArrayListDemo.<init>()V: root-Branch
	   * Goal 2. ArrayListDemo.trimToSize()V: I15 Branch 5 IF_ICMPGE L98 - true
	   * Goal 3. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 4. Branch ArrayListDemo.trimToSize()V: I15 Branch 5 IF_ICMPGE L98 - true in context: ArrayListDemo:trimToSize()V
	   * Goal 5. ArrayListDemo.<init>()V: Line 67
	   * Goal 6. ArrayListDemo.<init>()V: Line 68
	   * Goal 7. ArrayListDemo.<init>()V: Line 69
	   * Goal 8. ArrayListDemo.trimToSize()V: Line 97
	   * Goal 9. ArrayListDemo.trimToSize()V: Line 98
	   * Goal 10. ArrayListDemo.trimToSize()V: Line 105
	   * Goal 11. [METHOD] ArrayListDemo.<init>()V
	   * Goal 12. [METHOD] ArrayListDemo.trimToSize()V
	   * Goal 13. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 14. [METHODNOEX] ArrayListDemo.trimToSize()V
	   * Goal 15. Weak Mutation 3: ArrayListDemo.trimToSize()V:97 - ReplaceConstant - 1 -> 0
	   * Goal 16. Weak Mutation 4: ArrayListDemo.trimToSize()V:97 - ReplaceArithmeticOperator + -> %
	   * Goal 17. Weak Mutation 5: ArrayListDemo.trimToSize()V:97 - ReplaceArithmeticOperator + -> -
	   * Goal 18. Weak Mutation 6: ArrayListDemo.trimToSize()V:97 - ReplaceArithmeticOperator + -> *
	   * Goal 19. Weak Mutation 7: ArrayListDemo.trimToSize()V:97 - ReplaceArithmeticOperator + -> /
	   * Goal 20. Weak Mutation 13: ArrayListDemo.trimToSize()V:98 - ReplaceComparisonOperator >= -> >
	   */

	  @Test(timeout = 4000)
	  public void test86()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      arrayListDemo0.trimToSize();
	      assertEquals(0, arrayListDemo0.size());
	  }

	  //Test case number: 87
	  /*
	   * 10 covered goals:
	   * Goal 1. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 2. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - true
	   * Goal 3. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 4. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 5. <init>(I)V_java.lang.IllegalArgumentException_EXPLICIT
	   * Goal 6. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 7. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 8. ArrayListDemo.<init>(I)V: Line 59
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 60
	   * Goal 10. [METHOD] ArrayListDemo.<init>(I)V
	   */

	  @Test(timeout = 4000)
	  public void test87()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = null;
	      try {
	        arrayListDemo0 = new ArrayListDemo<String>((-1));
	        fail("Expecting exception: IllegalArgumentException");
	      
	      } catch(IllegalArgumentException e) {
	         //
	         // Illegal Capacity: -1
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 88
	  /*
	   * 26 covered goals:
	   * Goal 1. ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: root-Branch
	   * Goal 2. ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;: root-Branch
	   * Goal 3. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 4. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 5. ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - false
	   * Goal 6. Branch ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;: root-Branch in context: ArrayListDemo:set(ILjava/lang/Object;)Ljava/lang/Object;
	   * Goal 7. Branch ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 9. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 10. Branch ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - false in context: 
	   * Goal 11. set(ILjava/lang/Object;)Ljava/lang/Object;_java.lang.IndexOutOfBoundsException_EXPLICIT
	   * Goal 12. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 13. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 14. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 15. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 16. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 17. ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: Line 578
	   * Goal 18. ArrayListDemo.rangeCheck(I)V: Line 560
	   * Goal 19. ArrayListDemo.rangeCheck(I)V: Line 561
	   * Goal 20. ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;: Line 352
	   * Goal 21. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 22. [METHOD] ArrayListDemo.set(ILjava/lang/Object;)Ljava/lang/Object;
	   * Goal 23. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 24. Weak Mutation 919: ArrayListDemo.rangeCheck(I)V:560 - ReplaceComparisonOperator < -> <=
	   * Goal 25. Weak Mutation 946: ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;:578 - ReplaceConstant - Index:  -> 
	   * Goal 26. Weak Mutation 951: ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;:578 - ReplaceConstant - , Size:  -> 
	   */

	  @Test(timeout = 4000)
	  public void test88()  throws Throwable  {
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.set(0, "");
	        fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // Index: 0, Size: 0
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 89
	  /*
	   * 28 covered goals:
	   * Goal 1. ArrayListDemo.get(I)Ljava/lang/Object;: root-Branch
	   * Goal 2. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 3. ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch
	   * Goal 4. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - false
	   * Goal 5. ArrayListDemo.<init>(Ljava/util/Collection;)V: I25 Branch 4 IF_ACMPEQ L83 - true
	   * Goal 6. ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - true
	   * Goal 7. Branch ArrayListDemo.elementData(I)Ljava/lang/Object;: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo.get(I)Ljava/lang/Object;: root-Branch in context: ArrayListDemo:get(I)Ljava/lang/Object;
	   * Goal 9. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - false in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 10. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I25 Branch 4 IF_ACMPEQ L83 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 11. Branch ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - true in context: 
	   * Goal 12. [Output]: ArrayListDemo.get(I)Ljava/lang/Object;:NonNull
	   * Goal 13. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 14. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 15. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 16. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 83
	   * Goal 17. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 18. ArrayListDemo.elementData(I)Ljava/lang/Object;: Line 326
	   * Goal 19. ArrayListDemo.get(I)Ljava/lang/Object;: Line 337
	   * Goal 20. ArrayListDemo.get(I)Ljava/lang/Object;: Line 339
	   * Goal 21. ArrayListDemo.rangeCheck(I)V: Line 560
	   * Goal 22. ArrayListDemo.rangeCheck(I)V: Line 562
	   * Goal 23. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 24. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 25. [METHOD] ArrayListDemo.get(I)Ljava/lang/Object;
	   * Goal 26. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 27. [METHODNOEX] ArrayListDemo.get(I)Ljava/lang/Object;
	   * Goal 28. Weak Mutation 918: ArrayListDemo.rangeCheck(I)V:560 - ReplaceComparisonOperator < -> -2
	   */

	  @Test(timeout = 4000)
	  public void test89()  throws Throwable  {
	      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      Integer integer0 = new Integer(0);
	      linkedList0.add(integer0);
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(linkedList0);
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>(arrayListDemo0);
	      arrayListDemo1.get(0);
	      assertEquals(1, arrayListDemo1.size());
	  }

	  //Test case number: 90
	  /*
	   * 26 covered goals:
	   * Goal 1. ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: root-Branch
	   * Goal 2. ArrayListDemo.get(I)Ljava/lang/Object;: root-Branch
	   * Goal 3. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 4. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true
	   * Goal 5. ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - false
	   * Goal 6. Branch ArrayListDemo.get(I)Ljava/lang/Object;: root-Branch in context: ArrayListDemo:get(I)Ljava/lang/Object;
	   * Goal 7. Branch ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: root-Branch in context: 
	   * Goal 8. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 9. Branch ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - false in context: 
	   * Goal 10. get(I)Ljava/lang/Object;_java.lang.IndexOutOfBoundsException_EXPLICIT
	   * Goal 11. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 12. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 13. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 14. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 87
	   * Goal 15. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 16. ArrayListDemo.get(I)Ljava/lang/Object;: Line 337
	   * Goal 17. ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: Line 578
	   * Goal 18. ArrayListDemo.rangeCheck(I)V: Line 560
	   * Goal 19. ArrayListDemo.rangeCheck(I)V: Line 561
	   * Goal 20. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 21. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 22. [METHOD] ArrayListDemo.get(I)Ljava/lang/Object;
	   * Goal 23. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 24. Weak Mutation 919: ArrayListDemo.rangeCheck(I)V:560 - ReplaceComparisonOperator < -> <=
	   * Goal 25. Weak Mutation 946: ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;:578 - ReplaceConstant - Index:  -> 
	   * Goal 26. Weak Mutation 951: ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;:578 - ReplaceConstant - , Size:  -> 
	   */

	  @Test(timeout = 4000)
	  public void test90()  throws Throwable  {
	      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>(linkedList0);
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>(arrayListDemo0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo1.get(0);
	        fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // Index: 0, Size: 0
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 91
	  /*
	   * 25 covered goals:
	   * Goal 1. ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 3. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 4. ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - false
	   * Goal 5. Branch ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: root-Branch in context: 
	   * Goal 6. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 7. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 8. Branch ArrayListDemo.rangeCheck(I)V: I5 Branch 41 IF_ICMPLT L560 - false in context: 
	   * Goal 9. remove(I)Ljava/lang/Object;_java.lang.IndexOutOfBoundsException_EXPLICIT
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 11. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 12. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 13. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 14. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 15. ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;: Line 578
	   * Goal 16. ArrayListDemo.rangeCheck(I)V: Line 560
	   * Goal 17. ArrayListDemo.rangeCheck(I)V: Line 561
	   * Goal 18. ArrayListDemo.remove(I)Ljava/lang/Object;: Line 400
	   * Goal 19. ArrayListDemo.remove(I)Ljava/lang/Object;: root-Branch
	   * Goal 20. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 21. [METHOD] ArrayListDemo.remove(I)Ljava/lang/Object;
	   * Goal 22. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 23. Weak Mutation 919: ArrayListDemo.rangeCheck(I)V:560 - ReplaceComparisonOperator < -> <=
	   * Goal 24. Weak Mutation 946: ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;:578 - ReplaceConstant - Index:  -> 
	   * Goal 25. Weak Mutation 951: ArrayListDemo.outOfBoundsMsg(I)Ljava/lang/String;:578 - ReplaceConstant - , Size:  -> 
	   */

	  @Test(timeout = 4000)
	  public void test91()  throws Throwable  {
	      ArrayListDemo<Object> arrayListDemo0 = new ArrayListDemo<Object>(0);
	      // Undeclared exception!
	      try { 
	        arrayListDemo0.remove(0);
	        fail("Expecting exception: IndexOutOfBoundsException");
	      
	      } catch(IndexOutOfBoundsException e) {
	         //
	         // Index: 0, Size: 0
	         //
	         verifyException("ArrayListDemo", e);
	      }
	  }

	  //Test case number: 92
	  /*
	   * 44 covered goals:
	   * Goal 1. ArrayListDemo.retainAll(Ljava/util/Collection;)Z: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 4. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 5. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I50 Branch 46 IF_ICMPLT L627 - false
	   * Goal 6. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I143 Branch 50 IF_ICMPEQ L633 - true
	   * Goal 7. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I175 Branch 51 IF_ICMPEQ L639 - true
	   * Goal 8. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 9. Branch ArrayListDemo.retainAll(Ljava/util/Collection;)Z: root-Branch in context: ArrayListDemo:retainAll(Ljava/util/Collection;)Z
	   * Goal 10. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 11. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 12. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I50 Branch 46 IF_ICMPLT L627 - false in context: 
	   * Goal 13. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I143 Branch 50 IF_ICMPEQ L633 - true in context: 
	   * Goal 14. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I175 Branch 51 IF_ICMPEQ L639 - true in context: 
	   * Goal 15. [Output]: ArrayListDemo.retainAll(Ljava/util/Collection;)Z:False
	   * Goal 16. ArrayListDemo.<init>()V: Line 67
	   * Goal 17. ArrayListDemo.<init>()V: Line 68
	   * Goal 18. ArrayListDemo.<init>()V: Line 69
	   * Goal 19. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 20. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 21. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 22. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 23. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 24. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 623
	   * Goal 25. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 624
	   * Goal 26. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 625
	   * Goal 27. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 627
	   * Goal 28. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 630
	   * Goal 29. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 633
	   * Goal 30. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 639
	   * Goal 31. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 648
	   * Goal 32. ArrayListDemo.retainAll(Ljava/util/Collection;)Z: Line 618
	   * Goal 33. ArrayListDemo.retainAll(Ljava/util/Collection;)Z: Line 619
	   * Goal 34. [METHOD] ArrayListDemo.<init>()V
	   * Goal 35. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 36. [METHOD] ArrayListDemo.retainAll(Ljava/util/Collection;)Z
	   * Goal 37. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 38. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 39. [METHODNOEX] ArrayListDemo.retainAll(Ljava/util/Collection;)Z
	   * Goal 40. Weak Mutation 957: ArrayListDemo.retainAll(Ljava/util/Collection;)Z:619 - ReplaceConstant - 1 -> 0
	   * Goal 41. Weak Mutation 958: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:624 - ReplaceConstant - 0 -> 1
	   * Goal 42. Weak Mutation 959: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:624 - ReplaceConstant - 0 -> 1
	   * Goal 43. Weak Mutation 960: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:625 - ReplaceConstant - 0 -> 1
	   * Goal 44. Weak Mutation 1000: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:627 - ReplaceComparisonOperator < -> <=
	   */

	  @Test(timeout = 4000)
	  public void test92()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      ArrayListDemo<ArrayListDemo<String>> arrayListDemo1 = new ArrayListDemo<ArrayListDemo<String>>(0);
	      boolean boolean0 = arrayListDemo1.retainAll(arrayListDemo0);
	      assertFalse(boolean0);
	  }

	  //Test case number: 93
	  /*
	   * 44 covered goals:
	   * Goal 1. ArrayListDemo.removeAll(Ljava/util/Collection;)Z: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 4. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 5. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I50 Branch 46 IF_ICMPLT L627 - false
	   * Goal 6. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I143 Branch 50 IF_ICMPEQ L633 - true
	   * Goal 7. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I175 Branch 51 IF_ICMPEQ L639 - true
	   * Goal 8. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 9. Branch ArrayListDemo.removeAll(Ljava/util/Collection;)Z: root-Branch in context: ArrayListDemo:removeAll(Ljava/util/Collection;)Z
	   * Goal 10. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 11. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 12. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I50 Branch 46 IF_ICMPLT L627 - false in context: 
	   * Goal 13. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I143 Branch 50 IF_ICMPEQ L633 - true in context: 
	   * Goal 14. Branch ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: I175 Branch 51 IF_ICMPEQ L639 - true in context: 
	   * Goal 15. [Output]: ArrayListDemo.removeAll(Ljava/util/Collection;)Z:False
	   * Goal 16. ArrayListDemo.<init>()V: Line 67
	   * Goal 17. ArrayListDemo.<init>()V: Line 68
	   * Goal 18. ArrayListDemo.<init>()V: Line 69
	   * Goal 19. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 20. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 21. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 22. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 23. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 24. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 623
	   * Goal 25. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 624
	   * Goal 26. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 625
	   * Goal 27. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 627
	   * Goal 28. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 630
	   * Goal 29. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 633
	   * Goal 30. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 639
	   * Goal 31. ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z: Line 648
	   * Goal 32. ArrayListDemo.removeAll(Ljava/util/Collection;)Z: Line 597
	   * Goal 33. ArrayListDemo.removeAll(Ljava/util/Collection;)Z: Line 598
	   * Goal 34. [METHOD] ArrayListDemo.<init>()V
	   * Goal 35. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 36. [METHOD] ArrayListDemo.removeAll(Ljava/util/Collection;)Z
	   * Goal 37. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 38. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 39. [METHODNOEX] ArrayListDemo.removeAll(Ljava/util/Collection;)Z
	   * Goal 40. Weak Mutation 956: ArrayListDemo.removeAll(Ljava/util/Collection;)Z:598 - ReplaceConstant - 0 -> 1
	   * Goal 41. Weak Mutation 958: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:624 - ReplaceConstant - 0 -> 1
	   * Goal 42. Weak Mutation 959: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:624 - ReplaceConstant - 0 -> 1
	   * Goal 43. Weak Mutation 960: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:625 - ReplaceConstant - 0 -> 1
	   * Goal 44. Weak Mutation 1000: ArrayListDemo.batchRemove(Ljava/util/Collection;Z)Z:627 - ReplaceComparisonOperator < -> <=
	   */

	  @Test(timeout = 4000)
	  public void test93()  throws Throwable  {
	      ArrayListDemo<Integer> arrayListDemo0 = new ArrayListDemo<Integer>();
	      ArrayListDemo<ArrayListDemo<String>> arrayListDemo1 = new ArrayListDemo<ArrayListDemo<String>>(0);
	      boolean boolean0 = arrayListDemo1.removeAll(arrayListDemo0);
	      assertFalse(boolean0);
	  }

	  //Test case number: 94
	  /*
	   * 17 covered goals:
	   * Goal 1. ArrayListDemo.size()I: root-Branch
	   * Goal 2. ArrayListDemo.toArray()[Ljava/lang/Object;: root-Branch
	   * Goal 3. ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true
	   * Goal 4. Branch ArrayListDemo.size()I: root-Branch in context: ArrayListDemo:size()I
	   * Goal 5. Branch ArrayListDemo.<init>(Ljava/util/Collection;)V: I18 Branch 3 IFEQ L81 - true in context: ArrayListDemo:<init>(Ljava/util/Collection;)V
	   * Goal 6. [Output]: ArrayListDemo.size()I:Zero
	   * Goal 7. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 79
	   * Goal 8. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 80
	   * Goal 9. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 81
	   * Goal 10. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 87
	   * Goal 11. ArrayListDemo.<init>(Ljava/util/Collection;)V: Line 88
	   * Goal 12. ArrayListDemo.size()I: Line 186
	   * Goal 13. ArrayListDemo.toArray()[Ljava/lang/Object;: Line 284
	   * Goal 14. [METHOD] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 15. [METHOD] ArrayListDemo.size()I
	   * Goal 16. [METHODNOEX] ArrayListDemo.<init>(Ljava/util/Collection;)V
	   * Goal 17. [METHODNOEX] ArrayListDemo.size()I
	   */

	  @Test(timeout = 4000)
	  public void test94()  throws Throwable  {
	      LinkedList<String> linkedList0 = new LinkedList<String>();
	      ArrayListDemo<String> arrayListDemo0 = new ArrayListDemo<String>(linkedList0);
	      ArrayListDemo<Object> arrayListDemo1 = new ArrayListDemo<Object>(arrayListDemo0);
	      int int0 = arrayListDemo1.size();
	      assertEquals(0, int0);
	  }

	  //Test case number: 95
	  /*
	   * 21 covered goals:
	   * Goal 1. ArrayListDemo.clone()Ljava/lang/Object;: root-Branch
	   * Goal 2. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 3. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 4. Branch ArrayListDemo.clone()Ljava/lang/Object;: root-Branch in context: ArrayListDemo:clone()Ljava/lang/Object;
	   * Goal 5. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 6. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 7. [Output]: ArrayListDemo.clone()Ljava/lang/Object;:NonNull
	   * Goal 8. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 9. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 10. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 11. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 12. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 13. ArrayListDemo.clone()Ljava/lang/Object;: Line 259
	   * Goal 14. ArrayListDemo.clone()Ljava/lang/Object;: Line 260
	   * Goal 15. ArrayListDemo.clone()Ljava/lang/Object;: Line 261
	   * Goal 16. ArrayListDemo.clone()Ljava/lang/Object;: Line 262
	   * Goal 17. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 18. [METHOD] ArrayListDemo.clone()Ljava/lang/Object;
	   * Goal 19. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 20. [METHODNOEX] ArrayListDemo.clone()Ljava/lang/Object;
	   * Goal 21. Weak Mutation 315: ArrayListDemo.clone()Ljava/lang/Object;:261 - ReplaceConstant - 0 -> 1
	   */

	  @Test(timeout = 4000)
	  public void test95()  throws Throwable  {
	      ArrayListDemo<Object> arrayListDemo0 = new ArrayListDemo<Object>(0);
	      ArrayListDemo arrayListDemo1 = (ArrayListDemo)arrayListDemo0.clone();
	      assertTrue(arrayListDemo1.isEmpty());
	  }

	  //Test case number: 96
	  /*
	   * 45 covered goals:
	   * Goal 1. ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V: root-Branch
	   * Goal 2. ArrayListDemo.subList(II)Ljava/util/List;: root-Branch
	   * Goal 3. ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true
	   * Goal 4. ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false
	   * Goal 5. ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true
	   * Goal 6. ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - true
	   * Goal 7. ArrayListDemo.subListRangeCheck(III)V: I39 Branch 61 IF_ICMPLE L917 - true
	   * Goal 8. Branch ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V: root-Branch in context: 
	   * Goal 9. Branch ArrayListDemo.subList(II)Ljava/util/List;: root-Branch in context: ArrayListDemo:subList(II)Ljava/util/List;
	   * Goal 10. Branch ArrayListDemo.<init>(I)V: I7 Branch 1 IFLE L54 - true in context: ArrayListDemo:<init>(I)V
	   * Goal 11. Branch ArrayListDemo.<init>(I)V: I19 Branch 2 IFNE L56 - false in context: ArrayListDemo:<init>(I)V
	   * Goal 12. Branch ArrayListDemo.subListRangeCheck(III)V: I3 Branch 59 IFGE L913 - true in context: 
	   * Goal 13. Branch ArrayListDemo.subListRangeCheck(III)V: I21 Branch 60 IF_ICMPLE L915 - true in context: 
	   * Goal 14. Branch ArrayListDemo.subListRangeCheck(III)V: I39 Branch 61 IF_ICMPLE L917 - true in context: 
	   * Goal 15. ArrayListDemo.<init>(I)V: Line 53
	   * Goal 16. ArrayListDemo.<init>(I)V: Line 54
	   * Goal 17. ArrayListDemo.<init>(I)V: Line 57
	   * Goal 18. ArrayListDemo.<init>(I)V: Line 58
	   * Goal 19. ArrayListDemo.<init>(I)V: Line 61
	   * Goal 20. ArrayListDemo.subList(II)Ljava/util/List;: Line 908
	   * Goal 21. ArrayListDemo.subList(II)Ljava/util/List;: Line 909
	   * Goal 22. ArrayListDemo.subListRangeCheck(III)V: Line 913
	   * Goal 23. ArrayListDemo.subListRangeCheck(III)V: Line 915
	   * Goal 24. ArrayListDemo.subListRangeCheck(III)V: Line 917
	   * Goal 25. ArrayListDemo.subListRangeCheck(III)V: Line 920
	   * Goal 26. ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V: Line 929
	   * Goal 27. ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V: Line 930
	   * Goal 28. ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V: Line 931
	   * Goal 29. ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V: Line 932
	   * Goal 30. ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V: Line 933
	   * Goal 31. ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V: Line 934
	   * Goal 32. ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V: Line 935
	   * Goal 33. ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V: Line 936
	   * Goal 34. [METHOD] ArrayListDemo.<init>(I)V
	   * Goal 35. [METHOD] ArrayListDemo.subList(II)Ljava/util/List;
	   * Goal 36. [METHODNOEX] ArrayListDemo.<init>(I)V
	   * Goal 37. [METHODNOEX] ArrayListDemo.subList(II)Ljava/util/List;
	   * Goal 38. Weak Mutation 1217: ArrayListDemo.subList(II)Ljava/util/List;:909 - ReplaceConstant - 0 -> 1
	   * Goal 39. Weak Mutation 1233: ArrayListDemo.subListRangeCheck(III)V:913 - ReplaceComparisonOperator >= -> >
	   * Goal 40. Weak Mutation 1251: ArrayListDemo.subListRangeCheck(III)V:915 - ReplaceComparisonOperator <= -> <
	   * Goal 41. Weak Mutation 1270: ArrayListDemo.subListRangeCheck(III)V:917 - ReplaceComparisonOperator <= -> <
	   * Goal 42. Weak Mutation 1874: ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V:933 - ReplaceArithmeticOperator + -> %
	   * Goal 43. Weak Mutation 1877: ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V:933 - ReplaceArithmeticOperator + -> /
	   * Goal 44. Weak Mutation 1893: ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V:934 - ReplaceArithmeticOperator - -> %
	   * Goal 45. Weak Mutation 1895: ArrayListDemo$SubList.<init>(LArrayListDemo;LAbstractListDemo;III)V:934 - ReplaceArithmeticOperator - -> /
	   */

	  @Test(timeout = 4000)
	  public void test96()  throws Throwable  {
	      ArrayListDemo<Object> arrayListDemo0 = new ArrayListDemo<Object>(0);
	      List<Object> list0 = arrayListDemo0.subList(0, 0);
	      assertTrue(list0.isEmpty());
	  }

	  //Test case number: 97
	  /*
	   * 27 covered goals:
	   * Goal 1. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: root-Branch
	   * Goal 2. ArrayListDemo.<init>()V: root-Branch
	   * Goal 3. ArrayListDemo.listIterator()Ljava/util/ListIterator;: root-Branch
	   * Goal 4. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: root-Branch
	   * Goal 5. Branch ArrayListDemo.<init>()V: root-Branch in context: ArrayListDemo:<init>()V
	   * Goal 6. Branch ArrayListDemo$Itr.<init>(LArrayListDemo;)V: root-Branch in context: 
	   * Goal 7. Branch ArrayListDemo.listIterator()Ljava/util/ListIterator;: root-Branch in context: ArrayListDemo:listIterator()Ljava/util/ListIterator;
	   * Goal 8. Branch ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: root-Branch in context: 
	   * Goal 9. ArrayListDemo.<init>()V: Line 67
	   * Goal 10. ArrayListDemo.<init>()V: Line 68
	   * Goal 11. ArrayListDemo.<init>()V: Line 69
	   * Goal 12. ArrayListDemo.listIterator()Ljava/util/ListIterator;: Line 733
	   * Goal 13. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 752
	   * Goal 14. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 753
	   * Goal 15. ArrayListDemo$Itr.<init>(LArrayListDemo;)V: Line 755
	   * Goal 16. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: Line 821
	   * Goal 17. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: Line 822
	   * Goal 18. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: Line 823
	   * Goal 19. ArrayListDemo$ListItr.<init>(LArrayListDemo;I)V: Line 824
	   * Goal 20. [METHOD] ArrayListDemo.<init>()V
	   * Goal 21. [METHOD] ArrayListDemo.listIterator()Ljava/util/ListIterator;
	   * Goal 22. [METHODNOEX] ArrayListDemo.<init>()V
	   * Goal 23. [METHODNOEX] ArrayListDemo.listIterator()Ljava/util/ListIterator;
	   * Goal 24. Weak Mutation 1202: ArrayListDemo.listIterator()Ljava/util/ListIterator;:733 - ReplaceConstant - 0 -> 1
	   * Goal 25. Weak Mutation 1675: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> 0
	   * Goal 26. Weak Mutation 1676: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> 1
	   * Goal 27. Weak Mutation 1677: ArrayListDemo$Itr.<init>(LArrayListDemo;)V:752 - ReplaceConstant - -1 -> -2
	   */

	  @Test(timeout = 4000)
	  public void test97()  throws Throwable  {
	      ArrayListDemo<ArrayListDemo<Object>> arrayListDemo0 = new ArrayListDemo<ArrayListDemo<Object>>();
	      ListIterator<ArrayListDemo<Object>> listIterator0 = arrayListDemo0.listIterator();
	      assertFalse(listIterator0.hasPrevious());
	  }
}
