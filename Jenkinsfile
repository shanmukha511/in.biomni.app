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


stages
{
stage("build")
{

steps
{
sh "uptime"
    sh "echo ${params.servername}"
	sh "scp /tmp/workspace/Sample_Slave_job/target/biomni-1.0-SNAPSHOT.jar root@${params.servername}:/tmp"
}
}

}
}
