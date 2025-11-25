# Operating System - 3 Hour Crash Course  
  
**Total Duration: 3 Hours | Interview Focused | Practical Examples**  
  
---  
  
## How to Use This Guide  
  
```  
Hour 1 (0:00 - 1:00): OS Basics + Process Management  
Hour 2 (1:00 - 2:00): CPU Scheduling + Memory Management  
Hour 3 (2:00 - 3:00): File Systems + Practice + Interview Prep  
```  
  
Take 5-minute breaks after each hour. Practice commands as you learn.  
  
---  
  
## HOUR 1: OS Fundamentals & Processes   
  
### Part 1: Operating System Basics   
  
#### What is Operating System?  
  
Software that manages hardware and software resources.  
  
**Real-World Analogy:**  
```  
OS = Railway Station Manager  
- Manages multiple trains (processes)  
- Allocates platforms (CPU)  
- Controls signals (I/O devices)  
- Maintains timetable (scheduling)  
```  
  
#### Functions of OS (Remember: PMMFS)  
  
1. **Process Management** - Running multiple programs  
2. **Memory Management** - Allocating RAM  
3. **File Management** - Organizing files  
4. **Device Management** - Hardware control  
5. **Security** - Protection from threats  
  
#### Types of OS (4 Main Types)  
  
**Batch OS**  
- Jobs processed in batches  
- Example: Old bank check processing  
  
**Time-Sharing OS**  
- Multiple users share CPU time  
- Example: University server (100 students)  
  
**Real-Time OS (RTOS)**  
- Fixed response time  
- Example: ATM, Railway signals, Medical devices  
  
**Distributed OS**  
- Multiple machines working together  
- Example: Flipkart servers across India  
  
**Your Computer Uses:**  
- Windows (Multiprogramming + Time-sharing)  
- Linux (Multiprogramming + Time-sharing)  
- Android (Based on Linux kernel)  
  
---  
  
### Part 2: Process Management   
  
#### Process vs Program  
  
```  
Program = Code on disk (WhatsApp.exe)  
Process = Program in execution (WhatsApp running)  
  
Example:  
Chrome.exe on disk = Program  
Chrome running in RAM = Process  
```  
  
#### Process States (5 States)  
  
```  
[NEW] → Created but not ready  
   ↓  
[READY] → Waiting for CPU  
   ↓  
[RUNNING] → Currently executing  
   ↓  
[WAITING] → Waiting for I/O  
   ↓  
[TERMINATED] → Finished execution  
```  
  
**Real Scenario: Booking Train Ticket**  
```  
1. NEW: Open IRCTC app (process created)  
2. READY: App loaded, waiting for CPU  
3. RUNNING: Searching trains (using CPU)  
4. WAITING: Loading results from server (I/O wait)  
5. RUNNING: Displaying results  
6. TERMINATED: Close app (process ends)  
```  
  
#### Process Control Block (PCB)  
  
Contains all process information:  
- Process ID (PID)  
- Process State (Ready/Running/Waiting)  
- Program Counter  
- CPU Registers  
- Memory Information  
- I/O Status  
  
**View Processes:**  
```bash  
# Windows  
tasklist  
taskmgr  
  
# Linux  
ps aux  
top  
htop  
```  
  
#### Context Switching  
  
CPU switches from one process to another.  
  
**Example: Food Court**  
```  
Time 0-5 sec:   Chef makes Suresh's burger (Process A)  
[Context Switch - Save A's state, Load B's state]  
Time 5-10 sec:  Chef makes Ramesh's pizza (Process B)  
[Context Switch - Save B's state, Load C's state]  
Time 10-15 sec: Chef makes Mahesh's sandwich (Process C)  
  
Overhead = Time to switch between tasks  
```  
  
**Why Context Switch?**  
- Enables multitasking  
- Fair CPU time distribution  
- Better resource utilization  
  
#### Process Creation (fork)  
  
**Simple Example:**  
```c  
#include <stdio.h>  
#include <unistd.h>  
  
int main() {  
    int pid = fork();  // Creates child process  
      
    if (pid == 0) {  
        printf("Child process: Ramesh\n");  
    } else {  
        printf("Parent process: Suresh\n");  
        printf("Child PID: %d\n", pid);  
    }  
    return 0;  
}  
```  
  
**Output:**  
```  
Parent process: Suresh  
Child PID: 1235  
Child process: Ramesh  
```  
  
#### Practice Exercise   
```bash  
# Open Task Manager (Windows) or top (Linux)  
# Answer these:  
1. How many processes are running?  
2. Which process uses most CPU?  
3. Which process uses most memory?  
4. Find your browser's PID  
```  
  
---  
  
### Part 3: Threads   
  
#### Process vs Thread  
  
```  
Process = Heavy (separate memory)  
Thread = Light (shared memory)  
  
Example: Chrome Browser  
- Chrome = 1 Process  
- Each Tab = 1 Thread  
All tabs share Chrome's memory  
```  
  
#### Benefits of Threads  
1. **Faster creation** - Less overhead  
2. **Shared memory** - Easy communication  
3. **Better performance** - Parallel execution  
  
**Real Scenario: WhatsApp**  
```  
Main Thread: UI display  
Thread 1: Send message  
Thread 2: Receive messages  
Thread 3: Download images  
Thread 4: Play voice notes  
  
All threads in one WhatsApp process  
```  
  
#### Simple Thread Example (Python)  
```python  
import threading  
  
def download_file(filename):  
    print(f"Downloading {filename}...")  
    import time  
    time.sleep(2)  
    print(f"{filename} downloaded!")  
  
# Create threads  
t1 = threading.Thread(target=download_file, args=("Movie.mp4",))  
t2 = threading.Thread(target=download_file, args=("Song.mp3",))  
  
# Start threads (parallel execution)  
t1.start()  
t2.start()  
  
# Wait for completion  
t1.join()  
t2.join()  
  
print("All downloads complete!")  
```  
  
---  
  
### Part 4: Quick Recap   
  
#### Key Concepts Summary  
```  
✓ OS manages hardware and software  
✓ Process = Running program  
✓ Process states: New, Ready, Running, Waiting, Terminated  
✓ Context switch enables multitasking  
✓ Thread = Lightweight process  
✓ PCB stores process information  
```  
  
#### Quick Quiz  
```  
Q1: What is difference between process and program?  
Q2: Name 5 process states.  
Q3: What is context switching?  
Q4: Why use threads instead of processes?  
Q5: Give real example of multithreading.  
  
Answers at the end of this section!  
```  
  
---  
  
## HOUR 2: CPU Scheduling & Memory   
  
### Part 1: CPU Scheduling   
  
#### Why Scheduling?  
  
Multiple processes compete for CPU. Need fair allocation.  
  
#### Scheduling Criteria  
- **CPU Utilization** - Keep CPU busy  
- **Throughput** - Processes completed per unit time  
- **Waiting Time** - Time in ready queue  
- **Response Time** - Time to first response  
  
#### FCFS (First Come First Serve)  
  
Simplest algorithm - First arrived, first served.  
  
**Example: Railway Ticket Counter**  
```  
Customer    Arrival    Service Time  
Mukesh      0          5 min  
Kamlesh     1          3 min  
Nitesh      2          8 min  
  
Gantt Chart:  
|--Mukesh--|--Kamlesh--|----Nitesh----|  
0          5           8              16  
  
Waiting Time:  
Mukesh:  0 (arrived first)  
Kamlesh: 5 (waited for Mukesh)  
Nitesh:  8 (waited for Mukesh + Kamlesh)  
  
Average Waiting Time = (0+5+8)/3 = 4.33 min  
```  
  
**Disadvantage:** Convoy Effect (long process blocks short ones)  
  
#### SJF (Shortest Job First)  
  
Shortest process executed first.  
  
**Example: Bank Queue**  
```  
Customer     Service Time  
Hitesh       2 min  
Ratnesh      10 min  
Himesh       3 min  
  
Order: Hitesh → Himesh → Ratnesh (shortest to longest)  
  
Gantt Chart:  
|--Hitesh--|--Himesh--|----Ratnesh----|  
0          2          5               15  
  
Waiting Time:  
Hitesh:  0  
Himesh:  2  
Ratnesh: 5  
  
Average = (0+2+5)/3 = 2.33 min (Better than FCFS!)  
```  
  
**Advantage:** Minimum average waiting time  
**Disadvantage:** Starvation (long jobs may never execute)  
  
#### Round Robin (RR)  
  
Each process gets fixed time slice (quantum).  
  
**Example: Video Game Console**  
```  
Time Quantum = 2 min  
Player      Play Time  
Jitesh      5 min  
Gukesh      3 min  
Suresh      2 min  
  
Execution:  
0-2:   Jitesh (3 min left)  
2-4:   Gukesh (1 min left)  
4-6:   Suresh (done!)  
6-7:   Gukesh (done!)  
7-9:   Jitesh (1 min left)  
9-10:  Jitesh (done!)  
  
Everyone gets fair chance!  
```  
  
**Advantage:** Fair, no starvation  
**Disadvantage:** Context switch overhead  
  
#### Priority Scheduling  
  
Higher priority → Earlier execution.  
  
**Example: Hospital Emergency**  
```  
Patient     Priority    Time  
Ramesh      3 (Minor)   10 min  
Mahesh      1 (Critical) 15 min  
Dinesh      2 (Serious)  5 min  
  
Execution Order: Mahesh → Dinesh → Ramesh  
(1 = Highest priority)  
```  
  
**Problem:** Low priority starvation  
**Solution:** Aging (increase priority over time)  
  
#### Quick Calculation Practice  
```  
Process    Arrival    Burst Time  
P1         0          4  
P2         1          3  
P3         2          1  
  
Calculate for FCFS:  
Gantt: |--P1--|--P2--|P3|  
       0      4      7  8  
  
Waiting Time:  
P1: 0  
P2: 4-1 = 3  
P3: 7-2 = 5  
  
Average = (0+3+5)/3 = 2.67  
```  
  
---  
  
### Part 2: Process Synchronization   
  
#### Critical Section Problem  
  
Multiple processes accessing shared resource.  
  
**Real Example: Last Train Seat**  
```  
Situation:  
- 1 seat left on Rajdhani Express  
- Mukesh and Kamlesh book simultaneously  
  
Without Synchronization:  
Both see "1 seat available"  
Both click "Book"  
Both get confirmation  
Conflict! ⚠️  
  
With Synchronization:  
Mukesh locks seat → Books → Unlocks  
Kamlesh waits → Sees "Sold out"  
No conflict! ✓  
```  
  
#### Semaphore  
  
Synchronization tool (counter variable).  
  
**Binary Semaphore (Mutex):**  
```c  
Semaphore seat = 1;  // 1 = available  
  
Process Mukesh:  
    wait(seat);      // 1 → 0 (lock)  
    book_seat();  
    signal(seat);    // 0 → 1 (unlock)  
  
Process Kamlesh:  
    wait(seat);      // Waits if 0  
    book_seat();  
    signal(seat);  
```  
  
**Counting Semaphore:**  
```  
ATM with 3 machines  
Semaphore machines = 3;  
  
Person arrives:  
wait(machines)  // 3→2→1→0  
Use ATM  
signal(machines) // 1→2→3  
  
If 0, wait in queue  
```  
  
#### Deadlock  
  
Circular waiting for resources.  
  
**Example: Traffic Intersection**  
```  
     North Car ↓  
          |  
West Car→-+-← East Car  
          |  
     South Car ↑  
  
Each waits for other to move  
Nobody can proceed = Deadlock!  
```  
  
#### Deadlock Conditions (All 4 needed)  
  
1. **Mutual Exclusion** - Resource cannot be shared  
2. **Hold and Wait** - Holding resource, waiting for another  
3. **No Preemption** - Cannot forcefully take resource  
4. **Circular Wait** - Circular dependency  
  
**Prevention:** Break any one condition!  
  
---  
  
### Part 3: Memory Management   
  
#### Memory Hierarchy  
  
```  
Fastest ↑               Smallest ↑  
[Registers]     - Nanoseconds  
[Cache]         - Nanoseconds  
[RAM]           - Microseconds  
[Hard Disk]     - Milliseconds  
[Cloud]         - Seconds  
Slowest ↓               Largest ↓  
```  
  
#### Logical vs Physical Address  
  
```  
Logical = Program sees (virtual)  
Physical = Actual RAM location  
  
Example:  
Program thinks: Address 1000  
Actually at:    Address 5000  
  
MMU (Memory Management Unit) translates  
```  
  
#### Paging  
  
Dividing memory into fixed-size pages.  
  
**Example:**  
```  
Physical Memory = 16 KB  
Page Size = 4 KB  
Process Size = 10 KB  
  
Process divided into pages:  
Page 0: 0-4 KB  
Page 1: 4-8 KB  
Page 2: 8-10 KB  
  
Page Table:  
Page 0 → Frame 5  
Page 1 → Frame 2  
Page 2 → Frame 7  
  
No external fragmentation!  
```  
  
#### Virtual Memory  
  
Using disk as extended RAM.  
  
**Scenario:**  
```  
Laptop RAM: 4 GB  
Running:  
- Chrome: 1 GB  
- VS Code: 1 GB  
- Photoshop: 2 GB  
- Excel: 500 MB  
- Word: 500 MB  
Total: 5 GB > 4 GB RAM!  
  
Solution: Virtual Memory  
- OS uses hard disk as extra RAM  
- Swaps less-used pages to disk  
- Called "Page File" or "Swap Space"  
```  
  
**Check Virtual Memory:**  
```bash  
# Windows  
systeminfo | findstr Memory  
  
# Linux  
free -h  
```  
  
#### Page Replacement Algorithms  
  
**FIFO (First In First Out):**  
```  
Memory Frames: 3  
Reference String: 1, 2, 3, 4, 1, 2, 5  
  
[1] [_] [_]  
[1] [2] [_]  
[1] [2] [3]  
[4] [2] [3]  ← Remove 1 (oldest)  
[4] [1] [3]  ← Remove 2 (oldest)  
[4] [1] [2]  ← Remove 3 (oldest)  
[4] [1] [5]  ← Remove 2 (oldest)  
```  
  
**LRU (Least Recently Used):**  
```  
Removes page not used for longest time  
Better than FIFO  
Example: Cache management in apps  
```  
  
---  
  
## HOUR 3: File Systems & Interview Prep   
  
### Part 1: File Systems   
  
#### File Structure  
  
```  
Linux/Unix:  
/  
├── home  
│   ├── himesh  
│   │   ├── documents  
│   │   └── pictures  
│   └── jitesh  
│       └── projects  
├── etc (configuration)  
├── var (logs)  
└── tmp (temporary)  
  
Windows:  
C:\  
├── Users  
│   ├── Himesh  
│   │   ├── Documents  
│   │   └── Pictures  
│   └── Jitesh  
├── Program Files  
└── Windows  
```  
  
#### File Operations  
  
```bash  
# Create  
touch file.txt          # Linux  
echo. > file.txt        # Windows  
  
# Read  
cat file.txt           # Linux  
type file.txt          # Windows  
  
# Write  
echo "Hello" > file.txt  
  
# Append  
echo "World" >> file.txt  
  
# Copy  
cp source.txt dest.txt  # Linux  
copy source.txt dest.txt # Windows  
  
# Move/Rename  
mv old.txt new.txt      # Linux  
move old.txt new.txt    # Windows  
  
# Delete  
rm file.txt            # Linux  
del file.txt           # Windows  
```  
  
#### File Permissions (Linux)  
  
```bash  
ls -l file.txt  
-rwxr-xr-x 1 user group 1024 Nov 24 10:00 file.txt  
  
-rwxr-xr-x breakdown:  
- = regular file  
rwx = owner (read, write, execute)  
r-x = group (read, execute)  
r-x = others (read, execute)  
  
Change permissions:  
chmod 755 file.txt  
7 = rwx (owner)  
5 = r-x (group)  
5 = r-x (others)  
```  
  
#### File Allocation Methods  
  
**Contiguous:**  
```  
File stored in continuous blocks  
Fast sequential access  
Example: Movie.mp4 in blocks 100-199  
```  
  
**Linked:**  
```  
Each block points to next  
Block 10 → Block 45 → Block 78 → End  
Like a linked list  
```  
  
**Indexed:**  
```  
Index block contains all locations  
Like book index  
Fast random access  
```  
  
#### Disk Scheduling  
  
**FCFS:**  
```  
Requests: 98, 183, 37, 122, 14  
Current: 53  
  
Movement: 53→98→183→37→122→14  
Total: 640 tracks  
```  
  
**SSTF (Shortest Seek Time First):**  
```  
Choose nearest first  
53→65→67→98→122→124→183→37→14  
Total: 236 tracks (much better!)  
```  
  
**SCAN (Elevator):**  
```  
Move in one direction, then reverse  
Like elevator  
```  
  
---  
  
### Part 2: Interview Questions   
  
#### Top 25 Questions  
  
**Q1: What is an operating system?**  
```  
System software managing hardware and software resources.  
Examples: Windows, Linux, Android  
```  
  
**Q2: Functions of OS?**  
```  
Process, Memory, File, Device Management, Security  
```  
  
**Q3: Types of OS?**  
```  
Batch, Time-sharing, Real-time, Distributed  
```  
  
**Q4: Process vs Program?**  
```  
Program: Passive (code on disk)  
Process: Active (running in memory)  
```  
  
**Q5: Process states?**  
```  
New, Ready, Running, Waiting, Terminated  
```  
  
**Q6: What is PCB?**  
```  
Process Control Block - stores process info  
Contains: PID, state, registers, memory info  
```  
  
**Q7: Context switching?**  
```  
CPU switches from one process to another  
Saves current state, loads new state  
```  
  
**Q8: Thread vs Process?**  
```  
Process: Heavy, separate memory  
Thread: Light, shared memory  
Example: Chrome (process), Tabs (threads)  
```  
  
**Q9: CPU scheduling algorithms?**  
```  
FCFS, SJF, Round Robin, Priority  
```  
  
**Q10: Explain Round Robin.**  
```  
Each process gets fixed time quantum  
Fair allocation, prevents starvation  
Example: 2 sec quantum for each process  
```  
  
**Q11: What is deadlock?**  
```  
Circular wait for resources  
Example: Traffic jam at intersection  
```  
  
**Q12: Deadlock conditions?**  
```  
1. Mutual Exclusion  
2. Hold and Wait  
3. No Preemption  
4. Circular Wait  
All four must be present  
```  
  
**Q13: Deadlock prevention?**  
```  
Break any one of the four conditions  
Example: Acquire all resources at once  
```  
  
**Q14: What is semaphore?**  
```  
Synchronization tool (counter)  
Binary: 0 or 1 (mutex)  
Counting: Multiple resources  
```  
  
**Q15: Critical section problem?**  
```  
Multiple processes accessing shared resource  
Need synchronization to prevent conflicts  
```  
  
**Q16: Logical vs Physical address?**  
```  
Logical: Generated by CPU (virtual)  
Physical: Actual RAM location  
MMU translates logical to physical  
```  
  
**Q17: What is paging?**  
```  
Divide memory into fixed-size pages  
Eliminates external fragmentation  
Uses page table for mapping  
```  
  
**Q18: Virtual memory?**  
```  
Use disk as extended RAM  
Allows programs larger than physical memory  
Uses page file/swap space  
```  
  
**Q19: Page replacement algorithms?**  
```  
FIFO: First In First Out  
LRU: Least Recently Used  
Optimal: Best but impractical  
```  
  
**Q20: What is thrashing?**  
```  
Excessive paging activity  
System spends more time swapping than executing  
Solution: Add RAM or reduce processes  
```  
  
**Q21: Internal vs External fragmentation?**  
```  
Internal: Wasted space within allocated block  
External: Free space scattered  
Paging solves external fragmentation  
```  
  
**Q22: File allocation methods?**  
```  
Contiguous: Continuous blocks (fast)  
Linked: Chain of blocks (flexible)  
Indexed: Index block (fast random access)  
```  
  
**Q23: Disk scheduling algorithms?**  
```  
FCFS, SSTF, SCAN, C-SCAN  
SCAN = Elevator algorithm  
```  
  
**Q24: System call?**  
```  
Interface between process and OS  
Examples: fork(), read(), write(), open()  
```  
  
**Q25: Kernel vs User mode?**  
```  
Kernel: Privileged, unrestricted access  
User: Restricted, safe  
Programs switch to kernel for system calls  
```  
  
---  
  
### Part 3: Practice & Quiz   
  
#### Scenario-Based Questions  
  
**Scenario 1: Scheduling**  
```  
Problem: 3 processes arrive simultaneously  
P1: 10 sec, P2: 5 sec, P3: 8 sec  
  
Which scheduling gives minimum average waiting time?  
  
Answer: SJF (Shortest Job First)  
Order: P2 → P3 → P1  
Waiting: 0, 5, 13  
Average: 6 sec  
```  
  
**Scenario 2: Deadlock**  
```  
Two processes:  
Process A: Holds Printer, needs Scanner  
Process B: Holds Scanner, needs Printer  
  
Is this deadlock? Why?  
  
Answer: YES  
All 4 conditions met:  
1. Mutual exclusion (devices can't share)  
2. Hold and wait (holding while waiting)  
3. No preemption (can't forcefully take)  
4. Circular wait (A waits for B, B waits for A)  
```  
  
**Scenario 3: Memory**  
```  
Physical Memory: 16 KB  
Page Size: 4 KB  
Process needs: 10 KB  
  
How many pages?  
  
Answer: 3 pages  
Page 0: 0-4 KB (4 KB)  
Page 1: 4-8 KB (4 KB)  
Page 2: 8-10 KB (2 KB)  
Internal fragmentation = 2 KB (in page 2)  
```  
  
#### Quick Quiz (10 questions)  
  
**Q1:** Process in execution is called?  
a) Program    
b) Thread    
c) Job    
d) Process    
**Answer: d**  
  
**Q2:** Which gives minimum waiting time?  
a) FCFS    
b) SJF    
c) Round Robin    
d) Priority    
**Answer: b**  
  
**Q3:** Binary semaphore is also called?  
a) Lock    
b) Mutex    
c) Counter    
d) Flag    
**Answer: b**  
  
**Q4:** Page table maps?  
a) Physical to Logical    
b) Logical to Physical    
c) Virtual to Cache    
d) Cache to RAM    
**Answer: b**  
  
**Q5:** Excessive paging is called?  
a) Thrashing    
b) Swapping    
c) Buffering    
d) Caching    
**Answer: a**  
  
**Q6:** Context switch time is?  
a) Useful CPU time    
b) Wasted time    
c) Idle time    
d) Response time    
**Answer: b (overhead)**  
  
**Q7:** Deadlock requires how many conditions?  
a) 2    
b) 3    
c) 4    
d) 5    
**Answer: c**  
  
**Q8:** Virtual memory uses?  
a) Cache    
b) Registers    
c) Disk    
d) ROM    
**Answer: c**  
  
**Q9:** chmod 755 means?  
a) rwxr-xr-x    
b) rwxrwxrwx    
c) r-xr-xr-x    
d) rw-rw-rw-    
**Answer: a**  
  
**Q10:** Elevator algorithm is?  
a) FCFS    
b) SSTF    
c) SCAN    
d) Round Robin    
**Answer: c**  
  
---  
  
## Command Reference  
  
### Process Management  
  
```bash  
# Windows  
tasklist                  # List processes  
tasklist /FI "PID eq 1234"  # Filter by PID  
taskkill /PID 1234 /F    # Kill process  
taskmgr                  # Task Manager  
  
# Linux  
ps aux                   # All processes  
ps -ef | grep chrome     # Find specific  
top                      # Real-time  
htop                     # Better top  
kill -9 1234            # Kill process  
killall chrome          # Kill by name  
```  
  
### Memory Commands  
  
```bash  
# Windows  
systeminfo | findstr Memory  
wmic OS get TotalVisibleMemorySize  
  
# Linux  
free -h                  # Memory usage  
cat /proc/meminfo        # Detailed info  
vmstat                   # Virtual memory  
```  
  
### File Commands  
  
```bash  
# Create  
touch file.txt           # Linux  
echo. > file.txt         # Windows  
  
# View  
cat file.txt            # Linux  
type file.txt           # Windows  
  
# Permissions (Linux)  
ls -l                   # View permissions  
chmod 755 file.txt      # Change permissions  
chown user file.txt     # Change owner  
  
# Disk  
df -h                   # Disk space (Linux)  
wmic logicaldisk        # Disk info (Windows)  
```  
  
---  
  
## Memory Tricks  
  
### Process States  
```  
"Never Run While Tired"  
New → Ready → Waiting → Terminated  
(with Running in between)  
```  
  
### Scheduling Algorithms  
```  
"Faster Small Jobs Run Perfectly"  
FCFS → SJF → Round Robin → Priority  
```  
  
### Deadlock Conditions  
```  
"My Horse Never Circles"  
Mutual Exclusion  
Hold and Wait  
No Preemption  
Circular Wait  
```  
  
### Memory Hierarchy  
```  
"Rabbits Can Run Happily Daily"  
Registers → Cache → RAM → Hard Disk → (Cloud)  
```  
  
---  
  
## 3-Hour Completion Checklist  
  
### ✓ Hour 1 Completed  
- [x] OS fundamentals  
- [x] Process management  
- [x] Process states  
- [x] Context switching  
- [x] Threads  
- [x] Process vs Thread  
  
### ✓ Hour 2 Completed  
- [x] FCFS scheduling  
- [x] SJF scheduling  
- [x] Round Robin  
- [x] Priority scheduling  
- [x] Semaphore  
- [x] Deadlock  
- [x] Paging  
- [x] Virtual memory  
  
### ✓ Hour 3 Completed  
- [x] File systems  
- [x] File operations  
- [x] Disk scheduling  
- [x] Interview questions (25)  
- [x] Scenarios  
- [x] Quiz  
  
---  
  
## Post-Study Action Plan  
  
### Immediate (Today)  
```bash  
# Practice these commands:  
tasklist (or ps aux)  
top (or taskmgr)  
free -h (or systeminfo)  
ls -l (or dir)  
chmod 755 file (Linux)  
```  
  
### Day 1-2: Hands-on  
- Open Task Manager/top - observe processes  
- Monitor CPU and memory usage  
- Create files and check permissions  
- Kill and restart processes  
  
### Day 3-4: Code Practice  
```python  
# Write simple programs:  
1. Fork example (C)  
2. Thread example (Python)  
3. Producer-Consumer (any language)  
```  
  
### Day 5-6: Calculations  
- FCFS calculations (5 problems)  
- SJF calculations (5 problems)  
- Round Robin (quantum = 2)  
- Page table creation  
  
### Day 7: Mock Interview  
- Explain OS to friend  
- Draw process state diagram  
- Explain deadlock with example  
- Demonstrate commands  
  
---  
  
## Interview Day Checklist  
  
### 15 Minutes Before Interview  
  
**1. Recall Process States (2 min)**  
```  
New → Ready → Running → Waiting → Terminated  
```  
  
**2. Scheduling Algorithms (3 min)**  
```  
FCFS: Simple queue  
SJF: Shortest first (optimal)  
RR: Time quantum (fair)  
Priority: Urgent first  
```  
  
**3. Deadlock (2 min)**  
```  
4 conditions: Mutual Exclusion, Hold & Wait,  
No Preemption, Circular Wait  
```  
  
**4. Memory Concepts (3 min)**  
```  
Paging: Fixed pages  
Virtual Memory: Disk as RAM  
Page replacement: FIFO, LRU  
```  
  
**5. Commands (3 min)**  
```  
tasklist, top, ps, kill, free, chmod  
```  
  
**6. Deep Breath (2 min)**  
```  
You're prepared! Trust your practice! 💪  
```  
  
---  
  
## Key Takeaways  
  
### Must Remember  
  
**Process Management:**  
- Process = Program in execution  
- 5 states: New, Ready, Running, Waiting, Terminated  
- Context switch enables multitasking  
  
**Scheduling:**  
- FCFS: Simple but convoy effect  
- SJF: Optimal average waiting time  
- RR: Fair with quantum  
- Priority: Important first  
  
**Synchronization:**  
- Critical section needs protection  
- Semaphore: Binary (mutex) or Counting  
- Deadlock needs all 4 conditions  
  
**Memory:**  
- Paging eliminates external fragmentation  
- Virtual memory extends RAM  
- LRU better than FIFO usually  
  
**Files:**  
- Hierarchical structure  
- Read, Write, Execute permissions  
- Multiple allocation methods  
  
---  
  
## Final Tips  
  
### Do's ✓  
- Use real examples (WhatsApp, Train booking)  
- Draw diagrams (process states, deadlock)  
- Mention commands you've practiced  
- Explain with analogies  
- Be confident but honest  
  
### Don'ts ✗  
- Don't memorize without understanding  
- Don't give vague answers  
- Don't overcomplicate  
- Don't skip basics  
- Don't panic if stuck  
  
### Confidence Phrases  
```  
"I understand the concept of..."  
"In practical terms, this means..."  
"For example, when we use WhatsApp..."  
"I've practiced this command..."  
"Let me draw a diagram to explain..."  
```  
  
---  
  
## Resources for Deeper Learning  
  
### Websites  
- GeeksforGeeks OS Section  
- TutorialsPoint Operating System  
- OSDev Wiki  
  
### YouTube  
- Neso Academy (OS Playlist)  
- Gate Smashers  
- Jenny's Lectures  
  
### Practice  
- Virtual machines (VirtualBox)  
- Linux terminal practice  
- Write simple programs  
  
### Books  
- Operating System Concepts (Galvin)  
- Modern Operating Systems (Tanenbaum)  
  
---  
  
## Quick Revision Card  
  
**Before Interview - Read This:**  
  
```  
OS = Manager of computer resources  
  
Process: 5 states (N-R-Ru-W-T)  
Scheduling: FCFS < SJF (optimal) | RR (fair) | Priority  
Deadlock: 4 conditions (all needed)  
Semaphore: Mutex (binary) or Counting  
Memory: Paging (fixed pages) | Virtual (disk as RAM)  
Files: rwx permissions (chmod 755)  
  
Commands:  
ps/tasklist, top/taskmgr, kill, free, chmod  
  
Examples ready:  
- WhatsApp (threads)  
- Train booking (critical section)  
- ATM (semaphore)  
- Traffic jam (deadlock)  
```  
  
---  
  
## Conclusion  
  
**Congratulations! 3 hours well spent!**  
  
**You Can Now:**  
✓ Explain OS concepts clearly  
✓ Differentiate process, thread, program  
✓ Calculate scheduling problems  
✓ Understand deadlock and prevention  
✓ Explain memory management  
✓ Use OS commands confidently  
✓ Answer interview questions  
  
**Remember:**  
- Real examples make great answers  
- Diagrams help explanation  
- Commands show practical knowledge  
- Confidence from practice  
- You've got this!  
  
**All the best for your interview!** 🎯  
  
---  
  
**3-Hour Crash Course Completed | Interview Ready | Practical Focus**