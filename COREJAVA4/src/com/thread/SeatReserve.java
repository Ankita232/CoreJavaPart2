package com.thread;

class Reservation{
	static int availableSeats=10;
	 void reserveSeat(int requestedSeats)
	{
		System.out.println(Thread.currentThread().getName()+" Entered");
		System.out.println("Available: "+availableSeats+"Requestedseats: "+requestedSeats);
		if(availableSeats>=requestedSeats){
			System.out.println("Seat Avlaibale.reserve now:)");
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println("thread interrupted");
			}
			System.out.println(requestedSeats +" seats Reserved");
			availableSeats=availableSeats-requestedSeats;
		}
		else {
			System.out.println("Requested Seats not available");
			System.out.println(Thread.currentThread().getName()+" leaving");
			System.out.println("--------------------------------");
			}
	class Person extends Thread
		{
			Reservation reserve;
			int requestedSeats;
			public Person(Reservation reserve, int requestedSeats) {
				this.reserve=reserve;
				this.requestedSeats=requestedSeats;
			}
			public void run() {
				reserve.reserveSeat(requestedSeats);
			}
			
		}
 class SeatReservation1{

			public static void main(String[]args) {
				Reservation reserve=new Reservation();
//				Person thread1=new Person(reserve, 5);
//				thread1.start();
//				Person thread2=new Person(reserve, 4);
//				thread2.start();
//				Person thread3=new Person(reserve, 2);
//				thread3.start();
			}
		}


			
		
			
		

		
	}
}


