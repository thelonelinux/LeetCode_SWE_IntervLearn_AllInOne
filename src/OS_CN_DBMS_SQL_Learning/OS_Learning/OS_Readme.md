# OPERATING SYSTEM (OS)
* Includes learning related to OS
* NOTE - OS Notes, after long time will not be useful. For quick revision you can check interview pdf. but understanding properly YT is required.
* After a long period of learning to understand you must first watch YT, and then Topics notes added here.
* For revision only, you can peek into interview and here fast topic notes added below.


## ABOUT NOTES ADDED IN THIS REPO FOR OS
* 1. Booting_MyNotes_OS.pdf
  * Learn this for understanding booting process in OS. You can entirely follow this. Good notes
  * This note is self prepared by me.
* 2. MemoryMgmt_MyNotes_OS.pdf
  * Self made notes. 
  * You can although check it once. But more about memory management topic is already present in this readme file in below lines. That is good already.
* 3. OS_InterviewBit_Questions.pdf
  * Scaler/Interviewbit interview related pdf.
  * Once you able to give all the questions answers then you are prepared completely for OS interview. 
  * Must complete this pdf all the questions to check if any concept you don't know or missed.
* 4. YutubeNote_OS_Functions_Methodologies_Intro.pdf
  * Can be ignored, but read once.
* 5. YutubeNote_OS_Process_ProcessManagement_Part2.pdf
  * Can be ignored, but read once.


## WAY TO LEARN
* If revision then interviewbit pdf is fine and some notes below is fine. 
* If you learn after a long time, to re-install the concepts you have to do Youtube learning for main concepts.
* during interview better learn important chapters. Very high level side questions you might be not able to answer then no worries.


## OS LEARNING
### INTERVIEW QUESTIONS
* OS Interviewbit questions - Pdf attached. Now you should be able to answer most of questions after below learning and understanding
* https://www.interviewbit.com/operating-system-interview-questions/
* Scaler OS learning - Just in case you want more learning then. else the below learning you have done is enough
* https://www.scaler.com/topics/operating-system/


## MY TOPICS WISE OS LEARNING AND ARRANGEMENTS (INDEX OF OS - LEARNING TOPIC WISE) - FOLLOWING GFG TOPICWISE
* MY LEARNING AND INFORMATION ABOUT THIS LEARNING
  * Precise idea of topicwise learning you can check here (index is there in this page) - https://www.geeksforgeeks.org/operating-systems/ 
  * We are following heading topics of this geeksforgeeks sequence wise only
  * MOTIVE OF THIS LEARNING - You should learn things such that you can explain to your interviewer like you are teaching them that topic. That level of knowledge you should have.

### 0. EXTRAS TOPICS (Probably comes in OS Basics)
#### Boot Process, Booting, BIOS, Bootstrap Loader (BootLoader)
* This topic is added in your notes in old notebook only.

### 1. OS BASICS (TO LEARN FROM EITHER GFG OR YT OR INTERVIEWBIT PDF - YOU CAN LEARN LATER DURING INTERVIEW ALSO - DON'T WORRY. MAIN TOPCIS DONE)
* 1. INTRO
  * What is Operating System?
  * Functions of Operating Systems
* 2. Types of Operating Systems
  * Batch Processing Operating System
  * Multiprogramming in Operating System
  * Time Sharing Operating System
  * What is Network Operating System
  * Real Time Operating System (RTOS)
  * Need and Functions of Operating Systems
  * Commonly Used Operating System
* 3. STRUCTURE OF OPERATING SYSTEM
  * Operating System Services
  * Introduction of System Call
  * System Programs in Operating System
  * Operating Systems Structures
  * Booting and Dual Booting of Operating System
* 4. THREADS IN OS
  * Thread in Operating System
  * Threads and its types in Operating System
  * Multithreading in Operating System
* .
#### MY COMPLETE TOPIC WISE LEARNING ABOUT PROCESS MANAGEMENT (WITH TOPIC WISE DEEP LOW LEVEL LEARNING)
* 1. WHAT IS OPERATING SYSTEM
  * INTRO
    * Operating system is system software
    * It acts as an intermediatory between h/w and user. Remember - you can (user) also directly access H/w but it will not be efficient and convenient. so we need os.
    * It is resource manager - manage system resrorces in an unbiased manner for both s/w and h/w
    * Provides a platform on which other application programs are installed. Can directly install.
  * ABSTRACT VIEW OF SYSTEM
    * See in YT for diagram - https://www.youtube.com/watch?v=YwqexcfbucE&list=PLmXKhU9FNesSFvj6gASuWmQd23Ul5omtD&index=4&ab_channel=KnowledgeGATEbySanchitSir
    * HW => OS => System and Application Programs (Like VLC, MS-Office, Compiler) => Users
    * Example a user wants to play movie on VLC Media Player. Then OS will ask permission to H/W to allow to play the movie in Monitor H/W and CPU to process that play. So this is how it works.
  * GOALS AND FUNCTIONS OF OS
    * YT link - https://www.youtube.com/watch?v=ENYFsXTaV2Y&list=PLmXKhU9FNesSFvj6gASuWmQd23Ul5omtD&index=5&ab_channel=KnowledgeGATEbySanchitSir 
    * GOALS of OS Means what we have to achieve at the end. To accomplish this Goals we have to do some good functions by our OS.
    * So this is different between Goals and Functions of OS
      * GOALS OF OS
        * Primary Goal - Convenience / User friendly 
          * Why this is primary, let's take example. You know linux is more efficient, more secure, still people use Windows more why
          * Because windows is more Convenience and user friendly, so it is primary goal.
        * Secondary Goal - Efficiency, Free
      * FUNCTIONS OF OS
        * To Achieve this above mentioned goals, OS should have following functionalities in it.
          * 1. Process Management
          * 2. Memory Management
          * 3. I/O Device Management
          * 4. File Management
          * 5. Network Management
          * 6. Security and Protection
* 2. TYPES OF OS / EVOLUTION OF OS 
  * YT - https://www.youtube.com/watch?v=VtqPyXDaMr4&list=PLmXKhU9FNesSFvj6gASuWmQd23Ul5omtD&index=6&ab_channel=KnowledgeGATEbySanchitSir
  * OS STARTED WITH MAINFRAME COMPUTERS
    * It has simple operations. They were not UI Interactive OS.
    * These were called jobs where we have to give program, input data and control instructions at the beginning only.
    * It's like simple calculator stuffs.
    * OS has simple task, where one job is done, then moved to next job when current job is done. 
    * Memory were limited then. CPU works poorer than.
    * So to resolve this issue Batch Processing OS came into play
  * BATCH PROCESSING OS
    * Here jobs with similar needs are batched together and executed through the processes as s group.
    * Example all C related programs and grouped together and fortran related programs are grouped together.
    * So when C related programs comes then we will load Assemblers and compilers for C language. Once all jobs done.
    * Then we unload C assemblers and load FORTRAN/COBOL assembler. So this way memory and time is saved.
    * Same batch requires same environment needs.
    * Disadvantages - Memory limitations. Interaction of I/P and O/P devices directly with CPU.
    * As CPU has no buffer. So CPU remains idle, as job queue/buffer is empty.
  * SPOOLING
    * ... no video on it
  * MULTIPROGRAMMING OS (EXAMPLE WINDOWS, UNIX, MACOS, ETC)
    * YT link - https://www.youtube.com/watch?v=OOLy8jnl1hA&list=PLmXKhU9FNesSFvj6gASuWmQd23Ul5omtD&index=7&ab_channel=KnowledgeGATEbySanchitSir
    * When more than one process in Main Memory, this is called Multiprogramming.
    * Multiprogramming means more than one process in Main Memory which are ready to execute.
    * Remember here we have one CPU, So at a time only one process can run in a CPU at a time. Multiprogramming does not mean multiple process in CPU.
    * If we have more than one CPU, then we call it multiprocessing, which we learn about it later.
    * CPU will keep on picking the process from Main Memory and keeps on doing it task.
    * So here CPU utilization is maximized.
    * However, a process generally requires CPU time and I/O time.
    * CPU is idle in any one of this two case - 1. No process in Main Memory left 2. When it is context switching (Means switching between process) 3. Waiting for I/O devices, but here it won't wait and try doing other programs from Main Memory.
    * So the conclusion is - In main memory we will have multiple process but CPU will be doing one process at a time. So this way of keeping multilple programs/process in Main Memory is the concept of Multiprogramming.
    * Advantage
      * High CPU Utilization
      * Less waiting time, response time etc
      * May be extended to multiple users - rather than multiple program/process
      * Very useful these days, as load is very high
    * Disadvantage
      * Difficult scheduling of Process
      * Main memory management is required
      * Memory fragmentation - empty irregular space in main memory
      * Paging (Non-contiguous memory location)
    * Remember - Multiprogramming does not means multiple processes are running at a time. As we have only one CPU, so the processor do context switching between multiple process so fast that we feel like as if multiple programs are running.
    * Here CPU is utilized almost 100%. As long as we have process in Main memory.
  * MULTITASKING OS / TIME SHARING / FAIR SHARE / MULTIPROGRAMMING WITH ROUND-ROBIN
    * YT link - https://www.youtube.com/watch?v=UcXWaeRikSo&list=PLmXKhU9FNesSFvj6gASuWmQd23Ul5omtD&index=8&ab_channel=KnowledgeGATEbySanchitSir
    * We want that CPU instead of working on single process, it should also leave current process and move to other process as well. 
    * CPU should do this task so fast and process other program/process as well rather than just one process.
    * So this concept is called multitasking. or time sharing or fair share or multiprogramming with round-robin.
    * Remember - Here we are only having one CPU system.
    * This we are able to do because CPU processor is very fast that we are unable to identify.
    * So we can listen music, browse and run excel at a same time - CPU will process one by one each of them in time sharing manner. So we user will feel illusion of as if all these program are running parallely.
    * Multitasking is multiprogramming with time-sharing
    * Only one CPU but switches between processes so quickly that it give the illusion that all esecuting at same time
    * The task in multitasking may refer to multiple threads of the same program.
    * Main ides is better response time and executing multiple process together.
    * Disadvantages - One CPU will have high load as it is doing multiple task by context switching between programs.
    * So we come into multiprocessing
  * MULTIPROCESSING OS
    * YT link - No vide made on it.
    * It's just we have multiple processor CPU in our system. So load will decrease.
    * 2 processor - dual core, 4 process - quad core, 8 processor - octa core system.
  * REAL TIME OS
    * Here the processing time is measured in tenths of seconds. This system is time-bound and has a fixed deadline.
    * Mostly used in industrial control, flight control, time bomb, missile launcher, Heart pacemakers
    * Two types
      * Hard Real-time os
        * The task should be completed in exact given time.
      * soft Real-time os
        * The task should be completed in given time range.
  * NETWORK OS
    * Network OS is software that connects multiple devices and ocmputers on the network and allows them to share resources on the netowork.
    * It creates and manges user accounts on the network. Controls access on network
    * Two types
      * Peer to Peer
        * Used on LAN
      * Client/server 
        * Central server. This Os is good for the big networks which provide many services.
    * Examples like Microsoft Windows Server, Unix/Linux, Like you do in HVD in BofA.
  * DISTRIBUTED OS (SEE IN YT NOTES PDF METHODOLOGIES)
    * ..
* 3. STRUCTURE OF OS (METHODOLOGIES FOR IMPLEMENTATION OF OS SERVICES)
  * Learn  from the notes pdf attached - YutubeNote_OS_Functions_Methodologies_Intro.pdf (Covers enough details - learn this only and some yt)
  * some yt you can see though apart from pdf
    * https://www.youtube.com/watch?v=sUw32fUZgNk&ab_channel=Lastmomenttuitions (User space vs kernel space)
    * https://www.youtube.com/watch?v=88vlIFfsmKM&ab_channel=Lastmomenttuitions (Monolithic vs Micro kernel)
  * BOOTING IN OS
    * SEE THIS GFG ENOUGH IMP AND ALSO SEE YOUR PDF
    * YT - https://www.geeksforgeeks.org/what-happens-when-we-turn-on-computer/
  * USER MODE VS KERNEL MODE (USER SPACE VS KERNEL SPACE)
    * USER MODE 
      * Example like to write addition function code in program
      * If a user program or application corrupts, that single program application stops misbehaving or working.
    * KERNEL MODE (More about kernel and its types you can see here - https://www.geeksforgeeks.org/kernel-in-operating-system/)
      * Open a program or file and show your program add in console. 
      * Kernel is mastermind of os. All OS operations are taken care by kernel
      * If kernel programs/functions gets corrupts, the whole OS crashes.
      * Kernel is the core of OS. Kernel is the one helps in Memory Management, Process Management, File Management etc.
      * Kernels are the heart of OS, managing how hardware and software communicate and ensuring everything runs smoothly.
      * TYPES OF KERNEL
        * MONOLITHIC KERNEL (example UNIX,Linux)
        * MICRO KERNEL (example mach)
        * HYBRID KERNEL (mixed of monolithic and micro kernel - example like windows NT)
        * EXO KERNEL
        * NANO KERNEL
  * SYSTEM CALLS 
    * Interface between user and kernel. System call is send from user to do some kernel level task.
    * System call exposes all functionalities of kernel.
    * System call protects and keep kernel safe from user misuse or corrupted programs.
    * More about system calls, working, kernel and user relations see in pdf only and understand.
  * SYSTEM PROGRAMS (SEE IN PDF MENTIONED ABOVE)
    * ..
  * INTERRUPT MECHANISM (SEE IN PDF MENTIONED ABOVE)
    * ..
  * ....ETC (SEE IN PDF MENTIONED ABOVE)
    * ..
* 4. THREADS IN OS (MULTITHREADING)
  * FROM GFG (SEE IN BELOW TOPIC SECTION IN THIS GFG LINK FOR MULTITHREADING - https://www.geeksforgeeks.org/operating-systems/?ref=lbp)
  * THREADS VS PROCESS
    * YT see this very important - https://www.youtube.com/watch?v=LOfGJcVnvAk&list=PLBlnK6fEyqRh5YXKAPCZPVZPkdhQa9Skz&ab_channel=NesoAcademy
    * This Yt has good stuffs to see and learn, see it once.
    * A process is program in execution, A process contains Stack, Registers and Resources (Data, file and code).
    * A process always will have one thread called as Main thread. 
    * So a process always will have one thread.
    * Also a process can have multiple threads.
    * This different thread will have their own stack and Registers. Main thread will have their own stack and registers, Thread 1 will have other stack and registers, thread 2 will have other stack and registers.
    * But this different thread will share the resources in that process (Resources like - Code, Data and Files)
    * A thread is a basic unit of CPU utilization.
    * Thread includes thread ID and Program Counter.
    * EXAMPLE
      * Lets say we run chrome.exe process. 
      * So opening a tab is one thread. And downloading a item is another thread.
      * So this way browser will do multiple task using multiple threads.
      * Downloading and uploading happening simultaneously.
      * If we were having single threads, then when downloading, page couldn't have uploaded, 
      * or if uploading then downloading could not have happened.
      * So here multithreading will help in doing different task efficiently, as there is very less time wasted in context switching as compared to multiple processes.
  * BENEFITS OF MULTITHREADING IN A PROCESS
    * RESPONSIVENESS - 
      * Even if we have some other thread taking a lot of time to complete/or is blocked, then other threads keep on working.
      * Example while downloading in chrome, downloading data won't block your uploading.
    * RESOURCE SHARING -
      * As data is shared, so multithreading allows application to have several different threads of activity within the same address space.
      * No separate dedicate Memory Resource is required here. So it makes efficient and economical
    * ECONOMY -
      * Allocating memory and resource for process creation is costly. because threads share resources of theprocess ot which the belong,
      * it is more economical to create and context-switch threads
    * UTILIZATION OF MULTIPROCESSOR ARCHITECTURE - 
      * If we hace multiple CPU system, then multiple threads will run parallely in different CPUs.
      * So CPU will be utilized.
      * Multithreading on a multi-CPU machine increasaes concurrency
      * Example - If you have single thread process, then apart from having multiple CPUs,
        * That one process will run only in one CPU utilizing that single thread in that CPU only
        * So other CPU will remain idle and unutilized
        * So this is how Multithreading is useful for multiprocessor architecture.
        * So if we have 4 threads in process, and 4 cpu, then each thread will run in each cpu concurrently and the task is done efficiently.
  * CONCURRENCY VS PARALLELISM
    * YT see this is enough -https://www.youtube.com/watch?v=RlM9AfWf1WU&ab_channel=ByteByteGo
      * PARALLELISM
        * Process running alongside in different CPUs.
      * CONCURRENCY
        * Task is switched between one process to another to run different process by the single cpu.
        * They looks like running parallely, But they are not parallel.
      * Learn about MultiProcessing also. How it works with process, How it works with threads is mentioned above in process vs threads. 
  * MULTITHREADING MODELS AND HYPERTHREADING
    * https://www.youtube.com/watch?v=HW2Wcx-ktsc&list=PLBlnK6fEyqRh5YXKAPCZPVZPkdhQa9Skz&index=2&ab_channel=NesoAcademy
    * TYPES OF THREADS
      * USER THREADS - Supported above the kernel and are managed without kernel support.
      * KERNEL THREADS - Supported and managed directly by the operating system.
      * Ultimately, there must exist a relationship between the user threads and kernel threds.
      * THREE COMMON WAYS OF ESTABLISHING THIS RELATIONSHIP
        * MANY TO ONE MODEL
        * ONE TO ONE MODEL
        * MANY-TO-MANY MODEL
      * No need to go deep in it.
  * THE FORK() AND EXEC() SYSTEM CALLS
    * https://www.youtube.com/watch?v=IFEFVXvjiHY&list=PLBlnK6fEyqRh5YXKAPCZPVZPkdhQa9Skz&index=3&ab_channel=NesoAcademy
    * No need to go deep in it
  * THREAD ISSUE AND THREAD CANCELLATION
    * Thread is terminated before it complete its execution.
    * Example - When a page is loading in browser and you click the cancel, 
      * then there are several threads running in background to load that page. 
      * all threads loading the page will get cancelled. some threads load links, some threads load images, text etc.
    * Asynchronous cancellation - 
    * Deferred cancellation - 
    * Ignore more depth in this
  * THREADS AND HEAP MEMORY SPACE, WHERE HEAP LIES
    * https://www.youtube.com/watch?v=4rLW7zg21gI&t=107s&ab_channel=ByteByteGo
* --- < END > ------

### 2. PROCESS MANAGEMENT (RE-UPDATED INDEX BY MY LEARNING)
* 1. Introduction to Process Management
  * Pre-requisites Topics
    * Process and Threads
    * Process Table and Process Control Block (PCB)
    * Operations on Processes
    * Context Switching in Operating System
* 2. Inter Process Communication (IPC)
  * Shared Memory
  * Message Passing
* 3. Process Schedulers in Operation System
  * Preemptive and Non-Preemptive Scheduling
  * CPU Scheduling Criteria
  * Multilevel Queue Scheduling
* 100. Leftover Topic 
  * Multiple-Processor Scheduling in Operating System (TODO - Or leave)
  * Thread Scheduling (TODO - Or leave)
* 4. PROCESS SYNCHRONIZATION
  * Introduction of Process Synchronization
  * Race Condition Vulnerability
  * Critical Section in Synchronization
  * Mutual Exclusion in Synchronization
  * CRITICAL SECTION PROBLEM SOLUTION 
    * Person's Algorithm in Process Synchronization
    * Semaphores in Process Synchronization
    * Semaphores and its types
    * Producer Consumer Problem using Semaprhores | Set 1
    * Readers-Writers Problem | Set 1 (Introduction and Readers Preference Solution)
    * Dining Philosophers Problem Using Semaphores
    * Hardware Synchronization Algorithsm : Unlock and Lock, test and Set, Swap
* 5. DEADLOCKS AND DEADLOCK HANDLING METHODS
  * Introduction of Deadlock in Operating System
  * Conditions for Deadlock in Operating System
  * Banker's Algorithm in Operating System
  * Wait for Graph Deadlock Detection in Distributed System
  * Handling Deadlocks
  * Deadlock Prevention and Avoidance
  * Deadlock Detection and Recovery
  * Deadlock Ignorance in Operating System
  * Recovery from Deadlock in Operating System
* .
#### MY COMPLETE TOPIC WISE LEARNING ABOUT PROCESS MANAGEMENT (WITH TOPIC WISE DEEP LOW LEVEL LEARNING)
* Youtube Found - Can refer this to understand in video  :  https://www.youtube.com/watch?v=OrM7nZcxXZU&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&ab_channel=NesoAcademy
* 1. PROCESS MANAGEMENT INTRO
  * Motive - To provide CPU/Process to our programs/process to get maximum throughput.
  * PROCESS AND THREADS
    * PROCESS
      * A process can be thought of as a program in execution
    * THREAD
      * A thread is the unit of execution within a process. A process can have anywhere from just one thread to many threads.
    * Using process explorer tool u can see all the process and it's thread running. see YT.
  * PROCESS STATE
    * Process in execution will go through below states
    * NEW STATE - The process is being created
    * RUNNING STATE - The process is being executed
    * WAITING STATE - The process is waiting for some event to occur (Such as an I/O completion or recption of a signal).
    * READY STATE - The process is waiting to be assigned to a processor.
    * TERMINATED STATE - The process has finished execution.
    * Diagram you can see in YT. Well explained.
    * https://www.youtube.com/watch?v=jZ_6PXoaoxo&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&index=2&ab_channel=NesoAcademy
    * IMPORTANT - See youtube to understand process state transition better.
  * PROCESS CONTROL BLOCK
    * Each process is represented in the operating system by a Process Control Block (PCB) - also called as task control block
    * Process Control Block is some memory block which stores the information about a process. Each process has a PCB to store its details.
    * Some of the items that PCB stores are 
      * Process State - It says in which state the process is in at that particular moment.
      * Process Number - Process ID, It shows the unique number to identify the process.
      * Program Counter - It indicates the address of the next instruction of that paritcualr process that has to be executed for that particular process.
      * CPU Registers - It tells about the  registers used by that process. Registers like index registers, stack registers.
      * memory limits
      * List of open files
      * CPU Scheduling Information - It stores the priority of the processes. Stores the pointer to the scheduling queue and other scheduling parameter.
      * Memory management information - It tells the memory that is being used by the process.
      * Accounting information - It keeps account of all the resources which is being used by the particular process. Resources can be CPU, Time, or Memory. 
      * Input/Output Status Information - It stores what all I/O devices are assigned to this process.
  * PROCESS SCHEDULING
    * The objective of multiprogramming is to have some process running at all times, to maximize CPU utilization
    * The objective of time-sharing is to switch the CPU among processes so frequently that users can interact with each program while it is running.
      * Example, type a doc. listen music, and download file. We are doing three task at same time in system. But actually what is happening is CPU is switching to each process so frequently and quickly we don't realise.
    * How to accomplish the objectives of MULTIPROGRAMMING AND TIME SHARING
      * To meet these objectives, the process scheduler selects an available process(possibly from a set of several available processes) for program execution on the CPU.
        * For a single-processor system, there will never be more than one running process.
        * If there are more processes, the rest will have to wait until the CPU is free and can be rescheduled.
        * The process scheduler takes care of this.
    * SCHEDULING QUEUES
      * JOB QUEUE - As processes enter the system, they are put int oa job queue. which consists of all processes in the system.
      * READY QUEUE - The processes that are residing in main memory and are ready and waiting to execute are kept on a list called the ready queue.
      * SEE THE DIAGRAM IN YT WORKING - https://www.youtube.com/watch?v=2h3eWaPx8SA&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&index=5
  * CONTEXT SWITCH
    * Interrupts cause the operating system to change a CPU from its current task and to run a kernel routine (When higher priority task comes up).
    * Such operations happen frequently an general-purpose systems.
    * When an interrupt occurs, the system needs to save the current context of the process currently running on the CPU so that it can restore
      * that context when its processing is done, essentially suspending the process and then resuming it.
    * The context is represented in the PCB of the process.
    * Switching the CPU to another process requires performing a state save of the current process and a state restore of a different process. This task is known as a context switch.
    * Some Imp Points about Context Switching
      * Context-switch time is pure overhead (Waste of time and resource), but the system does no useful work while switching.
      * Its speed varies from machine to machine, depending on the memory speed, the number of resigters that must be copies, and the existence of special instructions (such as a single instruction to load or store all registers).
      * Typical speeds are few milliseconds.
  * OPERATIONS ON PROCESSES
    * PROCESS CREATION
      * A process may create serveral new processs, via a create-process system call, during the course of execution
      * The creating process is called a parent process, and the new processes are called the children of that process.
      * Each of these new processs mah in turn create other processes, forming a tree of processes.
      * Tree diagram of process creation check in YT. (Not so imp) - https://www.youtube.com/watch?v=pSW9d3Oaie8&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&index=6&ab_channel=NesoAcademy
      * Possibilities (In terms of memory)
        * The parent continues to execute concurrently with its children
        * The parent waits until some or all of tis children have terminated.
      * Possibilities (In terms of address space)
        * Child process is a duplicate of the parent process (Same code and date)
        * The child process has a new program loaded into it.
    * PROCESS TERMINATION
      * A process terminates when it finishes executing its final statement and ask the os to delete it by using the exit() system call.
      * At that point, the process may return a statu value (typically a integer) o its parent process (via the wait() system call).
      * All the resources of the process- including physical and virtual memory, open fies, and I/O buffers- are deallocated by the os.
      * Other circumstances to cause termination of process
        * A process can cause the termination of another process via an appropriate system call. Such system call can only be invoked only by the parent of the process that is to be terminated.
        * Reasons for parent process to kill child process
          * If child has exceed the resources allocated. Parent will have mechanism to find how.
          * If child is no longer required
          * If parent terminates, child should also terminate.
  * INTERPROCESS COMMUNICATION
    * Processes executing concurrently i the operating system may bne either independent processes or cooperating processes.
    * INDEPENDENT PROCESSES
      * They cannot affect or be affected by the other processes executing in the system.
    * COOPERATING PROCESS
      * They can affect or be affected by the other process executing in the system.
      * Any process that shares data with other processes in a cooperating process.
      * In cooperating process we need interprocess communication.
    * THERE ARE SEVERAL REASONS FOR PROVIDING AN ENVIRONMENT THAT ALLOWS PROCESS COOPERATOION
      * Information Sharing
      * Computation speedup
      * Modularity
      * Convenience
    * Cooperating processes require an interprocess communication (IPC) mechanism that will allow them to exchange data and information
    * THERE ARE TWO FUNDAMENTAL MODELS OF INTERPROCESS COMMUNICATION
      * 1. SHARED MEMORY
        * In the shared-memory model, a region of memory that is shared by cooperating process is established. 
        * Processes can then exchange information by reading and writing data to the shared region
      * 2. MESSAGE PASSING
        * In the message passing model, communication takes place by means of message exchange between the cooperating processes.
      * You can see the diagram in YT. - https://www.youtube.com/watch?v=dJuYKfR8vec&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&index=8&ab_channel=NesoAcademy
    * SHARED MEMORY SYSTEMS (Deep dive) (BETTER CHECK MORE VIDEOS FOR BETTER UNDERSTANDING)
        * In LayMan words - Here we have extra communicating process present in shared memory between two process. there they update some message and used by both the process.
        * Diagram see in yt - https://www.youtube.com/watch?v=dJuYKfR8vec&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&index=8&ab_channel=NesoAcademy
        * Typically, a shared-memory region resides in the address space of the process creating the shared-memory segment.
        * Other processes that wish to communicate using this shared-memory segment must attach it to their address space.
        * Process must remove restrictions to access other process memory access else OS won't allow to access. (What is address space?)
        * Some Examples of Shared Memory Programs are as follows - Producer consumer problem
        * PRODUCER CONSUMER PROBLEM
          * Example of Producer consumer program/process is
            * For example, a compiler may produce assembly code, which is consumed by an assembler
            * Other example like, The assembler, in turn, may produce object modules, which are consumed by the loader.
            * Other example like, Client-Server model. Server is producing HTML files and client is consuming those files.
          * Problems/issue faced in producer consumer problem
            * The Client must consume what is produced by the server. And not something else.
            * We want the process of producer and consumer to be concurrent.
            * So how to resolve this issue. How to make our producer and consumer work concurrently.
            * We have the following solutions to resolve this problem
              * 1. Shared Memory (As we have already discussed above)
                * One of the solution to the producer-consumer problem uses shared memory
                * To allow producer and consumer processes to run concurrently, we must have available a buffer of items that 
                * can be filled by the producer and emptied by the consumer. Buffer will be filled by the producer and emptied by consumer.
                * Buffer will be kepd in shared memory
                * A producer can produce one item while the consumer is consuming another item.
                * The producer and consumer must be synchronized, so that the consumer does not try to consume an item that has not yet been produced.
                * Two kinds of buffers
                  * 1. Unbounded Buffer
                    * Places no practical limit on the size of the buffer. The consumer may have to wait for new items, but hte producer can always produce new items.
                    * 
                  * 2. Bounded Buffer 
                    * Assumes a fixed vuffer size. In this case, the consumer must wait if the buffer is empty, and the producer must wait if the buffer is full.
    * MESSAGE-PASSING SYSTEMS
      * Here we don't need to share memory space.
      * Mostly useful for distributed environment.
      * Here the communicating process may reside on different computers connected by a network.
      * Example chatting via internet. You send message to your friend in other system. Your friend receives the message. But here we chat via network.
        * Here we don't have any shared memory. So here message passing system is used, and we communicate via messages.
      * Two operations are provided by the message-passing facility
        * 1. Send (Message) - send message to other process.
        * 2. Receive (Message) - receive message from other process
      * Message sent by a process can of either fixed or variable size.
        * Fixed Size - Simple fixed size implementation. But since size if fixed, this makes the task of programming more difficult.
        * Variable Size - More complex system-level implementation as size is variable, but the programming task becomes simpler, as we can send any size message.
      * A communication link must exist between the process. Some of the methods are (Logical implementing a link)
        * 1. Direct or indirect communication
        * 2. Synchronous or asynchronous communication
        * 3. Automatic or explicit buffering
        * There are several issues related with features like : 
          * Naming (Issue Present in Direct or indirect communication)
          * Synchronization (Issue Present in Synchronous or asynchronous communication)
          * Buffering (Issue Present in Direct or indirect communication / Automatic or explicit buffering)
          * NAMING (Issue present in Direct or Indirect communication)
            * Process that want to communicate with each other must have a way to refer to each other. 
            * They can use either direct or indirect communication.
            * This is where NAMING comes into play.
            * DIRECT COMMUNICATION - 
              * Explicitly specify to which process you are sending the message.
                * Example send( P, Message) - send a message to process P.
                * receive (Q, message) - receive a message from process Q.
              * Here link is established automatically every pari of processed that want to communicate.
              * The processes need to know only each other's identify to communicated.
              * Two process will have exactly one link for them to communicate.
              * This scheme exhibits Symmetry in addressing : name each other to communicate.
              * ANOTHER VARIANT (of direct communication)
                * Only the sending process needs to specify the name of the recipient.
                * recipient is not required name the sender.
                * send (P, message).  receive (id, message) - id is process from which we want to receive, and id can vary. not constant so.
                * This scheme employs asymmetry in addressing
              * DISADVANTAGE - If Id of process is changed then it will create issue. Many other codes will be updated when process id is changed.
            * INDIRECT COMMUNICATION
              * Mailbox plays an intermediate to send and receive message.
              * Process send message in mailbox and recipient read message from mailbox.
              * Each mailbox has unique identification where process identify.
              * Send (A, message), receive(A, message) - A is mailbox here.
              * Each communicating process will have number of different links, wth each link corresponding to one mailbox.
              * But it will create issue if one process have multiple link.
              * So only one link associated with the two processes at most.
              * See YT for how to know whihc process will receive if two process has same receive mailbox.
                * Usually sytem will decide. or let only one recipient has same link as sender.
              * Mailbox is either owned by the process or OS.
          * SYNCHRONIZATION (Issue present in Synchronous or asynchronous communication)
            * We know in Message Passing system we use send(), receive() primitives to communicate between the process.
            * Message passing may be either blocking or nonblocking -also known as synchronous and asynchronous.
            * Blocking = Synchronous 
            * Unblocking = Asynchronous
            * Blocking send - Sending process will be blocked until the message is received by the receiving process or by the mailbox.
            * Nonblocking send - Sending process will send the message and resumes operation.
            * Blocking receive - The receiver blocks until a message is available
            * Nonblocking receive - The receiver retrieves either a valid message or a null.
          * BUFFERING (Issue Present in Direct or indirect communication / Automatic or explicit buffering)
            * In Direct or Indirect communication, message exchanged by the communicating process reside in temporary queue.
            * This temporary queue is called Buffer.
            * So this queues(Buffer) can be implemented in three ways.
              * ZERO CAPACITY BUFFER/QUEUE
                * Max queue length is zero. As we don't want messages waiting. It should directly send message to recipient.
                * Sender must be blocked until the recipient receives the message
              * BOUNDED CAPACITY BUFFER/QUEUE
                * Queue Length = n. Until queue is full sender can continue execution.
                * If the link/queue is full sender must be blocked until space is available in the queue.
              * UNBOUNDED CAPACITY BUFFER/QUEUE
                * Queue Length = infinite. Sender keeps sending the message and never blocked.
                * Receiver will receive the message whenever required.
    * INTERPROCESS COMMUNICATION IN CLIENT-SERVER SYSTEMS (Don't go deep not part of OS Syllabus)
      * SOCKETS
        * A socket is defined as an endpoint for communication
        * A pair of processes communicating over a network employ a pair of socket-one for each process.
        * A socket is identifier by an IP address concatenated with a port number.
        * The server waits for incoming client requests by listening to a specified port. 
        * Once a request is received, the server accepts a connection from the client socket to complete the connection.
        * Port number is used to identify process.
        * Servers implementing specific services (such as telnet - remote login, ftp and http)
        * telnet server listens to port 23, ftp to port 21 and web or http to port 80.
        * These ports can't be assigned to other client or process.
        * All port below 1024 are already reserved for standard services. So we don't chose from them.
        * Rest see in YT for socket
        * https://www.youtube.com/watch?v=uagKTbohimU&list=PLBlnK6fEyqRgKl0MbI6kbI5ffNt7BF8Fn&index=13&ab_channel=NesoAcademy
        * Communication using socket (See YT diagram)
    * RPC (Remote Procedure calls)  - further in YT - Not part in syllabus
    *
* 2. CPU PROCESS SCHEDULING ALGORITHM (THIS IS TAKEN FROM YOUR WRITTEN NOTES ONLY - WELL EXPLAINED THERE ONLY. ADD CHECK IN PDF)
  * To execute multiple process in CPU, we first bring those process in RAM in ready Queue, and from here execution takes place
  * In case we are using uniprocessor (1 CPU) system, then at a time single process in CPU
  * So to use criterial to keep this process in queue is called scheduling algorithm
  * CPU SCHEDULING TERMS
    * ARRIVAL TIME - The time at which process enter the Ready queue or state
    * BURST  TIME - It is time required by a process to get execute on CPU
    * COMPLETION TIME - The time at which process complete its execution
    * TURN AROUND TIME - completion time - arrival time
    * WAITING TIME - turn around time - burst time
    * RESPONSE TIME - the time at which a process get CPU first time - arrival time
  * TWO TYPES OF PROCESS
    * CPU BOUND - Time in CPU to execute that process
    * I/O BOUND - e.g. printer and scanner invoke process. To print or scan process.
  * There are two types we can divide our scheduling algorithm (The table with numericals see in note pdf)
    * 1. PRE-EMPTIVE
      * Here other process can come in and replace current process using the CPU.
      * Types of Pre-Emptive
        * 1. SRTF (SHORTEST REMAINING TIME FIRST)
        * 2. LRTF (LONGEST REMAINING TIME FIRST)
        * 3. ROUND ROBIN
        * 4. PRIORITY BASED
    * 2. NON PRE-EMPTIVE
      * Here current process is not replaced until the current process is completed. 
      * Types of Non Pre-emptive
        * 1. FCFS (FIRST COME FIRST SERVE)
        * 2. SJF (SHORTEST JOB FIRST)
        * 3. LJF (LONGEST JOB FIRST)
        * 4. HRRN (HIGHEST RESPONSE RATIO NEXT)
    * for gantt chat and numerical understanding of each scheduling algorithm
  * MULTILEVEL QUEUE SCHEDULING (simple diagram you can see in notes pdf)
    * Until now we have only make sure of single ready queue. And we pick process from it using some scheduling algorithm.
    * In Multilevel Queue Scheduling - In real life in our system we don't have same type of process. So in multilevel queue we divide into three categories as 
      * HIGHEST PRIORITY - Consists of System process
      * MEDIUM PRIORITY - Consists of Interactive Process
      * LOWEST PRIORITY - Batch process
    * Also in above each process can have their own scheduling algorithm. Then can be same also different also.
    * Also disadvantages here is that if we've a lot of system process (Highest Priority) then batch process won't get time to execute. so the starvation occurs.
    * So to remove this we can make use of multilevel feedback queue.
  * MULTILEVEL FEEDBACK QUEUE (see diagram in notes pdf)
    * Here we give feedback by lower priority queue that it has being idle for some time. so cpu is notice and bring this in cpu
    * highest priority will work for 8 time unit, then goes to medium priority which works for 6 time quant and then lowest priority queue will have 2 time quant.
    * so like this it works.
    * see in notes pdf. for gantt chat and numerical understanding of each scheduling algorithm
* 3. PROCESS SYNCHRONIZATION (CONCURRENCY AND SYNCHRONIZATION)
  * Concurrent means running currently both the process. Parallelly you can understand.
  * Followed this YT playlist for synchronization - https://www.youtube.com/watch?v=ju4bycQQF2A&list=PL8tc66sMn9Kggk4zRPzcjXNUIDDnJKUnU
  * As we know degree of multiprogramming depends on the RAM. Number of frames/process in RAM. So all this process are running simultaneously.
  * So because of multiprogramming nature of our modern operating system, the concept of synchronization came into the view.
  * On the basis of synchronization - Processes can be divided into two types
    * COOPERATING PROCESS - Requires synchronization. When process is affected by the other process or affects the other process is called cooperating process.
      * This effecting each other is possible only if there are shared variable. i.e. some variable x. (One process will be doing x-x+10, while other will be doing x=x-10).
      * Sharing a data variables, file or table, then there is a need of synchronization
      * This synchronization problem gave rise to an inconsistency in the system known as RACE CONDITION
      * RACE CONDITION
        * A situation where several processes access and manipulate the same data concurrently and the outcome of the execution depends on the particular order in which the access takes place. This is called RACE Condition.
        * Let say we are using Round robin algorithm, And a process has three main code segment START SECTION, CRITICAL SECTION, and EXIT/END SECTION
        * So when one process is in critical section, then other process must not be in critical section.
        * It is very well explained in the YT, Check there only
        * In round-robin, it can be that value of global variable will get updated by another process. so it gives rise to inconsistency-
        * So in cooperating process if the process are manipulating the shared data then it will give rise to inconsistency and hence race condition occurs
      * CONCLUSION
        * The order of execution matter the most in concurrent processes.
        * Moreover, they are been executed in time-shared environment, where the OS Context switches the processes as and when necessary.
        * As they share resources (mostly files and variables), there result can have inconsistency.
        * And this problem of inconsistency is known as Race Condition! (Understand this way - which process will race to change/update/modify the global variable)
      * HOW TO GET RID OF RACE CONDITION
        * CRITICAL SECTION - That portion of your program where shared resources are updated or modified.
          * When a process is accessing shared modifiable data or a resource that can only operate on behalf of one process at a time, the process is said ot be in a critical section
          * When one process is in a critical section, all other processes are excluded from their critical section when that same shared resources is shared between cooperating process,
          * In critical section problem there are four General sections:
            * 1, Entry section
            * 2, Critical Section
            * 3, Exit section
            * 4, Remainder section
          * Principle of Mutual Exclusion
            * It states that not two processes may be simultaneously present in the critical section (ie. at the same time).
            * Entry Section - At entry section only you have to ask for permission - It is treated as security check. It tells the status of CS whether it is availabe or not and ensures that only one processes enters the cs.
            * Critical Section - Any shared resources on which lock is tag. It can be a data/item/register/files/variables etc.
            * Exit Section - Intimate the waiting processes that CS has become empty or available for use.
          * Solutions to Critical Section Problem (So the above four general sections should follow this criteria in the code)
            * 1. Mutex (Mutual Exclusion) - In critical section only one process at a time.
            * 2. Progress - Process which are in entry, critical or exit section, they will decide which process will go next in critical section. So that progress is on.
            * 3. Bounded Waiting - A fair chance should be provided to all other process to access critical section. We don't want only one process to be in critical section.
          * LOCK Variable - Example of Mutual Exclusion
            * If Lock-1 (Neans resource CS is free) then the process will access the CS and set the Lock=® (so that no other process comes in CS when this current process is in CS). Once this process completes it's task in CS, then it goes in Exit section and re-update the Lock=1. so that other process can use this free CS now.
            * If Lock=0 (Means resource CS is not free) - then go in waiting situation. Process is going in waiting situation.
          * PETERSON'S ALGORITHM - SOLUTION FOR THE CRITICAL SECTION PROBLEM
            * This is same like Dekker's son algorithm.
            * flag[0]= true (Enter the CS )
            * turn = 1
            * This algorithm satisfies all the criteria - Mutual Exclusion, Bounded Waiting and Progress
            * See in YT only. This is better to be understand by code only - You can directly learn this in Intervie time then also it will be fine.
          * HARDWARE SOLUTION FOR THE CRITICAL SECTION PROBLEM (FOR MULTIPLE CPU)
            * Dekker's and Peterson solution does not guaranteed to work on modern computer with multiple core. (more than one CPU) -
            * Use hardware insturction that are provided by modern computer.
            * There are two types of hardware instruction;
              * TestAndSet() - Here we have global variable lock (value true or false). See more in YT only (Part 3 of Playslist)
              * Swap() - Similar to TestAndSet. Here we have two words/variables. See more in YT only (Part 3 of Playlist)
          * SEMAPHORES - SOLUTION FOR THE CRITICAL SECTION PROBLEM
            * Designed by Dijkstra
            * What gave rise to Semaphore - The critical section problem, multi-process env, process are constantly access shared resources, which gave rise to Race condition
            * So, process must access the Shared resources in a mutual exclusive manner.
            * So OS must resolve this, os is software only, Software is programs only, so we need good program/algo to resolve this issue and allow mutual exclusion in multiprogramming system.
            * Semaphores helps in attaining mutual exclusion
            * Semaphore is just a variable, (Integer Variable), Or say similar to variable.
            * Uses of semaphore - (See in yt also)
              * 1. MUTEX - Provides Mutual Exclusion (Most important use of semaphore)
              * 2. NOTIFIER - Notifies events to processes
              * 3. COUNTER - Tracks processes or resources
            * Semaphore as a flag variable (Lock).
            * Semaphore can be also used as counters - They keep track of processes and resources.
            * SEMAPHORE AS AN COUNTER
              * int s = 1 ; (C programming language)
              * It is a basic integer. Once initialized you can perform only two operation on it.
              * Semaphore Methods
                * wait() - Decrement Operation (Present in the entry section of the program/process)
                  * --code--.
                  * void wait(sem S){
                    * S.count--;
                    * if(S.count < 0){
                      * add the caller to the waiting list
                      * block();
                    * }
                  * }
                * ---.
                * After the decreasing the counter by 1, If the counter value becomes negative, then
                  * 1. Add the caller to the waiting list and then 
                  * 2. Block itself
                
                * Signal() - Increment Operation (Present in the exit section of the program/process)
                  * --code--.
                  * void signal (sem S){
                    * S.count++
                    * if(s.count <= 0){
                      * rewmove a process P from the waiting list;
                      * resume(P);
                    * }
                  * }
                  * ---.
                  * After increasing the counter by 1, if the value is not positive, then 
                    * 1. Remove a process P from the waiting list
                    * 2. Resume the execution of process P and return
            * TYPES OF SEMAPHORES
              * 1. COUNTING SEMAPHORES
                * Value can be any sort of number. Any integer value.
                * Used to co-ordinate resources, where the value of semaphores is equal to the number of resources.
                * If S = 9, means we can perform 9 successful s.wait(). Means only 9 processes are allowed to access the resource.
                  * If the S>9, then the process will get blocked in the waiting queue.
                  * So this initialized value of S=9 tells us that only 9 process will access the resource. and hence 9 successful wait operation will be performed.
                  * EXAMPLE 
                    * Let say we have S = 4. So we have 4 Resource available
                    * Now comes process P1, it will get the resource, and then wait(S) operation is performed.
                    * This wait operation will decrement the value of S to 3.
                    * Now P2 comes, decrement value of S to 2, P3 comes S becomes 1, 
                    * Now P4 comes, S becomes 0
                    * Now P5 comes, and S becomes -1. Now the values is -1, this says that all our resource unit is utilized now.
                    * So process P5 goes in waiting queue, and have to wait until any of P1-P4 are done there task and resource is available.
                    * Once P1 is done it's task in Critical Section. It will run Signal(S) method and increment the S to 0.
                    * So now P5 can get the resource which is internally checking S by using do while loop for checking S.
                    * So this is the working of counting semaphore.
                * If S = -9, means there are already 9 suspended processes
              * 2. BINARY SEMAPHORES
                * Only two values 0 and 1.
                * Use as a lock for single resource.
                * S.Wait() only works when S=1
                * Easier to implement
                * EXAMPLE
                  * Let say we have S = 1. Here S is lock. lock=S=1
                  * Now comes process P1, wait(S) operation executed, S decreases to 0. Resource is allocated to P1.
                  * Now comes process P2, wait(S) operation executed, S decreases to -1. That means go in waiting queue.
                  * Once P1 completes its critical section, it will free the lock by performing Signal(lock) or signal(S) by incrementing the S/lock and P2 can use the resource.
                  * P2 internally checks the value of lock or S by doing do while loop for if lock>=0 like this.
                  * So value of binary semaphores only work with two process.
                * See in YT for diagram wise understanding.
                * https://www.youtube.com/watch?v=5BIXGnhwhxA&list=PL8tc66sMn9Kggk4zRPzcjXNUIDDnJKUnU&index=5&ab_channel=AnjaliSharma
            * PROBLEMS WITH SEMAPHORE (DEADLOCK AND STARVATION)
              * Wait() is in the entry section of the program/process
              * signal() is in the exit section of the program/process
              * Incorrect use of wait and signal operation can give rise to deadlock and starvation.
                * s.signal() .... S.wait()
                * s.wait() ..... s.wait()
                * omitting s.wait() or s.signal() or both
                * So these all incorrect use can lead to deadlock and starvation
              * So first should be wait and then signal, else the process will be violating mutual exclusion which in return there will be two process in critical section for single resource.
          * READER WRITER PROBLEM - SOLUTION FOR THE CRITICAL SECTION PROBLEM (USING THE HELP OF SEMAPHORE)
            * Problem Statement
              * The problem is to ensure that the writer have exclusive excess to the shared objects.
              * Then means only one writer can have access to the file at a time. 
              * And when writer is kept updating the file, reader process is kept waiting.
            * Variations
              * No reader will be kept waiting unless a writer has already abtain permission to use the shared objects.
                * It means no reader should wait for readers to finish simply because writer is waiting.
              * Once the writer is ready the writer performs it write as soon as possible. 
                * It means if a writer is waiting to access the object, no new reader will start reading.
            * Solution - Using Binary Semaphore
              * See YT to understand the working
              * https://www.youtube.com/watch?v=uT8oUS5T7cQ&list=PL8tc66sMn9Kggk4zRPzcjXNUIDDnJKUnU&index=6&ab_channel=AnjaliSharma
              * use of semaphore mutex=1, wrt=1 (for reading and writing so two binary variables)
              * mutex to access readcount (shared among readers)
              * wrt for notifying that writing is being performed.
              * REST you learn from vide only. and more during interview only
          * SLEEPING BARBER PROBLEM (USE OF SEMAPHORE)
            * Problem statement
              * Keeping the barber working, when there  are customers, keeping barber resting when there are no customers.
              * we have one barber chair and a waiting room with numbers of chairs.
            * Rest you see in YT - https://www.youtube.com/watch?v=puJnIpNks0Q&list=PL8tc66sMn9Kggk4zRPzcjXNUIDDnJKUnU&index=7&ab_channel=AnjaliSharma
            * More you learn during interview only from here.
          * MONITORS (PRODUCER CONSUMER PROBLEM - BOUNDED BUFFER - SEMAPHORE)
            * If we miss out any of wait() and signal() operation the mutual exclusion can be violated.
            * A monitor is a programming language construct that supports controlled access to shared data.
            * A monitor encapsulates:
              * Shared data structure
              * Procedure that operates on the shared data 
              * Perform synchronization among these processes
            * Data can only nbe accessed from within the monitor. Protecs the data from unstructured access.
            * Rest see in YT or learn in during interview only - https://www.youtube.com/watch?v=gW67ojO9jjY&list=PL8tc66sMn9Kggk4zRPzcjXNUIDDnJKUnU&index=8&ab_channel=AnjaliSharma
        * BUSY WAITING IN CRITICAL SECTION
          * check in YT only and learn during interview only - https://www.youtube.com/watch?v=W3aZQQHUWCI&list=PL8tc66sMn9Kggk4zRPzcjXNUIDDnJKUnU&index=9&ab_channel=AnjaliSharma
          *
* 4. DEADLOCK AND DEADLOCK HANDLING METHODS (SOME YOU CAN FIND IN NOTES AS WELL - FOR RE-START CHECK YT VIDEO LINK)
  * WHY DEADLOCK - PROBLEM WITH SEMAPHORE (DEADLOCK AND STARVATION) - FROM PART 3 ABOVE CONTINUATION. CHECK THAT FIRST
    * In here however we are looking for improper use of signal() and wait() operation to cause deadlock and starvation.
    * But most scenario, it is due to when two process P1 and P2 are using resources R1 and R2 respectively. And now they require other resources
      * Let say now P1 needs resource R2. But since it is being used by P2 in its critical section
      * and simultaneously P2 required resource R1 which is being used by P1 in it's CS.
      * so since both the process requires each others resource to complete there task in CS. and also unable to let go of there resource as they can't come out of cS.
      * So this gives raise to Deadlock.
  * YT LINK - https://www.youtube.com/watch?v=_zOTMOubT1M&list=PLKvlVXf2hXAPrRXE_B8LWW25r5DJVe7Yv&ab_channel=KnowledgeGATEbySanchitSir
  * https://www.youtube.com/watch?v=xw_OuOhjauw&list=PLmXKhU9FNesSFvj6gASuWmQd23Ul5omtD
  * DEADLOCK DEFINITION -
    * In a multiprogramming system, a number of process compete for limited number of resources and if a resource is not available at that instance then process enters into waiting state.
    * If a process unable to its waiting stated indefinitely, because the resources requested by it are held by another waiting process, then system is said to be in deadlock
    * Deadlock - Goes upto infinite time and still no progress. (Waiting is infinite).
    * Starvation - Goes for finite time and progress can be later achieved. (But not sure how long is this finite time. either 1 year or 100 years)
  * SYSTEM MODEL (Model followed by every process for execution)
    * Step 1 - Every process will request for the resource
    * Step 2 - If entertained then, process will use the resource
    * Step 3 - Process must release the resource after use.
  * FOUR NECESSARY CONDITION OF DEADLOCK (REQUIRED CONDITION TO GET INTO DEADLOCK - THIS IS ON THE CONTEXT/BASIS OF RESOURCE)
    * 1. MUTUAL EXCLUSION - At least one Resource should be in non-sharable mode i.e. mutual exclusion. e.g. printer.
      * So semaphore brought Mutual exclusion to achieve synchronization of process. But it also puts us in new issue called Deadlock and starvation
      * IF Resource were not mutual exclusion - then deadlock will never occur as that resource can be shared.
    * 2. HOLD AND WAIT - When a process is holding one Resource already and asks for other resource which is being held by other process.
      * So it is better for process, that unless all the resources it require is available, until then don't hold any resource. This is one of the solution we will learn Later.
      * Also waiting for all the resource, the process can go in starvation which is not good.
      * IF Resource would not be in hold and wait - then a process can release its resource after waiting for sometime,
      * and other process can use this resource and deadlock can be avoided
    * 3. NO PRE-EMPTION - A process can't pre-empt (mean snatch) resource from other resource.
      * Unless other process release the required resource voluntarily, the process can't snatch resource from other process which is holding the required resource.
      * IF Resource were Pre-Empted - then other process can snatch the required resource from other process and deadlock can be avoided
    * 4. CIRCULAR WAIT
      * WHY CIRCULAR WAIT is must for DEADLOCK process system, Even if all three process are in interdependent P1 →> P2 →> P3.
      * Then once P3 completes its task then P2 can get the resource and then P1 will also get the resource once P2 completes. So the deadlock is avoided.
      * So to actuall create the deadlock, circular wait must be there. That is P3 must be dependent on resource present in P1. Then only deadlock will actually happen
      * in this three process system, even if in this 3 process system we have Mutual Exclusion, Hold and Wait and Non-Premption, circular wait is most.
      * Else deadlock cannot happen.
      * So we are saying all these 4 conditions are required to create deadlock. Not alone they will create the deadlock.
    * So if any of this above condition is not there then deadlock will not happen.
  * DEADLOCK HANDLING METHODS HOW TO AVOID DEADLOCK IN OUR SYSTEM)
    * 1. PREVENTION (More detail below)
      * This says that you make an environment or solution such that deadlock never happens.
      * Best approach - A good approach. Don't want to do any Deadlock
      * Definition - Means design such a system which voidate at least one of hour necessary conditions of dead lock and ensure independence from dead lock
    * 2. AVOIDANCE
      * This says, that we try to avoid deadlock during runtime.
      * Little lazy as compared to prevention - Intention here is not to become successful. but more like to avoid being failing.
      * Definition - System maintains a sest of data using which it takes a decision whether to entertain a new request or not, to be in safe state.
      * Example like Bankers Algorithm
    * 3. DETECTION AND RECOVERY
      * This says, first lets have deadlock to occur, then we will see how to recover from that deadlock by some means or approach accordingly.
      * Lazier than Avoidance - This says why to learn fro al lthe deadlocks but only learn and work for those  deadlock which is happening.
      * Definition - Here we wait until deadlock occurs and once we detect it, we recover from it.
    * 4. IGNORANCE
      * This is very lazy approach. Also called as ostrich algorithm.
      * This says, that just ignore the problem as if it does not exist. (Just reboot the system if system hangs)
      * Laziest method - They don't care about the deadlock.
      * Definition - We ignore the problem as it it does not exist.
      * Example like in home applications. Windows, linux system which we work in our home. Just switch off and restart, the problem is resolved.
      * Example like In whole year power is cut for just 10-15 mins only. Then it make sense not to buy generator unnecessarily. So this means ignorance.
        * But if this is hospital then we must add generator as the risk can risk life of patients.
        * If this was a school, then there we don't need generator.
      * Example if power cut like 4-5 hours per day, then we need generator. So this time we not do ignorance.
    * #1 PREVENTION (DETAIL LEARNING - DEADLOCK PREVENTION)
      * If this 4 conditions occurs together then deadlock happens (mutual exclusion, hold and wait, no pre-emption, circular wait). Called necessary condition for deadlock.
      * So if we remove any one of above necessary condition then deadlock never happens.
      * Can we prevent mutual exclusion
        * No we can't as one process use one resource, Resource can't be shared when other process is using. Hardware Os is made in such way.
      * Can we prevent hold and wait - Yes, we have the following approach
        * Conservative approach
          * A process is allowed to start execution if and only if it has acquired all the required resources
          * It is very less efficient (because resources keep on being in hold/waiting so throughput decreases),
          * not implementable - we can't define the resource requirement until the process exactly starts so bit unimplementable,
          * Advantages - easy, deadlock independence
        * Do not hold
          * When proceeding further in instructions in program codes, before requesting new resource first the previous resources need to be free first then acquire new required resources.
          * Implementable and efficient
        * Wait time out
          * We will put maximum time bound of waiting of required resources, If until then you don't get the resources you need then, just let go of the resources you already have.
      * Can we prevent no pre-emption
        * Forcefull pre-emption
          * We will allow forcefull pre-empting resources from other process to get the required resources.
          * Only high priority process can take forcefully from low priority process. So this way it works fine.
          * Process which are in waiting state must be selected as victim rather than process in running state.
      * Can we prevent circular wait
        * p1 has R1 (Waiting for R2) and P2 has R2 (waiting for R1). This is called circular wait.
        * Here we re-update resource requirement for both P1 and P2 same. Like R1 and then R2. So if any one of process takes R1, then other never takes R2. As both need R1.
        * So if request orders are same for both the process, then we can avoid circular wait and hence deadlock can be prevented.
        * But the problem is no one knows which process needs what resources. Even process can't tells that until it is executed.
        * So to handle this we can make Resource list in Sequence, and allow all process to get resources in either increasing or decreasing order
        * Like process will generate resource as R1 and then R6 and then R10. so it should be in increasing, hence we will never fall in deadlock
    * #2 AVOIDANCE (DETAIL LEARNING - DEADLOCK AVOIDANCE)
      * A deadlock-avoidance algorithm dynamically examines the resource-allocation state.
      * The resource-allocation state is defined by the number of available and allocated resources and the maximum demands of hte processes before allowing that request first.
      * We check, if there exist the state of resources which satisfies the current need of some process.
      * More learn in YT link (It's totally see and learn only) -
      * BANKER'S ALGORITHM
        * See in that same YT
        * First check which process requires which all resources, And how many resource in resource table is avialable/free. If it satisfies then complete that process first
        * Then once that task is done, all the resources of that process is free. so now check next process with it's requirement and from avaiable resources table.
        * and so on this way bankers algorithm is used to resolve deadlock avoidance.
  * RESOURCE ALLOCATION GRAPH (See in my notes pdf)
    * SINGLE INSTANCE OF A RESOURCE
    * MULTI-INSTANCE OF A SAME RESOURCE (EXAMPLE MULTIPLE PRINTERS) - Here even in circular wait if we have multiple instance then deadlock won't happen
  * BANKER'S ALGORITHM WITH NUMERICAL (See in my notes pdf.)
    * ..
* --- < END > ------

### 3. MEMORY MANAGEMENT (GFG TOPIC INDEX - ENHANCED BY MY LEARNING)
* 1. Implementation of Contiguous Memory Management Techniques
  * A. Fixed (or static) Partitioning
  * B. Variable (or Dynamic) Partitioning (Below are dynamic allocation technique for contiguous memory allocation)
    * Best-Fit Allocation
    * Worst-Fit Allocation
    * First-Fit Allocation
    * Next-Fit Allocation
  * Fragmentation (Internal and External)
  * Compaction (Solution to External Fragmentation)
* 2. Non-Contiguous Allocation (Also a solution to External Fragmentation)
  * A. Paging
    * Page Table, MMU
  * B. Segmentation
* 3. Virtual Memory
  * Page Replacement Algorithms
   * FIFO Page Replacement Algorithm - Belady's Anomaly in Page Replacement Algorithms
   * Optimal Page Replacement Algorithm
   * Program for Least Recently Used (LRU) Page Replacement algorithm
  * Techniques to handle Thrashing
    * Learn from this link - https://www.scaler.com/topics/thrashing-in-os/
    * Thrashing is when huge page replacement is taking place such that the system hangs out. Swapping is part of page replacement algorithm, but thrashing is like worst.
* --
#### MY COMPLETE TOPIC WISE LEARNING ABOUT MEMORY MANAGEMENT (WITH TOPIC WISE DEEP LOW LEVEL LEARNING)
* Youtube playlist followed - Can refer this to understand in video :  https://www.youtube.com/watch?v=RhNWpUrO5MQ&list=PL8tc66sMn9Kjt2Wf5H9O-TMqZFQukoCQ1&ab_channel=AnjaliSharma
* Re-arranged according to actual learning techniques and flow (Bit mixed in GFG but topics are well explained)
#####  Flow of Learning is Like this (For Deep Learning in YT follow - mentioned above) (Follow less of my notes added in OS repo)
* 1. MEMORY MANAGEMENT INTRO (Why we need) 
  * Moving of program/process from Physical address (Hard Drive) to Logical Address(RAM) which is then CPU does executing of that process
  * So we need some Management stuffs to manage this flow. Usually MMU (Memory Management Unit does this task)
  * Functions of Memory Management - Allocate Memory to Programs/Process (Determine allocation policy), Check status of Memory, Swap inactive process with active process etc.
* 2. ADDRESS BINDING, LINKING AND LOADING CONCEPTS
  * ADDRESS BINDING - The program we write is in Secondary Memory. We want it to get executed and bring it in Primary Memory. More check in YT only.
    * MMU (Memory Management Unit) - It is a hardware component whose main purpose is to convert virtual addressed created by the CPU (Logical address) into physical adressed in the computer's memory.
  * LINKING - Linking of our compiled program code (main function in C) viz intermediate code which is machine readable (known as object code) with Header files (function library) like std header file in C into an executable file.
    * Two types of linking : Static (directly use header library) and Dynamic Linking (Use pointer address to get header library rather than complete header library)
  * LOADING - It is process of loading a program from the secondary memory to main memory
    * Two types of loading - Static loading (All at a time) and Dynamic loading (when needed)
* 3. SWAPPING AND OVERLAYS
   * SWAPPING - Changing of memory location of a process from secondary to main memory and vice versa.
   * OVERLAYS - When the size of process is greater than Memory allocated to it, then overlays are used to execute such programs. In overlays we keep only those instructions
     * and data in memory which are needed at any given time. When new instructions are needed they will be loaded in previous used up instructions which is no longer required.
     * Advantage of Overlay - Using less memory efficiently
     * Disadvantage - Extensive Programming Requirements (We have to make extra programs to handle such scenarios).
* 4. MEMORY ALLOCATION TECHNIQUES
   * Two Types
     * 1. CONTIGUOUS MEMORY ALLOCATION (like arrays) - This has become obsolete. Not more used in real life systems
       * A. FIXED OR STATIC ALLOCATION 
         * All sectors of Memory will be of fixed size. Each partition is called frame. 
         * The degree of multiprogramming will depend on the number of partitions of this main memory
       * B. VARIABLE OR DYNAMIC ALLOCATION
         * All sectors of memory are of different size like 1kb, 2kb, 10kb etc, they are called Hole
         * Process comes to search the appropriate Hole and get settled, search in sequential only. This searching and allocating memory process is called DYNAMIC STORAGE ALLOCATION PROBLEM
         * DYNAMIC STORAGE ALLOCATION PROBLEM
           * 4 ways to resolve this problem (DYNAMIC ALLOCATION)
             * 1. FIRST FIT - When process comes it settles down when it finds the first memory space hole suitable for it.
             * 2. BEST FIT - When process comes and find most suitable hole according to there size and settle down. Allocate the smallest hole that is big enough. 
               * We must search the entire list, unless the hole list is ordered by size. This strategy produces the smallest hole
             * 3. WORST FIT - When process comes and find out large enough hole for it and settle down. It checks from first to last and then select the largest hole.
             * 4. NEXT FIT - When process continues to search from where the previous process has find out its position. This allocates like first fit only, just searching starts from last left allocation. 
               * This is done because it will make use of whole list rather than beginning list of holes.
       * FRAGMENTATION (PARTITION AND MEMORY MANAGEMENT ISSUE) - (Note - this is possible in contiguous memory allocation only)
         * PARTITION OF MEMORY - Partition of Memory in Sectors. Goal is to reduce memory wastage (fragmentation) and use of large process to run easily in smaller memory areas (Overlay)
         * FRAGMENTATION - Inability to use the memory even if it is free is called fragmentation.
           * Memory fragmentation is when most of your memory is allocated in a large number of non-contiguous blocks, or chunks - leaving a good percentage of your total memory unallocated, but unusable.
           * 3 forms of Fragmentation (But in sylabus only 2)
             * INTERNAL FRAGMENTATION
               * Illustration - lets say we have partitioned our main memory in block size of 10k. We have now process of size 8k. So when we put this process in 10k block, 2k waste we get, this is called internal fragmentation.
               * CPU will allocate next process in next free block. let say 5k process, so wasted 5k. so it will be allocate in next. now we have 5+2k waste total. so now process of 7k comes then we can't accomodate it even though we have space. because the space is not contgiguous.
             * EXTERNAL FRAGMENTATION
               * Illustration - block size 10k taken again. let say we have 10k of 5 partition. so we have 50k total in memory. let say we have occupied block 1, 3, and 5. so we have 2 and 4 block left of each 10k size and total 20k.
               * Now if we have some process of 20k. then we can't allocate it as 2 and 4 are not contiguous memory block. so this results in external fragmentation
       * SOLUTIONS OF EXTERNAL FRAGMENTATION
         * 1. COMPACTION
           * It is process of combining free memory block group together and used memory block together. This can be useful to remove external fragmentation.
           * Compaction refers to combine all the empty spaces together.
           * Processes are on one side and free spaces is on the other side in the memory. During memory compaction we have to first block process for compaction, move them towards lower address space
           * allocate memory for pending request, resume blocked processes w.r.t compaction, It consumes CPU time (Overhead). Program needs to support the dynamic allocation.
           * So due to this above disadvantage in compaction we have other way to remove external fragmentation called NON-CONTIGUOUS MEMORY ALLOCATION
         * 2. NON-CONTIGUOUS MEMORY ALLOCATION
     * 2. NON-CONTIGUOUS MEMORY ALLOCATION (like linkedlist)
       * Two Types
         * 1. PAGING
           * Paging is a memory management scheme that eliminates the need for a contiguous allocation of physical memory. 
           * The process of retrieving processes in the form of pages from the secondary storage into the main memory is known as paging. 
           * The basic purpose of paging is to separate each procedure into pages.
           * Memory management technique that permits the physical address space of a process/program to be non-contiguous.
           * The mapping between logical pages and physical page frames is maintained by the page table, which is used by the memory management unit (MMU) to translate logical addresses into physical addresses. The page table maps each logical page number to a physical page frame number. By using a Page Table, the operating system keeps track of the mapping between logical addresses (used by programs) and physical addresses (actual locations in memory).
           * Physical memory is divided into fixed size-bock called FRAMES (Main Memory is divided into fixed size block called frames)
           * Logical memory is divided into fixed size block called PAGES (Process before bringing it to memory can be divided into fixed size block called page)
           * A frame has the same size as a page, It is place where a logical page can be physically placed
           * So since the size of page and frame is same then it will remove internal fragmentation. Paging however will not completely irradicate internal fragmentation, as last block of a process page size can be smaller so.
           * PAGE TABLE 
             * This is table whose main task is to map the page with frame and store the table list in the table. 
             * Table contains page column and frame column and which page map to which frame is present there. It has other task also like memory protection etc.
             * Each process has its own page table stored in memory. Page table is organized as series of entries.
             * Number of entries in the page table = Number of pages in logical address space of that process/program
             * Page table contains frame numbers. Page table is kept in the main memory. 
             * Page table implementation maintains a four bit per page table entry. 
               * Use bit, Modified bit, valid bit, Read only. (Apart from page number and corresponding frame number. it also does protection task etc.)
           * PAGE NUMBER AND OFFSET - See in video better explained there. 
             * Let say a process have 0-15 instructions. so total 16 instructions, Divided into 4 page. so each page has 4 instructions of code. 
             * So this instructions within the page is called offsets. CPU creates this Logical Address of this page and offset.
             * Physical address is frame and its offset created for Main Memory RAM.
           * Advantages - No External Fragmentation, Simple Memory Management Algorithm, Swapping is easy.
           * Disadvantages - Internal fragmentation (It reduces not totally irradicate), Page table may consume more memory, Multi level paging leads to memory reference overhead.
           * Disadvantages of Paging - I/O Overhead During Page Faults: When a required page is not in physical memory (page fault), it needs to be fetched from secondary storage, causing delays and increased I/O operations.
           * See this page for more about paging Disadvantages and advantages (important) - https://www.geeksforgeeks.org/paging-in-operating-system/?ref=lbp
           * Numerical problems related to paging. Page table formulas. Address translation
           * WHAT IS MEMORY MANAGEMENT UNIT(MMU)?
             * A memory management unit (MMU) is a technique used to convert logical address to physical address. Logical address is the address generated by CPU for each page and physical address is the real address of the frame where page is going to be stored.
             * Whenever a page has to be accessed by CPU using the logical address, it requires physical address for accessing the page. Logical address comprises of two parts: Page Number and Offset.
           * TLB (TRANSLATION LOOK aside BUFFER) - you may ignore this topic from video as out of syllabus. But just check as knowledge.
             * TLB = Cache (Fast lookup hardware)(Cache Memory) (But used for pages to reduce the effectvie access time for the frame number) - It acts as cache in paging.
           * SHARED PAGING, TWO LEVEL PAGING AND MISCELLANEOUS TOPICS
             * PROTECTION - 
               * So attributes like Page, corresponding frame, read bit, invalid bit etc. these columns can be also added in page table.
               * To protect page table. If page table we want for read only then set bit to 1. If modifiable set bit to 0. Other additional bit with page table is valid-invalid bit.
               * So this way memory protection is done.
             * SHARED PAGES - 
               * Some programs like Compilers, run time libraries, the code in them is never changed, but might be used again and again by multiple process
               * So such programs present in Page table is called shared pages. So they are shared in page table
             * STRUCTURE OF THE PAGE TABLE
               * Why we need to do this - As process becomes larger, the page table also grows larger, so we need efficient way to store this page table in memory.
               * Large page table is not desired as they take lot of memory. So to reduce this issue we have below way of structuring the page table to resolve this issue.
               * 3 TYPES
               * 1. HIERARCHICAL PAGING
                 * MULTI-LEVEL PAGING
                   * Larger page table is not desired because they take lot of memory.
                   * So how to reduce page table size.
                     * Solution 1 - Increase the page size. (1 page of size 20k takes more lines then of size 40k of that same process to store each page in page table.). But in this case if code is small for some instructions then internal fragmentation will occur. So we came with multilevel paging.
                     * Solution 2 - Multilevel Paging in Hierarchical memory. Outer page table will have entry/index of inner page table. Inner page table will contains the page table. See in YT 10/17.
               * 2. HASHED PAGE TABLE
                * Here we make use of Hash function to store our page in page table, 
                * Internally linkedlist is used to point to the frame. This hash table is like array of linkedList to understand in coding way. Where linkedlist points to frames.
                * So whenever that page is required again, we make use of hash function to get that from hash table and put in main memory. Here instead of page table we can say it's hash table.
               * 3. INVERTED PAGE TABLE
                 * Very Imp - 
                   * Inverted Page Table is the global page table which is maintained by the OS for all the processes. In inverted page table, the number of entries is equal to the number of frames in the main memory.
                   * It can be used to overcome the drawbacks of page table
                   * There is always a space reserved for the page regardless of the fact that whether it is present in the man memory or not, However, this is simply the wastage of the memory if the page is not present.
                   * We can save this wastage by just inverting the page table. We can save the details only for the pages which are present in the main memory. 
                   * Frames are the indices and the information saved inside the block will be Process ID and page number.
                   * Like in frame1(P1 page5) in frame2(P2 page3), in frame3(P1 page2). etc.
                 * This says that we want only one page table to maintain for all processes. We don't want 100 page tables created for 100 processes as they will use lot of memory.
                 * So this time when CPU will generate Logical Address for a Process, this time it will generate ProcessID along with Page Number in the Logical address.
                 * So previously CPU generates Logical address  for a process having Page Number of a process
                 * But now CPU generated Logical address for a process having page number and ProcessID (This extra bit/header we added now)
                 * So this time in Page table, we would have Process ID (this extra column added in page table) along with page number, Process ID will identify to which process it belongs to. So that memory can get that page of certain process when required without making use of multiple page tables.
               * -
         * 2. SEGMENTATION
           * In Layman words Understanding
             * Lets say we developers have different code chunk in our program having of different size. 
             * Lets say main program of 5kb, SharedLibrary of 6kb and Stack of 4kb.
             * In paging we didn't care of this sizes. We would just divide the program in fixed page of let's say 10k, And we will put these programs accordingly in page of 10k by mixing two types of code chunk in one to become in 10k page.
             * So here developers perspection is not taken care of in paging.
             * So we came with new technique of Segmentation to overcome the paging issue where developers perspection is taken care.
             * So now we won't divide our process in pages of fixed size. 
             * But now we will divide our process in the form of different code chunk. Like Main Program, Shared Libraries, Function, Stack. Irrespective of there size. 
             * These code chunks are called as Segment.
             * Also we won't divide our main memory in frames of fixed size. But now we will try and find required space needed by our code chunk and put it there.
             * These mapping of process segments with main memory address is stored in Segment Table.
             * Segment Table has column like s.no (which says segment number of the program), Base Address (first bit of memory address where the segment is allocated in memory) and Length (Size of segment or say offset) .
             * Here logical address is the combination of Segment number and offset.
             * See in YT, You understand more. YT - Segmentation
           * Address translation in Segmentation and Numericals (SEE YT only)
           * SEGMENTATION FAULT - When searching for offset greater than that chunk of code actually has then it will give segmentation error. 
             * Example I have segment of size 6. ( instruction are 0,1,2,3,4,5). 
             * Base address is 0 and offset (last address is 5). So when we search for segment 0 with offset 9, then there is no 9th instruction in my segment. so Segmentation fault occurs.
           * PAGING VS SEGMENTATION
             * Paging has some internal fragmentation, whereas segmentation has no internal fragmentation
             * Paging does not care user view whereas segmentation does.
             * Paging has not external fragmentation, whereas in segmentation there is external fragmentation.
             * So advantages are exact opposite in this two memory allocation technique.
             * So we can combine this two to develop a new methodologies.
             * The combined methodologies is called Paged Segmentation
         * PAGED SEGMENTATION (COMBINED EFFECT OF PAGING AND SEGMENTATION)
           * LayMan Understand
             * The program is divided into Segments.
             * It preserves the user view of the Program
             * The segments are further divided in to pages
             * So that the non-contiguous memory allocation can be implemented effectively.
             * Page size = Frame size (Physical memory)
             * SO here each segment is internally divided into pages.
           * IMPORTANT POINTS
             * Pages are smaller than segments.
             * Each segments has a page table which means evenly program has multiple page tables. One for each segment of program
             * Suppose we have 5 segments in a program, so there will be 5 Page table. and one Segment table to store the segments. 
             * Here two tables are used segment table and page table.
             * Segment table contains the information about every segment. Each segment table entry points to a page table entry.
             * Logical address comprises <segment no, offset>
             * Segment number is used to index the segment table.
             * Each segment table entry consists of <segment length, page table base>
             * The logical address is valid if the offset is less than the segment legnth.
             * The segment offset is divided into 2 parts <page no, page offset>
             * Here page no is used to index the page table of the segment
             * Logical Address generates <Segment No, Page No. Offset>
               * Segment Number => which code chunk (In segment table find that segment number)
               * Page Number => Which page of that code chunk (Segment table s.no contains the address of that page table. So we go to that address and find the page table and get the page number)
               * Frame Number => Using page number find the frame number mapped to it in page table
               * Offset => Which instruction of that page to be executed in main memory (Go to that page table and find the offset)
             * So this is basic hardware working of Paged Segmentation
           * ADVANTAGES
             * Reduces memory usages.
             * No external fragmentation
           * DISADVANTAGES
             * Some internal fragmentation still there.
* 5. VIRTUAL MEMORY
  * WHY VIRTUAL MEMORY AS WE ALREADY HAVE MEMORY MANAGEMENT TECHNIQUES
    * Consider a situation - Lets say we have large programs in our system. 
    * Where even overlay concept fails.
    * So in that case memory will run out and a trap will get generate and system crashes.
    * So to check this situation we have Virtual Memory to resolve this issue.
  * HOW VIRTUAL MEMORY WORKS (MORE BETTER EXPLAINED IN YT CHECK)
    * If we want to bring some page in main memory, but the main memory is full then
      * If we have no virtual memory concepts => Then trap is generated and system crashes.
      * If we have virtual memory concepts
        * The memory map (same as page table) will find that there is no free frames available in main memory
        * So it will store the page in the secondary memory called backing store. You know secondary memory has huge space.
        * So when any frame is free, then swapping takes place between Backing store and Main memory for that page and it gets the frame.
        * So here we get the illusion of as if we have large memory space. 
        * But this is done to remove the trap and system crashes.
        * Here page table is called Memory map.
        * Backing store is Secondary storage. Where page will get stored in case Main Memory is full.
    * So technically here we are calling Disk Storage or secondary memory as our virtual memory.
  * ADVANTAGES 
    * System libraries can be shared.
  * IMPLEMENTATION OF VIRTUAL MEMORY
    * 1. DEMAND PAGING
      * Only those pages are put in Main Memory which has high demand. Other less required pages are put in Secondary Storage (Backing store).
      * Bring a page into memory only when it is needed
      * We will remove oldest page from ram and put the latest page in ram from backing store. 
      * So removing page from ram is called page out, and adding from backing store to ram is called page in.
      * TYPES OF DEMAND PAGING
        * PURE DEMAND PAGING
          * Add pages only when it is required.
        * PRE-FETCHED
          * Add some pages before execution started
      * LAZY SWAPPER 
        * Swap from and back to RAM to Backing Store and vice versa.
        * Demand paging make use of this swapping software patch.
      * VALID/INVALID BIT : 
        * v => In memory, I => not in memory. this is extra bit in map table.
      * PAGE FAULT 
        * When we access a page marked invalid (Means not present in memory ram), it causes page fault.
        * OS performs a series of steps to handle page fault. to bring that page from backing store to main memory.
        * More page fault, the throughput of system declines.
        * WHAT HAPPENS IF THERE IS NO FREE FRAME IN RAM? (THERE COMES THE PAGE REPLACEMENT TECHNIQUES)
          * Page replacement - find some page in memory, but not really in use, swap it out
            * algorithm
            * performance - want an algorithm which will result in minimum number of page faults.
          * Same page may be brought into memory several times.
      * BASIC PAGE REPLACEMENT STEP
        * Find the location of the desired page on disk (Backing store)
        * Find a free frame: If there is a free frame use it. else use a page replacement algo to select a victim frame.
        * Bring the desired page into the (newly) free frame; update the pate and frame tables
        * Restart the process.
      * PAGE REPLACEMENT ALGORITHM
        * To reduce page fault we need this page replacement algorithms
        * FIFO PAGE REPLACEMENT ALGORITHM (CONSEQUENCE - BELADY'S ANOMALY)
          * https://www.youtube.com/watch?v=Q3Dkjq0xU0M&list=PL8tc66sMn9Kjt2Wf5H9O-TMqZFQukoCQ1&index=15&ab_channel=AnjaliSharma
          * See YT only to understand working using Reference String, Number of frames, Number of page faults, page frames.
          * Here we will replace that page which came first.
          * After complete algorithm, at end we will get how many page faults occurred.
          * This  you can learn better only by looking the YT video only.
          * Page hit = when the page required is already present in memory frame.
          * Reference string of page - example (7,0,1,2,0,3,0,4,2,3). These are pages of a process required in the sequence to be added in our memory
          * Frame size - Total number of frames in main memory
          * Page fault - Unable to find that page in memory when required.
          * BELADY'S ANOMALY
            * The advantage of FIFO page replacement algorithm is easy to implement and disadvantage is that it suffers from Belady's Anomaly
            * It is an unexpected result in FIFO algorithm. 
            * In some of the reference strings, increasing the size of the memory (number of frames - frame size) increases the page fault rate.
            * So this above statement is what belady's anomaly. Remember it is for some reference string of pages only. ie in some  cases.
        * OPTIMAL PAGE REPLACEMENT ALGORITHM
          * Here in reference string of pages, we will look forward for the upcoming required pages in reference string.
          * So looking forward whichever page has demand very later stage in the reference string. we will replace that only.
          * So this is called optimal page replacement algorithm approach
          * Rest check in YT to understand with example
        * LEAST RECENTLY USED (LRU) PAGE REPLACEMENT ALGORITHM
          * Unlike Optimal where we look forward here we will look at backward.
          * And whichever page was used least recently, we will replace that page.
          * Remember least recently used is not like First used for first come. It can be possible that same page was required again. so that becomes now recent one.
          * For more you can check in YT only. Well explained with example.
          * Least recently used can be fifo only when there is  distinct pages in reference string of pages.
      * TYPES OF PAGE REPLACEMENT ALGORITHMS
        * GLOBAL REPLACEMENT
          * Global Replacement allows a process  to select a replacement frame from the set of all frames even that frame is currently allocated to some other process. 
        * LOCAL REPLACEMENT
          * Local Replacement requires that each process select from only its own set of allocated frames.
      * THRASHING
        * Techniques to handle Thrashing
        * Learn from this link - https://www.scaler.com/topics/thrashing-in-os/
        * Thrashing is when huge page replacement is taking place such that the system hangs out. Swapping is part of page replacement algorithm, but thrashing is like worst.
      * -end of lecture
    * 2. DEMAND SEGMENTATION
      * Nothing about this. not so important
* --<END>--

### 4. STORAGE MANAGEMENT
#### Storage Management
#### File Systems in Operating System
#### File Allocation Methods
#### Free Space Management
#### Disk Scheduling Algorithms
* Learning from this video for disk management and scheduling algorithm is enough to understand. (GFG is compulsory to check and learn)
* https://www.youtube.com/watch?v=bqQprtp3byE&list=PL8tc66sMn9Kiy8Xtp5-_lLP8D9gR8gobp&ab_channel=AnjaliSharma
#### RAID (Redundant Arrays of Independent Disks)
* Learning from this vide for RAID is enough to understand RAID, and also check in interviewbit question there only is enough.(GFG is compulsory to check and learn)
* https://www.youtube.com/watch?v=bqQprtp3byE&list=PL8tc66sMn9Kiy8Xtp5-_lLP8D9gR8gobp&ab_channel=AnjaliSharma
* .
#### Storage Management Topic wise learning (as per above YT link)
##### DISK MANAGEMENT IN OS
* 1. DISK STRUCTURE 
  * Topics like Seek Time, Partition
* 2. DISK SCHEDULING ALGORITHM IN OS
  * 1. FCFS DISK SCHEDULING
  * 2. SSTF DISK SCHEDULING
  * 3. SCAN DISK SCHEDULING
  * 4. C-SCAN DISK SCHEDULING
  * 5. LOOK DISK SCHEDULING
  * 6. C-LOOK DISK SCHEDULING
  * 7. DISK SCHEDULING PRACTISE QUESTIONS
* 3. RAID (REDUNDANT ARRAY OF INDEPENDENT DISKS)
  * Motive - If in case disk is corrupt, so for backup we need RAID technique for fault tolerance of our  program code. so that our code we can get back
  * LEVEL 0 to 6
  * LEVEL 0 - Only Stripping (dividing our program to separate disks plate)
  * LEVEL 1 - Stripping and Mirroring (diving our program to separate disks and also creating separate duplicate disk to store our  programs)
  * LEVEL 2 - Use of hamming code instead of mirroring. We store our duplicate program code in hamming code error correction program and store in new disk
  * LEVEL 3 - Use of Parity code. this uses less bits as compared to hamming code. Here we create parity code for each programs each partitions and store in new disk.
  * LEVEL 4 - Here we make Parity code of whole program rather than program crunch and then store it is separate disks.
  * LEVEL 5 - We won't have a separate disk as whole disk corrupt then whole backup goes  away. so we add each parity program code to separate disk which is being used by programs only. no separate disk for parity.
  * LEVEL 6 - Here we add parity code of each program in two separate disks which is used by programs only (and not alone) rather than in one.
  * More you can understand by watching the videos by watching.
* 4. I/O Management
















