
# Oracle TM automation test Framework

This project contains two main modules: **LGS** and **IML**, developed to facilitate automated testing with a robust framework built using Serenity, Selenium, Cucumber, Java, and JUnit.

### Prerequisites

- Java 11 or above
- Maven 3.6.3 or above

## Running Tests

This project supports running tests for two modules: LGS and IML. Below are the instructions to run tests for each module.

### IML Module

To run tests in the IML module, use the following Maven command and specify the environment **default(ua)** or **qa**:

```bash
mvn clean verify -Denvironment=default
```

Before running the tests **locally**, ensure to configure your test environment correctly. The project uses **example.secrets.properties** as a template for environment configuration. 
Duplicate this file and rename it **(e.g., to secrets.properties)** and adjust the properties to match your test environment.

Configuration
The **example.secrets.properties** file contains various settings that you need to adjust according to your test environment

## Setting Up GitHub Secrets

This project requires certain sensitive information, such as usernames and passwords, to be set as secrets within GitHub to ensure secure handling of such data. Follow the steps below to add these secrets to your GitHub repository:

### Step 1: Navigate to Your Repository's Settings

1. Go to your GitHub repository.
2. Click on the **Settings** tab.
3. On the left sidebar, click on **Secrets & variables**.
4. Choose **Actions** under the "Secrets" section.

### Step 2: Add the Required Secrets

You need to add two secrets: one for the `username` and another for the `password`. Perform the following for each:

1. Click on **New repository secret**.
2. In the **Name** field, enter `USERNAME` for the username secret or `PASSWORD` for the password secret.
3. In the **Value** field, enter the actual username or password that the CI/CD process should use.
4. Click **Add secret**.

### Step 3: Use the Secrets in the GitHub Actions Workflow

The secrets you've added (`USERNAME` and `PASSWORD`) can now be accessed in your GitHub Actions workflow files. They are used to dynamically generate a `secrets.properties` file during the CI/CD process, ensuring your sensitive information remains secure.


## Branch Naming Convention

To ensure a consistent and clear approach to our version control, we follow a specific naming convention for our branches. This helps in identifying the purpose and scope of changes made in each branch.

### Format

The branch names should follow this format:

`<module_name>-<YYYYMMDD>-<type>-<short_description>`

vbnet
Copy code

Where:
- `<module_name>`: The name of the module the changes apply to.
- `<YYYYMMDD>`: The date when the branch was created, in YearMonthDay format.
- `<type>`: The type of changes made. Can be one of `enhanced`, `new-feature`, `fix`, or `correction`.
- `<short_description>`: A brief description of the changes or feature being worked on.

### Example

For instance, if you are working on an enhancement related to the LGS module, and today's date is February 27, 2024, with a focus on improving the login feature, the branch name would be:

```
LGS-20240227-enhanced-login_improvement
```