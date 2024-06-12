import java.util.concurrent.*;

class Task implements Runnable
{
	private String name;
	public Task(String s)
	{
		name = s;
	}
	 public void run()
	 {
		try
		{
			for(int i = 1; i < 5; i++)
			{
				System.out.println(name + " - task number -"+i);
				Thread.sleep(1000);
			}
			System.out.println(name + "Complete");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	 }
}


public class ExecutorThreadDemo
{
	public static void main(String[] args)
	{
		Runnable r1 = new Task("Task 1");
		Runnable r2 = new Task("Task 2");
		Runnable r3 = new Task("Task 3");
		Runnable r4 = new Task("Task 4");
		Runnable r5 = new Task("Task 5");
		ExecutorService pool = 
		Executors.newFixedThreadPool(3);
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
	}
}