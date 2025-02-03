public class zeroTres {
    /**
     Which APIs exist for creating or working with virtual threads? (Choose all that apply.)

     Executors.newVirtualThread()
     -- Executors.newVirtualThreadExecutor() --
     -- Executors.newVirtualThreadPerTaskExecutor() --
     new VirtualThread()
     -- Thread.ofVirtual() --
     Thread.ofVirtualThread()


     [Executors.newVirtualThreadExecutor()]
     - it use virtual threads to execute task. Virtual threads are much lighter than platform threads,
     you can use many of then withoug running into the overhead and scalability limits of tradicional thread pools.
     {Use case}: This executor is suitable when you need to execute many tasks concurrently,
     but each task doesn’t need to be bound to a specific physical thread. Virtual threads are managed by the Java
     runtime, which allows for efficient creation and scheduling of thousands or even millions of threads.

     [Executors.newVirtualThreadPerTaskExecutor()]
     - This method creates an executor service where each task that is submitted will be executed on
     a separate virtual thread.
     {Use case}: This is useful when you want each task to run independently on its own virtual thread,
     without sharing a thread with other tasks. This is ideal for workloads where tasks are independent
     and require isolation in terms of execution.

     [Thread.ofVirtual()]
     - This method is used to create a virtual thread directly. It is part of the Thread API, but instead of
     creating a traditional operating system thread, it creates a virtual thread, which is lightweight and
     managed by the Java runtime.
     {Use case}: This is used when you want to create and manage virtual threads manually, outside an executor.
     For example, you may want to configure a specific virtual thread, or run a task asynchronously on a virtual
     thread without using an executor service.

     */


}
