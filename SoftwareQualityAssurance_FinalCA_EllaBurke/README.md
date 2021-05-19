# Scrum Sprint Backlog and Task Estimation

### _Sprint Backlog_
| Task ID | User Story | Task | Task Owner | Estimate | Status |
| --- | ----------- |---- | ----- | ----- | --- |
| 1 | Student Grade Reference Guide | Create Rubric Class | Ella | 1| Done|
| 2 | Student Grade Reference Guide | Create Student Grade Class | Ella | 1| Done|
| 3 | Student Grade Reference Guide | Team Version Control | Ella | 2| In Progress|
| 4 | Student Grade Reference Guide | Code Review Check List | Ella | 2| In Progress |
| 5 | Student Grade Reference Guide | Test Driven Development | Ella | 2| In Progress |
| 6 | Student Grade Reference Guide | Test Coverage Metric | Ella | 3| To Be Started |
| 7 | Student Grade Reference Guide | Create Unit Test Class | Ella | 5| To Be Started |
| 8 | Student Grade Reference Guide | Create Controller Class | Ella | 5| To Be Started |


A story point is a high-level estimation of the complexity of the user story. A story point can be any 
value that a Scrum Team agrees on. The value of the story point can be in hours, days, weeks etc. 
For this project the value of the story point is 1 hour, therefore 1 point equalling 1 hour. By 
estimating in hours, it allows a more accurate representation of the work involved in hours. 
The points are also based on the Fibonacci sequence - 0 , 1, 2, 3, 5, 8, 13, 21 etc.

Developers can apply different techniques to help them estimate a task. 
- **Experience:** The developer should ask themselves have they completed a task like this before? Have they done something similar before? How much time did they spend on it? By asking themselves these questions, it makes it easier to predict how long a task will take this time.
- **Estimation Games:** Games such as "Planning Poker" follow objective criteria to allow team members to be able to compare results and come to a conclusion quickly. Planning Poker is a consensus-based technqiue for estimating the effort of user stories in scrum. A user story is read out and then each member of the team can ask questions in order to help them gain a better understanding of the work involved. Each member of the team selects a card with a number (from the Fibonacci Sequence in this case), and then all cards are revealed. If all team members chose the same card, that becomes the number appointed to the task and if not the team can discuss why they chose each number and then re-estimate until coming to a final decision.
- **Ask the Expert:** If team members can't figure out how long a task may take due to them maybe not having the technical skills or past experience, it could be best to ask the "Expert". A team is usually made up of many developers from different backgrounds who specialise in different things so there may be a team member who is an "Expert" on a given topic who can provide a better insight into how long a task might take.

For this Student Grade Guide project, the breakdown of tasks consisted of both code and markdown 
documentation files that explained the various tasks such as Version Control and Code Reviews. In 
order to estimate the points for the tasks I first read the entire User Story. By doing so, I was able 
to get a clear understanding of all the tasks that make up the entire story. Then I created the list of
tasks (The backlog). More complex tasks were broken down into smaller tasks, for example I broke down
the software component into multiple smaller tasks rather than one complex one. I placed the tasks in
the backlog in order from smallest to largest. 

To choose the estimates, I thought about what technical skills and knowledge on the given task were 
needed and if it would be something that I may have to research further or not. By considering the 
amount of work involved, complexity of the task, uncertainty of the task and the duration of the task 
I came up with the estimates shown in the backlog. Creating object classes such as the "Rubric class" 
and the "Student Grade class" seemed like they would take the least amount of work as the classes will 
only consist of the constructor and getter/setter methods, something I have the technical skills for, 
so therefore I estimated these tasks at 1. On the other extreme to that, I estimated the "Create 
Controller Class" task at 5. I estimated this at 5 as the task involves creating methods for calculating
the standard deviation, average, and maximum/ minimum. This task will require more research as the 
calculations are something I don't know how to do off the top of my head. Then as for the markdown file 
documentation such as "Team Version Control" & "Code Review Checklist" it felt appropriate to estimate
these tasks wit a value of 2 as I have a good knowledge about these tasks from the last assignment. 
Putting these estimates against an estimate of 3 for "Test Coverage Metric" is because I have little 
experience with using code coverage tools and therefore I think this task will take slightly longer. 
Finally, creating the "Unit Test Class" is estimated at 5 as I think this task will require me 
upskilling in providing unit tests for the code. This task will also only go as fast as creating the 
"Controller Class" as the tests correspond with it. 

### _Calculating the Velocity Metric_

Calculating sprint velocity allows the team to estimate how much work they can do in future sprints based on the amount of work they completed in previous sprints. This is useful for scrum teams to plan accordingly for sprints.

To calculate the sprint velocity, you need to measure the work done previously. To get an average measurement, review the 3 previous sprints.

![image](https://www.workfront.com/sites/default/files/styles/100/public/hero_images/2020-09/agile-velocity-chart.png?itok=SP4u_5k6)

At the end of each sprint, add up the total of story points that were completed. For example, the team aimed to complete 5 user stories, each story had 5 points, and the team managed to complete 4/5. 4 User stories multiplied by 5 points = 20.
Carry this out for 3 previous sprints to get the average sprint velocity by adding all velocities together and dividing by 3.
By getting this sprint velocity, the team can now base the amount of work to be completed on the average velocity. This measurement is only a guide and is only beneficial if the team size and task complexity stay more or less constant. So the Sprint Velocity can be looked at as a good starting point for a sprint. A team cannot calculate its velocity until completing enough sprints to get an average. As you can see in the diagram above, once the average of the first 3 sprints (The Sprint Velocity) was calculated, the team were able to complete the amount of work that they committed to being able to do as they were able to take on the amount of work that they should be able to carry out for the sprint judging from previous sprints..

# Test-driven Development

Test-driven development is an approach where you write a test before you write the code to fulfill that test. The goal of test-driven development is to write clean code, therefore getting the developer to think about the requirements of the task 
before writing the functional code. Test cases are written and tested and then if the test fails, new code is written
until the code passes the test. Test-driven development follows the approach that only write code if a test has failed to avoid 
duplication.

![image](https://www.xenonstack.com/images/insights/2020/04/test-driven-development-tools-best-practices-xenonstack.png) 

To see an example of a Method & it's corresponding test in the software:
In this commit, I create a method for getting the Rubric by its name. The test passes if the Rubric name is found, in my case the Rubric name is "SQA". If not found the test asserts null.
[Link to my Commit!](https://github.com/ellaburke/SoftwareQualityAssurance_FinalCA_EllaBurke/commit/52ef2c397ef24eadc0bee79c2586438d05e9132d)


# Test Coverage Metric

The code coverage tool that I use on this project is called "EclEmma". It is a Java code coverage tool for Eclipse. The tool analyzes the project to see how much of the code is covered by tests. The JUnit tests are analyzed to see if theu cover the code. The tools identifies where code is and is not covered which is extremley useful for developers when trying to efficiently test their code. In the image below, you can see that my code is covered by 89.6% by tests. The code that is covered is highlighted in green and code that is not in red

![Code Coverage Image](https://github.com/ellaburke/SoftwareQualityAssurance_FinalCA_EllaBurke/blob/TestCoverageMetric/codecoverage.png)





# Gitflow WorkFlow for Team Version Control

![image](https://miro.medium.com/max/577/1*AAU1VCV8LMHvVPBYxMBsxg.png)

Team version control is practicing the tracking and managing of changes to a teams code. Version control systems are software tools that allow a team to manage the changes made to its code through out the course of a sprint. The idea behind it is to keep track of every change made to the code and be able to revert back to an earlier version of the code in the event of an error. 

Gitflow is a Git workflow for continuous software development. The Gitflow workflow defines a branching model around the project release and follows continuous delivery. It assigns specific roles to different branches and how they should interact with each other. The idea behind Gitflow is to make parallel development by isolating new code from production code. Developers add new code on feature branches and the changes on these branches are only merged into the main branch once pull requests to do so have been approved. 

Feature branches are branched off of the development branch, and then once the features are complete they are merged back into the develop branch, this allows multiple developers to be working on the same task. When it is time for a sprint release, a release branch is created from develop. The code in this release branch can be tested independentally before merging into the master branch(and the develop branch as thats the branch in between). A Hotfix branch is a branch for emergency fixes on the released code. When the error has been fixed this branch gets merged back into main and develop.

In this project, to follow the GitFlow process I created a develop branch off of the main branch and then feature branches off the develop branch. Although this was a solo project, in the case that I needed help on a topic it would make sense that I was working on a feature branch so both me and another person could be working on the same task. Then when our work was complete we would merge both our feature branches into the develop branch, ready for release. This project requires documentation on multiple topics such as "Scrum sprint backlog and task estimation", "Team version-control", "Unit testing and Test-Driven development" etc. All of these topics are required to go in the one README file. So for the purpose of explaining the Gitflow process in this project, each topic in the README file was its own feature branch. By creating these seperate feature branches, for different tasks, this allowed different tasks to be carried out and once pull requests were approved, all work was put into the README file. In the working world, each task may be assigned to a different developer, and therefore they could all be creating work for the read me file seperately. 
