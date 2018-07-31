//Queue implementation

import java.util.*;

class Queue{
int SIZE=5;
//void size(int s){
	//	SIZE=s;}
int Q[]=new int[SIZE];
int MAX;
int FRONT;
int REAR;
int temp;



	void enqueue(int e){
		temp=e;
		if(REAR>MAX){
		System.out.println("Reached END! Can't enqueue");
		}
		else{
		Q[REAR+1]=temp;
		System.out.println(temp+" ENQUEUED!");
		REAR++;
		}
	}//enqueue end

	void dequeue(){
		if(FRONT>REAR){System.out.println("Nothing in Queue, Can't dequeue!");}
		else{
		System.out.println(Q[FRONT]+" DEQUEUED!");
		FRONT++;
		}
	}//dequeue end

	void displayQ(){
		System.out.println("Queue content:");
			for(int i=FRONT;i<REAR;i++){
				System.out.println(" "+Q[i]);
			}
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			Queue q=new Queue();
		//System.out.println("Enter Queue size:");
		//	q.size(sc.nextInt());
		System.out.println("Enter choice:# 1.Display 2.Push 3.Pop 4.Exit");
		int choice=0;
		while(choice!=4){
			System.out.print("#");
			choice=sc.nextInt();
				switch(choice){
					case 1:{
						q.displayQ();
						break;
						}	
					case 2:{
						System.out.println("Enter Element:");
						q.enqueue(sc.nextInt());
						break;
						}
					case 3:{
						q.dequeue();
						break;
						}
					case 4:{
						break;
						}
					default:{System.out.println("Invalid Choice!");}

				}
			}



	}

}//Class End


