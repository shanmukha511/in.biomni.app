pipeline
{
agent
{
label "Linux"

}
parameters
	{
		choice(name: 'Environment',choices: 'DEV\nUAT\nPRD',Description: 'Which Environment the Artifact should be Deployed')
		string(ServerName: 'Name',Description: 'Please enter HostName') 
	} 	
environment
{
    a="hi"
}
options
{
    timestamps()
}
stages
{
stage("build")
{
    
input
{
message "Proceed to continue"
submitter "user"
		parameters {
			string(name:'username', description: 'Username of the user pressing Ok')
		}
}
post
{
    success
    {
        sh "echo shanmukha"
    }
}
steps
{
sh "uptime"
}
}
stage("test")
{
steps
{
sh "pwd"
echo "${a}"
}
}
stage("dev")
{
steps
{
sh "ls -la"
}
}

}
}
