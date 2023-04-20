// Made By Damian Sclafani
package CSCE145AND146;

public class ProcessScheduler {
    
    private QueueI<Process> processes;
	private Process currentProcess;
	
	public ProcessScheduler()
	{
		init();
	}
	private void init()
	{
		processes = new LLQueue<Process>();
		currentProcess = null;
	}
	
	public Process getCurrentProcess()
	{
		return currentProcess;
	}
	public void addProcess(Process aName)
	{
		if(currentProcess == null)
		{
			currentProcess = aName;
		}
		else
		{
			processes.enqueue(aName);
		}
	}
	public void printProcessQueue()
	{
		processes.print();
	}
	public void runNextProcess()
	{
		currentProcess = processes.peek();
		processes.dequeue();
	}
	public void cancelCurrentProcess()
	{
		Process temp = currentProcess;
		currentProcess = processes.peek();
		processes.enqueue(temp);
	}
}
