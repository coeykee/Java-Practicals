//Queue implementation

import java.util.*;

class Queue{
int MAX;
int FRONT=0;
int REAR=0;
	Queue(int m){
	MAX=m;
	}
int Q[]=new int[MAX] ;

	void push(int e){
		int temp=e;
		if(REAR>MAX){
		System.out.println("Reached END! Can't push (-_-)");
		}
		else{
		Q[REAR]=temp;
		REAR++;
		}
	}//push end

	void pop(){
		if(FRONT>REAR){System.out.println("Nothings their! Can't pop");}
		else{
		FRONT++;
		}
	}//popends

	void displayQ(){
		System.out.println("Queue content:");
			for(int i=FRONT;i<REAR;i++){
				System.out.println(" "+Q[i]);
			}
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter Queue size:");
			Queue q=new Queue(sc.nextInt());
		System.out.println("Enter choice:# 1.Display 2.Push 3.Pop 4.Exit");
		int choice=0;
		while(choice!=4){
			System.out.println("#");
			choice=sc.nextInt();
				switch(choice){
					case 1:{
						q.displayQ();
						break;
						}	
					case 2:{
						System.out.println("Enter Element:");
						q.push(sc.nextInt());
						break;
						}
					case 3:{
						q.pop();
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


