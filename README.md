# Skill Builder 4 - Designing and Implementing Finite State Machines

At the end of this Skill Builder, a studnet will be able to:
- Design an FSMs
- Apply process to convert an FSM to code
- Implement an FSM in a function or class

## 1. The Grok Coalition - Again?
In the Grok Coalition video game, there exists a character called Zeffit, whose purpose is to attack Groks and 
eliminate them.  When Zeffits take a hit, they turn green.  When they take a second hit, Zeffits turn blue.  When 
they take a third hit, Zeffits turn red.  The fourth hit makes them explode!  At that point, the Zeffit is considered 
dead.

# Zeffit's Finite State Machine
Design the finite state machine (FSM) that models the state of the Zeffit as described above.

Use software to draw the FSM. PowerPoint, Keynote, or LiberOffice may be the most convenient due to availability. Make sure to properly 
label the diagram including states, transitions, and actions. See instructions for submission below.

# Zeffit Implementation
Implement the FSM designed above in the Zeffit template class provided.  Make sure to implement every method 
provided with the class.

## 2. Designing and Implementing a FSM
Design a finite-state machine that determines whether a string contains a sub-string that begins with a
<span style="color:rgb(172,86,0);">**t**</span> or <span style="color:rgb(172,86,0);">**T**</span> and ends
with a <span style="color:rgb(172,86,0);">**y**</span> or <span style="color:rgb(172,86,0);">**Y**</span>.  
The sub-string may appear anywhere inside the string.  For example,

```
Hello, my name is Tom Brady and I am thirsty.
```

contains two sub-string that start with a **t** and end in a **y**.
<p style="font-family: 'courier new', monospace;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:blue;font-weight:bold;">
Hello, my name is <span style="color:red;">Tom Brady</span> and I am <span style="color:red;">thirsty</span>.
<p>
Also,

```
Jasmine was rather terribly insulting!
```

contains a sub-string that starts with a **t** in the word **rather** and ends in a **y** in the word **terribly**.
<p style="font-family: 'courier new',monospace;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:blue;font-weight:bold;">Jasmine was ra<span style="color:#ff0000;">ther terribly</span> insulting!
</p>

Use software to draw the FSM.  Any online solution will work as long as you can save it as a pdf.  PowerPoint or LibreOffice may be the most convenient due to availability.  Make sure to
properly label the diagram including states, transitions, and actions.  See instructions for submission of FSMs.

Click the link below to watch the video that shows how to draw an FSM in PowerPoint and Keynote.

<a href="https://delawarestateuniversity-my.sharepoint.com/:v:/g/personal/mrasamny_desu_edu/EbMTuLeUZs1Di7VlgmAkz_sBg_8JuFAQBPiDEZi5Zvl_bQ?download=1">Drawing FSM</a>

## Implement Method
Implement the finite-state machine designed above in the SkillBuilder6 class method called
<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:blue;font-weight:bold;">
public static String findTYPattern(String s)
</p>
The function returns the first substring that starts with a <span style="color:rgb(172,86,0);">**t**</span> or 
<span style="color:rgb(172,86,0);">**T**</span> and ends with a 
<span style="color:rgb(172,86,0);">**y**</span> or <span style="color:rgb(172,86,0);">**Y**</span>; 
otherwise it returns an empty string.  For example, 

```java
SkillBuilder6.findTYPattern("Hello, my name is Tom Brady and I am thirsty")
```

should return the string <span style="color:red;font-family: 'courier new', courier;font-weight:bold;">Tom Brady</span>.

# 3. Submission of FSMs
Both FSMs from part 1 and 2 should be in a pdf document called **fsm.pdf**.  Place the file
in the project folder so that it gets pushed with your updates to this Skill Builder repo. There will be a link on Blackboard to submit your FSMs.  Make sure they are in pdf format.
