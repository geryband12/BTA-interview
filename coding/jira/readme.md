 # Task
You have two issue types in a hierarchical relationship:
- Theme <is parent of> Epic
- Epic <is child of Theme
- Epic has a Elements connect custom field were you can select issues from the type Theme.

If a Theme is selected, the Theme should be automatically linked to the Epic to show it e.g. in Structure
It must work in both directions:
- If the link is created, the field is populated
- If the field is populated, the link is created
Support all user interactions that can be done: both, field/link should always reflect the current state

## Extra info:
- relationship is 1 Theme : n Epics
- deleting has to work also
- Theme and epic don’t have to be in the same project

## Environment
The code can be checked using self-hosted jira: https://confluence.atlassian.com/adminjiraserver/installing-jira-applications-on-windows-938846835.html

Atlassian: Data Center

Apps: 
- Elements Connect https://marketplace.atlassian.com/apps/23337/elements-connect-external-data-fields-for-jira?tab=overview&hosting=datacenter


# Submission
Share the code you created in github. 

## Validation
Code will be loaded to a Jira Datacenter and triggered by user actions.
 

