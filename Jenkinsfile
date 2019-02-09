pipeline
{
agent
{
label "Linux"

}
parameters
	{
		choice(name: 'Environment',choices: 'DEV\nUAT\nPRD',description: 'Which Environment the Artifact should be Deployed')
		string(name: 'servername',description: 'Please enter HostName') 
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
	
	
    }
}
steps
{
sh "uptime"
    sh "echo ${params.servername}"
	sh "scp /tmp/workspace/Sample_Slave_job/biomni-1.0-SNAPSHOT.jar root@${params.servername}."
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
