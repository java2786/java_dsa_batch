# Computer Networking - 3 Hour Crash Course  
  
**Total Duration: 3 Hours | Interview Focused | Hands-on Practice**  
  
---  
  
## How to Use This Guide  
  
```  
Hour 1 (0:00 - 1:00): Core Concepts + OSI Model  
Hour 2 (1:00 - 2:00): IP Addressing + Protocols + Commands  
Hour 3 (2:00 - 3:00): Practice + Interview Prep + Quiz  
```  
  
Take 5-minute breaks after each hour. Practice commands as you learn.  
  
---  
  
## HOUR 1: Core Concepts   
  
### Part 1: Network Basics   
  
#### What is Computer Network?  
Interconnected devices that share resources and communicate.  
  
**Quick Example:**  
```  
ATM Network = Multiple ATMs connected to bank's central server  
- Withdraw from any ATM  
- Balance updated across all ATMs  
- Shared database  
```  
  
#### Network Types (Remember: L-M-W)  
  
**LAN (Local Area Network)**  
- Small area: Office, College, Home  
- Example: TCS Pune office network  
- High speed, low cost  
  
**MAN (Metropolitan Area Network)**  
- City-wide: Cable TV network in Mumbai  
- Medium speed, medium cost  
  
**WAN (Wide Area Network)**  
- Country/World: Internet, Flipkart servers across India  
- Lower speed, high cost  
  
#### Network Devices (4 Key Devices)  
  
| Device | Function | Real Example |  
|--------|----------|--------------|  
| **Hub** | Broadcasts to all ports | Old railway announcements (everyone hears) |  
| **Switch** | Sends to specific device | Direct phone call to Ramesh |  
| **Router** | Connects different networks | Post office sorting by cities |  
| **Modem** | Converts digital ↔ analog | Your Jio/Airtel broadband box |  
  
**Remember:** Hub = Dumb, Switch = Smart, Router = Navigator  
  
---  
  
### Part 2: OSI Model   
  
#### The 7 Layers (Memorize: "All People Seem To Need Data Processing")  
  
```  
7. Application  - What user sees (WhatsApp, Browser)  
6. Presentation - Data formatting (encryption, compression)  
5. Session      - Connection management (login session)  
4. Transport    - Reliable delivery (TCP/UDP)  
3. Network      - Routing (IP addresses)  
2. Data Link    - Hardware addressing (MAC address)  
1. Physical     - Physical transmission (cables, WiFi)  
```  
  
#### Real-World Example: Sending WhatsApp Message  
  
```  
Suresh (Mumbai) → Ramesh (Delhi)  
  
Layer 7: Suresh types "Hello" in WhatsApp  
Layer 6: Message encrypted  
Layer 5: WhatsApp maintains connection  
Layer 4: Message broken into packets (TCP)  
Layer 3: Packets get source/destination IP  
Layer 2: Packets get MAC addresses  
Layer 1: Sent via WiFi/4G radio waves  
  
[Reverse process at Ramesh's phone]  
```  
  
#### Quick Layer Functions  
  
**Application (7):** HTTP, HTTPS, FTP, SMTP, DNS  
**Transport (4):** TCP (reliable), UDP (fast)  
**Network (3):** IP addressing, routing  
**Physical (1):** Cables, WiFi, signals  
  
**Interview Tip:** Can explain OSI in 30 seconds using WhatsApp example!  
  
---  
  
### Part 3: TCP/IP Model   
  
#### 4 Layers (Simpler than OSI)  
  
```  
4. Application    - Combines OSI layers 5,6,7  
3. Transport      - TCP, UDP  
2. Internet       - IP, ICMP  
1. Network Access - Combines OSI layers 1,2  
```  
  
#### TCP vs UDP (Critical Difference!)  
  
| Feature | TCP | UDP |  
|---------|-----|-----|  
| Connection | Connected (call) | Connectionless (SMS) |  
| Reliability | Guaranteed | No guarantee |  
| Speed | Slower | Faster |  
| Use Case | File download | Live streaming |  
  
**Remember:**  
```  
TCP = Telephone Call (reliable, both talk)  
UDP = Broadcasting (one-way, fast)  
```  
  
**Real Examples:**  
```  
TCP: Downloading Aadhaar card, Bank transfer  
UDP: Live cricket score, Video call, Online gaming  
```  
  
#### Three-Way Handshake (TCP)  
  
```  
Mukesh → Bank Server  
  
Step 1: SYN       (Mukesh: Can we connect?)  
Step 2: SYN-ACK   (Server: Yes, confirmed!)  
Step 3: ACK       (Mukesh: Great, let's start!)  
  
Connection established ✓  
```  
  
**Interview Question:** "Explain TCP handshake in 20 seconds"  
**Answer:** "Client sends SYN, server replies SYN-ACK, client confirms with ACK. Three steps to establish reliable connection."  
  
---  
  
### Part 4: Quick Practice   
  
#### Exercise 1: Identify the Layer  
```  
Q1: Which layer handles IP addresses?  
Q2: Which layer does WhatsApp work on?  
Q3: Which layer has MAC addresses?  
Q4: Which protocol ensures reliable delivery?  
  
Answers: Network(3), Application(7), Data Link(2), TCP  
```  
  
#### Exercise 2: TCP or UDP?  
```  
Q1: Netflix movie streaming  
Q2: Downloading Income Tax form PDF  
Q3: Video call on Zoom  
Q4: Opening Gmail  
  
Answers: UDP/TCP hybrid, TCP, UDP, TCP  
```  
  
---  
  
## HOUR 2: IP Addressing & Protocols   
  
### Part 1: IP Addressing   
  
#### IPv4 Structure  
```  
Format: XXX.XXX.XXX.XXX (4 octets)  
Example: 192.168.1.100  
  
Each octet: 0-255 (8 bits)  
Total: 32 bits  
```  
  
#### IP Address Classes (Just remember A, B, C)  
  
```  
Class A: 1.0.0.0    to 126.0.0.0   (Large: ISPs)  
Class B: 128.0.0.0  to 191.255.0.0 (Medium: Universities)  
Class C: 192.0.0.0  to 223.255.255.0 (Small: Offices)  
```  
  
**Quick Trick:**   
- A starts with 1-126  
- B starts with 128-191  
- C starts with 192-223  
  
#### Private vs Public IP  
  
**Private IP (Internal only):**  
```  
10.x.x.x        - Large companies  
172.16.x.x      - Medium networks  
192.168.x.x     - Home WiFi (most common)  
```  
  
**Public IP (Internet):**  
```  
Your ISP gives: 103.45.67.89  
Visible to entire internet  
Used to access websites  
```  
  
**Check Your IPs:**  
```bash  
# Private IP  
ipconfig (Windows)  
ifconfig (Linux)  
  
# Public IP  
curl ifconfig.me  
Visit: whatismyip.com  
```  
  
#### Subnet Mask (Simple Understanding)  
  
```  
IP Address:    192.168.1.50  
Subnet Mask:   255.255.255.0  
  
255 = Network part (same for all)  
0   = Host part (different for each device)  
  
Network: 192.168.1.x (256 devices possible)  
Valid hosts: 192.168.1.1 to 192.168.1.254  
```  
  
**Quick Check:**  
```  
Same network?  
Device 1: 192.168.1.10 / 255.255.255.0  
Device 2: 192.168.1.20 / 255.255.255.0  
Answer: YES (same 192.168.1 network)  
  
Device 3: 192.168.2.10 / 255.255.255.0  
Answer: NO (different network: 192.168.2)  
```  
  
#### Practical Exercise  
```  
Network: 192.168.10.0/24  
Subnet Mask: 255.255.255.0  
  
Questions:  
Q1: First usable IP?        Answer: 192.168.10.1  
Q2: Last usable IP?         Answer: 192.168.10.254  
Q3: Total hosts?            Answer: 254  
Q4: Network address?        Answer: 192.168.10.0  
Q5: Broadcast address?      Answer: 192.168.10.255  
```  
  
---  
  
### Part 2: Important Protocols   
  
#### HTTP vs HTTPS  
  
```  
HTTP (Port 80)  
- Hypertext Transfer Protocol  
- Plain text (insecure)  
- Example: http://example.com  
  
HTTPS (Port 443)  
- HTTP Secure (SSL/TLS encryption)  
- Encrypted data  
- Example: https://paytm.com  
- Used by: Banks, payment sites, Gmail  
```  
  
**Rule:** Never enter passwords on HTTP sites!  
  
#### DNS (Domain Name System)  
  
Converts names to IP addresses.  
  
```  
You type: www.flipkart.com  
DNS converts to: 163.53.78.110  
Browser connects to that IP  
```  
  
**DNS Hierarchy:**  
```  
Root Server (.)  
    ↓  
Top Level Domain (.com, .in)  
    ↓  
Second Level Domain (flipkart)  
    ↓  
Subdomain (www)  
```  
  
**Hands-on Command:**  
```bash  
nslookup google.com  
nslookup irctc.co.in  
nslookup amazon.in  
```  
  
#### DHCP (Dynamic Host Configuration Protocol)  
  
Auto-assigns IP addresses.  
  
**Scenario:**  
```  
1. Kamlesh brings laptop to office  
2. Laptop: "DHCP, I need an IP!"  
3. DHCP Server: "Take 192.168.1.45"  
4. Also provides: Gateway, DNS, Subnet mask  
5. Kamlesh connected! ✓  
```  
  
**Without DHCP:** Manual configuration for every device (nightmare!)  
  
#### FTP (File Transfer Protocol)  
  
Transfers files between computers.  
  
```  
Port 21: Control (commands)  
Port 20: Data (actual files)  
  
Use: Upload website files to server  
```  
  
#### Common Ports (Memorize Top 10)  
  
| Port | Protocol | Usage |  
|------|----------|-------|  
| 20, 21 | FTP | File transfer |  
| 22 | SSH | Secure remote access |  
| 23 | Telnet | Unsecure remote (avoid!) |  
| 25 | SMTP | Send email |  
| 53 | DNS | Domain resolution |  
| 80 | HTTP | Web browsing |  
| 443 | HTTPS | Secure web |  
| 110 | POP3 | Receive email |  
| 143 | IMAP | Email sync |  
| 3306 | MySQL | Database |  
  
**Interview Trick:** "HTTP-80, HTTPS-443, DNS-53, SSH-22"  
  
---  
  
### Part 3: Network Commands   
  
#### Essential Commands for Interview  
  
**1. ping - Test Connectivity**  
```bash  
ping google.com  
ping 8.8.8.8  
ping 192.168.1.1  
  
Output:  
Reply from 8.8.8.8: bytes=32 time=20ms TTL=117  
```  
**What it shows:** If host is reachable, response time  
  
**2. ipconfig / ifconfig - Network Info**  
```bash  
# Windows  
ipconfig  
ipconfig /all  
  
# Linux  
ifconfig  
ip addr show  
```  
**Shows:** IP address, subnet mask, gateway, DNS  
  
**3. traceroute / tracert - Path to Destination**  
```bash  
# Windows  
tracert google.com  
  
# Linux  
traceroute google.com  
```  
**Shows:** All routers (hops) between you and destination  
  
**4. nslookup - DNS Lookup**  
```bash  
nslookup facebook.com  
nslookup 8.8.8.8  
```  
**Shows:** IP address of domain, DNS server used  
  
**5. netstat - Network Connections**  
```bash  
netstat -an      # All connections  
netstat -r       # Routing table  
netstat -tuln    # Listening ports (Linux)  
```  
**Shows:** Active connections, ports in use  
  
**6. arp - MAC Address Table**  
```bash  
arp -a  
```  
**Shows:** IP to MAC address mapping  
  
#### Quick Practice  
```bash  
# Try these now :  
1. ping google.com  
2. ipconfig (or ifconfig)  
3. nslookup irctc.co.in  
4. tracert google.com (first 3 hops only)  
```  
  
---  
  
## HOUR 3: Interview Prep & Practice   
  
### Part 1: Top 20 Interview Questions   
  
**Q1: What is a computer network?**  
```  
Answer: Collection of interconnected devices that communicate   
and share resources. Example: ATM network across India.  
```  
  
**Q2: Difference between LAN, MAN, WAN?**  
```  
LAN: Local (office campus) - fast, cheap  
MAN: City-wide (cable TV) - medium  
WAN: Wide area (Internet) - slow, expensive  
```  
  
**Q3: Explain OSI Model layers.**  
```  
7 layers: Application, Presentation, Session, Transport,   
Network, Data Link, Physical  
Mnemonic: "All People Seem To Need Data Processing"  
```  
  
**Q4: TCP vs UDP?**  
```  
TCP: Reliable, connection-oriented, slower (file download)  
UDP: Fast, connectionless, unreliable (live streaming)  
```  
  
**Q5: What is IP address?**  
```  
Unique identifier for devices on network  
IPv4: 192.168.1.1 (32-bit)  
IPv4: 2001:0db8:... (128-bit)  
```  
  
**Q6: Private vs Public IP?**  
```  
Private: Internal network (192.168.x.x, 10.x.x.x)  
Public: Internet-facing (assigned by ISP)  
```  
  
**Q7: What is subnet mask?**  
```  
Divides IP into network and host portions  
255.255.255.0 means first 3 octets = network  
```  
  
**Q8: Explain DNS.**  
```  
Domain Name System - converts names to IP addresses  
google.com → 172.217.160.78  
```  
  
**Q9: HTTP vs HTTPS?**  
```  
HTTP: Port 80, plain text, insecure  
HTTPS: Port 443, encrypted (SSL/TLS), secure  
```  
  
**Q10: What is DHCP?**  
```  
Automatically assigns IP addresses to devices  
Saves manual configuration effort  
```  
  
**Q11: Explain three-way handshake.**  
```  
TCP connection establishment:  
1. SYN (client → server)  
2. SYN-ACK (server → client)  
3. ACK (client → server)  
```  
  
**Q12: Hub vs Switch vs Router?**  
```  
Hub: Broadcasts to all (dumb)  
Switch: Sends to specific port (smart, uses MAC)  
Router: Connects different networks (uses IP)  
```  
  
**Q13: What is MAC address?**  
```  
48-bit physical address of network card  
Example: 00-1A-2B-3C-4D-5E  
Cannot be changed (hardware address)  
```  
  
**Q14: Purpose of ping command?**  
```  
Tests connectivity to host using ICMP  
Shows if reachable and response time  
```  
  
**Q15: What is a gateway?**  
```  
Device that connects different networks  
Usually your router's IP (192.168.1.1)  
```  
  
**Q16: Explain NAT (Network Address Translation).**  
```  
Converts private IP to public IP  
Multiple devices share one public IP  
Saves IPv4 addresses  
```  
  
**Q17: What is port number?**  
```  
Identifies specific application/service  
Range: 0-65535  
Example: HTTP=80, HTTPS=443  
```  
  
**Q18: Difference between IPv4 and IPv6?**  
```  
IPv4: 32-bit (4.3 billion addresses)  
IPv6: 128-bit (340 undecillion addresses)  
IPv6 solves address exhaustion  
```  
  
**Q19: What is firewall?**  
```  
Security system that monitors/controls network traffic  
Blocks unauthorized access  
Example: College blocking social media sites  
```  
  
**Q20: Explain traceroute.**  
```  
Shows path packets take to destination  
Displays all intermediate routers (hops)  
Helps identify network bottlenecks  
```  
  
---  
  
### Part 2: Rapid-Fire Scenarios   
  
**Scenario 1: Cannot Access Website**  
```  
Problem: Nitesh cannot open www.flipkart.com  
  
Troubleshooting:  
1. ping 8.8.8.8        (Check internet)  
2. ping flipkart.com   (Check if site is up)  
3. nslookup flipkart.com (Check DNS)  
4. Try different browser  
5. Clear DNS cache: ipconfig /flushdns  
```  
  
**Scenario 2: Slow Network**  
```  
Problem: Office network very slow  
  
Checks:  
1. ping gateway (192.168.1.1)  
2. Check bandwidth usage  
3. netstat -an (check connections)  
4. Verify no one downloading large files  
5. Check router configuration  
```  
  
**Scenario 3: Cannot Connect to Printer**  
```  
Problem: Cannot print from laptop  
  
Steps:  
1. ping printer_ip (192.168.1.50)  
2. Check if on same network  
3. Verify subnet mask  
4. Check firewall settings  
5. Verify printer is powered on  
```  
  
**Scenario 4: Email Not Sending**  
```  
Problem: Outlook not sending emails  
  
Check:  
1. Internet connection (ping 8.8.8.8)  
2. SMTP port 25 or 587 open  
3. Server settings correct  
4. No firewall blocking  
5. Check email quotas  
```  
  
**Scenario 5: New Device Cannot Connect**  
```  
Problem: Phone not getting IP from WiFi  
  
Solution:  
1. Check DHCP is enabled on router  
2. Restart router  
3. Forget and reconnect to WiFi  
4. Try static IP temporarily  
5. Check MAC filtering on router  
```  
  
---  
  
### Part 3: Final Quiz   
  
#### Section A: Multiple Choice (10 questions)  
  
**Q1:** Which layer handles routing in OSI?  
a) Transport    
b) Network    
c) Data Link    
d) Session    
**Answer: b**  
  
**Q2:** Default subnet mask for Class C?  
a) 255.0.0.0    
b) 255.255.0.0    
c) 255.255.255.0    
d) 255.255.255.255    
**Answer: c**  
  
**Q3:** Which protocol is connectionless?  
a) TCP    
b) HTTP    
c) FTP    
d) UDP    
**Answer: d**  
  
**Q4:** HTTPS uses which port?  
a) 80    
b) 443    
c) 8080    
d) 22    
**Answer: b**  
  
**Q5:** DNS converts what to what?  
a) IP to MAC    
b) Domain to IP    
c) MAC to IP    
d) Port to IP    
**Answer: b**  
  
**Q6:** Which device connects different networks?  
a) Hub    
b) Switch    
c) Router    
d) Modem    
**Answer: c**  
  
**Q7:** Private IP range for home networks?  
a) 192.168.x.x    
b) 8.8.x.x    
c) 172.217.x.x    
d) 203.45.x.x    
**Answer: a**  
  
**Q8:** TCP three-way handshake order?  
a) ACK, SYN, SYN-ACK    
b) SYN, SYN-ACK, ACK    
c) SYN-ACK, SYN, ACK    
d) ACK, SYN-ACK, SYN    
**Answer: b**  
  
**Q9:** Which command tests connectivity?  
a) ipconfig    
b) ping    
c) netstat    
d) arp    
**Answer: b**  
  
**Q10:** FTP uses which ports?  
a) 80, 443    
b) 20, 21    
c) 22, 23    
d) 25, 110    
**Answer: b**  
  
#### Section B: Fill in the Blanks (5 questions)  
  
**Q11:** OSI model has _____ layers.    
**Answer: 7**  
  
**Q12:** TCP is _____ oriented, UDP is _____.    
**Answer: connection, connectionless**  
  
**Q13:** _____ automatically assigns IP addresses.    
**Answer: DHCP**  
  
**Q14:** MAC address is _____ bit.    
**Answer: 48**  
  
**Q15:** Port 22 is used for _____.    
**Answer: SSH**  
  
#### Section C: True/False (5 questions)  
  
**Q16:** HTTP is more secure than HTTPS.    
**Answer: False**  
  
**Q17:** Hub sends data to all connected devices.    
**Answer: True**  
  
**Q18:** 192.168.1.1 is a public IP address.    
**Answer: False**  
  
**Q19:** UDP guarantees packet delivery.    
**Answer: False**  
  
**Q20:** DNS runs on port 53.    
**Answer: True**  
  
---  
  
## Command Quick Reference  
  
### Windows  
```bash  
ipconfig              # Show IP configuration  
ipconfig /all         # Detailed information  
ipconfig /flushdns    # Clear DNS cache  
ping google.com       # Test connectivity  
tracert google.com    # Trace route  
nslookup google.com   # DNS lookup  
netstat -an           # Show connections  
arp -a                # Show ARP table  
```  
  
### Linux  
```bash  
ifconfig              # Network interfaces  
ip addr show          # IP addresses  
ping google.com       # Test connectivity  
traceroute google.com # Trace route  
dig google.com        # DNS lookup  
nslookup google.com   # DNS lookup (alternative)  
netstat -tuln         # Show connections  
arp                   # Show ARP table  
```  
  
---  
  
## Memory Aids & Tricks  
  
### OSI Layers Mnemonic  
```  
"All People Seem To Need Data Processing"  
  
A - Application  
P - Presentation  
S - Session  
T - Transport  
N - Network  
D - Data Link  
P - Physical  
```  
  
### Port Numbers  
```  
"HTTP 80, HTTPS 443, DNS 53, SSH 22"  
"FTP 20-21, Telnet 23, SMTP 25"  
```  
  
### TCP vs UDP  
```  
TCP = Telephone (reliable conversation)  
UDP = Radio Broadcast (one-way, fast)  
```  
  
### IP Classes  
```  
A: 1-126 (Amazon, huge)  
B: 128-191 (Big university)  
C: 192-223 (College, small office)  
```  
  
### Private IP Ranges  
```  
10.x.x.x       - Class A  
172.16.x.x     - Class B  
192.168.x.x    - Class C (most common home WiFi)  
```  
  
---  
  
## 3-Hour Summary Checklist  
  
### ✓ Concepts Covered  
- [x] Network types (LAN, MAN, WAN)  
- [x] OSI Model (7 layers)  
- [x] TCP/IP Model (4 layers)  
- [x] TCP vs UDP  
- [x] IP Addressing (IPv4, Classes)  
- [x] Subnet mask basics  
- [x] DNS, DHCP, HTTP/HTTPS  
- [x] Common ports  
- [x] Network commands  
- [x] Hub, Switch, Router  
- [x] Troubleshooting basics  
  
### ✓ Hands-on Practice  
- [x] Used ping command  
- [x] Checked IP with ipconfig/ifconfig  
- [x] Tried nslookup  
- [x] Ran traceroute  
- [x] Viewed network connections  
  
### ✓ Interview Ready  
- [x] Top 20 questions answered  
- [x] Scenarios practiced  
- [x] Quiz completed  
- [x] Commands memorized  
  
---  
  
## Post-Study Action Plan  
  
### Next Steps (After 3 hours)  
  
**Day 1-2: Practice Commands**  
```bash  
# Practice these 10 times each:  
ping google.com  
ipconfig /all  
nslookup facebook.com  
tracert google.com  
netstat -an  
```  
  
**Day 3-4: Deep Dive**  
- Read RFC documents (optional)  
- Watch Wireshark packet analysis videos  
- Set up home lab with virtual machines  
  
**Day 5-6: Mock Interviews**  
- Practice explaining OSI model in 1 minute  
- Explain TCP handshake on whiteboard  
- Answer scenario-based questions  
  
**Day 7: Revision**  
- Go through this guide again (1 hour)  
- Practice quiz again  
- Review command outputs  
  
---  
  
## Final Tips for Interview  
  
### Do's  
✓ Explain with real-world examples (Flipkart, WhatsApp, Banking)  
✓ Draw diagrams when explaining (OSI layers, network topology)  
✓ Relate to practical experience (home WiFi, mobile data)  
✓ Mention you've practiced commands  
✓ Be clear about what you know and don't know  
  
### Don'ts  
✗ Don't memorize without understanding  
✗ Don't give vague answers  
✗ Don't say "I don't know" without trying  
✗ Don't over-complicate simple concepts  
✗ Don't skip the basics  
  
### Interview Confidence Boosters  
```  
"I've practiced networking commands hands-on"  
"I can demonstrate ping and traceroute"  
"I understand TCP handshake with diagrams"  
"I've set up home network with IP addressing"  
```  
  
---  
  
## Quick Revision (Before Interview)  
  
**15 Minutes Before Interview:**  
  
1. **Recall OSI Layers** (1 min)  
   - All People Seem To Need Data Processing  
  
2. **TCP vs UDP** (1 min)  
   - TCP = Reliable, UDP = Fast  
  
3. **Common Ports** (2 min)  
   - 80, 443, 53, 22, 21, 25  
  
4. **IP Classes** (2 min)  
   - A: 1-126, B: 128-191, C: 192-223  
  
5. **Key Commands** (3 min)  
   - ping, ipconfig, nslookup, tracert, netstat  
  
6. **Three-Way Handshake** (2 min)  
   - SYN → SYN-ACK → ACK  
  
7. **Devices** (2 min)  
   - Hub (dumb), Switch (smart), Router (navigator)  
  
8. **Deep Breath** (2 min)  
   - You've got this! 💪  
  
---  
  
## Resources for Further Learning  
  
### Websites  
- Cisco Networking Academy  
- GeeksforGeeks Networking Section  
- TutorialsPoint Computer Networks  
  
### YouTube Channels  
- NetworkChuck  
- PowerCert Animated Videos  
- Sunny Classroom  
  
### Practice Tools  
- Cisco Packet Tracer (Free)  
- GNS3 (Network simulator)  
- Wireshark (Packet analyzer)  
  
### Books (If Time Permits)  
- Computer Networks by Tanenbaum  
- TCP/IP Illustrated by Stevens  
  
---  
  
## Conclusion  
  
**You've completed 3 hours of focused networking study!**  
  
**What You Can Now Do:**  
✓ Explain OSI and TCP/IP models  
✓ Understand IP addressing and subnetting basics  
✓ Differentiate TCP from UDP  
✓ Use essential networking commands  
✓ Troubleshoot basic network issues  
✓ Answer interview questions confidently  
  
**Remember:**  
- Networking is everywhere (WhatsApp, Flipkart, Banking)  
- Commands are your friends (practice daily)  
- Real-world examples make great answers  
- Draw diagrams during explanations  
- Confidence comes from practice  
  
**Good luck with your interviews!** 🎯  
  
---  
  
**Course completed in 3 hours | Interview focused | Practical approach**