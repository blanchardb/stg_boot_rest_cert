# A STG REST Certification Module

In this project you will be creating a simple REST API, using Spring Boot, to solve the Business Problem described below. This project is designed to test your Java, Spring, Spring Boot and REST Architecture skills.

It is highly recommended to read this entire document before proceeding.

## Before You Begin

To more clearly showcase your REST skill, you will need to follow the following procedural steps.

1. Before you work on each step of this certification you will need create a new branch specifically for that step.
1. You will then need to commit and push your work to your repository on Bitbucket at least daily while working on this certification. While there is no official time limit on completing this certification we want to see the progress that you have made. This does not mean that you need to make a commit daily, it simply means that any day that you do work on the certification you should make a commit and push that work by the end of the day.
1. After each component section is completed you will need to save and push your code AND make a pull/merge request to merge your code to your repository's master branch for each section of your work. (Please do not delete the merged branch from your repository!)
1. The key understanding point to this certification is REST Architecture.  A common question a developer may ask is what methods or operations do I need as a guide in helping me.  For this certification we want to avoid answering that question.  Answering that would take away from a key point of this certification.
1. The [certification outline](./Certification.md) provides links to resources to help you understand how to develop a RESTful Application.  It also provides a guideline of what you should understand when you complete this certification.


## Business Problem

Wayne Enterprises has employees worldwide.  Because of the sensitive and legal nature of the material that employees work with, it is critical that the Organization Chart is current and accurate at all times.  It is also critical that at the top of the Organization Chart there is one leader.  This leader, Bruce Wayne, is the CEO who is ultimately responsible for all employees within Wayne Enterprises.

The application needs to provide the ability to manage employees and the tree structure of the organization or any subtree structure within the organization.

The application should be able to select any individual and get a direct line of reports ending with the CEO.

The application needs the ability to create, update and remove an employee from the system.  When a leader is removed from the system and their position has not been filled it is critical that all information about that person is removed, but the organization chart structure retains integrity.  The direct reports of the removed leader should now report to that removed leader�s direct report.  It is critical that the tree structure is always intact and that there is always a clear line of reports from the CEO to each employee within Wayne Enterprises.

Ease of use is also important and will be specified in the Business Requirements below.  One of the more important ease of use requirements is that a employee can be updated to any position within the organization chart where direct reports from one employee is simply moved to another employee.  Again it is critical that the Organization Chart stays intact at all times.

### Requirements:

1. Organization Tree structure.
1. Retrieve Employee.
1. Update Employee.
1. Remove Employee.
1. Move Employee.
1. Insert New Employee.
1. Integrity Checks - Before persistence can occur the integrity of the Organization chart must be assured.
    1. All employees have a direct report except the CEO.
    1. All direct line reports end with the CEO.
1. Show Org Chart from a point.
1. Show direct line of reports.
1. Security - only logged in employees can view/edit employees.

## Initializing

1. Fork and clone the [Java Spring REST Certification](https://bitbucket.org/stgconsulting/javaspringrestcertification/) repository.
    1. Click on the `Plus - create` icon, in the left sidebar.
    1. In the `Get to work` section, click the `Fork this repository` menu item.
    1. Select the `Fork` option near the bottom of the menu.
    1. Click on the `Clone` button at the top of the new repository.
    1. Click on the `Copy` icon next to the URL.
    1. Use a git client of your choice to clone the repository.


1. Create a new branch called `initializing` and checkout this branch. This is where you will begin working on this project.
1. Spin up a new Spring REST app using the [Spring Intializr](https://start.spring.io/) project.

    - Use a package structure with your name somewhere in the structure (e.g. com.stg.sfranson.javabootrestcert).
    - Name the project stg-boot-rest-cert

1. Set up your new app by installing the required Spring dependencies:

    - Web
    - JPA
    - Security
    - Actuator

1. Expand the download .zip file to the cloned repository directory.  The repository should now have this README.md file and a directory called `stg-boot-rest-cert`
1. Create a file named `spring-boot-rest-cert`/Documentation.md` to capture documentation on how to run the application, the provided endpoints and any other information needed.
1. Other spring projects/dependencies can be used, but document the deviations  (in `Documentation.md`) from the above list with some justification on why those projects/dependencies were used.
1. As a first step, create an initial endpoint to retrieve a list (directory) of all employees in the company.  The returned data should have at least the basic information about each individual, and does not need to indicate any organization.
1. Document how to access that new employee directory endpoint.
1. Save your work and push these changes to Bitbucket and create a Merge Request to merge them to `master`.

## Simple Employee Management

1. Create a new branch called `employees` and checkout this branch.
1. Modify the related employee code (model, controller, repository, service, etc) to perform the basic CRUD (Create, Read, Update, Delete).
1. Create endpoints to perform basic CRUD operations on a single employee.  ***Note:*** _Be mindful to use generally accepted REST naming conventions for Resource naming._
1. Document the new endpoints and give examples of required payloads.
1. Save your work and push these changes to Bitbucket and create a Merge Request to merge them to `master`.

## Advanced Org Management

1. Create a new branch called `org` and checkout this branch.
1. Modify the related employee code (model, controller, repository, service, etc) to perform more advanced management:

    - Return entire org chart in single response.  Response payload should reflect the heirarchical (tree) nature of the organization.
    - Return direct reports for an individual (i.e. individual's boss, boss' boss, boss' boss' boss, etc).  Payload should contain enough information
    - Move an individual as a direct report from one employee, to a different individual
    - Add sorting and paging capabilities to the employee directory.  Provide the ability to sort by last name only, ascending and descending.  Paging should allow any size page.  Document the process for API consumers to retrieve a sorted and paged response.
1. Document the new endpoints, including the required payload structure.  Include your justification for the naming choice(s).
1. Save your work and push these changes to Bitbucket and create a Merge Request to merge them to `master`.

## Error Handling

1. Create a new branch called `errors` and checkout this branch.
1. Modify the related employee code (model, controller, repository, service, etc) to perform/ensure error handling/reporting to the API consumers.  Develop a suitable error message format and use related HTTP error codes.

    1. Errors relating to the "Integrity Checks" portion of the "Business Problem".
    1. Proper messages with matching HTTP error codes in response to error conditions relating to the basic and advanced employee management
        1. Examples
            1. 404 for an employee that doesn't exist.
            1. 400 when trying to move one employee to another employee that doesn't exist

1. Document the error conditions that can occur for the various endpoints, including the HTTP error message and any other codes or information an API Consumer would need.
1. Save your work and push these changes to Bitbucket and create a Merge Request to merge them to `master`.

## Security

1. Create a new branch called `security` and checkout this branch.
1. Modify the related employee code (model, controller, repository, service, configuration, etc) to perform basic security to the API consumers.

    - Provide a /auth/login endpoint with an email and password that will return a signed JWT for authentication/authorization. There only needs to be one user.
    - Restrict all usage for non-authenticated employees from the API except for the directory listing and login endpoints.
    - Token should be passed using the `Authorization: Bearer <token>` on all requests.
    - Use signed JWT's (including the configuration for setting the needed secrets)

1. Document the endpoint with how an API Consumer would need to use it.
1. Save your work and push these changes to Bitbucket and create a Merge Request to merge them to `master`.

Extra Credit - Implement OAuth2 as your security solution.

## Testing

1. Create a new branch called `testing` and checkout this branch.
1. Create/modify the tests to provide some level of unit/integration testing for your endpoints.

    - Implement them as JUnit or TestNG tests.
    - Provide documentation on how to run the tests (if it deviates from `mvn test`).
    - Create tests that cover all of the endpoints for the API.

1. Save your work and push these changes to Bitbucket and create a Merge Request to merge them to `master`.


## Finalizing

#**Congratulations**
You have completed the Rest Certification!
