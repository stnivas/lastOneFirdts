//package java.util;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class ArrayListTask extends ArrayList<Long>{
		static Scanner input=new Scanner(System.in);
	
//Question1
	public  ArrayList<String> createArrayList(){
	  ArrayList<String> listOne= new ArrayList<String>();
	  return listOne;
	}
	
//Question2
	public static ArrayList<String> addFiveString(String names[]){
	 ArrayList<String> listTwo= new ArrayList<String>();
		
			for(int run=0;run<names.length;run++){
				listTwo.add(names[run]);
			}
	 return  listTwo;
  }
//Question3
	public ArrayList<Integer> addFiveIntegers(int number[]){
	  ArrayList<Integer>listThird=new ArrayList<Integer>();
		
			for(int run=0;run<number.length ;run++){
				listThird.add(number[run]);
			}	
	return listThird;
		}
	
//Question4
	 public ArrayList <ArrayListTask> addCustomobjects(){
	   ArrayList<ArrayListTask > listFour=new ArrayList<>();
       ArrayListTask obj1=new ArrayListTask();
       ArrayListTask obj2=new ArrayListTask();
       listFour.add(obj1);
       listFour.add(obj2);
	 return  listFour;             
	}
	
//Question5
	public void addIntStringCustomObjects(int[] numbers, String []studentName){
	  ArrayList<Object> list=new ArrayList<Object>();
 	  
 	  		for(int run=0; run<numbers.length;run++){
 	     		list.add(numbers[run]);
 	        }
 	        
 	 	    for(int run=0; run<studentName.length;run++){
 	    		list.add(studentName[run]);
 	   		 }
 	   		  
 	  ArrayListTask obj1=new ArrayListTask();
 	  ArrayListTask obj2=new ArrayListTask();
      list.add(obj1);
      list.add(obj2);
      System.out.println("arraylist:"+list);
      int len=list.size();
      System.out.println("arraylist size"+len);
         }
//Question6      
	 public ArrayList<String> findIndex(ArrayList<String> listSix,String index){	
   	   int value= listSix.indexOf(index);
   	   System.out.println("index of given values:"+value);
   	   return listSix;
     }

//Question7
	public void stringIterator(ArrayList<String> arrayList){
      Iterator runs=arrayList.iterator();
  
			while(runs.hasNext()){
				System.out.println("list elements" +runs.next());
      	   }
	}
//Question8
	public  String printStringGivenIndex(ArrayList<String> list, int indexs){
            System.out.println("print the string  ="+list.get(indexs));	
	        System.out.println("arraylistSize="+list.size());
	        System.out.println("arraylist="+list);
	        return list.get(indexs);
	}
//Question9 	
    public int[] findIndexOfDuplicate(ArrayList<String> listNine, String dummy){
         return new int[]{listNine.indexOf(dummy), listNine.lastIndexOf(dummy)};
    }
//Question10        
	public ArrayList<String> addingSecondPosition(ArrayList<String> tenList,int position ,String addPosition){
	     tenList.add(position , addPosition);
	     return tenList;
	 }
//Question11  
	public int[] createSecondArrayList(ArrayList<String> oneList,int one,int two){
		
		List<String> listTwo=new ArrayList<String>();
		listTwo=oneList.subList(one,two);
        return new int[]{ oneList.size() , listTwo.size()};
    }
        

//Question 12     
	public ArrayList<String> createThirdListUseAboveList(ArrayList<String>addOne, ArrayList<String>addTwo){

        ArrayList<String> thirdList=new ArrayList<String>();
        thirdList.addAll(addOne);
	    thirdList.addAll(addTwo );
        return thirdList;
     }	
    
     
//Questionn 13
   
        public ArrayList<String>creatThirdList(ArrayList<String>listFirst, ArrayList<String>listSecond){

        ArrayList<String> thirdList=new ArrayList<String>();
        thirdList.addAll(listSecond);
	    thirdList.addAll(listFirst);
        return thirdList;
     	
     }
    
//Question14       
	public ArrayList<Double> removeecimalValue(Double[] first, int delete){
		ArrayList<Double> deleteList=new ArrayList<Double>();

	    	for(int run=0; run<first.length; run++){ 
	    
        		 
 	             	 deleteList.add(first[run]);         	 
	           		 System.out.println("REMOVED VALUE "+deleteList.remove(delete));
             		 System.out.println("arraylist con't removed because your giveing wrong input");
                }
         return deleteList;
	  }
	  
//Question15      
	public ArrayList<Double> removeForthDecimalValue(Double[]second, int position){
  	    ArrayList<Double> listAdd =new ArrayList<Double>();
			
			for(int run=0; run<second.length; run++){
	  			listAdd.add(second[run]);
	}
	    listAdd .remove(position);
        return listAdd ;
    }
//Question16
	public ArrayListTask  removeLongValue(Long[] third,int firstNumber,int secondNumber){
       ArrayListTask addlist=new ArrayListTask ();
       
       		for(int run=0; run<third.length;run++){
      		     addlist.add(third[run]);
      	    }
       addlist.removeRange(firstNumber,secondNumber);
       return addlist;
    }     
//Question17   
	public ArrayList<String> removeElementFromFirst(String[] firstValue,String[] secondValue){
   	   ArrayList<String> list= new ArrayList<String>();
       
       		for(int run=0; run<firstValue.length; run++){
        	    list.add(firstValue[run]);
            }
   
       ArrayList<String> listTwo = new ArrayList<String>();
   
   			 for(int run=0; run<secondValue.length; run++){
                  listTwo.add(secondValue[run]);
             }
       list.removeAll(listTwo);
       return list;
   }
    
//Question18
    public  ArrayList<String> removeValueNotPresent(String[] numOne,String[] numTwo){
   		ArrayList<String> firstList= new ArrayList<String>();
   		
              for(int run=0; run<numOne.length; run++){
                	 firstList.add(numOne[run]);
              }
        System.out.println("first ArrayList"+firstList);
        ArrayList<String> secondList= new ArrayList<String>();
              
              for(int run=0; run<numTwo.length; run++){
                    secondList.add(numTwo[run]);
 	           }
 	           
 	           
 	   System.out.println("first ArrayList"+secondList);
 	   firstList.retainAll(secondList);
 	   return firstList;
	}
//Question19
 	public  ArrayList<Long> removeAllLongValues(long [] big){
 		ArrayList<Long> listClear=new ArrayList<Long>();	
 		 
 		 	for(int run=0;run<big.length; run++){
            	  listClear.add(big[run]);
       	     }
      	 listClear.clear();
      	 return listClear;
     }
//Question20      	
     public ArrayList<String> checkList(String[] nameList, String[] check){
      	 ArrayList<String> last=new ArrayList<String>();
      	 
              for(int run=0; run<nameList.length; run++){
                   last.add(nameList[run]);
               }
       
          System.out.println( last.contains(check));
          return last;
     }
	public static void main(String[] args){
		 ArrayListTask obj=new ArrayListTask();
	     System.out.println("enter your choice");
	     int choice=input.nextInt();
	  
	switch (choice) {
	 
        case 1:
               ArrayList<String> listOne=obj. createArrayList();
			   System.out.println("ARRAYlIST "+listOne);
			   System.out.println("ARRAYlIST size "+listOne.size());
               System.out.println("successfully");
        break;
                
        case 2:
               System.out.println("enter the number of string you want too");
               int  count=input.nextInt();
               String[]names=new String[count];
               System.out.println("enter the " +count+" string");
               
		       		for(int run=0;run<count;run++){
		      			 System.out.println("enter any String");
		      		 	 names[run]=input.next();
                    }
               ArrayList<String> listTwo =obj.addFiveString(names);
               System.out.println("size of list"+listTwo. size());
	   	       System.out.println(" list="+listTwo);
               System.out.println("successfully");
         break;
              
        case 3:
               System.out.println("enter the number  of string you want too");
               count =input.nextInt();
               int number[]=new int[count];
               System.out.println("enter the " + count+ "number");
               
              	 for(int run=0;run<count;run++){
                	 System.out.println("enter any  number");
		           	 number[run]=input.nextInt();
                 }
                   ArrayList<Integer> listThird=obj.addFiveIntegers(number);
				   System.out.println("SIZE OF LIST=" +  listThird);
                   
				   
                   System.out.println("SIZE OF LIST" +  listThird.size());
                   System.out.println("successfully");
                break;
                
                case 4:
				     System.out.println("how much object you need to add list");
					 count= input.nextInt();
					 
					 
                     obj.addCustomobjects();
                    System.out.println(" successfully");
                break;
              
              
                case 5:
                     System.out.println("how much integers you need to add list");
                     count=input.nextInt();
                     int  numbers[] =new int[count];
                     System.out.println("enter the" + count+ "numbers");
                     for(int run=0; run<count;run++){
                     System.out.println("enter the number");
                     numbers[run]=input.nextInt();
                     }
                     System.out.println("how much string  you need to add list");
                      count=input.nextInt();
                       String studentName[] =new String[count];
                      for(int run=0; run<count; run++){
                      System.out.println("enter the name");
                      studentName[run]=input.next();
                      } 
       
                     obj.addIntStringCustomObjects(numbers, studentName);
                     System.out.println(" successfully");
                break;
              
              
                case 6:
                      System.out.println("how much string you need");
                      count=input.nextInt();
                      String animals[]=new String [count];
                      System.out.println("enter the " + count+"animalsName");
                      
                        for(int run=0; run<count; run++){
                         animals[run]=input.next();
                      }
                     System.out.println("enter the any one animalsName to find the index");
                        String index=input.next();
                      
                      ArrayList<String> listSix=addFiveString(animals);
                            obj.findIndex(listSix,index);
                      System.out.println(" successfully");
				   
				   System.out.println("arrayList:"+listSix);
   	                int len = listSix.size();
   	                System.out.println("arrayList size:"+len);
                 	
	
                break;
              
              
                case 7:
				     System.out.println("how much value  you need to add arrayList");
				       count=input.nextInt();
				       String name[]=new String[count];
				       System.out.println("enter the"+ count +"name");
				     	  for(int run=0; run<count;run++){
				     	   name[run]=input.next();
				     	   }
				     	   ArrayList<String> arrayList =addFiveString(name);
                          obj.stringIterator(arrayList);
				  // System.out.println("arraylist="+list);
                   System.out.println(" successfully");
                break;
              
              
                case 8:
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String adding[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      adding[run]=input.next();
                      }
				  System.out.println("please enter the index");
	             	int indexs=input.nextInt();
	             	ArrayList<String> arrayListFirst=addFiveString(adding);
                    String result =obj.printStringGivenIndex(arrayListFirst,indexs);
                    System.out.println("arrayList index"+result);
                   System.out.println(" successfully");
                break;
              
              
                case 9:
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String duplicate[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      duplicate[run]=input.next();
                      }
                      
                      System.out.println("enter the  duplicate values");
                      String dummy=input.next();
                      System.out.println("enter the correct values");  
                      
                      ArrayList<String> listNine=addFiveString(duplicate);    
                   int[] answer = obj.findIndexOfDuplicate(listNine , dummy);
                   System.out.println(answer[0] + " " + answer[1]);
                   System.out.println(" successfully");
                break;
              
              
                case 10:
				    
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String added[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      added[run]=input.next();
				
					  }
					  System.out.println("enter the position");
					  int position=input.nextInt();
					  System.out.println("enter the string add list");
					  String  addPosition=input.next();
					  ArrayList<String> tenList=addFiveString(added);
                   ArrayList<String> listTen=obj.addingSecondPosition(tenList, position,addPosition);
                   System.out.println("size of list" +listTen.size());
                   System.out.println("arrayList" + listTen);
                   System.out.println(" successfully");
                break;
 
                case 11:
				      System.out.println("enter the minimum 10 string ");
                      count=input.nextInt();
                      String value[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      value[run]=input.next();
				
					  }
					  int one = 0, two = 0;
					 try{ System.out.println("enter the start index");
					  one=input.nextInt();
					  System.out.println("enter the end Index");
					  two=input.nextInt();
					  }
					  catch(ArrayIndexOutOfBoundsException e){
					  System.out.println("enter the index properly");
					  }
					  ArrayList<String> oneList=addFiveString(value);
                      int[]find = obj.createSecondArrayList(oneList,one,two);
                 
                   System.out.println("arrayList size"+find[0]);
                   System.out.println("arrayList size"+find[1]);
                   System.out.println(" successfully");
                break;
              
             
               case 12:
				
				  
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String valueOne[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      valueOne[run]=input.next();
				
					  }	  
				      System.out.println("how much string you need to be list two");
                      count=input.nextInt();
                      String valueTwo[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      valueTwo[run]=input.next();
				
					  }
					  
					ArrayList<String> addOne=createSecondArrayList(valueOne);
					ArrayList<String> addTwo=createSecondArrayList(valueTwo);
					 
                 ArrayList<String> listThree= obj.createThirdArrayList(addOne,addTwo);
                 System.out.println("array third list"+listThree.size());
                 System.out.println("array third list"+listThree);
                 
                   System.out.println(" successfully");
                break;
              
              
               case 13:
				
				
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String one[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      one[run]=input.next();
				
					  }	  
				      System.out.println("how much string you need list two");
                      count=input.nextInt();
                      String two[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0; run<count; run++){
                      two[run]=input.next();
				
					  }
					    
					 ArrayList<String> listFirst=createSecondArrayList(one);
					ArrayList<String> ListSecond=createSecondArrayList(two);
                 ArrayList<String> thirdList = obj.createThirdListUseAboveList(listFirst,listSecond);
                 
                   System.out.println("third arrayList size"+ thirdList.size());
                   System.out.println("third arrayList size"+ thirdList);
                   System.out.println(" successfully");
                break;
             
              
                case 14:
				
				
				      System.out.println("how much decimal value you need");
                      count=input.nextInt();
                     Double first[]=new Double [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      first[run]=input.nextDouble();
					  }
					  System.out.println("enter the delete index");
					  
					  int delete=input.nextInt();
					  
                       ArrayList<Double> deleteList =obj.removeecimalValue(first, delete);
                       System.out.println("ArrayList"+deleteList.size());
                       System.out.println("ArrayList"+deleteList);
                       System.out.println(" successfully");
                break;
              
              
                case 15:
				
				      System.out.println("please enter the minimun 5 decimal values");
                      count=input.nextInt();
                      Double second[]=new Double [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      second[run]=input.nextDouble() ; 
					  }
					  
					  System.out.println("enter the position you want remova list");
					   position=input.nextInt();
					
					  
                   ArrayList<Double> listAdd =obj.removeForthDecimalValue(second,position);
                    System.out.println("arrayList="+listAdd);
      
                    System.out.println("size of arrayList="+listAdd.size());
                   System.out.println(" successfully");
                break;
              
              
                case 16:
				
				      System.out.println("how much decimal value you need");
                      count=input.nextInt();
                      Long third[]=new  Long [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      third[run]=input.nextLong() ; 
					  }
					  System.out.println("enter the start value of remove");
					   int firstNumber=input.nextInt();
					  System.out.println("enter the end value of remove");
					  int  secondNumber=input.nextInt();
                 ArrayList<Long> addList = obj.removeLongValue(third,firstNumber,secondNumber);
                 
               System.out.println("Arraylist size"+addList.size());
               System.out.println("Arraylist"+addList);
                   System.out.println(" successfully");
                break;
              
              
                case 17:
								
				      System.out.println(" Enter the number of values : ");
                      count=input.nextInt();
                      String firstValue[]=new  String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      firstValue[run]=input.next() ; 
					  }
					  System.out.println("how much decimal value you need list two");
                      count=input.nextInt();
                      String secondValue[]=new String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      secondValue[run]=input.next() ; 
					  }
				
  			ArrayList<String> list=	 obj.removeElementFromFirst(firstValue,secondValue);
			     len=list.size();
				System.out.println("arraylist ="+list);
				System.out.println("arraylist size="+len);
				 
                   System.out.println(" successfully");
                break;
              
              
                case 18:
							
				      System.out.println(" Enter the number of values : ");
                      count=input.nextInt();
                      String numOne[]=new  String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      numOne[run]=input.next() ; 
					  }
					  System.out.println("Enter the number of values you need to add list two ");
                      count=input.nextInt();
                      String numTwo[]=new String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      numTwo[run]=input.next() ; 
					  }
                  ArrayList<String> firstList= obj.removeValueNotPresent(numOne, numTwo);
                  System.out.println(" first ArrayList"+ firstList);
                  System.out.println("first ArrayList"+firstList.size());
                  
                   System.out.println(" successfully");
                break;
              
              
                case 19:
                 	System.out.println("how much number you add to list");
                 	count=input.nextInt();
                 	long[] big=new long[count];
                 	System.out.println("enter the" +count+" number");
                 	for(int run=0;run<count; run++){
                 	big[run]=input.nextLong();
                }
                
               ArrayList<Long> listClear= obj.removeAllLongValues(big);
               System.out.println("arrayList"+  listClear);
            
               System.out.println("arrayList size "+listClear.size());
                   System.out.println(" successfully");
          
                break;
                
                case 20:
                    	System.out.println("enter the string you need");
                       	count=input.nextInt();  
                        String[] nameList=new String[count];
                        System.out.println("enter the "+ count+ "string");
                        for(int run=0;run<count; run++){
                             nameList[run]=input.next();
                             }
                             
         
         
                    	System.out.println("enter the string you need to check");
                       	count=input.nextInt();  
                        String[] check=new String[count];
                        System.out.println("enter the "+ count+ "string");
                        for(int run=0;run<count; run++){
                             check[run]=input.next();
                         }           
                      ArrayList<String> last =obj.checkList(nameList, check);
                         
                    
                      System.out.println("size of arraylist"+last.size());
                     System.out.println("arraylist"+last);
                
                break;
                
           }      
	    }
	}
	
	
	
	
	
